Select ContactName adi, CompanyName sirketadi, City sehir from Customers
Select * from Customers where City = 'London'

Select * from Products where CategoryID=1 or CategoryID=3

Select * from Products where CategoryID=1 and UnitPrice<10

Select * from Products order by UnitPrice desc

select count(*) Adet from Products where CategoryID=1

select CategoryID,count(*) from products where UnitPrice>20

group by CategoryID having count(*)<10

--innerjoin sadece iki tablodada eşleşen dataları getirir
--left join yazıma göre soldaki tabloda olup sağdaki tabloda olmayan dataları getirir

Select * from Products p inner join [Order Details] od on p.ProductID = od.ProductID inner join Orders o on o.OrderID = od.OrderID

Select * from Customers c left join Orders o on c.CustomerId = o.CustomerId where o.CustomerId is null

