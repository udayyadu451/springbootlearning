# springbootlearning
this repository contains code demonstrating spring boot learning 

What you can do with Spring boot?

Spring Boot offers a fast way to build applications. It looks at your classpath and at the beans you have configured, makes reasonable assumptions about what you are missing, and adds those items. With Spring Boot, you can focus more on business features and less on infrastructure.

The following examples show what Spring Boot can do for you:

Is Spring MVC on the classpath? There are several specific beans you almost always need, and Spring Boot adds them automatically. A Spring MVC application also needs a servlet container, so Spring Boot automatically configures embedded Tomcat.

Is Jetty on the classpath? If so, you probably do NOT want Tomcat but instead want embedded Jetty. Spring Boot handles that for you.

Spring boot actuator:
https://docs.spring.io/spring-boot/docs/current/reference/html/production-ready-features.html

Spring boot rest + swagger 
https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api
https://dzone.com/articles/spring-boot-2-restful-api-documentation-with-swagg
After server is up: Hit following urls
http://localhost:8081/swagger-ui.html
http://localhost:8081/v2/api-docs

Api gateway + eureka server
https://javabeginnerstutorial.com/spring-boot/spring-boot-2-microservices-with-netflix-zuul-api-gateway/