create database university;
use university;

create table student (name varchar(10), student_number int(2) primary key, class int(2), major varchar(20));
create table course (course_name varchar(50), course_number varchar(20) primary key, credit_hours int(2), department varchar(20));
create table section (section_identifier int(3) primary key, course_number varchar(20), semester varchar(20), year int(2), instructor varchar(20), foreign key (course_number) references course (course_number));
create table grade_report (student_number int(2), section_identifier int(3), grade varchar(20), foreign key (student_number) references student(student_number), foreign key (section_identifier) references section (section_identifier), primary key (student_number, section_identifier));
create table prerequisite (course_number varchar(20), prerequisite_number varchar(20), foreign key (course_number) references course(course_number),foreign key (prerequisite_number) references course(course_number), primary key (course_number, prerequisite_number));

insert into student values ("Smith",17,1,"CS"),("Brown",8,2,"CS");
insert into course values ("Intro to Computer Science","CS1310",4,"CS"),("Data Structures","CS3320",4,"CS"),("Discrete Mathamatics","MATH2410",3,"MATH"),("Database","CS3380",3,"CS");
insert into section values (85,"MATH2410","Fall",07,"King") ,(92,"CS1310","Fall",07, "Anderson"),(102,"CS3320","Spring",08,"Knuth"),(112,"MATH2410","Fall",08,"Chang"),(119,"CS1310","Fall",08,"Anderson"),(135,"CS3380","Fall",08,"Stone");
insert into grade_report values (17,112,"B"),(17,119,"C"),(8,85,"A"),(8,92,"A"),(8,102,"B"),(8,135,"A");
insert into prerequisite values ("CS3380","CS3320"),("CS3380","MATH2410"),("CS3320","CS1310");

select * from student;
select * from course;
select * from section;
select * from grade_report;
select * from prerequisite;

select course.course_name, grade_report.grade from student 
inner join grade_report on student.student_number = grade_report.student_number 
inner join section on grade_report.section_identifier = section.section_identifier
inner join course on section.course_number = course.course_number where name = "Smith";

select student.name, grade_report.grade from student 
inner join grade_report on student.student_number = grade_report.student_number 
inner join section on grade_report.section_identifier = section.section_identifier
inner join course on section.course_number = course.course_number where course.course_name = "Database" and section.semester = "Fall" and section.year ="8";

select course_name from course where course_number in (select prerequisite.prerequisite_number from prerequisite 
inner join course on prerequisite.course_number = course.course_number 
where prerequisite.course_number = (select course_number from course where course_name = "Database"));

create view seniors as select * from student where class = 2;
select name from seniors;

select course.course_name from course inner join section on course.course_number = section.course_number where section.instructor = "King" and section.year in ("7","8");

select section.course_number, section.semester, section.year, count(grade_report.student_number) as no_of_students from section 
inner join grade_report on section.section_identifier = grade_report.section_identifier 
where section.instructor = "King" group by grade_report.section_identifier;

select student.name, course.course_name, course.course_number, section.semester, section.year, grade_report.grade from student
inner join grade_report on student.student_number = grade_report.student_number
inner join section on grade_report.section_identifier = section.section_identifier
inner join course on section.course_number = course.course_number
where student.class = 2 and student.major = "CS";

SET SQL_SAFE_UPDATES = 0;  -- Temporarily turn off Safe Update Mode for your current session.
SET SQL_SAFE_UPDATES = 1;  -- Temporarily turn on Safe Update Mode for your current session.

insert into student values("johnson",25,1,"Math");

update student set class = 2 where name = "Smith";

insert into course value ("Knowledge Engineering","CS4390",3,"CS");

delete from student where name = "Smith";













