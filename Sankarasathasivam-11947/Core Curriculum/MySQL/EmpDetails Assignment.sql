create database Shiva;
use Shiva;
show databases;
create table EmpDetails(
EmpID int,
EmpName varchar(25),
Salary int,
DeptNo int,
JobID varchar(25));
show tables;

insert into EmpDetails values(100,'John',23000,10,'IT Programmer');
insert into EmpDetails values(200,'Johnny',33000,10,'IT Programmer');
insert into EmpDetails values(300,'Johns',13000,20,'Sales Rep');
insert into EmpDetails values(400,'Johnson',22000,30,'Clerk');
insert into EmpDetails values(500,'Johncy',11000,20,'Sales Rep');
insert into EmpDetails values(700,'Johncena',25000,30,'Clerk');
insert into EmpDetails values(600,'John Smith',12000,20,'Sales Rep');

select * from EmpDetails;
SET SQL_SAFE_UPDATES=0;
update EmpDetails set Salary=Salary+1000 where DeptNo=20;

select EmpName from EmpDetails where Salary>20000;
select JobID,count(JobID) from EmpDetails group by JobID;



