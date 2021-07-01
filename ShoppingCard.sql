CREATE DATABASE SHOP_CARD
USE SHOP_CARD

CREATE TABLE CustomerTBL(CustomerID varchar(5) not null primary key,
CustomerName nvarchar(50) not null, PW varchar(10) not null)

CREATE TABLE ProductTBL(ProductID int identity(1,1) primary key not null,
ProductName nvarchar(50) not null, ProductPrice int not null)

CREATE TABLE OrderTBL(OrderID int identity(1,1) primary key,
OrderDate Date not null, PaymentMethod float not null, 
CustomerID varchar(5) not null
FOREIGN KEY (CustomerID) REFERENCES CustomerTBL(CustomerID))

CREATE TABLE OrderLineTBL(OrderID int not null, ProductID int not null,
Quantity int not null, Price float not null
FOREIGN KEY (ProductID) REFERENCES ProductTBL(ProductID),
FOREIGN KEY (OrderID) REFERENCES OrderTBL(OrderID),
primary key(OrderID,ProductID))

Insert into ProductTBL(ProductName,ProductPrice)
values(N'Bàn Chải',1000),
(N'Dầu gội',500),
('Nồi cơm điện',2200),
('Giày Nike',5550),
('Balo Kéo',7000),
('Xúc Xích',300)

Insert into CustomerTBL
values('PR001',N'Nguyễn Văn Linh','123qwe'),
('PR002',N'Nguyễn Văn Vũ','123qwe'),
('PR003',N'Trần Đình Kiên','123qwe'),
('PR004',N'Lê Văn Bê','123qwe'),
('PR005',N'Nguyễn Tấn Dũng','123qwe'),
('PR006',N'Đỗ Văn Hạ','123qwe')
select * from ProductTBL
select * from CustomerTBL
select * from OrderTBL
select * from OrderLineTBL