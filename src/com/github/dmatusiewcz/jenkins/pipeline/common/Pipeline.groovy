package com.github.dmatusiewcz.jenkins.pipeline.common

class Pipeline implements Serializable {
  String branch

  public void getRepo(String credentialsId, String url){
    checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'RelativeTargetDirectory', relativeTargetDir: 'CommonPipelineLibrary']], submoduleCfg: [], userRemoteConfigs: [[credentialsId: credentialsId, url: url]]])
  }
}
