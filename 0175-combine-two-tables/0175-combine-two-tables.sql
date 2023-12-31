# Write your MySQL query statement below
select p.lastName,p.firstName,s.city,s.state
from Person p
left join Address s
on p.personId=s.personId;
