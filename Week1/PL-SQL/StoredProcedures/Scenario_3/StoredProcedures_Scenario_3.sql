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

CREATE OR REPLACE PROCEDURE TransferFunds
(
p_source_account IN NUMBER,

p_destination_account IN NUMBER,

p_amount IN NUMBER
)

IS

v_balance NUMBER;

BEGIN

SELECT Balance

INTO v_balance

FROM Accounts

WHERE AccountID = p_source_account;


IF v_balance >= p_amount THEN

UPDATE Accounts

SET Balance = Balance - p_amount

WHERE AccountID = p_source_account;


UPDATE Accounts

SET Balance = Balance + p_amount

WHERE AccountID = p_destination_account;


COMMIT;

DBMS_OUTPUT.PUT_LINE('Transfer successful');

ELSE

DBMS_OUTPUT.PUT_LINE('Insufficient balance');

END IF;

END;
/

SELECT * FROM Accounts;