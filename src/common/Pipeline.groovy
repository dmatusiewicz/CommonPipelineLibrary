package common

import com.cloudbees.groovy.cps


@groovy.transform.AutoClone
@NoCPS
class Pipeline implements Cloneable {
  String branch
}
