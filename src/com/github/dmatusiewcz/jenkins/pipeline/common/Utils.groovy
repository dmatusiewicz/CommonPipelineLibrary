#!/usr/bin/groovy
package com.github.dmatusiewcz.jenkins.pipeline.common

import com.cloudbees.groovy.cps.NonCPS
import jenkins.model.Jenkins


@NoCPS
static def check_out_gitlab_repo(credentialsId, url) {
  checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'RelativeTargetDirectory', relativeTargetDir: 'CommonPipelineLibrary']], submoduleCfg: [], userRemoteConfigs: [[credentialsId: credentialsId, url: url]]])
}
