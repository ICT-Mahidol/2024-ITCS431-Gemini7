# Gemini-7

## Team Members

- Mr. Napat Jirataranon 6588030&#x20;
- Miss Chalisa Kengkaewpennapa 6588041
- Miss Saruta Nakro 6588060
- &#x20;

  Mr. Natthaphat Pintip 6588073&#x20;
- Mr. Sittikorn Maneewong 6588182
- Mr. Boonchai Pintharotpanya 6588185

## Project Description

This project is a Spring Boot web application that implements the Gemini software functionality. It uses Java 17, Spring Boot framework, Thymeleaf for HTML rendering, and H2 Database for backend storage. The application supports login, science plan creation, testing, and submission, and interacts with an OCS backend.

There are 4 main use cases:

1. User Login
2. Create a Science Plan
3. Test a Science Plan
4. Submit a Science Plan

## Design Pattern

The project is designed using the **Model-View-Controller (MVC)** pattern and the **Service Layer** pattern:

- **Model**: Java classes like `User`, `LoginRequest`, `LoginResponse` represent data structures.
- **View**: Thymeleaf templates (HTML files) render the frontend UI.
- **Controller**: Classes like `AuthController` and `GeminiController` handle incoming HTTP requests.
- **Service**: Business logic is encapsulated inside `AuthService` and `GeminiService`.

---

## How to run the Application

1. Prerequisite: Install an IDE (e.g., IntelliJ IDEA) and Java 17.
2. Download or clone the project.
3. Open the project in your IDE.
4. Navigate to `build.gradle` and run it to build the project.
5. Then, navigate to `GeminiBackendApplication.java` and run it.
6. Open a web browser and visit `http://localhost:8080` to access the application.

---

## How to execute *User Login* use case

1. Visit `http://localhost:8080/login`.
2. Enter your username and password.

   username: [jane@example.com](mailto\:jane@example.com)

   password: password123
3. Click Login to access the system.

---

## How to execute *Create a Science Plan* use case

1. After login as an astronomer, navigate to the "Create Science Plan" page.
2. Fill in the necessary science plan details.
3. Click Save to record your new Science Plan.

---

## How to execute *Test a Science Plan* use case

1. After creating a science plan, navigate to the "Test Science Plan" section.
2. Select the science plan you want to test.
3. Click Test to validate the science plan.

---

## How to execute *Submit a Science Plan* use case

1. After testing and validating a science plan successfully, you will see "Tested".
2. Select the science plan you want to submit.
3. Click Submit to officially submit the science plan.

---

