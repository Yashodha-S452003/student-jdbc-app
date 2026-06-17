# 🎓 Student Management System (JDBC)

A console-based Student Management System developed using **Core Java**, **JDBC**, and **MySQL**. This application allows users to perform CRUD (Create, Read, Update, Delete) operations on student records through a menu-driven interface.

---

## 🚀 Features

- ➕ Add a new student
- 📋 View all student records
- 🔍 Search a student by ID
- ✏️ Update student details
- ❌ Delete student records
- 💾 MySQL database integration using JDBC
- ⚠️ Exception handling for reliable execution
- 🧩 Modular and easy-to-understand code structure

---

## 🛠️ Technologies Used

- Java
- JDBC (Java Database Connectivity)
- MySQL
- Eclipse IDE
- Git & GitHub

---

## 📂 Project Structure

```
Student-JDBC-App/
│── src/
│   ├── controller/
│   ├── dao/
│   ├── dto/
│   ├── util/
│   └── Main.java
│
├── database.sql
├── README.md
```

> *(Modify the folder names if your project structure is different.)*

---

## 🗄️ Database

Database: **MySQL**

Example Table:

```sql
CREATE TABLE student (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    email VARCHAR(50),
    phone VARCHAR(15),
    course VARCHAR(50)
);
```

---

## ⚙️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/Yashodha-S452003/student-jdbc-app.git
```

### 2. Open the project

Import the project into **Eclipse** (or any Java IDE).

### 3. Create the database

Create the MySQL database and execute the SQL script.

### 4. Update database credentials

Modify the JDBC URL, username, and password in your database configuration file.

Example:

```java
String url = "jdbc:mysql://localhost:3306/studentdb";
String user = "root";
String password = "your_password";
```

### 5. Run the application

Execute the `Main` class.

---

## 💡 JDBC Concepts Used

- DriverManager
- Connection
- Statement / PreparedStatement
- ResultSet
- CRUD Operations
- Exception Handling

---

## 📸 Screenshots

Add screenshots here.

Example:

```
screenshots/
├── menu.png
├── add-student.png
├── update-student.png
├── delete-student.png
└── mysql-table.png
```

---

## 🎯 Learning Outcomes

Through this project, I gained hands-on experience with:

- Core Java programming
- JDBC API
- MySQL database connectivity
- SQL CRUD operations
- PreparedStatement
- Exception Handling
- Database-driven application development

---

## 🔮 Future Enhancements

- Java Swing GUI
- Spring Boot REST API
- Hibernate / JPA Integration
- User Authentication
- Search by Name
- Export Student Data to Excel/PDF

---

## 👩‍💻 Author

**Yashodha S**

📧 Email: yashodhayash45@gmail.com

🔗 LinkedIn: https://linkedin.com/in/yashodha-s0405

💻 GitHub: https://github.com/Yashodha-S452003
