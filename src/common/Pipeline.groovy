package common

import org.jenkinsci.plugins.workflow.cps


@groovy.transform.AutoClone
@NoCPS
class Pipeline implements Cloneable {
  String branch
}
