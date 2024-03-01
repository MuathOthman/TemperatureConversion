pipeline {
    agent any

    tools {
            maven 'Maven'
            jdk 'JDK'
            dockerTool 'docker'
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