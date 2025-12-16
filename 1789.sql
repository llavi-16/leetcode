--1789
Select employee_id , department_id 
FROM Employee
WHERE primary_flag = "Y"

UNION

Select employee_id , department_id 
FROM Employee
GROUP BY employee_id
having count(*) = 1;

