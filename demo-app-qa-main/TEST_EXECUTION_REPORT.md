# Test Execution Report

Commands were run from each service directory with Java 21. Both backend services now use the checked-in Maven Wrapper configuration for Maven 3.9.11.

## Claims Service

```powershell
.\mvnw.cmd '-DskipOpenApiGeneration=true' test
```

**BUILD SUCCESS**: 198 tests, 0 failures, 0 errors, 0 skipped. Surefire reports are under `code/claims-service/target/surefire-reports/`, including the new [RequestLoggingFilterTest report](code/claims-service/target/surefire-reports/com.example.demo.config.RequestLoggingFilterTest.txt) and [KafkaDomainEventPublisherTest report](code/claims-service/target/surefire-reports/com.example.demo.adapter.out.messaging.KafkaDomainEventPublisherTest.txt).

## BFF Service

```powershell
.\mvnw.cmd test
```

**BUILD SUCCESS**: 213 tests, 0 failures, 0 errors, 0 skipped. Surefire reports are under `code/bff-service/target/surefire-reports/`.

## Frontend

Run `npm.cmd test` from `code/demo-app-ui`.

**PASS**: 266 tests across 25 files, 0 failures. The first full run exposed a 950-character `user.type` test that exceeded Vitest's timeout and left keyboard events pending. The long-input test now updates the textarea directly; the other long form-value tests also avoid per-character typing where keyboard behavior is not what they verify. `npm ci` restored the dependencies from the existing lockfile; the package lockfile was not changed.

## Notes

The initial full claims-service run found 3 failures and 6 errors. The failures were caused by test fixtures that mocked the wrong Jackson serialization call and tests that expected domain events after the use case had published and cleared them. Those test contracts were corrected; the subsequent complete claims-service run passed. Missing Maven Wrapper properties have also been added to both backend services, and each wrapper was verified to launch Maven 3.9.11. Maven reported non-blocking Checkstyle warnings in existing code; Checkstyle reported 0 violations. Docker-backed integration tests were not run.