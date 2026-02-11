# Write your MySQL query statement below
select name as Customers from customers c1 left join Orders c2 on c1.id = c2.customerId where c2.customerId is null;
