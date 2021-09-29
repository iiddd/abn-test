# Test assignment - ABN AMRO

## Description:
I used Kotlin, Espresso as Android recommended native testing framework, Added Allure reporting framework,
Spoon is used to execute tests (Could be used for scale up and orchestration for the future).
Page Object Model, builder pattern was used for test development.

## Usage:
1) Connect testing device (run Emulator)
2) Run `./gradlew app:runInstrumentationTests` from project root to execute tests and prepare allure reports
3) Run `./gradlew allureServe` from project root to start local webserver with Allure report

- Spoon report could be found at app/build/spoon-output

## Coverage:
* Failed Test Example
* Check Screen header
* Click Settings Menu
* Click Envelop Icon
* Check Background text

## Next steps:
* Scale up (Spoon or Android Orchestrator could be used for scaling and parallelizing test execution)
* Unique test properties for the app :)
* Knowing Hardware/Emulator config device management can be added
* CI integration