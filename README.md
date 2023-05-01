# EPAM Testing Automation Class

This repository contains the **individual tasks** completed during the EPAM Testing Automation Class.

## Module Maven
### Practical Task: I Can Win

1. Install Maven and make sure it works.
2. Download the test project from [here](https://github.com/vitalliuss/helloci/tree/master/Java) and collect it with Maven using the test target.
3. Find the junit libraries in the folder `c:\Users\User_Name\.m2\repository\` and look at the date when the files were created.
4. Change the junit version in the file `pom.xml` from 4.12 to 4.11 and collect the project again. Make sure the new version of the library has been added to `.m2/repository`.

## Module Webdriver
### Practical Tasks:
#### I Can Win (mandatory)
For this task, please use the Selenium WebDriver power, framework unit test, and Page Object concepts. Automate the following script:

1. Open https://pastebin.com/ or a similar service in any browser.
2. Create a 'New Paste' with the following attributes:
   - Code: "Hello from WebDriver"
   - Paste Expiration: "10 Minutes"
   - Paste Name/Title: "helloweb"

#### Hurt Me Plenty (mandatory)
For this task, please use the Selenium WebDriver power, framework unit test, and Page Object concepts. Automate the following script:

1. Open https://cloud.google.com/.
2. Click the search button at the top of the portal page and enter "Google Cloud Platform Pricing Calculator" into the search field.
3. Click on the search button to start searching.
4. Click "Google Cloud Platform Pricing Calculator" in the search results and go to the calculator page.
5. Click COMPUTE ENGINE at the top of the page.
6. Fill out the form with the following data:
   - Number of instances: 4
   - What are these instances for?: leave blank
   - Operating System / Software: Free: Debian, CentOS, CoreOS, Ubuntu, or another User-Provided OS
   - VM Class: Regular
   - Instance type: n1-standard-8 (vCPUs: 8, RAM: 30 GB)
   - Select “Add GPUs”
   - Number of GPUs: 1
   - GPU type: NVIDIA Tesla V100
   - Local SSD: 2x375 Gb
   - Datacenter location: Frankfurt (europe-west3)
   - Committed usage: 1 Year
7. Click Add to Estimate.
8. Check that the data is correct in the following fields: VM Class, Instance type, Region, local SSD, commitment term.
9. Check that the monthly rent matches the amount received when the test is done manually.

* If you find that something has changed in the user interface or in the options to choose from, feel free to choose any other elements for this task.

## Module Framework
### Practical Task (mandatory)
Develop an automation framework for the Hurt Me Plenty task in Webdriver module (previous task module). The final framework should include the following:
1. A WebDriver manager for managing browser connectors
2. Page Object/Page Factory for page abstractions
3. Models for business objects of the required elements
4. Property files with test data for at least two different environments
5. XML suites for smoke tests and other tests
6. If the test fails, a screenshot with the date and time is taken.
7. The framework should include an option for running with Jenkins and browser parameterization, test suite, environment.
8. Test results should be displayed on the job chart, and the screenshots should be archived as artifacts.

## Module Continuous Integration with Jenkins
### Practical Task: I Can Win (mandatory)
1. Install Jenkins
2. Create a task which will perform the following:
   - Clone the project (https://github.com/vitalliuss/helloci)
   - Launch tests from the project in Java directory with the help of mvn test goal
3. Set up build triggers so that the task is performed every 5 minutes.
