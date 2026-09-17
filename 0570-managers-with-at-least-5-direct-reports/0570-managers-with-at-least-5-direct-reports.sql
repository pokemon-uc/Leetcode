# Write your MySQL query statement below
Select e.name from 
Employee e
JOIN Employee o 
ON e.id=o.managerId
GROUP BY e.id,e.name
HAVING count(o.managerId)>=5
