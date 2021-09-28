# Test assignment - ABN AMRO

## Usage:
1) Connect testing device
2) Run `./gradlew downloadAllure` to download Allure command line
2) Run `./gradlew app:connectedAndroidTest` to run test execution
3) Run `adb pull /sdcard/allure-results` to retrieve allure-reports from AVD/Android device
4) Run `mv allure-results build/allure-results` to move allure reports to expected directory
5) Run `./gradlew allureServe` to start local webserver with Allure report

## Coverage:
* Check Screen header
* Click Settings Menu
* Click Envelop Icon
* Check Background text

## Next steps:
* Scale up
* CI integration