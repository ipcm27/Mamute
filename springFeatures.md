## Spring Boot Auto-Configuration
Spring Boot's auto-configuration is a powerful feature that aims to minimize the amount of manual configuration required in Spring-based applications. 
It automatically configures the Spring application context based on the dependencies present in the classpath, reducing the need for explicit configuration.
For example, if you gave a class with the annoation repository, it already know what to do with tha class. IF you have an JDBCTemplate in this class, it already knows how to intialize a connection and when to close it

## What is classpath:
The classpath is a parameter in the Java Virtual Machine (JVM) that specifies the location of user-defined classes and packages. 
When a Java program is executed, the JVM uses the classpath to locate the bytecode files (.class files) of the classes that the program needs to run.
