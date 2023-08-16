pipeline{
    agent any
tools{
    maven 'local-maven'
}

    stages{

 

    stage('SCM Checkout'){

 

    steps{
    git branch: 'main', url: 'https://github.com/aishwaryasomashekar/webAppExample.git'
    }
    } 
stage('Build'){

 

    steps{
    sh 'mvn clean package'
    }
    } 
stage ('Deploy to tomcat server'){
            steps{
                deploy adapters: [tomcat9(credentialsId: 'tomcatcreds', path: '', url: 'http://3.27.128.254:8090/')], contextPath: 'webAppExample', war: '**/*.war'
            }

 

        }

    }
    }
