pipeline {
    agent any

    tools {
        jdk 'jdk21'           // Make sure this matches your configured JDK name in Jenkins
        gradle 'gradle8'      // Make sure this matches your configured Gradle name in Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh './gradlew build'
            }
        }

        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }

        stage('Archive Test Results') {
            steps {
                junit '**/build/test-results/test/*.xml'
            }
        }

        stage('Archive Artifacts') {
            steps {
                archiveArtifacts artifacts: '**/build/libs/*.jar', allowEmptyArchive: true
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}
