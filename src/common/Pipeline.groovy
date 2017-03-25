import com.cloudbees.groovy.cps.NonCPS
package common

@groovy.transform.AutoClone
@com.cloudbees.groovy.cps.NoCPS
class Pipeline implements Cloneable {
  String branch
}
