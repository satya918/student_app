pipeline {
    agent any
    tools {
        maven 'local-maven'
    }
    stages {
        stage('SCM Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/satya918/student_app.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                    sh 'docker build -t reg:reg .'
                    def dockerImage = docker.build('registration:reg', '-f Dockerfile .')
                }
            }
        }
        stage('Push Docker Image') {
            steps {
                script {
                    docker.withRegistry('https://hub.docker.com/', 'dockercreds') {
                        def dockerImage = docker.image('registration:reg')
                        dockerImage.push()
                    }
                }
            }
        }
       // stage('Deploy to Tomcat Server') {
          //  steps {
            //    deploy adapters: [tomcat9(credentialsId: 'tomcatcreds', path: '', url: 'http://13.49.65.50:9091/')], contextPath: 'Montek', war: '**/*.war'
           // }
      //  }
    }
    post {
        success {
            echo 'Deployment and testing successful!'
        }
        failure {
            echo 'Deployment or testing failed.'
        }
    }
}
