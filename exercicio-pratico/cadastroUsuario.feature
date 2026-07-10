# language: pt
# Exercicio pratico: Cadastro de Usuario
# Cenarios em Gherkin (BDD), escritos a partir do caso de uso do Passo 3

Funcionalidade: Cadastro de usuario
  Como visitante do sistema
  Eu quero me cadastrar informando meus dados
  Para criar uma conta e acessar o sistema

  Cenario: Cadastro com sucesso
    Dado que estou na pagina de cadastro
    Quando eu preencho o campo nome com "Manuela Alves"
    E eu preencho o campo email com "manuela@teste.com"
    E eu preencho o campo senha com "senha123"
    E eu clico no botao cadastrar
    Entao eu devo ver a mensagem "Cadastro realizado com sucesso"

  Cenario: Cadastro com email ja existente
    Dado que estou na pagina de cadastro
    Quando eu preencho o campo nome com "Manuela Alves"
    E eu preencho o campo email com "ja_cadastrado@teste.com"
    E eu preencho o campo senha com "senha123"
    E eu clico no botao cadastrar
    Entao eu devo ver a mensagem de erro "Este email ja esta cadastrado"

  Cenario: Cadastro com campo obrigatorio vazio
    Dado que estou na pagina de cadastro
    Quando eu preencho o campo nome com "Manuela Alves"
    E eu deixo o campo email vazio
    E eu preencho o campo senha com "senha123"
    E eu clico no botao cadastrar
    Entao eu devo ver a mensagem de erro "O campo email e obrigatorio"
