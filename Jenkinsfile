pipeline {
  agent any
  environment {
    MAVEN_CONFIG = '/var/maven/.m2'
    MAVEN_OPTS   = '-Duser.home=/var/maven'
  }
  stages {
    stage('Build') {
        agent { 
          docker { 
            image 'maven:3.8.3-adoptopenjdk-11' 
            args "-v $HOME/.m2:/var/maven/.m2 -e MAVEN_CONFIG=${MAVEN_CONFIG} -e MAVEN_OPTS=${MAVEN_OPTS}"
          }
        }
      steps {
        sh 'mvn -B -DskipTests clean validate compile package install'
      }
      post {
        always {
            archiveArtifacts artifacts: "target/*.jar", fingerprint: true
        }
        success {
          echo 'Build ok'
        }
        failure {
          echo 'Build failed'
        }
      }
    }
    stage('Test') {
      agent { 
          docker { 
            image 'maven:3.8.3-adoptopenjdk-11' 
            args "-v $HOME/.m2:/var/maven/.m2 -e MAVEN_CONFIG=${MAVEN_CONFIG} -e MAVEN_OPTS=${MAVEN_OPTS}"
          }
      }
      steps {
        sh 'mvn test'
      }
      post {
        always {
          junit "target/surefire-reports/*.xml"
        }
        success {
          echo 'Test ok'
        }
        failure {
          echo 'Test failed'
        }
      }
    }
    stage('Deploy'){
      steps {
        echo 'Deploying..'
      }
    }
  }

  post {
    always {
        deleteDir() 
    }
  }
}