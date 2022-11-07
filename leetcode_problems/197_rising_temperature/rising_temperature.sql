# Write your MySQL query statement below
SELECT t1.Id AS Id
FROM Weather t1
LEFT JOIN Weather t2
ON DATE_FORMAT(t1.RecordDate, '%Y%m%d') = DATE_FORMAT(DATE_ADD(t2.RecordDate, INTERVAL +1 DAY), '%Y%m%d')
WHERE (t1.Temperature - t2.Temperature) > 0;