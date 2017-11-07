# asu-cucumber-demo
Small cucumber demo for the ASU WiCS Group


# ASU Example #

Tests run from the same directory that contains the pom.xml file.

## Running all test examples ##

    mvn test -Dtest=RunCucumber


## Running a specific feature file ##

    mvn test -Dtest=RunCucumber -Dcucumber.options="src/test/resources/features/IndustryPartners.feature"


## Running a specific tag ##

    mvn test -Dtest=RunCucumber -Dcucumber.options='--tags @ASU-outline'
    mvn test -Dtest=RunCucumber -Dcucumber.options='--tags @NAU-outline'
    mvn test -Dtest=RunCucumber -Dcucumber.options='--tags @minimum'


## Location of the reports ##
(Open in a web browser)
target/cucumber-integration-html-report.html/index.html (Cucumber equivalent)
target/surefire-reports/asu.example.cucumber.RunCucumber.txt  (Junit equivalent)
