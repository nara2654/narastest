pipeline {
   agent any

   

   stages {
      stage('Build') {
         steps {
            // Get some code from a GitHub repository
            git 'https://github.com/nara2654/narastest.git'

            
      }
   }
}
}
