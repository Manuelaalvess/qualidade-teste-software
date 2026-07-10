# Defeito registrado no Mantis BugTracker

Esse defeito foi aberto depois que o caso de teste CT-102 falhou na Build 1.0 (ver `RelatorioExecucao_TestLink.md`).

- **ID:** BUG-101
- **Projeto:** Cadastro de Usuário
- **Resumo:** Sistema permite cadastrar dois usuários com o mesmo email
- **Categoria:** Validação de cadastro
- **Severidade:** Maior
- **Reprodutibilidade:** Sempre
- **Prioridade:** Alta
- **Caso de teste relacionado:** CT-102

**Passos para reproduzir:**
1. Cadastrar um usuário com o email "ja_cadastrado@teste.com"
2. Tentar cadastrar um segundo usuário usando o mesmo email
3. Clicar em "Cadastrar"

**Resultado esperado:** o sistema deveria bloquear o segundo cadastro e exibir "Este email já está cadastrado".

**Resultado obtido:** o sistema cria a segunda conta normalmente, sem nenhum aviso.

**Ciclo de vida do defeito:**

Novo → Confirmado → Atribuído → Em correção → Resolvido → Fechado

**Responsável atual:** desenvolvedor do módulo de cadastro
