Employee Management System Documentation
Introduction
The Employee Management System is a web application built using Spring Boot, Spring MVC, Thymeleaf, and JPA. It allows users to perform CRUD operations on employee data, including adding, updating, deleting, and viewing employee records.
Project Setup
### Prerequisites
Ensure you have the following installed on your system:
- Java 8 or later
- Maven
- MySQL (or any other preferred database)
- IDE (IntelliJ IDEA, Eclipse, or VS Code)

### Clone the Repository
```sh
 git clone https://github.com/example/employee-management.git
 cd employee-management
```

### Build the Project
```sh
 mvn clean install
```
Configuration
### Database Configuration
Update the `application.properties` file with the database details:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=root
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
```
Running the Project
To run the project, use the following command:
```sh
mvn spring-boot:run
```
The application will start on `http://localhost:8080`
