# Basic-Login-and-Registry
# Spring Boot User Registration Application

## Overview
This is a Spring Boot application that provides user registration functionality with secure password encoding using Spring Security. The application saves user information (including name, age, and password) into a MySQL database.

## Features
- User registration with password encryption (BCrypt)
- MySQL database integration using Spring Data JPA
- Password encoding with Spring Security
- Endpoint `/register` for user registration
- Secure API with endpoint access control using Spring Security

## Prerequisites
- Java JDK 24 or higher installed
- MySQL database server up and running
- Maven or Gradle (depending on your build tool)
- IDE like IntelliJ IDEA or Eclipse for development

## Setup Instructions

### Database Configuration
1. Create a MySQL database named `datadata`.
2. Update `src/main/resources/application.properties` with your database credentials:
