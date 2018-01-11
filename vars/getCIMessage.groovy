import groovy.json.*
//import hudson.model.*
//import hudson.util.*
//import java.util.logging.*

//def call() {
//  echo "Content of the CI_MESSAGE:"
//  
//  // Retrieve parameters of the current build
//  //def msg = System.getenv("CI_MESSAGE")
//  //println "CI_MESSAGE=$msg"
//
//  //def listener = new LogTaskListener(Logger.getAnonymousLogger(), Level.OFF)
//  def slurper = new JsonSlurper()
//  def json = slurper.parseText(Run.getEnvironment(listener).get('CI_MESSAGE'))
//  println "CI_MESSAGE=$json"
//  //if (json["build"] != null) {
//  //    String taskId = json['build'].task_id
//  //    def pa = new ParametersAction([new StringParameterValue("TASK_ID", taskId)])
//  //    Thread.currentThread().executable.addAction(pa)
//  //}
//
//  //def resolver = AbstractBuild.getBuildVariableResolver()
//  //def slurper = new JsonSlurper()
//  //def json = slurper.parseText(resolver.resolve('CI_MESSAGE'))
//  //println "CI_MESSAGE=$json"
//}
//node {
//    deleteDir()
//    stage('test1') {
//        slurpIt(env.CI_MESSAGE)
//
//        sh 'env | sort'
//    }
//}

def call() {
    def message = getEnvironment(listener).get('CI_MESSAGE')
    echo message
    
    def json = new JsonSlurper().parseText(message)
    println "CI_MESSAGE=$message"
}
