begin transaction
commit
rollback



insert into department (department_id, department_name, project_number, employee_id, number_of_employees)

values ('1', 'technology', '123', '1', '2')
values ('2', 'sales', '419', '4,6,8', '3')
values ('3', 'legal', '64', '2,3,7', '3')


insert into project (project_id, project_number, project_name, start_date, number_of_employees)
values ('1', '123', 'project_blue_book', '11/23/2017', '3');
values ('2', '419', 'project_santa', '12/25/2025', '3');
values ('3', '64', 'project_good_vision', '2/20/2020', '2');

select employee.employee_id
from employee
join employee_department on employee_department.employee_id = employee.employee_id

select department.department_id
from department
join employee_department on department.department_id = employee_department.department_id

CREATE table employee_department (
employee_id INT REFERENCES employee (employee_id) NOT NULL,
department_id INT REFERENCES deparment (department_id) NOT NULL,
constraint pk_employee_department_employee_id_department_id PRIMARY KEY (employee_id_id, department_id) 
);



department emp id ref employee_dep emp

insert into employee (employee_id, first_name, last_name, gender, birthday, hire_date, department)

values ('1', 'Tyler', 'Waddington', 'M', '11/23/92', '12/25/2016', 'technology');
values ('2','Joe', 'King', 'M', '7/4/1950', '3/11/2017', 'legal');
values ('3', 'Ben', 'Dover', 'M', '3/8/52', '2/4/98', 'legal');
values ('4', 'Mike', 'Hunt', 'M', '2/4/69', '4/5/2000', 'sales');
values ('5', 'Arty', 'Fischel', 'M', '10/6/22', '3/9/2016', 'technology');
values ('6', 'Hugh', 'Jass', 'M', '2/7/83', '12/12/1999', 'sales');
values ('7', 'Joe', 'King', 'M', '7/4/1950', '3/11/2017', 'legal');
values ('8', 'Anita', 'Bath', 'F', '4/12/88', '10/8/2010', 'sales');

select * from department where department_name LIKE '%l%'