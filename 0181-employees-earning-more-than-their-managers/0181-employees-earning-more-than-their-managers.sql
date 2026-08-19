# Write your MySQL query statement below
SELECT E2.NAME as Employee FROM Employee as e1 INNER JOIN  Employee as  e2 ON E1.id=E2.managerId where e1.salary<e2.salary;