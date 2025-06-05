create database stores;
use stores;

create table product (pdtid int primary key, pname varchar(20), price decimal(5,2), qtyinstock int);
create table sale (saleid int primary key, deliveryaddress varchar(50));
create table saleitem (saleid int, pdtid int, qnt int, foreign key (saleid) references sale(saleid), foreign key (pdtid) references product(pdtid),
primary key(saleid, pdtid));

insert into product values (101,"Pencil",5,10),(102,"Pen",3,10);
insert into sale values (001,"home123"),(002,"home456");

select * from product;
select * from sale;
select * from saleitem;

insert into saleitem values (001,102,8);
insert into saleitem values (002,101,3);
insert into saleitem values (002,102,1);









