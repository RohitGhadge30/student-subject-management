# student-subject-management
Project Setup & Run Instructions
1. Install Prerequisites
Ensure you have JDK 19 or higher installed on your system.
Install an IDE such as Spring Tool Suite (STS)

2. Clone the Repository (if using version control)
bash
Copy code
git clone https://github.com/your-repo-name.git
cd your-repo-name

5. Set Up the Spring Boot Project
Open the project in your IDE.
Ensure that Spring Boot dependencies are correctly configured (Spring Web, Spring Data JPA, H2 Database, Spring Security, and JWT libraries).

7. Application Configuration
H2 Database: By default, H2 runs in memory with the configuration in src/main/resources/application.properties:
properties
Copy code
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true

9. Build the Project
If you're using Maven, you can build the project by running:

6. Run the Application
In your IDE, run the Application class with the @SpringBootApplication annotation.
Alternatively, run the application via command line:




Testing the Application
You can test the APIs using Postman or cURL.

Sample Endpoints:
POST /api/students: Create a new student.

json
Copy code
{
  "name": "Rohit",
  "address": "123 Main St",
  "subjects": [
{ "id": 1 }
]
}
POST /api/subjects: Create a new subject.

json
Copy code
{
  "name": "Mathematics"
}

GET /api/students: Retrieve all students.

GET /api/subjects: Retrieve all subjects.

POST /auth/login: Authenticate and receive a JWT token.

Request body:
json
Copy code
{
  "username": "user",
  "password": "password"
}

Response:
json
Copy code
{
  "token": "your_jwt_token"
}
