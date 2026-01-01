--1661
select a.machine_id, round(avg(aa.timestamp - a.timestamp),3) as processing_time
from Activity as a
join Activity as aa
on a.machine_id = aa.machine_id
and a.process_id = aa.process_id
and a.activity_type = 'start'
and aa.activity_type = 'end'
group by a.machine_id;