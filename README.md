# How to use retrolambds with libGDX
This repository a barebones libGDX project created with the setup-tool. Only Desktop and Android projects are created, no add-ons are selected. It aims to provide the minimal delta needed to use lambdas for the android build of a libGDX application.

It assumes the following
------------------------

1. You have Java 8 sdk and Java 6 sdk installed
2. You have a JAVA_HOME enivronmental variable set in you Windows that points to the Java 8 sdk
3. You have a JAVA6_HOME enivronmental variable set in you Windows that points to the Java 6 sdk

Shortcomings of retrolamda
--------------------------

1. It actually only ports lambda expressions, other Java 8 features like the Streaming API will not work
2. It also does not port any new interfaces, e.g. if you need a Consumer\<T\> you need to create this interface yourself

Finally: How to do it
---------------------

Look at [this changeset](https://github.com/drusin/LibgdxRetrolambdaTest/commit/9052767d79b4c340a2260ada61767c9f183cf260)
