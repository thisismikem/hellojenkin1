pipeline {
  agent any
  parameters {
    choice(name: 'VERSION', choices:['1.1', '1.2', '2.0'], description: 'choice version')
    booleanParam(name: 'executeTests', defaultValue: true, description: 'execute Tests')
  }
  stages {
    stage('Log Tool Version') {
      parallel {
        stage('Log Tool Version') {
          steps {
            sh '''mvn --version
              git --version
              java -version'''
          }
        }

        stage('Check for POM') {
          steps {
            fileExists 'pom.xml'
          }
        }

      }
    }

    //stage('Build with Maven') {
    //  when {
    //    expression {
    //      params.executeTests
    //    }
    //  }
    //  steps {
    //    sh 'mvn compile test package'
    //  }
    //}

    stage('Post build') {
      steps {
        echo "version is ${params.VERSION}"
        writeFile(file: 'status.txt', text: 'Hey it worked!!!')
      }
    }

  }
  
  post {
        always {
            archiveArtifacts artifacts: 'status.txt, pom.xml, abc.txt'
        }
    }
  
}
