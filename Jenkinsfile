pipeline{
    agent any
    stages{
        stage("verify branch"){
            steps{
                echo "$GIT_BRANCH"
            }
        }
            stage('Tests') {
         agent {
            docker { image 'maven:3-openjdk-17' }
         }
         steps {
            sh("mvn clean test")
         }

           stage('Tests') {
         agent {
            docker { image 'maven:3-openjdk-17' }
         }
         steps {
            sh("mvn clean test")
         }

        
    }
}
