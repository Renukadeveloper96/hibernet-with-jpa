create table person
(
id integer not null,
name varchar(255) not null,
location varchar(255),
--birth_date timestamp,
primary key(id)
);

INSERT INTO PERSON
(id,name,location
)
VALUES(10001,'Ragu','New York' );

INSERT INTO PERSON
(id,name,location
)
VALUES(10002,'ravi','New York' );

INSERT INTO PERSON
(id,name,location
--BIRTH_DATE
)
VALUES(10003,'James','New York' );
select * from person;