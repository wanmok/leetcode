# Write your MySQL query statement below
SELECT
t1.FirstName AS FirstName,
t1.LastName AS LastName,
t2.City AS City,
t2.State AS State
FROM Person t1 LEFT JOIN
Address t2 ON t1.PersonId = t2.PersonId