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
                bat """
                cd C:/Katalon_Studio_Engine_Windows_64-8.5.5
                katalonc -noSplash -runMode=console -projectPath="C:/my doc/katalon-houston/nobi-automation-katalon-bo-houston.prj" -retry=0 -testSuitePath="Test Suites/PROEARN/regressionJenkins" -browserType="Chrome" -executionProfile="default" -apiKey="f8cfa5f4-7647-4503-9535-02e25a35711c" --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true
                """
            }
        }
    }
}
