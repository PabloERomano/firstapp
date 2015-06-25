#!/bin/bash

mvn tomcat7:undeploy
mvn clean install
mvn tomcat7:deploy


