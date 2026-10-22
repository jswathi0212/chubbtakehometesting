# AI Working Journal

- Accepted: use a focused regression test at the request-logging boundary, capture Logback output in memory, and verify behavior rather than implementation internals.
- Challenged: the assessment brief says the application has no tests. Repository inspection found substantial existing tests in the frontend and BFF, and existing claims-service tests, so the strategy was adjusted to add missing coverage rather than duplicate the baseline.
- Challenged: an initial status-transition mismatch hypothesis. Comparing the UI and Java transition tables showed that their current rules agree, so no transition defect was claimed.
- Accepted: treat raw Authorization logging as a security defect because the filter logs token contents in two separate places, including the general header dump.
- Accepted: fix the stale `UpdateClaimStatusUseCaseTest` fixture after Maven exposed that it did not provide the use case's required event-publisher dependency.
- Accepted: run the full claims-service suite after the focused tests. It exposed Kafka tests stubbing event-record serialization instead of the actual ObjectNode envelope serialization, and claim-creation tests expecting events after the use case publishes and clears them. Updated those test contracts; the complete claims suite then passed all 198 tests.
- Accepted: expand execution to the BFF layer; its complete suite passed all 213 tests.
- Overrode: attempt to run the frontend suite after npm could not find Vitest. npm installation was blocked by Windows `EBUSY`/`ENOTEMPTY`/`EPERM` errors while cleaning `node_modules`; the report marks the frontend result unverified instead of claiming a pass.
- Overrode: the checked-in Maven wrapper is incomplete, so system Maven was used. The full claims-service and BFF executions both completed successfully; Docker-backed integration tests remain unrun.