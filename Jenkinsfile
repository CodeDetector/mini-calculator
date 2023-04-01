pipeline {
	agent any 
	
	stages {
		stage('checkout'){
		steps{
			checkout scm
		}
		}
		stage('Maven Build'){
		steps{
			sh 'mvn clean package'
		}
		}
		stage('Docker Build Image'){
		steps{
			sh 'docker build -t dhruvsharma983/docker-push .'
		     }
		}
		stage('Publish Docker Images'){
		steps{
			withCredentials([usernamePassword(credentialsId:'dockerCreds',usernameVariable:'USERNAME',passwordVariable:'PASSWORD')]){
			sh "docker login -u ${env.USERNAME} -p ${env.PASSWORD}"
			sh "docker push dhruvsharma983/docker-push:latest"
			}
		     }
		}
		stage('Clean Docker Images'){
		steps {
			sh 'docker rmi -f dhruvsharma983/docker-push'
		}
		}
		stage('Deploy and Run Image'){
		steps {
			annsiblePlaybook becomeUser: null , colorized: true ,disableHostKeyChecking:true , installation: 'Ansible' , inventory: 'inventory' ,playbook:'playbook.yml' , sudoUser: null 
		}
		}
	}
	post {
		always {
			sh 'docker logout'
		}
	}

}
