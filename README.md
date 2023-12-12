# CricketLeagueApplication

## Description
This Cricket League Application, crafted using Java Spring Boot and PostgreSQL, features comprehensive CRUD capabilities. The application is structured with a well-defined layered architecture comprising entities, repositories, services, exceptions, and controllers. Adhering to the principles of object-oriented programming, it provides a seamless experience for managing cricket league operations. Global exception handling is implemented to maintain a stable and reliable system. Key functionalities include managing team rosters, scheduling matches, recording scores, and generating league standings, making it an essential tool for cricket league administrators and enthusiasts.

## Prerequisites
Before you begin, ensure you have met the following requirements:
- Java JDK 11 or higher installed
- Maven or Gradle (specify the version)
- PostgreSQL (Database name)
- Download the latest version of Spring Tool Suite (STS)

## Installation and Setup
To install and set up, follow these steps:

1. **Clone the Repository:**

2. **Database Setup:**
- Set up a PostgreSQL database.
- Name the database (remember to update this in `application.properties`).

3. **Import Project into Spring Tool Suite:**
- Open STS.
- Choose `File > Import > Existing Maven/Gradle Projects` and select the cloned directory.

4. **Configure Database:**
- Navigate to `src/main/resources/`.
- Open `application.properties`.
- Update the database name, PostgreSQL username, and password.

5. **Run the Project:**
- Right-click the project in STS and select `Run As > Spring Boot App`.
- The project will run on port 8085.

6. **Access the Application:**
- Use Postman Tool.
- Visit any API in the controller with `https://localhost:8085` and run any API.

## Contribution.
To contribute, follow these steps:
1. Fork the repository.
2. Create a branch: `git checkout -b <branch_name>`.
3. Make your changes and commit them: `git commit -m '<commit_message>'`
4. Push to the original branch: `git push origin <project_name>/<location>`
5. Create a pull request.

## License
This project is licensed under the @2022 Umar Mohammad 

## Contact
If you have any questions or want to contribute, please email us at mohammadumar7w4@gmail.com

