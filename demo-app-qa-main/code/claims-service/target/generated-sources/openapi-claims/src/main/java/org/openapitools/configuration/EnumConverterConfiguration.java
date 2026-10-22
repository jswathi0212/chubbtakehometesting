package org.openapitools.configuration;

import com.example.claims.adapter.in.web.generated.model.ClaimStatusDTO;
import com.example.claims.adapter.in.web.generated.model.UserRoleDTO;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration(value = "org.openapitools.configuration.enumConverterConfiguration")
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.claimStatusConverter")
    Converter<String, ClaimStatusDTO> claimStatusConverter() {
        return new Converter<String, ClaimStatusDTO>() {
            @Override
            public ClaimStatusDTO convert(String source) {
                return ClaimStatusDTO.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.userRoleConverter")
    Converter<String, UserRoleDTO> userRoleConverter() {
        return new Converter<String, UserRoleDTO>() {
            @Override
            public UserRoleDTO convert(String source) {
                return UserRoleDTO.fromValue(source);
            }
        };
    }

}
