<h1 style="color:#6ecc50">Learn Spring Boot Basics</h1>

<h2 style="color:#cc5615">Bits</h2>
* POM (Project Object Model) is the heart of a maven project. Used to download dependencies and build our projects
* Java folder contains all the .java files required
* Resources folder contains non-java files such and any static assets like CSS, HTML files and property files
* Use 'mvnm spring-boot:run' as the command from the root of your intellij project with CMD, this will start the server to run your application
* Default port for an app is 8080, can be changed in application.properties/yml

<h2 style="color:#cc5615">Application.properties / yml</h2>
* Spring boot supports both application.properties and application.yml
* Both can be used at the same time, but if the same key is defined in both, the value from .properties will be picked up because it loads after yml files

<h2 style="color:#cc5615">Dependency management</h2>
It is usually good to remove the version tag from dependencies and let the highest parent level pom file to handle the version, this is because it automatically determines what plugins works best with which version of other available plugins. (Need to check the pros and cons of this)

<h2 style="color:#cc5615">Annotations Explained</h2>
An annotation is like a tag or label that gives instructions or additional context to the compiler, annotations can be added to classes methods fields parameters and so on

<h3 style="color:#C56ACC">@Controller</h3>
* Tells spring that a class is a web controller for receiving web traffic

<h3 style="color:#C56ACC">@RequestMapping</h3>
* When we send a request to the root of our website, the method that has the @RequestMapping annotation will be called
* This is part of the web starter dependency 
* The argument (URL pattern) "/" defines the root of the website
* The URL pattern can be changed as required if you want to receive traffic at a different end point, "/contact"

<h2 style="color:#cc5615">Dependency Injections</h2>
* Dependency injection is a software design pattern. It is not related to the original GOF design patterns
* It helps create loosely coupled code
* It is also a means to implement Inversion of Control (IOC)
* It follows the Open / Closed principle, means it is open for extension but closed for modification, this is how the loosely coupled aspect is achieved
* The example in the code shows the usage of an interface (Payment Service) that can use either PayPalPaymentService or StripePaymentService in the OrderService class
* This means that the Order Service class never has to be modified in order to add more payment methods

<h2 style="color:#cc5615">Open Closed Principle Explored</h2>
* The Open / Closed principle is a good way to build maintainable software
* It allows to add new functionality to classes without changing existing
* The concept is merely a guideline, it should be used where it is needed and not blindly implemented for the sake of implementing such a concept

<h2 style="color:#ba0639">How to run the code</h2>
* The Code is run as a normal java application, in the console. This is just to demonstrate the dependency injection example
* If you uncomment the SpringApplication.run(StoreApplication.class, args) in the main method you can run as a spring boot app once more and go to localhost:8080 on your browser to see the index.html 
