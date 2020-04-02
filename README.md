# Java-Selenium-Webdriver-tutorial-with-code
This is a Java + Selenium WebDriver framework 
Steps for E2E Automation framework creation: 

1.	Create maven project 
-	Create the project using maven command 
mvn archetype:generate -DgroupId=Ocx  -DartifactId=Auto_framework -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false (ArtifactId is the project name in Eclipse  and GroupId is the package names in Eclipse – both must be filled in with whatever project name is desired and goup is desired)
-	After project is successfully build, go inside the project folder (the one where pom.xml file resides) and run the mvn eclipse:eclipse command (This creates a .classpath file so it is recognized by Eclipse)
-	After the project is created and the .classpath file is present in the folder, from Eclipse, import an existing Maven project and import the already created Maven project 

2.	Configure framework dependencies in the pom.xml file 
-	Search for Selenium maven dependencies, testing maven dependencies on google and from maven repository, copy the xml syntax for the dependency and use it in the pom.xml file 
3.	Create the Page Object files 
-	In the main folder, create the Base class (the base for the framework)
o	We write a method to initialize the driver (only one method for invoking the driver for all the tests)
o	We are using a properties file from where we are taking the browser (chrome, ff etc ) – This is done to be able to have a good parametrization on the project and not hard code. By having the browser in the properties file, we can change the properties file and the browser will be changed in the tests. After the file is created and browser is declared, copy the file path and put it into the base page as an argument of the FileInputStream 
o	 We are initializing the WebDriver for each driver in its own place (see below the screengrab (Webdriver is initialized once, in the beginning so it can be used through all the if/else loop) 
o	After the browsers initialization code, we are setting-up the implicit wait before a test is going to fail  


