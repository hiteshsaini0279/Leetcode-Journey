# Write your MySQL query statement below

-- SELECT salary AS SecondHighestSalary from Employee order by  salary  LIMIT 1,1;

select max(salary) AS SecondHighestSalary from employee as e1 where (select count(distinct(e2.salary)) from employee as e2 where e1.salary<e2.salary)=1;