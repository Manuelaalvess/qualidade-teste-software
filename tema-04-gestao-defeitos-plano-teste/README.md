# Tema 4. Gestão de Defeitos e Plano de Teste

Esse tema fecha o ciclo que os Temas 2 e 3 deixaram em aberto: depois de planejar e executar teste, alguém precisa registrar o que deu errado, acompanhar até a correção e confirmar que o problema foi resolvido de verdade. É isso que o Mantis BugTracker e o TestLink resolvem juntos, cada um cuidando de uma metade do processo.

## Mantis BugTracker: o ciclo de vida do defeito

O Mantis existe pra rastrear defeito do início ao fim. Um bug não é só "aberto" ou "fechado", ele passa por um ciclo de vida real: Novo (acabou de ser reportado), Confirmado (alguém validou que o problema existe mesmo), Atribuído (um desenvolvedor específico ficou responsável), Em correção, Resolvido, e por fim Fechado, depois que o teste de retorno confirma que o problema não volta. Se o teste de retorno falhar, o defeito volta pro status Reaberto em vez de seguir pra Fechado, o ciclo não é uma linha reta.

O `DefeitoMantis_BUG-045.md` documenta um defeito real registrado nesse formato, incluindo severidade, prioridade, passos de reprodução e o status atual no ciclo de vida.

## TestLink: plano, execução e métrica

O TestLink cuida do lado do planejamento e execução: organiza os casos de teste em plano e suíte, permite atribuir caso a um testador específico, e registra o status de cada execução (passou, falhou, bloqueado) numa build específica. Com isso, dá pra gerar relatório e métrica reais: taxa de sucesso por build, quantos casos ainda estão pendentes, quantos defeitos foram abertos a partir de uma rodada de teste.

O `RelatorioExecucao_TestLink.md` mostra esse relatório pra uma build específica, usando os mesmos casos de teste do Tema 3 (CT-001 e CT-002).

## Onde as duas ferramentas se encontram

O ponto central desse tema é que Mantis e TestLink não funcionam isolados. Quando um caso de teste falha no TestLink, o testador abre um defeito no Mantis referenciando esse caso (é por isso que o BUG-045 cita o CT-002 diretamente). O desenvolvedor corrige, o testador reexecuta o mesmo caso numa build nova, e só quando o teste passa de novo é que o defeito pode ser fechado no Mantis. Sem essa rastreabilidade nos dois sentidos, fica impossível saber se uma correção realmente resolveu o problema ou só mudou de lugar.

## Arquivos

- `DefeitoMantis_BUG-045.md`: exemplo de defeito documentado no formato e ciclo de vida do Mantis BugTracker.
- `RelatorioExecucao_TestLink.md`: exemplo de relatório de execução e métrica gerado pelo TestLink, referenciando o defeito acima.
