<div align="center">
  <h1 align="center">
    Web Automation Project
    <br />
    <br />
      <img src="selenium-project/src/test/resources/photo_logo/Web Automation Project.png" alt="Web Automation Project">
    </a>
  </h1>
</div>

<p align="center">
  <img alt="Static Badge" src="https://img.shields.io/badge/Maven-v3.9.9-blue">
  <img alt="Static Badge" src="https://img.shields.io/badge/Java-v17.0.8-800000">
  <img alt="Static Badge" src="https://img.shields.io/badge/Cucumber-7.20.1-a8e4a0">
  <img alt="Static Badge" src="https://img.shields.io/badge/Selenium-4.25.0-568203">
  <img alt="Static Badge" src="https://img.shields.io/badge/Javafaker-1.0.2-5e1914">
</p>

## Introduction
Test automation is an essential practice in modern software development, allowing the repeated execution of tests quickly and reliably. The use of frameworks like Selenium, combined with programming languages like Java, facilitates the creation of robust and efficient test scripts.

BDD (Behavior Driven Development) is a methodology that aims to integrate stakeholders in the development process, using a common language to describe the expected behavior of the system. Automated tests are written in a readable format that can be understood by all team members, including business analysts, developers, and testers.


- **Purpose**

  > This automation project aims to demonstrate knowledge in software testing, using Java, Selenium, and the BDD (Behavior Driven Development) framework. The proposal is to create a set of automated tests for a web application, focusing on the validation of asserts (assertions) to ensure the correct functioning of the system.

- **About the dev**
  > ...


## Tecnologies

 - $${\color{lightgreen}Selenium:}$$ In essence, Selenium automates web browser interactions to test website functionality, ensuring a smooth user experience.

 - $${\color{green}Cucumber:}$$ The Cucumber dependency is a critical component for behavior-driven development (BDD) in Java projects. It facilitates the execution of feature files, which are human-readable descriptions of software behavior written in Gherkin.
  
- $${\color{red}JavaFaker:}$$ JavaFaker is a popular Java library used to generate realistic test data.
  
- $${\color{blue}Maven:}$$ Maven is a powerful build automation tool primarily used for Java projects. It simplifies the build process by Managing dependencies, Building and packaging, Project lifecycle and Reporting.
    
- $${\color{white}Java:}$$ Java is a high-level, object-oriented programming language known for its platform independence, meaning code written on one system can run on any system with a Java Virtual Machine (JVM) installed.
    

## How to install and build

- **Requirements**  
  - Java Development Kit (JDK): Install the latest version of the JDK.
  - Build Tool: Maven
  - IDE: IntelliJ IDEA or Eclipse.
  - Drivers: Install the drivers corresponding to the browsers that will be used (Chrome, Firefox, etc.).
    <br />
    <br /> 
- **Install**
  - Clone the repository: ``` git clone https://github.com/PHCLGomes/selenium-Project.git ```
  - Install the dependencies: ``` mvn clean install ```
  - Run tests: ``` mvn test ``` 
      <br />
    <br /> 
## Files structure
 <img width="195" alt="image" src="https://github.com/user-attachments/assets/6ac45149-c694-4de0-b62d-fc127f2a48d1" />
    <br />
    <br />
1 - Hooks: The Hooks.class class in a web automation project with Selenium and Cucumber plays a fundamental role in test execution, acting as a central point for defining actions that must be performed before and after the execution of each test scenario.
    <br />
     <br />    
2 - Pages: Page Object is a design pattern widely used in automated web interface testing, especially when working with frameworks such as Selenium and Cucumber. It is used to model web application pages as objects in our test code, providing several benefits for the organization, maintenance and readability of tests.
      <br />
      <br />
3 - runner: The Runner class in a web automation project with Selenium and Cucumber plays a key role in executing automated tests. It serves as the entry point to the Cucumber framework, acting as the engine that initiates and coordinates the execution of test scenarios defined in .feature files.
      <br />
      <br />
4 - steps: In a web automation project using Selenium and Cucumber, the Steps class plays a fundamental role in implementing the steps described in the test scenarios. It is where the natural language of the scenarios is transformed into executable code, establishing the bridge between the definition of the tests and their automated execution.
    <br />
    <br />
5 - support: In a web automation project using Selenium and Cucumber, the support class plays a fundamental role in organizing and reusing code, in addition to facilitating test maintenance.
      <br />
      <br />
6 - features: A feature in a Selenium and Cucumber web automation project serves as the backbone of your test scenarios. It clearly and concisely defines the behavior you expect your web application to have.
