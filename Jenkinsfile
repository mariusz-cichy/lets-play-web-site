pipeline {
  agent any
  stages {
    stage('Kompilacja') {
      steps {
        timestamps() {
          echo 'Start kompilacji'
        }

      }
    }
    stage('Testy jednostkowe') {
      steps {
        timestamps() {
          sleep 1
        }

      }
    }
    stage('Testy integracyjne') {
      steps {
        emailext(subject: 'Testy jednostkowe', body: 'Testy Jednowstkowe', from: 'pipeline@mcpm.pl', to: 'mariusz.cichy@mcpm.pl')
      }
    }
  }
}