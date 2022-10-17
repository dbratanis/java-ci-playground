pipeline {
  agent any
  tools {
    maven 'maven 3.6.3'
    jdk 'open-jdk-11'
  }
  stages {
    stage('Build') {
      withMaven {
        sh 'mvn validate compile'
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
      withMaven {
        sh 'mvn test'
      }
      post {
        success {
          echo "Tests ok"
        }
        failure {
          echo "Tests failed"
        }
      }
    }
  }
}