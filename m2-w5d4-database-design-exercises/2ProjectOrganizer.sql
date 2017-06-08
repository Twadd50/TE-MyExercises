DROP TABLE department

CREATE TABLE employee (
employee_id SERIAL PRIMARY KEY,
first_name VARCHAR (255) NOT NULL,
last_name VARCHAR(255) NOT NULL,
gender VARCHAR (255) NOT NULL,
birthday varchar NOT NULL,
hire_date varchar(255) NOT NULL ,
department VARCHAR(255) NOT NULL
);

CREATE TABLE department (
department_id serial PRIMARY KEY not null,
department_name VARCHAR (255) not null,
project_number int not null,
employee_id varchar (255),
number_of_employees int not null
);

CREATE TABLE project (
project_id int primary key not null,
project_number int not null,
project_name varchar(255) not null,
start_date varchar not null,
number_of_employees int not null
);

CREATE TABLE employee_department (
employee_id int references employee (employee_id) not null,
department_id int references department (department_id) not null,
constraint pk_employee_department_employee_id_department_id
primary key (employee_id, department_id)
);

CREATE TABLE employee_project (
employee_id int references employee (employee_id) not null,
project_id int references project (project_id) not null,
constraint employee_project_employee_id_project_id
primary key (employee_id, project_id)
);





































