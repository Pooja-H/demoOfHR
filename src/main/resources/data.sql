DROP TABLE IF EXISTS applicationStatus;

CREATE TABLE applicationStatus(
 id INT AUTO_INCREMENT  PRIMARY KEY,
  status VARCHAR(250) NOT NULL,
  applicantId int
  knownLang varchar(250)
);

create table applicantDetails(
id int AUTO_INCREMENT  PRIMARY KEY,
firstName varchar(250) not null,
lastName varchar(250) not null,
phnumber int
);

create table organisation(
id int  AUTO_INCREMENT  PRIMARY KEY,
name varchar(250) not null
)