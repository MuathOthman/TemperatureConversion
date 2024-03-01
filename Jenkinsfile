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
        stage('Build Docker Image') {
            steps {
                echo 'Building Docker Image...'
                sh "/usr/local/bin/docker build -t ${IMAGE_NAME}:${TAG} ."
            }
        }
        stage('Push Docker Image') {
            steps {
                echo 'Pushing Docker Image...'
                withCredentials([usernamePassword(credentialsId: 'dockerhub', passwordVariable: 'DOCKERHUB_PASSWORD', usernameVariable: 'DOCKERHUB_USERNAME')]) {
                    sh "/usr/local/bin/docker login -u $DOCKERHUB_USERNAME -p $DOCKERHUB_PASSWORD"
                    sh "/usr/local/bin/docker push ${IMAGE_NAME}:${TAG}"
                }
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