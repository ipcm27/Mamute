drop table person;
create table person
(
    ID integer not null,
    NAME varchar(255) not null,
    LOCATION varchar(255),
    BIRTH_DATE TIMESTAMP,
    primary key (ID)
);

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES (1, 'John', 'Brazil', CURRENT_TIMESTAMP);
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES (2, 'Alice', 'United States', '1990-05-15 00:00:00');
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES (3, 'Maria', 'Spain', '1985-10-20 00:00:00');
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES (4, 'Carlos', 'Mexico', '1978-03-25 00:00:00');
