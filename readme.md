# 🍃SpringBoot CRUD operations using JPA

This repository gives the detailed understanding of CRUD operations mentioned in <a href="https://github.com/yokeshkumar7105/springboot_CRUD-fixedLogic">other repository</a> where fixed logic is used. Here, the same concepts implemented along with the database.

**Disadvantage of Using Fixed Logic**

➤ Modified data disappears after program shutdown(Only static data remains)

➤ Large number of data leads to unmanageable one

➤ Cannot maintain all the data    

So there is a need of data persistance there comes JPA (Java Persistance API). Actually JPA defines a common thing on how to map the java objects to database (i.e.,) how to convert objects in java class to tables in database. One of the main benefit of JPA is ORM(Object Relational Mapping) which helps to achieve the job defined by JPA. Many ORM tools are used in recent days such as Hibernate(used in this repository), Eclipse Link etc.,

## 🧩Behind the scenes 

Hibernate which is an ORM framework which helps us in converting the Java objects into tables ensuring all the variables in java class maps to column name in a table and the class name maps to table name. When an request is made by the service layer, the repository interface connects with database and ORM helps to interact with database by giving query. For instance, if I need to GET all values from database, the request sent to repository interface it fetches the data through ORM which gives the neccessary query to interact with database. Then the fetched data is given as response through API endpoint where request is made.

## Repo Structure
```
├── .gitattributes
├── .gitignore
├── .mvn
    └── wrapper
    │   └── maven-wrapper.properties
├── mvnw
├── mvnw.cmd
├── pom.xml
├── readme.md
└── src
    ├── main
        ├── java
        │   └── com
        │   │   └── example
        │   │       └── JPAConcepts
        │   │           ├── JpaConceptsApplication.java
        │   │           ├── controller
        │   │               └── StudentController.java
        │   │           ├── model
        │   │               └── Student.java
        │   │           ├── repository
        │   │               └── StudentRepository.java
        │   │           └── service
        │   │               └── StudentService.java
        └── resources
        │   └── application.properties
    └── test
        └── java
            └── com
                └── example
                    └── JPAConcepts
                        └── JpaConceptsApplicationTests.java
```



<i>*This is purely meant for learning purpose only. One can learn this concepts and apply it in their projects.</i>
