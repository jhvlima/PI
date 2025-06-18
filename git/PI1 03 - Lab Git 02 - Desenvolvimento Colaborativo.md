# Lab Git 02 - Desenvolvimento Colaborativo

Neste roteiro, será simulado um desenvolvimento colaborativo de um projeto de software por uma equipe de ao menos 2 pessoas desenvolvedoras, que chamaremos de **DevA** e **DevB**. No caso de equipes de mais de 2 pessoas, ajustar o roteiro:

1. Verifiquem se o acesso ao [GitHub](https://github.com/) está configurado adequadamente (vide Lab Git 01 - Chaves SSH);

2. **DevA**: crie um repositório no GitHub e convide os demais colegas para participar no repositório: **Settings** > **Collaborators** > **Add People**;

3. **DevB**: aceite o convite clicando no perfil e indo em **Organizations**;

4. Clonem o repositório em suas máquinas locais;

5. **DevA**: adicione um arquivo texto qualquer no repositório, faça _add_, _commit_ e _push_;

6. **DevB**: faça _pull_, altere o arquivo, faça _add_, _commit_ e _push_;

7. **DevA**: faça _pull_ para verificar a nova versão do arquivo (alterada pelo colega);

8. Usem `git log --graph` para visualizar os _commits_ e identificar os _commits_ feito por cada um;

9. Façam alterações simultâneas nos arquivos (linhas diferentes). Façam, _add_ e _commit_;

10. Agora, um dos colegas deve fazer o _push_ primeiro. O outro deve fazer o _pull_, o que levará a identificação das modificações concorrentes no arquivo e a necessidade de se realizar uma mesclagem (_merge commit_). Tentem resolver;

11. Após resolvido, novamente usem `git log --graph` para visualizar os _commits_, incluindo o _merge_, e identificar os _commits_ feito por cada um;

12. Explore o GitHub para ver as várias informações que são passíveis de visualização, incluindo o histórico completo, os vários _diffs_ nos _commits, etc. 

13. Façam alterações simultâneas em uma mesma linha e repitam o _push_ de um lado e _pull_ do outro. Tentem resolver o conflito e fazer a mesclagem.

