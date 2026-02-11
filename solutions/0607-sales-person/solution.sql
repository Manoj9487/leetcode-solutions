# Write your MySQL query statement below
select s.name from SalesPerson s where s.name not in (Select s.name from SalesPerson s left join Orders o on o.sales_id = s.sales_id left join company c on c.com_id = o.com_id where c.name = 'Red');
