# language: pt
# Tema 3. Estrategias e planejamento de teste
# Cenario BDD que traduz o caso de teste CT-001 e CT-002 pra um formato
# que tanto time tecnico quanto stakeholder conseguem ler

Funcionalidade: Login no sistema
  Como usuario do sistema
  Eu quero fazer login com minhas credenciais
  Para acessar minha conta

  Cenario: Login com credenciais validas
    Dado que estou na pagina de login
    Quando eu preencho o campo usuario com "manuela"
    E eu preencho o campo senha com "senha123"
    E eu clico no botao entrar
    Entao eu devo ver a mensagem "Bem-vindo, manuela"

  Cenario: Login com senha invalida
    Dado que estou na pagina de login
    Quando eu preencho o campo usuario com "manuela"
    E eu preencho o campo senha com "senhaerrada"
    E eu clico no botao entrar
    Entao eu devo ver a mensagem de erro "Usuario ou senha invalidos"
