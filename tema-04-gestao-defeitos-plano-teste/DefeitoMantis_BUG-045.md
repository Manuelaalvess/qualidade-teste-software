# Defeito registrado no Mantis BugTracker

Esse defeito surgiu ao executar o caso de teste CT-002 (login com senha inválida) do Tema 3, quando ele falhou durante a execução no TestLink.

- **ID:** BUG-045
- **Projeto:** Sistema de Login
- **Resumo:** Mensagem de erro não aparece ao tentar logar com senha inválida
- **Categoria:** Autenticação
- **Severidade:** Maior
- **Reprodutibilidade:** Sempre
- **Prioridade:** Alta
- **Caso de teste relacionado:** CT-002

**Passos para reproduzir:**
1. Acessar a página de login
2. Preencher o campo usuário com "manuela"
3. Preencher o campo senha com uma senha errada
4. Clicar no botão "Entrar"

**Resultado esperado:** o sistema exibe a mensagem "Usuário ou senha inválidos".

**Resultado obtido:** a tela permanece em branco, sem nenhuma mensagem de erro visível.

**Ciclo de vida do defeito:**

Novo → Confirmado → Atribuído → Em correção → Resolvido → Fechado

(caso o teste de retorno mostre que o problema persiste, o defeito volta pro status Reaberto em vez de Fechado)

**Responsável atual:** desenvolvedor do módulo de autenticação
