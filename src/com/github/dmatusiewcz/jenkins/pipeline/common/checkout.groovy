package com.github.dmatusiewcz.jenkins.pipeline.common

def check_out_gitlab_repo(group, repo, branch, creds) {
  checkout poll: false, scm: [$class: 'GitSCM', branches: [[name: branch]], doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'CloneOption', depth: 0, noTags: true, reference: '', shallow: true], [$class: 'RelativeTargetDirectory', relativeTargetDir: repo]], submoduleCfg: [], userRemoteConfigs: [[credentialsId: creds, url: 'git@gitlab.motdev.org.uk:' + group + '/' + repo +'.git']]]
}
