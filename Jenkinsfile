pipeline {
  agent any
  stages {
    stage('Build') {
        agent { 
          docker { 
            image 'maven:3.8.3-adoptopenjdk-11' 
            args '-v $HOME/.m2:/root/.m2'
            reuseNode true
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
            args '-v $HOME/.m2:/root/.m2'
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