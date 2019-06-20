pipeline {
  agent any
  stages {
    stage('Kompilacja') {
      steps {
        echo 'Jestem tutaj 1'
      }
    }
    stage('Testy jednostkowe') {
      steps {
        sleep 1
      }
    }
    stage('Testy integracyjne') {
      steps {
        emailext(subject: 'Testy jednostkowe', body: 'Testy Jednowstkowe', from: 'pipeline@mcpm.pl', to: 'mariusz.cichy@mcpm.pl')
      }
    }
  }
}