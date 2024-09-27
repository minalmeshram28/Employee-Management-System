# Employee-Management-System
This project is a web-based application for managing employee data. It allows users to perform CRUD operations (Create, Read, Update, Delete) on employee records through a responsive interface. The system is built with a Spring Boot backend and a React.js frontend.

## Features

- Add new employees
- View all employees
- Update employee details
- Delete employees

## Technologies Used

### Backend
- Spring Boot 3: Backend framework
- Spring Data JPA (Hibernate 6): Database access and ORM
- MySQL: Database used for employee data
- Maven: Dependency management
- Postman: API testing
- IntelliJ: IDE for backend development

### Frontend
- React.js 18+: Frontend framework for UI development
- Vite.js: Build tool for React app
- Bootstrap: CSS framework for responsive design
- JavaScript: Programming language for frontend logic
- Axios: For making HTTP requests from the frontend to the backend.
- VSCode: IDE for frontend development

# Getting Started with Employee Management System

## Step 1: Clone the Repository
- Open a terminal and clone the repository from GitHub:
```
git clone https://github.com/minalmeshram28/Employee-Management-System.git
```
- Once cloned, you will have two main folders: one for the backend (springboot-backend) and one for the frontend (ems-frontend).

## Step 2: Backend Setup (Spring Boot) in IntelliJ
1. Open the Backend in IntelliJ:
- In IntelliJ, go to File -> Open and navigate to the employee-management-system/backend folder. Select it and click Open.
- IntelliJ will automatically detect that it's a Maven project and will begin loading dependencies.

2. Configure MySQL Database:
- Open the src/main/resources/application.properties file.
- Update the file with your MySQL credentials:
```
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```
3. Install Dependencies:
- If IntelliJ doesn’t automatically download dependencies, right-click on the pom.xml file and select Maven -> Reload Project.

4. Run the Backend:
- In the src/main/java directory, locate the SpringBootBackendApplication.java file.
- Right-click on it and select Run. This will start your Spring Boot backend on http://localhost:8080.

## Step 3: Frontend Setup (React + Vite.js) in VSCode

1. Open the Frontend in VSCode:
- Open Visual Studio Code.
- Go to File -> Open Folder and select the employee-management-system/frontend folder.
  
2. Install Frontend Dependencies:
- Open the integrated terminal in VSCode .
- Navigate to the frontend folder if you’re not already there:
```
cd ems-frontend
```

3. Install the required Node.js dependencies:
```
npm install
```

4. Run the Frontend:
- Start the Vite development server:
```
npm run dev
```
- The frontend should now be running on http://localhost:5173.
- OR to change the port number to 3000 (commonly used for React apps):
  - Create or update a vite.config.js file in the root of the frontend folder:
   ```
   export default {
     server: {
       port: 3000,
     },
   };
   ```
- The frontend will now run on http://localhost:3000.

## Step 4: Ensure Frontend and Backend Integration
- The frontend will make API requests to http://localhost:8080/api/employees. Make sure the Spring Boot backend is running before starting the frontend.
- If CORS issues arise, Spring Boot is configured to allow cross-origin requests with the @CrossOrigin annotation in your controllers.




  
   
   
   

