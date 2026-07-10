# Tema 3. Estratégias e Planejamento de Teste de Software

Esse tema junta quatro peças que só fazem sentido completo quando usadas juntas: escolher a abordagem certa de teste (caixa branca ou caixa preta), documentar o plano num lugar rastreável (TestLink), desenhar o cenário a partir de como o usuário realmente usa o sistema (UML e casos de uso), e automatizar a execução (Cucumber com Selenium WebDriver, usando BDD).

## Caixa branca e caixa preta

Teste caixa branca olha pra dentro do código, sabe como a lógica foi implementada e testa caminho, condição e ramificação internos. Teste caixa preta ignora completamente como o código foi escrito e valida só o comportamento visível de fora, dado uma entrada, o sistema devolve a saída esperada. Os dois casos de teste desse tema (`CasoDeTeste_Login.md`) são caixa preta: eles não sabem (nem precisam saber) como o login foi implementado por trás, só verificam se o comportamento bate com o que foi especificado.

## Plano e caso de teste com TestLink

O TestLink organiza caso de teste dentro de uma estrutura de plano e suíte, permitindo rastrear quantos casos existem, quantos já foram executados, quantos passaram e quantos falharam. O arquivo `CasoDeTeste_Login.md` segue esse mesmo formato (ID, pré-condição, passos, resultado esperado), só que em markdown em vez de estar dentro da ferramenta. É esse nível de detalhe que permite saber exatamente o que já foi coberto e o que ainda falta testar.

## UML e casos de uso no planejamento

Antes de escrever qualquer caso de teste, alguém precisa mapear como o usuário de fato interage com o sistema. Um diagrama de caso de uso pra "Fazer Login" já revela os cenários que precisam virar teste: fluxo principal (login com sucesso) e fluxos alternativos (senha errada, usuário não cadastrado, campo vazio). Os dois cenários do `login.feature` vieram direto desse tipo de análise, o fluxo principal e um fluxo alternativo de erro.

## Cucumber, BDD e Selenium WebDriver

BDD (Behavior Driven Development) aproxima o time técnico do stakeholder ao descrever o comportamento esperado numa linguagem legível por qualquer pessoa, não só por quem programa. É exatamente isso que o `login.feature` faz, usando Gherkin (Dado, Quando, Então) pra descrever os dois cenários de login em português simples.

O Cucumber conecta cada linha do `.feature` a um método Java correspondente (`LoginSteps.java`), e é esse método que usa o Selenium WebDriver pra abrir o navegador de verdade, preencher os campos e clicar no botão, automatizando o que antes seria um teste manual repetido a cada entrega.

## Arquivos

- `CasoDeTeste_Login.md`: dois casos de teste caixa preta documentados no formato de plano de teste (estilo TestLink).
- `login.feature`: os mesmos cenários escritos em Gherkin, formato BDD.
- `LoginSteps.java`: automação dos cenários usando Cucumber e Selenium WebDriver.

Pra rodar de verdade, o projeto precisa das dependências `cucumber-java`, `cucumber-junit` e `selenium-java` no classpath, além do ChromeDriver instalado e de uma página de login real rodando em `localhost:8080/login` com os elementos `usuario`, `senha`, `btnEntrar`, `mensagem` e `erro`.
