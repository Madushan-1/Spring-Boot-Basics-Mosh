<h1 style="color:#6ecc50">Learn Spring Boot Basics</h1>

<h2 style="color:#cc5615">Bits</h2>
* POM (Project Object Model) is the heart of a maven project. Used to download dependencies and build our projects
* Java folder contains all the .java files required
* Resources folder contains non-java files such as any static assets like CSS and HTML files or property files
* Use 'mvnm spring-boot:run' as the command from the root of your intellij project with CMD, this will start the server to run your application
* Default port for an app is 8080, can be changed in application.properties/yml

<h2 style="color:#cc5615">Application.properties / yml</h2>
* Spring boot supports both application.properties and application.yml
* Both can be used at the same time, but if the same key is defined in both, the value from .properties will be picked up because it loads after yml files

<h2 style="color:#cc5615">Dependency management</h2>
It is usually good to remove the version tag from dependencies and let the highest parent level pom file to handle the version, this is because it automatically determines what plugins works best with which version of other available plugins. (Need to check the pros and cons of this)

<h2 style="color:#cc5615">Annotations Explained</h2>
An annotation is like a tag or label that gives instructions or additional context to the compiler, can be added to classes methods fields parameters and so on

<h3 style="color:#C56ACC">@Controller</h3>
* Tells spring that a class is web controller for receiving web traffic

<h3 style="color:#C56ACC">@RequestMapping</h3>
* When we send a request to the root of our website, we want this method to be called
* RequestMapping helps with that 
* This is part of the web starter dependency 
* The argument (URL pattern) "/" defines the root of the website 
* When a request goes to the root this method will be called 
* It can be changed as required if you want to receive traffic at a different end point, "/contact"

<h2 style="color:#cc5615">Dependency Injections</h2>
