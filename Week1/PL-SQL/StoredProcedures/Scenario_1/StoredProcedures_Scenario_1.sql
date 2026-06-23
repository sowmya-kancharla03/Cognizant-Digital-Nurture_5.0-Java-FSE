CREATE TABLE Accounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerName VARCHAR2(50),
    AccountType VARCHAR2(20),
    Balance NUMBER
);

CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    EmployeeName VARCHAR2(50),
    Department VARCHAR2(50),
    Salary NUMBER
);

INSERT INTO Accounts VALUES (101,'Ram','Savings',10000);

INSERT INTO Accounts VALUES (102,'Sita','Savings',15000);

INSERT INTO Accounts VALUES (103,'John','Current',20000);

INSERT INTO Accounts VALUES (104,'Mary','Savings',12000);


INSERT INTO Employees VALUES (1,'Asha','IT',50000);

INSERT INTO Employees VALUES (2,'Ravi','IT',60000);

INSERT INTO Employees VALUES (3,'Priya','HR',45000);

INSERT INTO Employees VALUES (4,'Kiran','Finance',55000);

select * from Employees;
select * from Accounts;

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
IS
BEGIN

UPDATE Accounts

SET Balance = Balance + (Balance * 0.01)

WHERE AccountType='Savings';

COMMIT;

DBMS_OUTPUT.PUT_LINE('Monthly interest applied');

END;
/

SELECT AccountID,
       CustomerName,
       AccountType,
       Balance
FROM Accounts;