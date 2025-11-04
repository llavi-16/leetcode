--185
select d.name as Department , e.name as Employee ,e.Salary
from Employee as e
join Department as d
on e.departmentId = d.id
where (
    select count(distinct e2.salary)
    from Employee as e2
    where e2.departmentId  = e.departmentId 
    and e2.Salary>e.Salary

)<3;