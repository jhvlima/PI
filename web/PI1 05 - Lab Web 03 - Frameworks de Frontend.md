# Lab Web 03 - Frameworks de _Frontend_

Neste roteiro, vamos criar o _frontend_ da aplicação de cadastros de departamentos e funcionários, utilizando frameworks.

Ao longo do roteiro, há referências no estilo **(slide X)**, indicando que instruções de como fazer o que está sendo pedido encontram-se no slide número X da apresentação "Reuso de Frameworks", disponível no Classroom.


## Estudo do _Backend_ da Aplicação

1. Utilize o resultado do Lab Web 02 como base para este roteiro, caso o tenha concluído. Como alternativa, utilize o projeto `departamentos-base` (porém sem uso de banco de dados), desenvolvido pelo [prof. João Paulo](https://nemo.inf.ufes.br/equipe/jpalmeida/), disponível num [repositório do GitHub](https://github.com/vitorsouza/pi1-jp-departamentos-base);

2. Descompacte o projeto, abra com o VS Code e excute-o **(slide 36)**;

3. Experimente a API REST disponibilizada pela aplicação. Lembrando a especificação pedida no Lab Web 02 (para dicas de uso de `curl`, vide o roteiro anterior):

    - `/departamentos`: GET e POST;
    - `/departamentos/{depId}`: GET, PUT e DELETE;
    - `/departamentos/{depId}/funcionarios`: GET e POST;
    - `/departamentos/{depId}/funcionarios/{funcID}`: GET, PUT e DELETE;

    > Os significados de cada verbo em cada caminho deve ser intuitivo: GET em `/departamentos` lista todos os departamentos, enquanto POST cadastra um novo. Algo análogo ocorre com os funcionários de um departamento no caminho `/departamentos/{depId}/funcionarios`. Já GET, PUT e DELETE em `/departamentos/{depId}` retorna, altera e exclui, respectivamente, um departamento específico. O mesmo ocorre em `/departamentos/{depId}/funcionarios/{funcID}` com um funcionário.

4. Se preferir popular o sistema de forma automática com alguns departamentos e funcionários, o prof. João Paulo disponibilizou junto do projeto o script `populaempresa.sh` que pode ser executado;


## _Frontend_ com Bootstrap e Axios

5. Crie a página `index.html` no diretório `src/main/resources/static` do projeto;

6. Siga as instruções do [Quickstart do Bootstrap](https://getbootstrap.com/docs/5.3/getting-started/introduction/) para obter a página "Hello, World!" **(slide 67)**;

7. Obtenha o [Axios](https://github.com/axios/axios), crie um script JavaScript que o importe, coloque ambos em `src/main/resources/static` e inclua o seu script como um módulo na página HTML **(slide 87)**;

8. Similar à função `atualizarChat()` no exemplo do chat **(slide 86)**, crie uma função que executa quando a página é carregada e que consulte os departamentos existentes no _backend_ e imprima seus nomes em algum lugar (no console ou em alguma região da própria página);

9. Veja o exemplo do componente [Accordion](https://getbootstrap.com/docs/5.2/components/accordion/) do Bootstrap e utilize-o para mostrar os dados dos departamentos na página. Mostre o nome do departamento no título de cada item do _accordion_ e uma lista com marcadores com os nomes e salários dos funcionários no conteúdo de cada item;

    > **Dica:** abra o console JavaScript do seu navegador e digite os seguintes comandos:  
    > 
    > ```javascript
    > var str = `Veja bem:
    > O depto {NOME} fica no prédio {PREDIO}.
    > Então o prédio {PREDIO} é do depto {NOME}.`
    > console.log(str.replaceAll('{NOME}', 'Informática').replaceAll('{PREDIO}', 7));
    > ```
    > 
    > O recurso de colocar strings entre crases se chama [_template literals_](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Template_literals) (ou _template strings_) e permite, dentre outras coisas, fazer strings de múltiplas linhas. Você pode usar algo similar para montar um _template literal_ com o código HTML referente a um item de _accordion_ do Bootstrap e, dentro do `for` que passa pelos departamentos retornados pela API, substituir lacunas (ex.: `{NOME}`) pelos dados do departamento. Sugere-se fazer primeiro apenas os nomes dos departamentos e depois que estiver funcionando listar os funcionários.
    > 
    > Atenção ao fato de que o exemplo de _accordion_ do Bootstrap utiliza alguns IDs fixos `headingOne`, `headingTwo`, etc. Você terá que garantir que, para cada item, um ID diferente será usado (pode-se usar o ID do departamento por exemplo). Além disso, observe que o primeiro item do exemplo do Bootstrap está configurado para estar aberto enquanto os demais fechados. Decida como prefere mostrar os itens no caso dos departamentos.

10. Desafio: adicione um [botão](https://getbootstrap.com/docs/5.2/components/buttons/) ao final da página que abra uma caixa de diálogo [modal](https://getbootstrap.com/docs/5.2/components/modal/) com um formulário com um campo para o nome de um departamento e que permita a inclusão desse departamento ao sistema, utilizando a API;

11. Desafio: adicione botões e crie formulários que permitam (1) alterar um departamento; (2) excluir um departamento; (3) adicionar um funcionário a um departamento; (4) alterar um funcionário; (5) excluir um funcionário;

