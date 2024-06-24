# Config Server sample


Demo app is an example application demonstrating the use of Config Server for Tanzu Application Service. 
(For information on the Config Server product in Tanzu Application Service, please https://docs.vmware.com/en/Spring-Cloud-Services-for-VMware-Tanzu/3.2/spring-cloud-services/GUID-config-server-index.html[see the documentation].)


## Building and Deploying

Using Maven, run:

```
 mvn package
```



Run the deployment script (link:scripts/deploy.sh[`scripts/deploy.sh`] on Linux or maxOS, link:scripts/deploy.bat[`scripts/deploy.bat`] on Windows), giving it the path to the application archive.
./scripts/deploy.sh /target/springcloudconfig-0.0.1-SNAPSHOT.jar
```
$ ./scripts/deploy.sh target/springcloudconfig-0.0.1-SNAPSHOT.jar
```

The script will create a Config Server service instance, push the application, and bind the Config Server service instance to the application.


== Trying It Out

 Visit `[ROUTE]/testConfigClient`, where `[ROUTE]` is the route bound to the application. The value will be taken from the configuration repository and the value of `key1`.

