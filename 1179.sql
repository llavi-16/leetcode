--1179
Select id,
SUM(case when month = 'Jan'  then revenue END) AS Jan_Revenue,
SUM(case when month = 'Feb'  then revenue END) AS Feb_Revenue,
SUM(case when month = 'Mar'  then revenue END) AS Mar_Revenue,
SUM(case when month = 'Apr'  then revenue END) AS Apr_Revenue,
SUM(case when month = 'May'  then revenue END) AS May_Revenue,
SUM(case when month = 'Jun'  then revenue END) AS Jun_Revenue,
SUM(case when month = 'Jul'  then revenue END) AS Jul_Revenue,
SUM(case when month = 'Aug'  then revenue END) AS Aug_Revenue,
SUM(case when month = 'Sep'  then revenue END) AS Sep_Revenue,
SUM(case when month = 'Oct'  then revenue END) AS Oct_Revenue,
SUM(case when month = 'Nov'  then revenue END) AS Nov_Revenue,
SUM(case when month = 'Dec'  then revenue END) AS Dec_Revenue
from Department
group by id;