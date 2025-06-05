create database employ;
use employ;

create table employee (eid int primary key, ename varchar(20), deptid varchar(10), designation varchar(10), salary decimal(10,2), doj date, 
foreign key (deptid) references department(deptid));
create table department (deptid varchar(10) primary key, dname varchar(10));

insert into department values 
('D1', 'Sales'),
('D2', 'Marketing'),
('D3', 'Finance');
insert into employee values 
(101, 'Sudha',   'D2', 'Clerk',    20000, '2010-04-01'),
(102, 'David',   'D1', 'Manager',  50000, '2018-02-18'),
(103, 'Preethi', 'D3', 'Clerk',    35000, '2011-06-13'),
(104, 'Kiran',   'D1', 'Salesman', 20000, '2014-03-07'),
(105, 'Meenal',  'D2', 'Clerk',    50000, '2011-12-09'),
(106, 'Sunitha', 'D3', 'Manager',  60000, '2018-09-25'),
(107, 'Akhil',   'D3', 'Clerk',    25000, '2016-02-14'),
(108, 'Sushma',  'D2', 'Manager',  45000, '2012-01-31');

select * from department;
select * from employee;

select avg(salary) from employee;
select * from employee where salary > (select avg(salary) from employee);
select employee.eid,employee.ename,department.dname from employee inner join department on employee.deptid = department.deptid;
select * from employee order by salary desc;
select distinct designation from employee;
select * from employee order by deptid asc, salary asc;
select * from employee where designation = "Clerk" and deptid = "D2";
select * from employee where year(doj) = 2011;
select * from employee where monthname(doj) = 'February';
select * from employee where salary > 30000 and salary < 45000;
select timestampdiff(year, doj, curdate()) as work_experiance from employee;

delete from employee where eid = 101;   -- Error Code: 1644. cannot be delete this employee














