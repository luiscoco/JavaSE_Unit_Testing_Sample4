# JavaSE_Unit_Testing_Sample4

To create the "target" folder we have to run the command: 

```
mvn clean install
```

Also modify the pom.xml file to include this plugin:

```xml
  <plugin>
        <groupId>org.codehaus.mojo</groupId>
          <artifactId>exec-maven-plugin</artifactId>
          <version>3.0.0</version>
          <configuration>
            <mainClass>com.timbuchalka.Main</mainClass>
          </configuration>
  </plugin>
```
Be careful to set the "mainClass" name. In our application is "com.timbuchalka.Main"

Now we can start the java application with the command:

```
mvn exec:java -e
```

Also we can create a .gitignore file for not pushing the "target" folder to Github.

The code in the .gitignore file will be:
```
/target
```
