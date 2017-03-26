package com.github.dmatusiewcz.jenkins.pipeline.common

class Pipeline implements Serializable {
  String branch

}

def check_out_gitlab_repo(credentialsId, url) {
  //  println credentialsId + " " + url
  checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'RelativeTargetDirectory', relativeTargetDir: 'CommonPipelineLibrary']], submoduleCfg: [], userRemoteConfigs: [[credentialsId: credentialsId, url: url]]])
}
