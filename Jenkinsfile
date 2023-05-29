pipeline{
    agent any
    stages {
        stage("verify branch") {
            steps {
                echo "$GIT_BRANCH"
            }
        }
        stage('maven install') {
            agent {
                docker { image 'maven:3-openjdk-17' }
            }
            steps {
                sh("mvn clean test")
            }
        }

        stage('start tests') {
            agent {
                docker { image 'maven:3-openjdk-17' }
            }
            steps {
                sh("mvn clean test")
            }
        }
    }
}
