pipeline {
    agent any
    stages {
        stage('Build_mock') {
            steps {
                sh echo '--------------------------------------------------------------'
                sh echo '   If I was building the engine this is where I would do it   '
                sh echo '--------------------------------------------------------------'
            }
        }
    }
}
