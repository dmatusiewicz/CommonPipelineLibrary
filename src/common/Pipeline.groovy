package common

import com.cloudbees.groovy.cps.NonCPS


@groovy.transform.AutoClone
@com.cloudbees.groovy.cps.NoCPS
class Pipeline implements Cloneable {
  String branch
}
