package common

import com.cloudbees.groovy.cps.NonCPS


@groovy.transform.AutoClone
@NoCPS
class Pipeline implements Cloneable {
  String branch
}
