pipeline {
    agent any

    stages {
        stage('Clean') {
            steps {
                build job: 'sampleClean'
            }
        }
        stage('Build') {
            steps {
                build job: 'sampleBuild'
            }
        }
    }
}
