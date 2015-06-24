#!/bin/bash

mvn tomcat7:undeploy
sleep 10
mvn clean install
sleep 10
mvn tomcat7:deploy


