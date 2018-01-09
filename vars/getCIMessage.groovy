import groovy.json.*
import hudson.model.*

def call() {
  //def out
  //def config = new HashMap()
  //def bindings = getBinding()
  //config.putAll(bindings.getVariables())
  //out = config['out']
  //out.println "Printed to Jenkins console."
  echo "Printed to Jenkins console."
  
  //def slurper = new JsonSlurper()
  //def json = slurper.parseText(build.getEnvironment(listener).get('CI_MESSAGE'))
  //out.println json
  //if (json["build"] != null) {
  //    String taskId = json['build'].task_id
  //    def pa = new ParametersAction([new StringParameterValue("TASK_ID", taskId)])
  //    Thread.currentThread().executable.addAction(pa)
  //}
}


