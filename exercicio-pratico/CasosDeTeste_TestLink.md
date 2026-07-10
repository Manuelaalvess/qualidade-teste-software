# Casos de teste (formato TestLink): Cadastro de Usuario

## CT-101: Cadastro com sucesso

- **Tipo:** Funcional, caixa preta
- **Prioridade:** Alta
- **Pré-condição:** email "manuela@teste.com" ainda não cadastrado no sistema

**Passos:**
1. Acessar a página de cadastro
2. Preencher nome, email e senha válidos
3. Clicar em "Cadastrar"

**Resultado esperado:** sistema exibe "Cadastro realizado com sucesso"

---

## CT-102: Cadastro com email já existente

- **Tipo:** Funcional, caixa preta
- **Prioridade:** Alta
- **Pré-condição:** já existe uma conta com o email "ja_cadastrado@teste.com"

**Passos:**
1. Acessar a página de cadastro
2. Preencher nome e senha válidos, e o email já usado
3. Clicar em "Cadastrar"

**Resultado esperado:** sistema exibe "Este email já está cadastrado" e não cria uma segunda conta

---

## CT-103: Cadastro com campo obrigatório vazio

- **Tipo:** Funcional, caixa preta
- **Prioridade:** Média
- **Pré-condição:** nenhuma

**Passos:**
1. Acessar a página de cadastro
2. Preencher nome e senha, deixando o campo email vazio
3. Clicar em "Cadastrar"

**Resultado esperado:** sistema exibe "O campo email é obrigatório" e não permite o cadastro
