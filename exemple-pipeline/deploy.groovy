node {
  git url: 'https://github.com/jcsirot/ansible-meetup.git'
  dir('exemple-2') {
    wrap([$class: 'AnsiColorBuildWrapper', colorMapName: "xterm"]) {
      ansiblePlaybook(
        inventory: 'hosts.cfg',
        playbook: 'deplopy.yml',
        sudo: true,
        credentialsId: '3356be1d-bf9b-4a15-b41f-5617808a3877',
        extraVars: [
          db_login: 'jcsirot',
          db_pass: [value: '4K2Z_MZ+J;', hidden: true]
        ],
        colorized: true
      )
    }
  }
}
