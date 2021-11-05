pipeline {
    agent any
    stages {
        stage('Build_mock') {
            sh echo '--------------------------------------------------------------'
            sh echo '   If I was building the engine this is where I would do it   '
            sh echo '--------------------------------------------------------------'
        }
    }
}
