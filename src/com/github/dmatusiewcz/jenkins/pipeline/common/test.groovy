#!/usr/bin/env groovy

def getCurl(host, port, path) {
   returnValue = sh (
       script: "curl -s http://" + host + ":" + port + path,
       returnStdout: true
       )
   return returnValue
}

