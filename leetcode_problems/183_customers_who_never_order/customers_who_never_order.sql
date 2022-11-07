# Write your MySQL query statement below
SELECT
t1.Name As Customers
FROM Customers t1
LEFT JOIN Orders t2
ON t1.Id = t2.CustomerId
GROUP BY t1.Id, t1.Name
HAVING COUNT(t2.Id) = 0;