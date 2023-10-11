pipeline{
  agent any
  stages{
    stage('Deploy'){
      steps{
        echo "Test Successful"
        bat "mvn compile"
      }
    }
    stage('Build'){
      steps(
        echo "build successful"
      bat "mvn clean"
        }
      }
        stage('Test'){
          steps {
            echo "Test Successful"
            bat "mvn test"
          }
        }
     }
  }
