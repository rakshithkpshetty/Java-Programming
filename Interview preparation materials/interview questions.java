What is Spring Boot?
Spring Boot is an open-source framework built on top of the Spring Framework that simplifies the development of Java-based applications. It is designed to make it easier to create stand-alone, production-grade Spring-based applications with minimal configuration.

⬆ Back to Top

What are the advantages of Spring Boot?
The main advantages of Spring Boot include:

Auto-configuration: Automatically configures Spring and third-party libraries based on project dependencies.
Standalone: Spring Boot applications can run as standalone Java applications.
Production-ready: Includes features like metrics, health checks, and externalized configuration.
Microservice-ready: Ideal for building microservices due to its lightweight and modular design.
⬆ Back to Top

What are the main features of Spring Boot?
Major features of Spring Boot are:

Auto-configuration: Automatically configures your Spring application based on the dependencies you have added.
Standalone: Spring Boot applications can be run from the command line.
Production-ready: Includes built-in features for monitoring and managing your application.
Microservices: Facilitates building microservices with minimal configuration.
⬆ Back to Top

What are the differences between Spring and Spring Boot?
Configuration: Spring requires extensive XML configuration or Java-based configuration. Spring Boot offers auto-configuration and minimal setup.
Setup: Spring projects typically need manual setup and configuration, while Spring Boot provides default configurations and embedded servers.
Dependencies: Spring Boot includes a variety of dependencies and auto-configuration out of the box, reducing the need for manual dependency management.
⬆ Back to Top

How does Spring Boot simplify development?
Spring Boot simplifies development by:

Reducing Configuration: Provides default configurations and auto-configuration options.
Embedded Servers: Includes embedded servers like Tomcat, Jetty, or Undertow, eliminating the need for external server setup.
Spring Boot Starter Projects: Offers pre-configured dependency sets for common tasks.
⬆ Back to Top

How to create a Spring Boot application using Maven?
To create a Spring Boot application using Maven, follow these steps:

Add the Spring Boot dependencies to your pom.xml:

<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter</artifactId>
</dependency>
Create the main application class with @SpringBootApplication annotation:

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
Run your application using Maven:

mvn spring-boot:run
⬆ Back to Top

How to create a Spring Boot project using Spring Initializer?
To create a Spring Boot project using Spring Initializr:

Visit Spring Initializr.
Choose the project metadata (e.g., Project, Language, Spring Boot version).
Add dependencies.
Click "Generate" to download a ZIP file containing your Spring Boot project.
⬆ Back to Top

How do you create a simple Spring Boot application?
To create a simple Spring Boot application:

Create a new Maven project and add Spring Boot dependencies.

Create a main application class with @SpringBootApplication.

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
Create a REST controller:

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
  @GetMapping("/hello")
  public String sayHello() {
    return "Hello, Spring Boot!";
  }
}
⬆ Back to Top

What are Spring Boot Starters?
Spring Boot Starters are a set of convenient dependency descriptors you can include in your application. They simplify the process of adding commonly used dependencies.

Example of including a Spring Boot Starter in pom.xml:

<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-web</artifactId>
</dependency>
⬆ Back to Top

What is the use of the @SpringBootApplication annotation?
The @SpringBootApplication annotation is used to mark the main class of a Spring Boot application. It combines the following annotations:

@Configuration
@EnableAutoConfiguration
@ComponentScan
It enables auto-configuration and component scanning.

⬆ Back to Top

What is the Spring Initializr?
The Spring Initializr is an online tool that helps generate a Spring Boot project with the desired configuration and dependencies. You can access it at start.spring.io.

⬆ Back to Top

What are the Spring Boot annotations?
Key Spring Boot annotations include:

@SpringBootApplication
@RestController
@RequestMapping
@Service
@Repository
@Configuration
⬆ Back to Top

What is Spring Boot dependency management?
Spring Boot manages dependencies by providing default versions and configurations for commonly used libraries through its starter dependencies. It helps avoid version conflicts and simplifies dependency management.

⬆ Back to Top

What are the Spring Boot properties?
Spring Boot properties are configuration settings that can be defined in application.properties or application.yml files to customize the behavior of your application.

Example of application.properties:

server.port=8081
spring.datasource.url=jdbc:mysql://localhost:3306/mydb
⬆ Back to Top

What are Spring Boot starters?
Spring Boot starters are pre-configured dependency sets for common application needs. They simplify dependency management by grouping related dependencies into a single artifact.

⬆ Back to Top

What is Spring Boot Actuator?
Spring Boot Actuator provides production-ready features such as monitoring, metrics, and health checks. It helps in managing and monitoring your application in production environments.

⬆ Back to Top

How to connect Spring Boot to the database using JPA?
To connect Spring Boot to a database using JPA:

Add JPA and database dependencies to pom.xml:

<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
  <groupId>com.h2database</groupId>
  <artifactId>h2</artifactId>
  <scope>runtime</scope>
</dependency>
Configure database settings in application.properties:

spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
Create JPA entity and repository:

@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  // Getters and setters
}

public interface UserRepository extends JpaRepository<User, Long> {}
⬆ Back to Top

How to connect Spring Boot application to a database using JDBC?
To connect Spring Boot to a database using JDBC:

Add JDBC dependency to pom.xml:

<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-jdbc</artifactId>
</dependency>
Configure database settings in application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/mydb
spring.datasource.username=root
spring.datasource.password=root
Create a JdbcTemplate bean:

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
  @Bean
  public JdbcTemplate jdbcTemplate(DataSource dataSource) {
    return new JdbcTemplate(dataSource);
  }
}
⬆ Back to Top

What is @RestController annotation in Spring Boot?
The @RestController annotation is a combination of @Controller and @ResponseBody. It is used to create RESTful web services by marking a class as a web controller where every method returns a domain object instead of a view.

Example:

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
  @GetMapping("/hello")
  public String sayHello() {
    return "Hello, Spring Boot!";
  }
}
⬆ Back to Top

What is @RequestMapping annotation in Spring Boot?
The @RequestMapping annotation is used to map web requests to specific handler methods. It can be used at the class or method level to define the URL patterns for which the methods should be invoked.

Example:

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
  @GetMapping("/hello")
  public String sayHello() {
    return "Hello, Spring Boot!";
  }
}
⬆ Back to Top

How does Spring Boot simplify dependency management?
Spring Boot simplifies dependency management by:

Providing Starters: Pre-configured dependency sets for common use cases.
Auto-Configuration: Automatically configures application components based on the included dependencies.
Dependency Management: Uses dependency management to handle version conflicts and ensure compatibility.
⬆ Back to Top

What is the role of embedded servers in Spring Boot?
Embedded servers in Spring Boot allow applications to be run as standalone Java applications. Spring Boot includes embedded servers like Tomcat, Jetty, and Undertow, which simplifies deployment and reduces the need for external web server setup.

⬆ Back to Top

What are Profiles in Spring Boot?
Profiles in Spring Boot are used to segregate parts of your application configuration and make it only available in certain environments. They help in managing different configurations for development, testing, and production.

Example of using profiles:

# application-dev.properties
server.port=8081

# application-prod.properties
server.port=80
⬆ Back to Top

Intermediate Questions
What are the basic Spring Boot annotations?
Basic Spring Boot annotations include:

@SpringBootApplication
@RestController
@Service
@Repository
@Configuration
@Component
⬆ Back to Top

Is it possible to change the port of the embedded Tomcat server in Spring Boot?
Yes, you can change the port of the embedded Tomcat server by setting the server.port property in application.properties:

server.port=8081
⬆ Back to Top

What is the starter dependency of the Spring Boot module?
A Spring Boot starter is a dependency descriptor that simplifies adding common dependencies. For example, spring-boot-starter-web is used for building web applications:

<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-web</artifactId>
</dependency>
⬆ Back to Top

What is the default port of Tomcat in Spring Boot?
The default port of Tomcat in Spring Boot is 8080. You can change it by setting the server.port property in application.properties:

server.port=8081
⬆ Back to Top

Can we disable the default web server in the Spring Boot application?
Yes, you can disable the default web server in a Spring Boot application by using the spring.main.web-application-type property. Set it to none:

spring.main.web-application-type=none
⬆ Back to Top

How to disable a specific auto-configuration class?
You can exclude a specific auto-configuration class by using the @SpringBootApplication annotation with the exclude attribute:

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MyApplication {
  public static void main(String[] args) {
    SpringApplication.run(MyApplication.class, args);
  }
}
⬆ Back to Top

Can we create a non-web application in Spring Boot?
Yes, you can create a non-web application in Spring Boot by setting the spring.main.web-application-type property to none in application.properties:

spring.main.web-application-type=none
⬆ Back to Top

Explain @RestController annotation in Spring Boot.
The @RestController annotation combines @Controller and @ResponseBody. It is used to create RESTful web services where each method returns a domain object instead of a view. The response is serialized directly to JSON or XML.

Example:

@RestController
@RequestMapping("/api")
public class HelloController {
  @GetMapping("/hello")
  public String sayHello() {
    return "Hello, Spring Boot!";
  }
}
⬆ Back to Top

Difference between @Controller and @RestController?
@Controller: Used for creating web controllers that return views (HTML, JSP). Methods typically return the name of a view to be rendered.
@RestController: Used for creating RESTful web services. Methods return domain objects, and the response is serialized to JSON or XML.
⬆ Back to Top

What is the difference between RequestMapping and GetMapping?
@RequestMapping: Can be used to map HTTP requests to specific handler methods, supporting all HTTP methods (GET, POST, PUT, DELETE, etc.).
@GetMapping: A specialized version of @RequestMapping for handling GET requests.
Example:

@RequestMapping("/api")
public class MyController {
  @GetMapping("/hello")
  public String hello() {
    return "Hello!";
  }

  @PostMapping("/hello")
  public String createHello() {
    return "Created!";
  }
}
⬆ Back to Top

What are Profiles in Spring Boot?
Profiles in Spring Boot allow you to segregate application configuration and make it available only in specific environments. You can define different properties for different profiles (e.g., dev, test, prod).

Example:

# application-dev.properties
server.port=8081

# application-prod.properties
server.port=80
To activate a profile, use:

spring.profiles.active=dev
⬆ Back to Top

How do you enable Actuator in the Spring Boot application?
To enable Actuator, add the spring-boot-starter-actuator dependency to your pom.xml:

<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
You can then access actuator endpoints such as /actuator/health and /actuator/info.

⬆ Back to Top

How do you handle exceptions in a Spring Boot application?
You can handle exceptions using @ControllerAdvice and @ExceptionHandler annotations:

@ControllerAdvice
public class GlobalExceptionHandler {
  @ExceptionHandler(Exception.class)
  public ResponseEntity<String> handleException(Exception ex) {
    return new ResponseEntity<>("An error occurred: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
  }
}
⬆ Back to Top

What is Swagger in Spring Boot?
Swagger is a tool used to document and test RESTful APIs. In Spring Boot, you can integrate Swagger using the springfox-swagger2 and springfox-swagger-ui dependencies.

Example configuration:

<dependency>
  <groupId>io.springfox</groupId>
  <artifactId>springfox-swagger2</artifactId>
  <version>2.9.2</version>
</dependency>
<dependency>
  <groupId>io.springfox</groupId>
  <artifactId>springfox-swagger-ui</artifactId>
  <version>2.9.2</version>
</dependency>
⬆ Back to Top

How do you implement security in a Spring Boot application?
To implement security, add the spring-boot-starter-security dependency. Then, configure security settings using @Configuration and @EnableWebSecurity:

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
      .authorizeRequests()
        .anyRequest().authenticated()
        .and()
      .formLogin();
  }
}
⬆ Back to Top

What are the different ways to configure Spring Boot applications?
Spring Boot applications can be configured using:

application.properties or application.yml files
Command-line arguments
Environment variables
Java configuration classes with @Configuration and @Bean
⬆ Back to Top

What is Spring Data JPA, and how does it differ from Hibernate?
Spring Data JPA is a part of the Spring Data project that simplifies database access and integrates JPA with Spring. Hibernate is a JPA implementation. Spring Data JPA provides additional functionality like repositories and query methods to ease data access.

⬆ Back to Top

How do you use Spring Boot with Docker?
To use Spring Boot with Docker, create a Dockerfile:

FROM openjdk:17-jdk
COPY target/myapp.jar /myapp.jar
ENTRYPOINT ["java", "-jar", "/myapp.jar"]
Build and run the Docker image:

docker build -t myapp .
docker run -p 8080:8080 myapp
⬆ Back to Top

What is the difference between @Component, @Service, and @Repository annotations?
@Component: Generic stereotype for any Spring-managed component.
@Service: Specialized form of @Component, typically used for service-layer beans.
@Repository: Specialized form of @Component, used for data access layer beans with additional exception translation capabilities.
⬆ Back to Top

How do you test RESTful services in Spring Boot?
You can test RESTful services using @WebMvcTest or @SpringBootTest with tools like MockMvc:

@WebMvcTest(HelloController.class)
public class HelloControllerTest {
  @Autowired
  private MockMvc mockMvc;

  @Test
  public void testHello() throws Exception {
    mockMvc.perform(get("/api/hello"))
      .andExpect(status().isOk())
      .andExpect(content().string("Hello, Spring Boot!"));
  }
}
⬆ Back to Top

How do you configure multiple data sources in Spring Boot?
To configure multiple data sources, define multiple DataSource beans and use @Primary to indicate the default one:

@Configuration
public class DataSourceConfig {
  @Bean
  @Primary
  @ConfigurationProperties("spring.datasource.primary")
  public DataSource primaryDataSource() {
    return DataSourceBuilder.create().build();
  }

  @Bean
  @ConfigurationProperties("spring.datasource.secondary")
  public DataSource secondaryDataSource() {
    return DataSourceBuilder.create().build();
  }
}
⬆ Back to Top

What is the purpose of the @Autowired annotation?
The @Autowired annotation is used for dependency injection. It allows Spring to automatically inject the required dependencies into a bean.

⬆ Back to Top

How do you handle CORS in Spring Boot?
You can handle CORS by configuring it globally or at the controller level. For global configuration:

@Configuration
public class WebConfig implements WebMvcConfigurer {
  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")
      .allowedOrigins("http://localhost:3000")
      .allowedMethods("GET", "POST", "PUT", "DELETE");
  }
}
⬆ Back to Top

Advanced Question
What are the annotations used to create an Interceptor in Spring Boot?
To create an Interceptor, use the @Component annotation to define it as a Spring bean and implement the HandlerInterceptor interface:

@Component
public class MyInterceptor implements HandlerInterceptor {
  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    // Logic before the request is handled
    return true;
  }

  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    // Logic after the request is handled
  }

  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    // Logic after the request completes
  }
}
Register the interceptor with Spring:

@Configuration
public class WebConfig implements WebMvcConfigurer {
  @Autowired
  private MyInterceptor myInterceptor;

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(myInterceptor);
  }
}
⬆ Back to Top

What is the purpose of Swagger in Spring Boot?
Swagger is used to document and test RESTful APIs. It generates interactive API documentation and provides a user interface for testing endpoints.

To integrate Swagger, add the following dependencies:

<dependency>
  <groupId>io.springfox</groupId>
  <artifactId>springfox-swagger2</artifactId>
  <version>2.9.2</version>
</dependency>
<dependency>
  <groupId>io.springfox</groupId>
  <artifactId>springfox-swagger-ui</artifactId>
  <version>2.9.2</version>
</dependency>
Configure Swagger:

@Configuration
@EnableSwagger2
public class SwaggerConfig {
  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
      .select()
      .apis(RequestHandlerSelectors.any())
      .paths(PathSelectors.any())
      .build();
  }
}
Access the Swagger UI at /swagger-ui.html.

⬆ Back to Top

What are the differences between Spring Data JPA and Hibernate?
Spring Data JPA: A part of Spring that simplifies data access and integrates JPA with Spring. It provides a repository abstraction and various query methods.
Hibernate: A JPA implementation that provides ORM capabilities for mapping Java objects to database tables. Spring Data JPA can use Hibernate as the JPA provider.
⬆ Back to Top

How do you use Spring Boot with Docker?
To use Spring Boot with Docker, create a Dockerfile in the root of your project:

FROM openjdk:17-jdk
COPY target/myapp.jar /myapp.jar
ENTRYPOINT ["java", "-jar", "/myapp.jar"]
Build and run the Docker image:

docker build -t myapp .
docker run -p 8080:8080 myapp
⬆ Back to Top

How to implement caching in Spring Boot?
To implement caching, add the spring-boot-starter-cache dependency and enable caching with @EnableCaching:

<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-cache</artifactId>
</dependency>
@Configuration
@EnableCaching
public class CacheConfig {
}
Use the @Cacheable annotation to cache method results:

@Service
public class MyService {
  @Cacheable("myCache")
  public String getCachedValue(String key) {
    // Method logic
  }
}
⬆ Back to Top

How to configure Spring Boot for asynchronous processing?
Enable asynchronous processing with @EnableAsync and use @Async for asynchronous methods:

@Configuration
@EnableAsync
public class AsyncConfig {
}
@Service
public class MyService {
  @Async
  public CompletableFuture<String> asyncMethod() {
    // Asynchronous logic
    return CompletableFuture.completedFuture("result");
  }
}
⬆ Back to Top

How do you configure multiple data sources in Spring Boot?
Define multiple DataSource beans in a configuration class:

@Configuration
public class DataSourceConfig {
  @Bean
  @Primary
  @ConfigurationProperties("spring.datasource.primary")
  public DataSource primaryDataSource() {
    return DataSourceBuilder.create().build();
  }

  @Bean
  @ConfigurationProperties("spring.datasource.secondary")
  public DataSource secondaryDataSource() {
    return DataSourceBuilder.create().build();
  }
}
⬆ Back to Top

What is the purpose of @ComponentScan in the class files?
The @ComponentScan annotation is used to specify the packages to scan for Spring components, such as @Component, @Service, @Repository, and @Controller.

@Configuration
@ComponentScan(basePackages = "com.example.myapp")
public class AppConfig {
}
⬆ Back to Top

How to monitor a Spring Boot application using Actuator?
Spring Boot Actuator provides monitoring endpoints. Enable it by adding the spring-boot-starter-actuator dependency:

<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
Access endpoints like /actuator/health and /actuator/metrics to monitor the application.

⬆ Back to Top

How do you implement distributed tracing in a Spring Boot application using OpenTelemetry?
Add dependencies for OpenTelemetry and configure it:

<dependency>
  <groupId>io.opentelemetry</groupId>
  <artifactId>opentelemetry-sdk-extension-autoconfigure-spring-boot</artifactId>
  <version>1.7.2</version>
</dependency>
Configure OpenTelemetry in application.properties:

otel.exporter.otlp.endpoint=http://localhost:4317
Use the OpenTelemetry API to instrument your code.

⬆ Back to Top

How do you enable HTTPS in a Spring Boot application?
To enable HTTPS, configure SSL in application.properties:

server.port=8443
server.ssl.key-store=classpath:keystore.p12
server.ssl.key-store-password=password
server.ssl.key-store-type=PKCS12
Place the keystore.p12 file in src/main/resources.

⬆ Back to Top

What is Spring Boot WebFlux?
Spring Boot WebFlux is a reactive web framework that supports non-blocking and asynchronous processing. It is an alternative to the traditional Spring MVC framework for building reactive applications.

⬆ Back to Top

What is reactive programming in Spring Boot?
Reactive programming is a paradigm that deals with asynchronous data streams and the propagation of changes. Spring Boot supports reactive programming with the Reactor framework.

⬆ Back to Top

How do you deploy a Spring Boot application as a WAR file?
To deploy as a WAR file, modify pom.xml to package the application as a WAR:

<packaging>war</packaging>
Extend SpringBootServletInitializer in your main application class:

@SpringBootApplication
public class MyApplication extends SpringBootServletInitializer {
  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(MyApplication.class);
  }

  public static void main(String[] args) {
    SpringApplication.run(MyApplication.class, args);
  }
}
Build the WAR file with:

mvn clean package
⬆ Back to Top

How do you integrate Spring Boot with RabbitMQ?
Add the spring-boot-starter-amqp dependency:

<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-amqp</artifactId>
</dependency>
Configure RabbitMQ settings in application.properties:

spring.rabbitmq.host=localhost
spring.rabbitmq.port=5672
Define a message listener:

@Component
public class MyMessageListener {
  @RabbitListener(queues = "myQueue")
  public void receiveMessage(String message) {
    System.out.println("Received: " + message);
  }
}
⬆ Back to Top

How do you configure a data source in Spring Boot?
Configure the data source in application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/mydb
spring.datasource.username=root
spring.datasource.password=password
⬆ Back to Top

How do you use Spring Boot with Kubernetes?
Create a Docker image of your Spring Boot application and deploy it on Kubernetes using a YAML configuration file. Define a deployment and service in deployment.yaml:

apiVersion: apps/v1
kind: Deployment
metadata:
  name: myapp
spec:
  replicas: 1
  selector:
    matchLabels:
      app: myapp
  template:
    metadata:
      labels:
        app: myapp
    spec:
      containers:
      - name: myapp
        image: myapp:latest
        ports:
        - containerPort: 8080
---
apiVersion: v1
kind: Service
metadata:
  name: myapp-service
spec:
  ports:
  - port: 80
    targetPort: 8080
  selector:
    app: myapp
Apply the configuration with:

kubectl apply -f deployment.yaml
⬆ Back to Top

How do you secure a Spring Boot REST API using OAuth2?
Add the spring-boot-starter-oauth2-client dependency:

<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-oauth2-client</artifactId>
</dependency>
Configure OAuth2 client settings in application.properties:

spring.security.oauth2.client.registration.google.client-id=your-client-id
spring.security.oauth2.client.registration.google.client-secret=your-client-secret
⬆ Back to Top