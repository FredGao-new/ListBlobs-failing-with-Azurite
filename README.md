# ListBlobs failing with Azurite
This sample is to reproduce the bug described in the issue https://github.com/Azure/azure-sdk-for-java/issues/6945 

## Prerequisites

1. Clone the repo
``` 
git clone https://github.com/FredGao-new/ListBlobs-failing-with-Azurite.git
```

2. Install [Azurite]

## Steps to reproduce

1. Start Azurite:
```
azurite
```

2. Edit App.java, then build and execute code snippet.
```
~/apache-maven-3.6.3/bin/mvn compile
~/apache-maven-3.6.3/bin/mvn package
~/apache-maven-3.6.3/bin/mvn exec:java -Dexec.mainClass="com.blobs.listex.App" -Dexec.cleanupDaemonThreads=false
```

## Test cases that have been covered so far

### Azurite

List blobs fail when there is no blob or there are some blobs.

Upload/Download blobs pass with Azurite.

### Azure Portal

List blobs pass when there is no blob or there are some blobs.

Upload/Download blobs pass with Azure Portal.


<!--LINKS-->
[Azurite]:https://github.com/Azure/Azurite