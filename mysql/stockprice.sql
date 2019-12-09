#create database for stock price
create database IF NOT EXISTS stock;

use stock;

DROP TABLE IF EXISTS stockprice;

CREATE TABLE stockprice(
  id bigint auto_increment,
  companycode VARCHAR(512) NOT NULL,
  stockexchange VARCHAR(512) NOT NULL,
  currentprice FLOAT NOT NULL,
  currentdate DATE NOT NULL,
  currenttime TIME NOT NULL,
  primary key(id)
);

DROP TABLE IF EXISTS user;

CREATE TABLE user(
  id bigint auto_increment,
  username VARCHAR(512) NOT NULL,
  password VARCHAR(512) NOT NULL,
  primary key(id)
);


DROP TABLE IF EXISTS company;

CREATE TABLE company(
  id bigint auto_increment,
  name VARCHAR(512) NOT NULL,
  turnover VARCHAR(512) NOT NULL,
  ceo VARCHAR(512) NOT NULL,
  boardofdirectors VARCHAR(512),
  sector VARCHAR(512),
  briefwriteup VARCHAR(512) NOT NULL,
  primary key(id)
);


DROP TABLE IF EXISTS stockexchange;

CREATE TABLE stockexchange(
  id bigint auto_increment,
  name VARCHAR(512) NOT NULL,
  brief VARCHAR(512) NOT NULL,
  contactaddress VARCHAR(512) NOT NULL,
  remark VARCHAR(512) NOT NULL,
  primary key(id)
);

insert into stockexchange(name, brief,contactaddress,remark) values('BSE', 'brief for BSE','contact address for BSE','the remark for BSE');
insert into stockexchange(name, brief,contactaddress,remark) values('NSE', 'brief for NSE','contact address for NSE','the remark for NSE');

DROP TABLE IF EXISTS companystockexchange;

CREATE TABLE companystockexchange(
  company_id bigint,
  stockexchange_id bigint,
  companystockcode VARCHAR(512) NOT NULL,
  primary key(company_id, stockexchange_id),
  foreign key(company_id) references company(id),
  foreign key(stockexchange_id) references stockexchange(id)
);



