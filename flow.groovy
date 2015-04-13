stage 'inital'

node('docker-image-builder'){
  git changelog: true, url: 'git@github.com:vimond/vimond-base.git', credentialsId: 'github_jenkins'
  def docker = new com.vimond.workflow.Docker()

  docker.buildTagPush('micros-baseimage')
    
  }

  stage 'inital'
