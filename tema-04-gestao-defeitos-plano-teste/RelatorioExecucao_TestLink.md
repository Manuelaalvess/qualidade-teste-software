# Relatório de execução no TestLink (Build 1.2)

Esse relatório mostra o resultado da execução dos casos de teste do Tema 3 (CT-001 e CT-002) numa build específica, exatamente o tipo de relatório e métrica que o TestLink gera automaticamente depois de cada rodada de teste.

- **Plano de teste:** Login do sistema
- **Build:** 1.2
- **Total de casos planejados:** 2
- **Passou:** 1 (CT-001, login com credenciais válidas)
- **Falhou:** 1 (CT-002, login com senha inválida)
- **Bloqueado:** 0
- **Taxa de sucesso da build:** 50%
- **Defeito aberto a partir dessa execução:** BUG-045 (registrado no Mantis)

Numa build seguinte, depois da correção do BUG-045, o mesmo CT-002 é reexecutado. Se passar, o status muda pra Passou e o defeito é fechado no Mantis. É esse histórico de execução por build que forma a métrica real de qualidade do projeto ao longo do tempo, não só o resultado da última rodada.
