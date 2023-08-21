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
                deploy adapters: [tomcat9(credentialsId: 'tomcatcreds', path: '', url: 'http://16.16.215.143:9092/')], contextPath: '', war: '**/*.war'
            }
        }
    }
    }
