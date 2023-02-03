//Mendefinisikan pipeline
pipeline {
    //Menetapkan agen sebagai 'any', yang berarti bisa dijalankan pada agen yang tersedia
    agent any
    
    //Mendefinisikan tahap-tahap dalam pipeline
    stages {
        //Tahap pertama bernama "Build"
        stage('Build') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/FikyAnggra/automation-katalon-houston.git']]])
           }
        }
        //Tahap kedua bernama "Test"
        stage('Test') {
            steps {
                bat "groovy C:/ProgramData/Jenkins/.jenkins/workspace/automation-katalon-houston/Scripts/PROEARN/earn2.0/jenkins/Script1675416518177.groovy"
            }
        }
    }
}
