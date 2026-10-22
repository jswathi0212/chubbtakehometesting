# QA Assessment and Test Strategy

## Assessment

The highest-risk behavior is authentication and authorization across the UI, BFF, claims API, and identity provider. A failure can expose or alter policyholder data. Claim creation and status transitions are the next priority because invalid amounts, incident data, or lifecycle changes affect claim handling and downstream notifications. Kafka/WebSocket delivery, persistence, and dashboard caching are brittle integration boundaries: data can be stored correctly while users see stale or duplicate updates.

The supplied repository already contains unit tests in all three application layers, plus architecture and test-container scaffolding; it is not an empty test baseline. Existing coverage includes parts of auth, claim UI components, and service utilities. This change adds a focused security regression test for `RequestLoggingFilter`, where DEBUG request logging previously emitted bearer-token contents both in a dedicated truncated log and in the generic header dump.

## Scope Decisions

Selected: capture the request filter's DEBUG output and assert that authorization is reported as present, its value is redacted, and the token does not appear. The production fix redacts Authorization, Proxy-Authorization, Cookie, and Set-Cookie values while keeping ordinary request headers available for diagnosis.

Deferred: full-stack Playwright journeys, BFF-to-claims contract verification, database/Kafka/WebSocket integration, CDC duplicate-delivery behavior, and load testing. These exercise valuable cross-service contracts, but need a running Docker stack and broader setup; the targeted credential-leak regression has high impact and runs without external services. The mirrored UI and Java claim-transition tables should also be consolidated or contract-checked to prevent future drift.

## Findings and Execution

- Fixed: claims-service request logs could persist bearer credentials at DEBUG level.
- Fixed: `UpdateClaimStatusUseCaseTest` no longer compiled because its manually constructed use case omitted the new event-publisher dependency; the fixture now supplies a mock.
- Concern: the checked-in Maven wrapper cannot run because `.mvn/wrapper/maven-wrapper.properties` is absent.
- Validation: the complete claims-service suite passed (198 tests) and the BFF suite passed (213 tests), both with 0 failures/errors/skips. The frontend suite could not run because the existing `node_modules` tree is incomplete and npm cleanup encountered Windows file locks; details are in [TEST_EXECUTION_REPORT.md](TEST_EXECUTION_REPORT.md). Docker-backed integration tests were not run.
