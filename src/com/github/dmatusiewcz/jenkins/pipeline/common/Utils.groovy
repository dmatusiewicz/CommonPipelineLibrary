#!/usr/bin/groovy
package com.github.dmatusiewcz.jenkins.pipeline.common

import jenkins.model.Jenkins.*

def check_out_gitlab_repo(credentialsId, url) {
  checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'RelativeTargetDirectory', relativeTargetDir: 'CommonPipelineLibrary']], submoduleCfg: [], userRemoteConfigs: [[credentialsId: credentialsId, url: url]]])
}
