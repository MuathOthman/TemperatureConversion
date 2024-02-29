pipeline {
    agent any

    tools {
            maven 'Maven'
            jdk 'JDK'
        }

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                // Runs Maven's clean and package phases, which compiles your project and packages it into a JAR/WAR (without running unit tests)
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                // Runs Maven's test phase to execute your unit tests
                sh 'mvn test'
            }
        }
    }
    post {
        always {
            echo 'This will always run'
        }
        success {
            echo 'Build succeeded!'
            // Publish JUnit test results
            junit '**/target/surefire-reports/TEST-*.xml'
            // Generate JaCoCo code coverage report
            jacoco(execPattern: '**/target/jacoco.exec')
        }
        failure {
            echo 'Build failed!'
            echo 'Sending email notification...'
        }
    }
}