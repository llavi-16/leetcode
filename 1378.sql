--1378
select ee.unique_id as unique_id,e.name as name
from Employees as e
left join EmployeeUNI as ee
on e.id = ee.id;