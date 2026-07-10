# Caso de Teste: Login com credenciais válidas

Esse é o formato de caso de teste que normalmente se documenta numa ferramenta como o TestLink, dentro de um plano de teste organizado por suíte.

- **ID:** CT-001
- **Título:** Login com credenciais válidas
- **Tipo:** Funcional, caixa preta
- **Prioridade:** Alta
- **Pré-condição:** Usuário já cadastrado no sistema com usuário "manuela" e senha "senha123"

**Passos:**
1. Acessar a página de login
2. Preencher o campo usuário com "manuela"
3. Preencher o campo senha com "senha123"
4. Clicar no botão "Entrar"

**Resultado esperado:** o sistema exibe a mensagem "Bem-vindo, manuela" e redireciona pro painel principal.

---

# Caso de Teste: Login com senha inválida

- **ID:** CT-002
- **Título:** Login com senha inválida
- **Tipo:** Funcional, caixa preta
- **Prioridade:** Alta
- **Pré-condição:** Usuário já cadastrado no sistema com usuário "manuela"

**Passos:**
1. Acessar a página de login
2. Preencher o campo usuário com "manuela"
3. Preencher o campo senha com "senhaerrada"
4. Clicar no botão "Entrar"

**Resultado esperado:** o sistema exibe a mensagem de erro "Usuário ou senha inválidos" e permanece na página de login.
