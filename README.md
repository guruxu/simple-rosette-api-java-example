# Simple example of using Rosette API with the Java Binding

See details in [pom.xml](pom.xml) and [Example.java](src/main/java/Example.java)

- Compile the code

```
mvn clean verify
```

- Run the example

```
mvn exec:java -Dexec.mainClass=Example -Dapi.key=<your_api_key>

...
Washington D.C. (Q61) - LOCATION
USA (Q30) - LOCATION
...
```
