# Hibernate Learning Project 🚀

This project is a learning repository for **Hibernate ORM** integrated with **Spring Boot**. It covers CRUD operations, entity relationships, caching mechanisms, and transaction management.

## 📌 Features
- ✅ **Hibernate Configuration** (Spring Boot + JPA)
- ✅ **CRUD Operations** using `@Entity` and `@Repository`
- ✅ **One-to-One, One-to-Many, Many-to-Many Relationships**
- ✅ **First-Level & Second-Level Caching**
- ✅ **HQL & Criteria Queries**
- ✅ **Transaction Management with `@Transactional`**
- ✅ **Integration with MySQL / PostgreSQL / DB2**

---

## 📂 Project Structure
HibernateLearning/ │── src/ │ ├── main/ │ │ ├── java/com/example/hibernate/ │ │ │ ├── config/ # Hibernate Configuration Files │ │ │ ├── entity/ # Hibernate Entity Classes │ │ │ ├── repository/ # Data Access Layer │ │ │ ├── service/ # Business Logic Layer │ │ │ ├── controller/ # REST API Endpoints │ │ ├── resources/ │ │ │ ├── application.properties # Hibernate & DB Config │── pom.xml # Maven Dependencies │── README.md # Project Documentation


---

## 🛠 **Technologies Used**
- **Java 17+**
- **Spring Boot 2.6.6**
- **Hibernate 5+**
- **MySQL / PostgreSQL / DB2**
- **Maven (Dependency Management)**

---

## **📌 How to Save This File?**
1. Open **Notepad** or **VS Code**.
2. Copy the content above and **paste** it into a new file.
3. Save the file as `README.md` in:  
   📂 `D:\Workspaces\JAVA_SPRING_FRAMEWORK\HibernateLearning`
4. Done! ✅

---

## ⚙️ **Hibernate Configuration (`application.properties`)**
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/hibernate_db
spring.datasource.username=root
spring.datasource.password=password
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update


---

