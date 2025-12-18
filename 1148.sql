--1148
SELECT Distinct author_id as id
FROM Views
where author_id = viewer_id
order by author_id asc;