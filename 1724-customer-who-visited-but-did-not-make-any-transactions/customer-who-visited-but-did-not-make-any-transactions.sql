# Write your MySQL query statement below

SELECT v.customer_id,count(*) as count_no_trans

from Visits v
LEFT join Transactions T
on v.visit_id=T.visit_id 
where T.transaction_id is null
group by v.customer_id;