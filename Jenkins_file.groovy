@Library('jenkinsfile@main') _
pipeline{
  agent { label "linux" }
  stages{
    stage('Example'){
      steps {
        helloworld()
      }
    }
  }
} 
