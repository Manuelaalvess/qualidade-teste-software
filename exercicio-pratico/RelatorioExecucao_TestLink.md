# Relatório de execução no TestLink: Cadastro de Usuário

## Build 1.0 (primeira execução)

- **Total de casos:** 3
- **Passou:** CT-101, CT-103
- **Falhou:** CT-102 (defeito BUG-101 aberto no Mantis)
- **Taxa de sucesso:** 66,7%

## Build 1.1 (depois da correção do BUG-101)

- **Total de casos:** 3
- **Passou:** CT-101, CT-102, CT-103
- **Falhou:** nenhum
- **Taxa de sucesso:** 100%
- **Defeito BUG-101:** reexecutado e fechado no Mantis, pois o CT-102 passou a exibir a mensagem de erro corretamente

É essa comparação entre builds que mostra a métrica de qualidade evoluindo de verdade, a build 1.0 tinha um defeito crítico bloqueando a entrega, e a build 1.1 já está com todos os casos passando.
