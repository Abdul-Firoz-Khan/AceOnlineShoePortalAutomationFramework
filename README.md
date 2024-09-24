# Ace Online Shoe Portal Automation Framework

This project is a Selenium-based automation framework designed to test the Ace Online Shoe Portal, ensuring that both new and logged-in users can navigate the website and perform actions such as login and registration. The project is implemented using Maven and Cucumber, with step definitions written in Java and tests executed using JUnit.

## Table of Contents

- [Project Structure](#project-structure)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup Instructions](#setup-instructions)
- [Running Tests](#running-tests)
- [Test Scenarios](#test-scenarios)
- [Contributing](#contributing)

## Project Structure

```
AceOnlineShoePortalAutomation
│
├── src
│   ├── main
│   │   └── java
│   └── test
│       ├── java
│       │   ├── features
│       │   │   ├── LoggedInUser.feature
│       │   │   └── NewUser.feature
│       │   ├── runner
│       │   │   └── TestRunner.java
│       │   ├── stepDefinition
│       │   │   ├── BasePage.java
│       │   │   ├── ProductCategoryPage.java
│       │   │   ├── RegistrationPage.java
│       │   │   └── SignInPage.java
│       │   └── utility
│       │       ├── BrowserDriver.java
│       │       └── Hooks.java
│       └── resources
│           └── application.properties
└── pom.xml
```

## Features

- **Logged-in User View:** Verifies that a logged-in user can view the product category page after successful login.
- **New User Registration:** Ensures that new users can view the registration page when clicking on the registration button.
- **Modular Design:** Organized step definitions and reusable utility classes.
- **Cross-browser Testing:** Configured to run tests on Firefox using WebDriver Manager.

## Technologies Used

- **Java**: Programming language used for writing the step definitions.
- **Selenium**: WebDriver used for browser automation.
- **Cucumber**: Behavior-Driven Development (BDD) framework for running feature files.
- **JUnit**: Test runner framework used to run the Cucumber tests.
- **Maven**: Build automation tool used to manage dependencies and execute tests.
- **WebDriver Manager**: Manages browser drivers automatically.

## Setup Instructions

### Prerequisites

1. **Java Development Kit (JDK)** - Version 8 or above.
2. **Maven** - Ensure Maven is installed and added to your system's `PATH`.
3. **Firefox** - For browser testing.

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/Abdul-Firoz-Khan/AceOnlineShoePortalAutomation.git
   ```
2. Navigate to the project directory:
   ```bash
   cd AceOnlineShoePortalAutomation
   ```
3. Install dependencies using Maven:
   ```bash
   mvn clean install
   ```

## Running Tests

To execute the Cucumber tests, you can run the following Maven command:

```bash
mvn test
```

Alternatively, you can run the tests directly from your IDE by running the `TestRunner.java` file located in the `runner` package.

## Test Scenarios

### LoggedIn User View

- **Scenario:** Validate user is able to view the product category page after login.
- **Steps:**
  - User navigates to the login page.
  - User enters valid login credentials.
  - User is able to view the product category page.

### New User Registration

- **Scenario:** Validate new user is able to view the registration page.
- **Steps:**
  - User navigates to the login page.
  - User clicks on the registration button.
  - User is able to view the registration page.

## Contributing

If you'd like to contribute to this project, please fork the repository and create a pull request with your changes. Make sure all tests pass before submitting your pull request.

---

This `README.md` file provides an overview of the project, explains the folder structure, and includes instructions for setting up the project and running the tests.
