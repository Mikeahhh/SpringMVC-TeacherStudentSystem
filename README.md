# A Complete Teacher-Student Management System Based on Spring MVC

This is a full-featured **Teacher-Student Management System** built with **Spring MVC**, designed for managing users, courses, lectures, voting, and comments. It is ideal for educational purposes, online learning platforms, or classroom interactions.

---

## 🌟 Features

- ✅ User registration and login (roles: Teacher, Student)
- ✅ Teachers can create courses and publish lectures
- ✅ Students can view lectures, vote, and comment
- ✅ Voting system with options: anonymous, single/multiple choice, auto-close
- ✅ Comment system with timestamps and usernames
- ✅ Role-based access: Teachers can delete courses, lectures, and votes
- ✅ Responsive UI, mobile friendly
- ✅ Auto-create default teacher/student accounts at startup

---

## 🛠 Tech Stack

- **Java 17+**
- **Spring Boot + Spring MVC**
- **Thymeleaf** - Template engine
- **Spring Security** - Authentication & Authorization
- **Spring Data JPA** - Database interaction
- **H2 / MySQL** - Database support
- **Bootstrap / CSS** - Frontend styling
- **JavaScript / AJAX** - Interactive features

---

## 🚀 Getting Started

### 1. Clone the Repository
git clone https://github.com/your-username/teacher-student-system.git
cd teacher-student-system

2. Configure the Database (Optional)
The default database is H2 (in-memory). To use MySQL, update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/your_db
spring.datasource.username=root
spring.datasource.password=your_password
3. Run the Project
Use your IDE or command line:

./mvnw spring-boot:run

Access the system at:
http://localhost:8080

👤 Default Accounts
These accounts are automatically created on startup:

Role	Username	Password	Email	Description
Teacher	teacher1	123456	teacher@example.com	Can manage content
Student	student1	123456	student@example.com	Can view, vote, comment

🤝 Contributing
Contributions are welcome!

Fork the repository
Create your feature branch: git checkout -b feature/YourFeature
Commit your changes: git commit -m 'Add some feature'
Push to the branch: git push origin feature/YourFeature
Open a Pull Request
📄 License
This project is licensed under the MIT License - see the LICENSE file for details.

🙌 Acknowledgments
Spring Framework Documentation
Bootstrap CSS
H2 Database
IntelliJ IDEA / VS Code
© 2025 MIKE_WANG - Teacher-Student Management System
