CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(50),
    Age NUMBER,
    Balance NUMBER,
    IsVIP VARCHAR2(5)
);

CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    InterestRate NUMBER,
    DueDate DATE,

    FOREIGN KEY (CustomerID)
    REFERENCES Customers(CustomerID)
);

INSERT INTO Customers VALUES (1,'Aries Yin',65,15000,'FALSE');
INSERT INTO Customers VALUES (2,'Chanel Cao',45,8000,'FALSE');
INSERT INTO Customers VALUES (3,'Alice Sun',70,20000,'FALSE');
INSERT INTO Customers VALUES (4,'Henry Li',30,12000,'FALSE');
INSERT INTO Customers VALUES (5,'Saddie Wen',30,12000,'TRUE');
INSERT INTO Customers VALUES (6,'Julius Gong',33,15000,'TRUE');


INSERT INTO Loans VALUES (101,1,8,DATE '2026-07-10');
INSERT INTO Loans VALUES (102,2,9,DATE '2026-09-20');
INSERT INTO Loans VALUES (103,3,7.5,DATE '2026-07-05');
INSERT INTO Loans VALUES (104,4,8.5,DATE '2026-12-15');
INSERT INTO Loans VALUES (105,5,9,DATE '2026-08-10');
INSERT INTO Loans VALUES (106,6,5,DATE '2026-09-10');


SELECT * FROM Customers;

SELECT * FROM Loans;

BEGIN
   FOR r IN (
      SELECT c.Name, l.DueDate
      FROM Customers c
      JOIN Loans l
      ON c.CustomerID = l.CustomerID
      WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30
   )
   LOOP
      DBMS_OUTPUT.PUT_LINE(
         'Reminder: ' || r.Name ||
         ', your loan is due on ' ||
         TO_CHAR(r.DueDate, 'DD-MON-YYYY')
      );
   END LOOP;
END;
/
SELECT c.Name,
       l.DueDate
FROM Customers c
JOIN Loans l
ON c.CustomerID = l.CustomerID
WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30;