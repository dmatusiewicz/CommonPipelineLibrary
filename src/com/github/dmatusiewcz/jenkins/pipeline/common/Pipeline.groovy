package com.github.dmatusiewcz.jenkins.pipeline.common

class Pipeline implements Serializable {
  String branch
  static def check_out_gitlab_repo(credentialsId, url) {
    checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'RelativeTargetDirectory', relativeTargetDir: 'CommonPipelineLibrary']], submoduleCfg: [], userRemoteConfigs: [[credentialsId: credentialsId, url: url]]])
  }
}
