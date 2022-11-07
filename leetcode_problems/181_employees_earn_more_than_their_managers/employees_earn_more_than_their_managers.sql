# Write your MySQL query statement below
SELECT
t1.Name AS Employee
FROM Employee t1
LEFT JOIN Employee t2
ON t1.ManagerId = t2.Id
WHERE t1.Id IS NOT NULL
AND t1.Salary > t2.Salary;