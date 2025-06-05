create database employee;
use employee;

CREATE TABLE Department (
    Dept_no INT PRIMARY KEY,
    Dept_Name VARCHAR(100),
    location VARCHAR(100)
);

CREATE TABLE Employee (
    Emp_no INT PRIMARY KEY,
    Emp_Name VARCHAR(100),
    Salary DECIMAL(10, 2),
    Dept_no INT,
    FOREIGN KEY (Dept_no) REFERENCES Department(Dept_no)
);

INSERT INTO Department VALUES (1, 'HR', 'New York');
INSERT INTO Department VALUES (2, 'IT', 'San Francisco');

INSERT INTO Employee VALUES (101, 'Alice', 28000, 1);
INSERT INTO Employee VALUES (102, 'Bob', 32000, 1);CREATE DATABASE `employee` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

INSERT INTO Employee VALUES (103, 'Charlie', 25000, 2);

SELECT *
FROM Employee 
inner join Department  ON Employee.Dept_no = Department.Dept_no
WHERE Department.location = 'New York';

SELECT Dept_no, COUNT(*) AS num_employees
FROM Employee
GROUP BY Dept_no;

UPDATE Employee
SET Salary = Salary * 1.10
WHERE Dept_no = (
    SELECT Dept_no FROM Department WHERE Dept_Name = 'HR'
);

select * from department;
select * from employee;

call CheckAndPromoteEmployee(101);
