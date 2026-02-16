Student Management System using JDBC

Introduction:
This project is a console-based Java application developed to demonstrate database integration using JDBC. It focuses on implementing core database operations while following a clean layered architecture.

The primary objective of this project was to gain practical experience in connecting Java applications with a MySQL database and executing SQL queries securely.

Technology Stack:
- Java
- JDBC (Java Database Connectivity)
- MySQL

Project Highlights:
- Implemented JDBC-based database connectivity
- Performed INSERT operations using PreparedStatement
- Applied DAO (Data Access Object) design pattern
- Structured project using layered architecture (Model, DAO, Utility)
- Implemented exception handling for database operations

Functional Scope:
- Establishing connection with MySQL database
- Inserting student records into database
- Secure SQL execution using PreparedStatement

Database Schema:
The application interacts with a `students` table structured as follows:

- id (Primary Key)
- name
- email
- marks

Concepts Practiced:
- JDBC Connection Establishment
- DriverManager & Connection Interface
- PreparedStatement for parameterized queries
- Exception Handling (SQLException)
- Separation of Concerns via DAO Pattern

Purpose of Development:
This project was developed as part of my learning journey to strengthen my understanding of JDBC, database operations, and real-world Java application structuring.

Future Enhancements:
- Implement SELECT operations using ResultSet
- Add UPDATE & DELETE functionalities
- Build menu-driven interaction system
