pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                // Clone the repository
                git branch: 'main', url: 'https://github.com/skolarkar/my-restaurant-app'
            
            }
        }
         stage('Build') {
            steps {
                // Build the project with Maven
                sh 'mvn clean install -DskipTests'
                sh "java -jar target/my-restaurant-app-0.0.1-SNAPSHOT.jar" 
            }
        }
    }
}
