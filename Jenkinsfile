pipeline{
    agent any
    stages{
        stage("verify branch"){
            steps{
                echo "$GIT_BRANCH"
            }
        }
        stage("maven install"){
            steps{
                sh 'mvn clean install'
            }
        }
        stage("start tests"){
            steps{
                sh 'mvn clean test'
            }
        }
    }
}