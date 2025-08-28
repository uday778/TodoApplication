# 📝 Todo Application

A simple **Todo Management Application** built using **Spring Boot MVC**, **Thymeleaf**, **Bootstrap**, and **MySQL**.  
The application demonstrates the use of **EntityManager** and performs complete **CRUD (Create, Read, Update, Delete)** operations.

---

## ⚙️ Tech Stack
- **Spring Boot MVC** – Web framework
- **Thymeleaf** – Server-side templating engine
- **Bootstrap** – UI styling & responsive design
- **MySQL** – Database
- **EntityManager (JPA)** – Database operations

---

## 🚀 Features
- Add a new Todo task
- View all tasks
- Update an existing task
- Delete tasks
- Responsive UI with Bootstrap

---

## 🛠️ Project Setup

### 1. Clone the repository
```bash
git clone https://github.com/uday778/TodoApplication.git
cd TodoApplication
```
### 2. Configure Database
#### Create a MySQL database named ```todoapp```
```
CREATE DATABASE todoapp;
```
#### Update your application.yml file with DB credentials:
```
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/todoapp
    username: root
    password: your_password_here
    driver-class-name: com.mysql.cj.jdbc.Driver
  jpa:
    database-platform: org.hibernate.dialect.MySQL8Dialect
    hibernate:
      ddl-auto: update
    show-sql: true
```
### 3. Build and Run the application
#### Using Maven:
```
mvn spring-boot:run
```
#### Or, build the jar and run:
```
mvn clean package
java -jar target/todo-application-0.0.1-SNAPSHOT.jar
```

## 📌 Usage
Open your browser and navigate to:
👉```  http://localhost:8080 ```

You can now:

- Add new todos

- View todo list

- Edit tasks

- Delete tasks



## 🤝Contribution
Fork the repository

Create a feature branch

Make your changes

Submit a pull request

## 📜 License
This project is licensed under the ***MIT Licens***.
```
Do you want me to also **add SQL script for the `todo` table** (so others don’t need to rely only on JPA `ddl-auto`)?
```

