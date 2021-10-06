# Chootay-Taimoor
Upstart Assignment
1. Dump20211006 folder includes schema files with data in it. Would require Schema and Data import from MySql
   "root" Password needed to be changed at ChootayBikes\src\main\resources\application.properties
2. If above mentioned schema import works then goto step 4 otherwise got to step 3
3. Need to edit ChootayBikes\src\main\resources\application.properties
   Swap this line "spring.jpa.hibernate.ddl-auto=update"
              with this
                  "spring.jpa.hibernate.ddl-auto=craete-drop"
4. Then tables will need to be populated.
5. At login page, for all username added in db for now those are ("Owner","SalesPerson","Mechanic","Manager","Mechanic","Customer") password is "pass"
6. On the basis of roles, each user should be able to redirected to page of their interest or access.(Not complely implemented)


After running this application
these urls would be helpful
localhost:8080/home/owner
localhost:8080/home/manager

localhost:8080/bike/bikes
localhost:8080/bike/listbikes
localhost:8080/bike/addNewBike
.
.
.
.
