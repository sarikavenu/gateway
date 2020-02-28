# Zuul Gateway Service

This is a simple spring boot Zuul service acts as a gateway for the sample micro-services I have built for demonstration purpose.

## Deployment
I have deployed and tested this in OpenShift, you can quickly spin a pod and try using an application type Git and Java.

## Routes
As this is Gateway Service so I have published a route to access the underlying **heroService** via your client app. For demonstration  purposes I also have built an Angular app for completeness.

## Underlying Services:
* heroservice
