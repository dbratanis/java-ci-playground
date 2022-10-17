pipeline {
    agent any
    tools { 
        maven 'maven 3.6.3' 
        jdk 'open-jdk-11' 
    }
    stages {
        stage ('Validate') {
            steps {
                sh 'mvn validate'
            }
        }

        stage ('Build') {
            steps {
                sh 'mvn compile'
            }
        }

        stage ('Tests') {
            steps {
                sh 'mvn test'
            }
        }
    }
}