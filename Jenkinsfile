
pipeline {
    agent any

    tools {
        jdk 'JDK21'
        maven 'Maven3.10.1'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/Omkarpatil143/Selenium-POM-Framework.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }
}
