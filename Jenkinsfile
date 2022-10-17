pipeline {
    agent any
    tools { 
        maven 'maven 3.6.3' 
        jdk 'open-jdk-11' 
    }
    stages {
        stage ('Build') {
            steps {
                sh 'mvn validate compile'
            }
        }

        stage ('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}