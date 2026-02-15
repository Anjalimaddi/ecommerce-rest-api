Ecommerce REST API
A simple Spring Boot RESTful API for managing ecommerce products.
This application allows users to add products and retrieve product details using REST endpoints.
Live Demo
 Deployed on Render:  https://ecommerce-rest-api-a898.onrender.com/products
 Project Overview
This project is a backend REST API built using Spring Boot.
It demonstrates:
RESTful API design
In-memory data storage using ArrayList
Input validation using Jakarta Validation
Proper HTTP status responses
Deployment using Render
The system manages a collection of products similar to an ecommerce platform like Flipkart or Amazon.
 Technologies Used
Java 17
Spring Boot
Maven
Spring Web
Spring Validation
Render (Cloud Deployment)
Git & GitHub
 Project Structure
Copy code

ecommerce-rest-api
│
├── controller
│   └── ProductController.java
│
├── service
│   └── ProductService.java
│
├── model
│   └── Product.java
│
└── EcommerceApplication.java
 Product Model
Each product contains:
Field
Type
Validation
id
Integer
Must not be null
name
String
Must not be blank
price
double
Must be positive
Example JSON:
Json
Copy code
{
  "id": 1,
  "name": "Laptop",
  "price": 75000
}
API Endpoints
1️ Add a New Product
POST /products
Request Body:
Json
Copy code
{
  "id": 1,
  "name": "Mobile",
  "price": 25000
}
Response:
Copy code

200 OK
2️ Get Product By ID
GET /products/{id}
Example:
Copy code

GET /products/1
Response:
Json
Copy code
{
  "id": 1,
  "name": "Mobile",
  "price": 25000
}
If product not found:
Copy code

404 Not Found
3️⃣ Get All Products
GET /products
Response:
Json
Copy code
[
  {
    "id": 1,
    "name": "Mobile",
    "price": 25000
  }
]
✅ Input Validation
The application validates input using Jakarta Validation.
Invalid request example:
Json
Copy code
{
  "id": null,
  "name": "",
  "price": -100
}
Response:
Copy code

400 Bad Request
Validation Rules:
ID cannot be null
Name cannot be empty
Price must be greater than 0
 Data Storage
Uses in-memory ArrayList
No database used
Data resets when server restarts
 How to Run Locally
1️ Clone the Repository
Copy code

git clone https://github.com/your-username/ecommerce-rest-api.git
2️ Navigate to Project
Copy code

cd ecommerce-rest-api
3️ Run the Application
Copy code

mvn spring-boot:run
Application runs at:
Copy code

http://localhost:8080
☁️ Deployment
The application is deployed on Render.
Deployment Steps:
Push project to GitHub
Connect GitHub to Render
Create Web Service
Use Docker or Maven build
Deploy
