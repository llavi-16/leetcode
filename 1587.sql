--1587
select u.name as NAME, SUM(t.amount) as BALANCE
from Users as u
left join Transactions as t
on u.account = t.account
group by u.name
having BALANCE>10000;