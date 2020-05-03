DROP TABLE IF EXISTS customers_tbl;

CREATE TABLE customers_tbl ( 
   id INT NOT NULL, 
   name VARCHAR(50) NOT NULL, 
   bill INT NOT NULL, 
   month VARCHAR(50) 
);

select * from customers_tbl;

INSERT INTO customers_tbl (id,name,bill,month) VALUES (1, 'nairobi',100,'JAN');
INSERT INTO customers_tbl(id,name,bill,month) VALUES (2, 'nairobi',110,'FEB');
INSERT INTO customers_tbl(id,name,bill,month) VALUES (3, 'nairobi',50,'MAR');
INSERT INTO customers_tbl(id,name,bill,month) VALUES (4, 'berlin',100,'JAN');
INSERT INTO customers_tbl(id,name,bill,month) VALUES (5, 'berlin',10,'FEB');
INSERT INTO customers_tbl(id,name,bill,month) VALUES (6, 'berlin',150,'MAR');
INSERT INTO customers_tbl(id,name,bill,month) VALUES (7, 'berlin',70,'JAN');
INSERT INTO customers_tbl(id,name,bill,month) VALUES (8, 'denver',200,'JAN');
INSERT INTO customers_tbl(id,name,bill,month) VALUES (9, 'denver',110,'FEB');
INSERT INTO customers_tbl(id,name,bill,month) VALUES (10, 'denver',105,'JAN');
INSERT INTO customers_tbl(id,name,bill,month) VALUES (11, 'denver',30,'MAR');
INSERT INTO customers_tbl(id,name,bill,month) VALUES (12, 'denver',15,'FEB');