# Java 13 Feature Preview

This projecti s a very brief demonstration of using the new [Text Block](https://openjdk.java.net/jeps/355) feature and the updates to [Switch Expression](https://openjdk.java.net/jeps/354). 

##Running the Demo

###Without Java 13 

It is not required to have Java 13 installed to run this demo. To run the demo without Java 13 installed on your system, build the Docker image by running the following command: 

```
docker build -f Dockerfile.nojava -t java-13-preview:1 .
```

To then run the project execute:

```
docker run -e SEASON=[SOME STRING] java-13-preview:1
```

The output should look something like this:

```
{
        "season" : "SUMMER",
        "wordLength" : "6"
}
```

###With Java 13

If you do have Java 13 installed, from the root of the project run:

```
mvn clean package
```

Then execute the following:

```
java --enable-preview -jar java-13-preview.jar [SOME STRING]
```

Output would the same as above example. 