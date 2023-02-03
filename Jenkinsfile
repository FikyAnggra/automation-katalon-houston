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
              bat 'katalonc -noSplash -runMode=console -projectPath="C:/my doc/katalon-houston" -testSuitePath="Test Suites/regressionJenkins" -browserType="Chrome" -retry=0 -statusDelay=15 email="fiky.anggra@usenobi.com" password="Dimensional00#"'
            }
        }
    }
}
