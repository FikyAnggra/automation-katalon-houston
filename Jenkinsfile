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
//                 cd C:/Katalon_Studio_Windows_64-8.3.5
                bat """
                katalon -projectPath="C:/my doc/katalon-houston" -browserType="Chrome" -retry=0 -statusDelay=15 -testSuitePath="Test Suites/PROEARN/regressionJenkins" -apiKey="f8cfa5f4-7647-4503-9535-02e25a35711c" -orgID=757562>
                """
            }
        }
    }
}
