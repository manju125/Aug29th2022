pipeline {
 stages {
      stage('checkout') {
           steps {
             
                git branch: 'master', url: 'https://github.com/manju125/Aug29th2022.git'
             
          }
        }
  stage('Execute Maven') {
           steps {
             
                sh 'sudo mvn clean package'             
          }
        }
 }
}