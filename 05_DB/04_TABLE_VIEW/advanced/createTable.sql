use sqldb;

drop table if exists buytbl;
drop table if exists userTBL;

# create table userTBL
# (
#     userID    char(8)     not null primary key,
#     name      varchar(10) null,
#     birthYear int         null check ( 1900 <= birthYear <= 2023 ),
#     mobile    char(3)     not null
# );

create table userTBL
(
    userID    char(8)     not null primary key,
    name      varchar(10) not null,
    birthYear int      default -1,
    addr      char(2)  default '서울',
    mobile1   char(3)     null,
    mobile2   char(8)     null,
    height    smallint default 170,
    mDate     date        null


);

INSERT INTO userTBL
VALUES ('MINSU', '민수', DEFAULT, DEFAULT, null, null, DEFAULT, null);

alter table userTBL
    drop column mobile1;

alter table userTBL
    change column name uName varchar(10) not null;

alter table userTBL
    drop primary key ;