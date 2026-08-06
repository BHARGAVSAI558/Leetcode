# Write your MySQL query statement below

select e1.unique_id , e2.name
from EmployeeUNI e1
RIGHT JOIN Employees e2
ON e1.id=e2.id;