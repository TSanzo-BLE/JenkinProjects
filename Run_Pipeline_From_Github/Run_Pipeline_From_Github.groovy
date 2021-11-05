pipeline {
    agent any
    stages {
        stage('Build_mock') {
            steps {
                echo '--------------------------------------------------------------'
                echo '   If I was building the engine this is where I would do it   '
                echo '--------------------------------------------------------------'
            }
        }
    }
}
