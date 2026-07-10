# Tema 2. Processo do Teste de Software e Seus Princípios

Esse tema desmonta uma confusão comum: testar não é só "rodar o programa pra ver se quebra". É um processo estruturado, com papel, planejamento e critério definido de quando começar e quando parar. Isso vem desde os anos 1950 e 1960, quando as primeiras linguagens modernas surgiram (o Cobol é um exemplo que sobrevive até hoje), e o teste foi virando parte obrigatória do controle de qualidade em vez de uma etapa informal no fim do projeto.

## Princípios do teste de software

Tem sete ideias que sustentam qualquer processo de teste sério:

Teste mostra a presença de defeito, não a ausência. Rodar um monte de teste e não achar bug não prova que o sistema está livre de erro, só prova que aqueles testes específicos passaram.

Teste exaustivo é impossível. Não dá pra testar toda combinação possível de entrada, então o trabalho real é escolher as combinações que mais importam.

Teste cedo economiza. Achar defeito na fase de requisito custa muito menos que achar depois que o sistema já está em produção.

Defeito se agrupa. Historicamente, a maioria dos bugs de um sistema costuma estar concentrada em poucos módulos, geralmente os mais complexos ou mais mexidos.

Paradoxo do pesticida. Repetir os mesmos casos de teste sempre para de encontrar bug novo, porque o sistema "se acostuma" com aquele conjunto de testes. Por isso os casos de teste precisam ser revisados e ampliados com o tempo.

Teste depende do contexto. Testar um sistema bancário não é igual a testar um app de jogo, o nível de rigor muda conforme o risco envolvido.

Ausência de erro é uma falácia. Um sistema pode estar tecnicamente sem bug e mesmo assim ser inútil, porque não atende o que o usuário realmente precisa.

## Processo, papéis e planejamento

O processo de teste normalmente segue etapas de planejamento, análise, projeto dos casos de teste, execução e encerramento, cada uma com responsável definido (analista de teste, gerente de teste, etc). O planejamento é o que decide o critério de seleção (quais testes valem a pena rodar primeiro, dado tempo e risco) e o critério de encerramento (quando parar de testar e liberar pra entrega). Sem esse planejamento, a equipe testa até o prazo acabar, não até o risco estar de fato coberto.

## Modelo V

O modelo V deixa visual algo que já estava implícito nos princípios: cada fase de desenvolvimento tem uma fase de teste correspondente, rodando em paralelo desde o início do projeto. Levantamento de requisito se conecta com teste de aceitação, projeto do sistema se conecta com teste de sistema, projeto detalhado se conecta com teste de integração, e codificação se conecta com teste unitário. A vantagem prática é que o teste começa a ser pensado junto com o requisito, não só depois que o código já existe.

## Testes estáticos e dinâmicos

Teste estático analisa o artefato sem executar o programa, revisão de código, inspeção, análise estática de ferramenta. Serve pra pegar problema de design ou de requisito mal escrito antes mesmo de existir código rodando. Teste dinâmico já exige executar o sistema com dado real de entrada e comparar o resultado com o esperado, é o que a maioria das pessoas imagina quando pensa em "testar".

## Testes estruturais e funcionais

Teste estrutural (caixa branca) olha pra dentro do código, cobre caminho, condição e ramificação da lógica interna. Teste funcional (caixa preta) ignora como o código foi escrito e valida só se o comportamento bate com o que foi especificado. Nenhum dos dois sozinho garante qualidade completa, um cobre a lógica interna, o outro cobre se o sistema entrega o que o cliente pediu.

## Na prática

Nenhuma dessas técnicas substitui a outra. O planejamento define o que testar primeiro dado o risco, o modelo V garante que teste não é uma etapa isolada no fim, e a combinação de estático com dinâmico e estrutural com funcional é o que realmente reduz a chance de um defeito crítico passar despercebido até a entrega.
