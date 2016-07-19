node ('linux'){
  stage 'Build and Test'
  env.PATH = "${ool 'Maven 3'}/bin:${env.PATH}"
  git url: "https://github.com/tanyixiu/HelloWorld.git"
  sh 'mvn clean package'
}
