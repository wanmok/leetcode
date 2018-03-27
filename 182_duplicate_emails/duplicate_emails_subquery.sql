# Write your MySQL query statement below
select t1.Email from (select Email, count(Id) as num from Person group by Email) t1 where t1.num >= 2;