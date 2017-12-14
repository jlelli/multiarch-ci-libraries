def call(List<String> sudo_cmds=[]) {
  try {
    for (cmd in sudo_cmds) {
      withEnv(["cmd=${cmd}"]) {
        sh '''#!/bin/bash -xeu
              script="$( mktemp )"
              cat <<SCRIPT >"${script}"
#!/bin/bash
${cmd}
SCRIPT
              chmod +x "${script}"
              sudo "${script}"
        '''
      }
    }
  }
  catch (err) {
    echo err.getMessage()
    throw err
  }
}

