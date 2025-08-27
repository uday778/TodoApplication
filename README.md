# TodoApplication
A full-featured Todo application built with Spring Boot, MySQL, and Thymeleaf that allows you to manage your tasks efficiently.

# Features
✅ Create new todo items

📋 Read and view all your todos

✏️ Update existing todo items

🗑️ Delete todos you no longer need

🎨 Clean UI built with Thymeleaf and Bootstrap

💾 Persistent storage with MySQL database

# Technology Stack
Backend: Spring Boot

Database: MySQL

Templating Engine: Thymeleaf

Frontend: HTML, CSS, Bootstrap

Build Tool: Maven

# Prerequisites
Before running this application, make sure you have the following installed:

Java JDK 11 or higher

MySQL Server 5.7 or higher

Maven 3.6 or higher

# Installation & Setup
Clone the repository

```
git clone <repository-url>
cd todo-application
```
Configure MySQL Database

```
CREATE DATABASE todo_db;
CREATE USER 'todo_user'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON todo_db.* TO 'todo_user'@'localhost';
FLUSH PRIVILEGES;
```
Update application properties
Edit src/main/resources/application.properties with your database credentials:

## properties
spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=todo_user
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
### Build the application
```
mvn clean install
```
### Run the application
```
mvn spring-boot:run
```
Access the application
Open your browser and navigate to ``` http://localhost:8080 ```

Usage
Viewing Todos
The home page displays all your existing todo items

Todos are listed in a clean, organized table format

## Adding a New Todo
Click the "Add New Todo" button

Fill in the todo description
Click "Save" to add the todo to your list

## Editing a Todo
Click the "Edit" button next to any todo item

Modify the description in the form

Click "Update" to save your changes

## Deleting a Todo
Click the "Delete" button next to the todo you want to remove

Confirm the deletion in the confirmation dialog

## Marking Todos as Complete
Click the checkbox next to a todo to mark it as complete/incomplete

Completed todos are visually distinguished from pending ones



## Contributing
Fork the repository

Create a feature branch

Make your changes

Submit a pull request

## License
This project is licensed under the MIT License.
