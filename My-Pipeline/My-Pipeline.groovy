pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo At your service :)
            }
        }
    }
}