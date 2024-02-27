pipeline {
 agent any
 tools {
  maven "3.9.6"
 }
 environment {
 PATH = "${env.PATH};C:\\Windows\\System32" // Update the PATH to include the directory of cmd.exe
 GIT_CREDENTIALS = credentials('249b052c-c57f-4224-ac66-466ffca32a96')
 }

 stages {
 stage('Checkout') {
 steps {
 git branch: 'FarToCel', credentialsId: '249b052c-c57f-4224-ac66-466ffca32a96', url: 'https://github.com/MMKeke11/MavenTestit'
 }
 }
 stage('Build') {
 steps {
 bat 'mvn clean install'
 }
 }
 stage('Test') {
 steps{
 bat 'mvn test'
 }
 post {
 success {
 // Publish JUnit test results
 junit '**/target/surefire-reports/TEST-*.xml'
 // Generate JaCoCo code coverage report

 }
 }
 }
 }
}
