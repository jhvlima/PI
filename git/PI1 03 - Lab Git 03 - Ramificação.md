# Lab Git 03 - Ramificação

Neste roteiro, será simulado um desenvolvimento colaborativo **com uso de um esquema de Git Flow** de um projeto de software por uma equipe de ao menos 2 pessoas desenvolvedoras, que chamaremos de **DevA** e **DevB**. No caso de equipes de mais de 2 pessoas, ajustar o roteiro:


## Preparação:

1. Verifiquem se o acesso ao [GitHub](https://github.com/) está configurado adequadamente (vide Lab Git 01 - Chaves SSH);

2. **DevA**: crie um repositório no GitHub com ramo principal `main` para um projeto de desenvolvimento de um sofisticado _Hello, World!_. Escolha uma licença e crie também um README com informações sobre o projeto;

3. **DevA**: convide os demais colegas para participar no repositório;

4. **DevB**: aceite o convite;

5. Clonem o repositório em suas máquinas locais;


## Ramificação sem conflitos:

6. **DevB**: crie o ramo `development` (ou `develop` ou `dev`), implemente uma primeira versão do _Hello, World!_, a mais simples possível, e compartilhe no GitHub;

7. **DevA**: atualize o repositório local com as modificações enviadas ao GitHub pelo(a) colega. Crie um ramo temporário `issue1` para implementar uma nova funcionalidade: adicionar argumentos de linha de comando para o _Hello, World!_ imprimir: `Hello <args[0]>!`;

8. **DevB**: em paralelo, crie um ramo temporário `issue2` para adicionar comentários no topo do programa _Hello, World!_ de modo a não criar conflitos com a `issue1`, ou seja, não mexa nas mesmas linhas que DevA está mexendo;

9. **DevA**: faça a mesclagem (_merge_) simples (_fast forward_) de `issue1` com `development`, exclua o ramo temporário e envie as atualizações ao GitHub;

10. **DevB**: atualize o repositório local com as modificações enviadas pelo(a) colega ao GitHub, faça a mesclagem sem conflitos (_ort/recursive strategy_) de `issue2` com `development`, exclua o ramo temporário e envie as atualizações ao GitHub;


## Ramificação com conflitos:

11. **DevB**: crie um ramo `issue3` para implementar uma nova funcionalidade: adicione um segundo argumento na linha de comando representando a língua a ser utilizada. O valor "pt-br" neste argumento deverá fazer o seu programa imprimir "Olá, <args[0]>!", qualquer outra coisa deverá resultar no "Hello, <args[0]>!" original;

12. **DevA**: em paralelo, atualize o repositório local com as modificações enviadas pelo(a) colega ao GitHub (no passo 10), crie um ramo `issue4` para reorganizar o código do _Hello, World!_ (ex.: melhorar nomes de variáveis, indentação, posicionamento de chaves, etc.), de modo a mexer propositalmente nas mesmas linhas que DevB está mexendo na `issue3`;

13. **DevB**: faça a mesclagem simples de `issue3` com `development`, exclua o ramo temporário e envie as atualizações ao GitHub;

14. **DevA**: atualize o repositório local com as modificações enviadas pelo(a) colega ao GitHub, faça a mesclagem com conflitos de `issue4` com `development`, resolva manualmente o conflito, exclua o ramo temporário e envie as atualizações ao GitHub;


## Lançamento do software:

15. **DevB**: atualize o repositório local com as modificações enviadas pelo(a) colega ao GitHub, faça a mesclagem de `development` com `main`, adicione a tag `v1.0` e envie tudo ao GitHub;

16. **DevA**: atualize o repositório local com as modificações enviadas pelo(a) colega ao GitHub, execute `git log --oneline --decorate --graph --all` e veja como está o grafo de _commits_ no final do exercício;

17. **DevB**: se o repositório no GitHub for público, clique em _Insights_ > _Network_ e compare o grafo de _commits_ produzido pelo GitHub com o produzido pelo Git no passo anterior;

18. Chame o professor para que veja o resultado do exercício.


## Desafios extra (se sobrar tempo):

* Simule um(a) dev começar a implementar uma nova funcionalidade (em ramo temporário a partir de `development`) enquanto outro(a) cria um ramo `hotfix` direto na `main` para corigir um bug. Depois do bug corrigido, mescle `hotfix` com `main` (crie uma nova tag de versão, ex.: `v1.01`) e com `development` para que a correção do bug também seja feita na versão em desenvolvimento. Ao concluir a funcionalidade, faça a mesclagem do ramo temporário com `development` e resolva conflitos se houver. Exclua todos os ramos temporários, verifique o grafo com `git log` pra certificar que está tudo certo;

* Crie um ramo temporário para implementar mais uma coisa. Ao concluir, não faça mesclagem (_merge_), ao invés faça _rebase_. Veja o grafo com `git log` pra ver a diferença entre um _merge_  e um _rebase_;

* Faça novamente o exercício do _rebase_, porém logo antes de fazer o _rebase_ envie tudo ao GitHub e peça ao(à) colega para atualizar seu repositório local. Em seguida, faça o _rebase_ e compartilhe novamente no GitHub e peça ao(à) colega para atualizar novamente. Ocorreu algum problema? Caso o colega tivesse feito algum commit em algum ramo, o que aconteceria?
