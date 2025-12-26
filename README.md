PROJECT TITLE
student registration system using JDBC

DESCRIPTION
this is the simple java console based that demonstrates how to use jdbc to connect with a MYSQL database.
This has studentname,rollnumber,department and done using prepared statement

TECHNOLOGY USED
java JDK21
JDBC
MYSQL
Eclipse IDE

DATABASE STRUCTURE
create database student;
use student;
CREATE TABLE studentdetail (
 studentname VARCHAR(50),
 rollnumber INT,
 department VARCHAR(50)
 );
insert into studentdetails values("lallu",1,"cse");
select * from studentdetail;

SAMPLE OUTPUT
connection established
enter studentname:
lallu
enter rollnumber:
1
enter department:
cse
student registered successfully!




