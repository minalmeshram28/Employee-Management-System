# Employee-Management-System
This is a full-stack Employee Management System application developed using Spring Boot for the backend and React for the frontend. 
The application allows users to perform CRUD operations (Create, Read, Update, Delete) on employee data.

## Features

- Add New Employee: Users can add new employees with details like first name, last name, and email ID.
- View Employees: Displays a list of all employees.
- Update Employee: Users can update the details of an existing employee. The update form is pre-populated with the current employee details.
- Delete Employee: Users can delete an employee from the list.

## Technologies Used

### Backend
- Spring Boot: Framework for creating RESTful web services.
- Spring Data JPA: For database operations.
- MySQL: Relational database management system.

### Frontend
- React: JavaScript library for building user interfaces.
- Axios: For making HTTP requests from the frontend to the backend.

# Getting Started with Employee Management System

## React Setup in VSCode

1. Install Node.js and npm:
   - Download and install Node.js from [nodejs.org](https://nodejs.org/).
   - npm is included with Node.js.

2. Install Create React App:
   Open a terminal or command prompt and run the following command to install Create React App globally:
  ``` 
   npm install -g create-react-app
```
3. Create a New React App:
  Navigate to your desired directory and create a new React app using Create React App:
```
   npx create-react-app your-react-app-name
   cd your-react-app-name
```
4. Start the React Development Server:
   Once the app is created, start the development server:
```
   npm start
```
   This will start the development server and open your app in the default browser.

## Spring Boot Setup in IntelliJ IDEA

1.Install IntelliJ IDEA:
   
   Download and install IntelliJ IDEA Community edition from jetbrains.com/idea/download.

2.Create a New Spring Boot Project:

   - Go to spring.io/start.
   - Select your project's details like language, Spring Boot version, and project metadata (group, artifact, name, package, and dependencies).
   - Click "Generate" to download the project zip file.
   - Extract the downloaded zip file to your desired location.
   - Import the extracted project into your IntelliJ IDEA

3.Configure MySQL Database:

   Make sure MySQL Server is installed and running.
   
   Create a new database named employee_management using MySQL Workbench or a MySQL client tool.

4.Update application.properties:
   Open the application.properties file located in src/main/resources directory.
   Configure the MySQL connection properties:
   ```
   spring.datasource.url=jdbc:mysql://localhost:3306/employee_management
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```

