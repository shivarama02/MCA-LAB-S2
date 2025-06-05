create database store;
use store;

create table product (pdtid varchar(4) primary key, pname varchar(20), price decimal(5,2), Quantity int);

call insertpdt(1001,"Pen",10.5,10);
call insertpdt(1002,"Pencil",5.75,15);
call insertpdt(1003,"Book",25,5);

select * from product;


call insertpdt(1004,"Eraser",-2,20);
call insertpdt(1005,"Paper",1.25,-10);
call insertpdt(1001,"Pen",-2.5,-20);

CALL manage_product_prices();
