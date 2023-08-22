pipeline{
    agent any
        tools{
            maven 'local-maven'
            }
    stages{
        stage('SCM Checkout'){
                             steps{
                               git branch: 'main', url: 'https://github.com/satya918/student_app.git'
                                  }
                            } 
        stage('Build'){
                                steps{
                                    sh 'mvn clean package'
                                    }
                        } 
    stage ('Deploy to tomcat server'){
                        steps{
                deploy adapters: [tomcat9(credentialsId: 'tomcatcreds', path: '', url: 'http://13.51.108.55:9092/')], contextPath: 'Montek', war: '**/*.war'
            }
        }
    }
    }
