
# Employee info Project

- 2 Spring-boot projects:
- employee-company-info: This project handles the company related information for employees.
- employee-details: This project handles the Employee related information.


# Technical Stack
- Spring boot
- Thyme-leaf
- H2 database


# Instructions to test the api
- Import both the projects and run them as spring boot app. (They will run on port 8080 and 8090 respectively so make sure nothing is already running on those ports)
- Endpoint for getting company details: http://localhost:8090/app-api/company/details (It is being use by employee-details project)
- Endpoint for getting details of all employees: http://localhost:8080/app-api/employees/all
- Endpoint for getting details of a specific employee along with details of his company based on id: http://localhost:8080/app-api/employees/{id} (sample uri: http://localhost:8080/app-api/employees/1)
- Endpoint for getting details of all employees on webpage: http://localhost:8080/app/employees/all
- Endpoint for getting details of specific employee on webpage: http://localhost:8080/app/employees/{id} (sample uri: http://localhost:8080/app/employees/4)
