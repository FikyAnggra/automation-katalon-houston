//Mendefinisikan pipeline
pipeline {
    //Menetapkan agen sebagai 'any', yang berarti bisa dijalankan pada agen yang tersedia
    agent any
    
    //Mendefinisikan tahap-tahap dalam pipeline
    stages {
        //Tahap pertama bernama "Build"
        stage('Build') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/FikyAnggra/automation-karate-api.git']]])
           }
        }
        //Tahap kedua bernama "Test"
        stage('Test') {
            steps {
              bat '/path/to/katalon-studio/katalonc -noSplash -runMode=console -projectPath="/path/to/project" -testSuitePath="Test Suites/PROEARN/regressionEarn2.0Features" -browserType="Chrome" -retry=0 -statusDelay=15 -testSuiteCollectionStart=test_suite_start -testSuiteCollectionStop=test_suite_stop -executionProfile="default" -apiKey="api_key"'
            }
        }
    }
}
