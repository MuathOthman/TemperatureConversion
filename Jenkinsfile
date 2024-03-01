pipeline {
    agent any
    environment {
        IMAGE_NAME = 'temperatureconversion.jar'
        TAG = 'latest'
    }

    tools {
            maven 'Maven'
            jdk 'JDK'
        }

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                sh "/usr/local/bin/docker build -t ${IMAGE_NAME}:${TAG} ."
            }
        }
    }
    post {
        success {
            echo 'Build success'
        }
        failure {
            echo 'Build failed'
        }
    }
}