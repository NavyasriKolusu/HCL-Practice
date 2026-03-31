**EasyBasket - User Service (Spring Boot)**

This project was developed as part of an assignment to understand how backend applications work using Spring Boot. The main goal was to build a simple REST API with proper structure, validation, and database integration.

**Project Overview:**

This is a basic User Management Service where:
A user can be created using API,
All users can be retrieved from the database,
Input validation is handled properly,
Errors are returned in a structured format.

**Dependencies Used:**

Java,
Spring Boot,
Spring Web,
Spring Data, JPA,
H2 Database (in-memory),
Spring Validation,
Spring Security,
Swagger (OpenAPI),
Maven.

**Project Structure:**

The project is organized into different layers:

Controller → Handles API requests

Service → Contains business logic

Repository → Handles database operations

Model → Represents the User entity

DTO → Used for request and response

Exception → Handles validation errors globally

**API Endpoints:**
1. Create User
POST /api/users
Example request:
{
  "name": "Navya",
  "email": "navya@example.com",
  "password": "123456"
}

2. Get All Users
GET /api/users
Returns list of all users stored in the database.

**Features Implemented:**

REST API development using Spring Boot

Layered architecture (Controller → Service → Repository)

DTO usage for clean data handling

Input validation using annotations

Global exception handling

H2 database integration

Basic authentication using Spring Security


**1. Login Page (Spring Security)**

When the application is accessed, Spring Security redirects to a login page.
This ensures that only authenticated users can access the APIs.

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/01e54579-ebf3-4d51-b34f-17262291beed" />

**2. Create User API – Request (POST)**

Here, I used the POST /api/users endpoint to create a new user.
The request contains name, email, and password in JSON format.

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/b7b7179c-a34b-4fc5-a1e0-5865490107dd" />

**3. Validation Error (Missing Name)**

In this step, I tested validation by sending a request without the name field.
The application returns an error message saying "Name is required", which is handled using global exception handling.

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/2ab8e350-968e-4537-b31a-2f3731e7fbbc" />

**4. Get Users API – Response (GET)**

After creating the user, I used the GET /api/users endpoint to fetch all users.
The response shows the stored user data from the database.

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/3255fbe5-0dce-472d-aa76-a2442bda4583" />


