# RS Hola 2

Ejemplo de proyecto Spring Boot 2 que corre en Tomcat.

pom.xml
```xml
<dependencies>
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-tomcat</artifactId>
		<scope>provided</scope>
	</dependency>
</dependencies>
<build>
	<finalName>${artifactId}</finalName>
  <!-- ... -->
</build>
```
