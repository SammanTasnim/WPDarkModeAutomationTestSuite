# WordPress Automation Test Suite

This project contains an automation test suite for testing the **WP Dark Mode** plugin on WordPress, built using **Selenium** and **Java**. The test suite automates various scenarios to verify the plugin's functionality, customization options, and dark mode behavior. Continuous integration is achieved through **GitHub Actions**.

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
  - [Via GitHub Actions](#via-github-actions)
- [Additional Information](#additional-information)
- [Contributing](#contributing)

## Prerequisites

Before starting, ensure the following are installed:

1. **Java JDK (11 or later)**: Download [here](https://www.oracle.com/java/technologies/javase-downloads.html).
2. **Maven**: Install Maven [here](https://maven.apache.org/install.html).
3. **Eclipse IDE**: Download [here](https://www.eclipse.org/downloads/).
4. **Git**: Install Git from [here](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git).
5. **WordPress**: A local or remote WordPress installation.

## Setup

### Clone the Repository

1. Open a terminal or command prompt.
2. Navigate to the directory where you want to clone the project.
3. Run the following command to clone the repository:


4. Navigate into the project directory:


### Set Up WordPress

#### Local Installation

1. Install a local web server stack such as **XAMPP**, **MAMP**, or **Local by Flywheel**.
2. Start the web server and database services.
3. Download the **WordPress** package from [here](https://wordpress.org/download/).
4. Extract the WordPress files into your local server's document root (e.g., `htdocs` for XAMPP).
5. Create a new MySQL database for WordPress in **phpMyAdmin** or the command line.
6. Run the WordPress installation by visiting `http://localhost/wordpress` in your browser and follow the on-screen instructions.
7. In the WordPress Admin Panel:
- Go to **Plugins → Add New**.
- Search for **WP Dark Mode**.
- Install and activate the plugin.

#### Remote Installation

1. Set up a WordPress site on a remote server or hosting platform.
2. Access the server via **FTP** or **cPanel** to install WordPress.
3. Configure a database and run the WordPress installation.
4. Install and activate the **WP Dark Mode** plugin as described in the Local Installation section.

### Configure Eclipse

1. Open **Eclipse**.
2. Import the project:
- **File → Import → Maven → Existing Maven Projects**.
- Select the project folder and click **Finish**.
3. Install project dependencies by running:


### Environment Variables

1. Create a `.env` file in the root directory with your WordPress credentials:


2. Add a `.env.example` file for others to understand how to create their `.env` file:


## Running the Tests

### Via Eclipse

1. Open **Eclipse**.
2. Right-click on the test folder (`src/test/java`) and select **Run As → JUnit Test**.
3. Ensure your WordPress credentials are correctly configured in the `.env` file.

### Via GitHub Actions

When you push changes to the repository, the tests are automatically triggered via **GitHub Actions**. You can view the results under the **Actions** tab in the repository.

## Additional Information

- **Supported Browsers**: The tests run on **Chrome**. Ensure the Chrome WebDriver is installed.
- **Running Tests via Maven**: You can run the tests using Maven with the following command:

