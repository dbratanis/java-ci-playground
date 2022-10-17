pipeline {
    agent any
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