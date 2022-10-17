pipeline {
  agent any
  tools {
    maven 'maven 3.6.3'
    jdk 'open-jdk-11'
  }
  stages {
    stage('Build') {
      steps {
        sh 'mvn -B -DskipTests clean validate compile package'
      }
      post {
        success {
          echo "Build ok"
        }
        failure {
          echo "Build failed"
        }
      }
    }
    stage('Test') {
      steps {
        sh 'mvn test'
      }
      post {
        always {
          junit "target/surefire-reports/*.xml"
        }
        success {
          echo "Build ok"
        }
        failure {
          echo "Build failed"
        }
      }
    }
  }
}