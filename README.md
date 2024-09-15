# Wordpres Dark Mode Test Suite

This project contains an automation test suite for testing the **WP Dark Mode** plugin on WordPress, built using **Selenium**, **JUnit** and **Java**. The test suite automates various scenarios to verify the plugin's functionality, customization options, and dark mode behavior. 

## Table of Contents

- [Prerequisites](#prerequisites)
- [Setup](#setup)
  - [Clone the Repository](#clone-the-repository)
  - [Set Up WordPress](#set-up-wordpress)
    - [Local Installation](#local-installation)
    - [Remote Installation](#remote-installation)
  - [Configure Eclipse](#configure-eclipse)
  - [Environment Variables](#environment-variables)
- [Running the Tests](#running-the-tests)
  - [Via Eclipse](#via-eclipse)

## Prerequisites

Before starting, ensure the following are installed:

1. **Java JDK (11 or later)**: Download [here](https://www.oracle.com/java/technologies/javase-downloads.html).
2. **Maven**: Install Maven [here](https://maven.apache.org/install.html).
3. **Eclipse IDE**: Download [here](https://www.eclipse.org/downloads/).
4. **Git**: Install Git from [here](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git).
5. **Local**: A local or remote WordPress installation.

## Setup

### Clone the Repository

1. Open a terminal or command prompt.
2. Navigate to the directory where you want to clone the project.
3. Run the following command to clone the repository:
   
git clone [https://github.com/SammanTasnim/WPDarkModeAutomationTestSuite](https://github.com/SammanTasnim/WPDarkModeAutomationTestSuite)


5. Navigate into the project directory


### Set Up WordPress

#### Local Installation

1. Install Local in your environment.
2. Turn on the local server from Local.
3. Create a new server "wppool"
4. Create Password "wp1234"

### Configure Eclipse

1. Open **Eclipse**.
2. Import the project:
- **File → Import → Maven → Existing Maven Projects**.
- Select the project folder and click **Finish**.
3. Install project dependencies


### Environment Variables

1. Create a `.env` file in the root directory with your WordPress credentials:


2. Add a `.env.example` file for others to understand how to create their `.env` file:


## Running the Tests

### Via Eclipse

1. Open **Eclipse**.
2. Right-click on the test folder (`src/test/java/wppool.wppool/AllTests.java`) and select **Run As → JUnit Test**.
3. Ensure your WordPress credentials are correctly configured in the `.env` file.

