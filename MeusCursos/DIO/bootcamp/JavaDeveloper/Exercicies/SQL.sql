show databases;
create database if not exists first_example;
use first_example;
CREATE TABLE person(
	person_id smallint unsigned,
	fname varchar(20),
	lname varchar(20),
	gender enum('M','F','Others'),
	birth_date DATE,
	street varchar(30),
	city varchar(20),
	state varchar(20),
	country varchar(20),
	postal_code varchar(20),
    constraint pk_person primary key (person_id)
);
desc person;

create table favorite_food(
	person_id smallint unsigned,
    food varchar(20),
    constraint pk_favorite_food primary key (person_id, food),
    constraint fk_favorite_food_person_id foreign key(person_id)
    references person(person_id)
);

desc favorite_food;
show databases;
desc information_schema.table_constraints;
select * from information_schema.table_constraints
where constraint_schema = 'first_example';

insert into person values ('1','Jonata','Mendes','M','2001-09-01','rua-tal','Cidde','RJ','Brasil','65415-000');
insert into person values ('2','Jonata','Mendes','M','2001-09-01','rua-tal','Cidde','RJ','Brasil','65415-000');
select * from person;

delete from person where person_id=2 
or person_id=3
or person_id=4

desc favorite_food;

insert into favorite_fod values (1,'lasanha'),
(2,'carne'),
(3,'carneseca');

select * from favorite_food;