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
                tool 'Maven'
                sh 'mvn clean install'
            }
        }
        stage("start tests"){
            steps{
                tool 'Maven'
                sh 'mvn clean test'
            }
        }
    }
}
