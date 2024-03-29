# Write your MySQL query statement below
select name, sum(amount) as balance from Users natural join Transactions group by account having balance > 10000;
