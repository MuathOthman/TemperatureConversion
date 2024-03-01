pipeline {
    agent any
    environment {
        IMAGE_NAME = 'temprature-converter'
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
                sh "docker build -t ${IMAGE_NAME}:${TAG} ."
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