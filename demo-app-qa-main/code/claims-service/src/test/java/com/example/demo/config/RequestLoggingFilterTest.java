package com.example.demo.config;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.read.ListAppender;
import jakarta.servlet.FilterChain;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.slf4j.LoggerFactory;

import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class RequestLoggingFilterTest {

    private static final String BEARER_TOKEN = "Bearer test-sensitive-token-value";

    private RequestLoggingFilter filter;
    private Logger logger;
    private Level previousLogLevel;
    private ListAppender<ILoggingEvent> logAppender;

    @BeforeEach
    void setUp() {
        filter = new RequestLoggingFilter();
        logger = (Logger) LoggerFactory.getLogger(RequestLoggingFilter.class);
        previousLogLevel = logger.getLevel();
        logger.setLevel(Level.DEBUG);
        logAppender = new ListAppender<>();
        logAppender.start();
        logger.addAppender(logAppender);
    }

    @AfterEach
    void tearDown() {
        logger.detachAppender(logAppender);
        logAppender.stop();
        logger.setLevel(previousLogLevel);
    }

    @Test
    void should_PassRequestThroughFilterChain() throws Exception {
        MockHttpServletRequest request = new MockHttpServletRequest("GET", "/api/claims");
        MockHttpServletResponse response = new MockHttpServletResponse();
        FilterChain chain = mock(FilterChain.class);

        filter.doFilter(request, response, chain);

        verify(chain).doFilter(request, response);
    }

    @Test
    void should_PassRequestThroughFilterChain_When_AuthorizationHeaderPresent() throws Exception {
        MockHttpServletRequest request = new MockHttpServletRequest("POST", "/api/claims");
        request.addHeader("Authorization", BEARER_TOKEN);
        MockHttpServletResponse response = new MockHttpServletResponse();
        FilterChain chain = mock(FilterChain.class);

        filter.doFilter(request, response, chain);

        verify(chain).doFilter(request, response);
    }

    @Test
    void should_RedactAuthorizationHeaderFromDebugLogs() throws Exception {
        MockHttpServletRequest request = new MockHttpServletRequest("GET", "/api/claims");
        request.addHeader("Authorization", BEARER_TOKEN);
        MockHttpServletResponse response = new MockHttpServletResponse();
        FilterChain chain = mock(FilterChain.class);

        filter.doFilter(request, response, chain);

        String loggedMessages = logAppender.list.stream()
                .map(ILoggingEvent::getFormattedMessage)
                .collect(Collectors.joining("\n"));
        assertThat(loggedMessages)
                .contains("Authorization header present: true")
                .contains("Authorization: [REDACTED]")
                .doesNotContain(BEARER_TOKEN);
    }

    @Test
    void should_PassRequestThroughFilterChain_When_LongAuthorizationHeader() throws Exception {
        MockHttpServletRequest request = new MockHttpServletRequest("GET", "/api/claims");
        request.addHeader("Authorization", "Bearer " + "x".repeat(100));
        MockHttpServletResponse response = new MockHttpServletResponse();
        FilterChain chain = mock(FilterChain.class);

        filter.doFilter(request, response, chain);

        verify(chain).doFilter(request, response);
    }
}
