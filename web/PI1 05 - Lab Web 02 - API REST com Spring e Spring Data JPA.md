# Lab Web 02 - API REST com Spring e Spring Data JPA

Neste roteiro, vamos criar o backend de uma aplicação simples que use a abordagem REST para cadastros de departamentos e funcionários, em cima da infraestrutura do framework Spring.

Ao longo do roteiro, há referências no estilo **(slide X)**, indicando que instruções de como fazer o que está sendo pedido encontram-se no slide número X da apresentação "Reuso de Frameworks", disponível no Classroom.


## Estudo de uma aplicação REST simples

1. Obtenha o projeto de uma aplicação REST simples para uma agenda de contatos, desenvolvido pelo [prof. João Paulo](https://nemo.inf.ufes.br/equipe/jpalmeida/), disponível num [repositório do GitHub](https://github.com/vitorsouza/pi1-jp-agenda);

2. Descompacte o projeto, abra com o VS Code e excute-o **(slide 36)**;

3. Experimente a API REST disponibilizada pela aplicação. A seguir, alguns comandos que podem ser executados para experimentar, utilizando `curl` para enviar os comandos. A parte `| python3 -m json.tool` é opcional e serve para formatar a saída:

    - `curl http://localhost:8080/contatos | python3 -m json.tool` (GET): retornará a agenda vazia;
    - `curl -d '{"nome":"Fulano","telefone":"+5511111"}' -H 'Content-Type: application/json' http://localhost:8080/contatos` (POST): adiciona Fulano à agenda;
    - `curl -d '{"nome":"Maria","telefone":"+5522222"}' -H 'Content-Type: application/json' http://localhost:8080/contatos` (POST): adiciona Maria à agenda;
    - Repita o primeiro GET para ver os contatos da agenda;
    - `curl http://localhost:8080/contatos/1 | python3 -m json.tool` (GET): mostra só o contato de Maria (ID 1)''
    - `curl -X PUT -d '{"nome":"Sicrano","telefone":"+55"}' -H 'Content-Type: application/json' http://localhost:8080/contatos/0` (PUT): renomeia Fulano para Sicrano;
    - Use GET para ver que foi renomeado;
    - `curl -X DELETE http://localhost:8080/contatos/0` (DELETE): apaga o contato do Sicrano;
    - Use GET para ver que a agenda só tem o contato da Maria.

4. Estude o código-fonte para ver como a API REST foi implementada em `AgendaController`. Note que o controlador foi separado da classe que representa a aplicação Spring Boot. Repare também que as classes de domínio foram colocadas num pacote separado;


## Construção de uma aplicação REST

5. Crie uma aplicação utilizando a [interface Web do Spring Boot](https://start.spring.io/), incluindo Spring Web, Spring Data JPA e o H2 Database **(slide 58)** -- a parte de dados já será incluída por conta da próxima etapa do roteiro;

6. Implemente classes de domínio que representem departamentos (que possuem ID e nome) e funcionários (que possuem ID, nome e salário);

7. A exemplo da aplicação da agenda, implemente uma API REST para resolver os seguintes caminhos, armazenando os dados em memória (vide solução da agenda):

    - `/departamentos`: GET e POST;
    - `/departamentos/{depId}`: GET, PUT e DELETE;
    - `/departamentos/{depId}/funcionarios`: GET e POST;
    - `/departamentos/{depId}/funcionarios/{funcID}`: GET, PUT e DELETE;

    > Os significados de cada verbo em cada caminho deve ser intuitivo: GET em `/departamentos` lista todos os departamentos, enquanto POST cadastra um novo. Algo análogo ocorre com os funcionários de um departamento no caminho `/departamentos/{depId}/funcionarios`. Já GET, PUT e DELETE em `/departamentos/{depId}` retorna, altera e exclui, respectivamente, um departamento específico. O mesmo ocorre em `/departamentos/{depId}/funcionarios/{funcID}` com um funcionário.

    > Sugere-se implementar primeiro para departamentos, testar se funciona e, em seguida, fazer a parte de funcionários.

8. Teste sua aplicação com `curl`, [Postman](https://www.postman.com/downloads/), [Insomnia](https://insomnia.rest/download) ou similar. Ao reiniciar sua aplicação, veja que os dados são perdidos;


## Armazenamento em banco de dados

9. Configure o Spring Data pra armazenar o banco H2 em um arquivo em disco e para criar as tabelas automaticamente caso não existam no banco **(Slide 59)**;

10. Faça das suas classes de domínio entidades persistentes **(Slide 60)**. Um desafio aqui é como mapear a associação entre as classes que representam departamentos e funcionários. Procure informações sobre as anotações `@ManyToOne` e `@OneToMany` do JPA, em especial a propriedade `mappedBy` desta última, que é necessária caso a associação seja bidirecional (i.e., departamento tem uma coleção de funcionários e funcionário tem uma referência ao departamento). Caso não encontre a resposta sozinho(a), chame o professor;

11. Implemente um repositório para cada classe de domínio **(Slide 61)** e injete-o no controlador **(Slide 62)**, implementando as operações de persistência dos objetos a partir da API oferecida pelos repositórios;

    > Assim como na etapa anterior, sugere-se implementar primeiro para departamentos, testar se funciona e, em seguida, fazer a parte de funcionários.

12. Teste sua aplicação e veja, agora, que você pode reiniciá-la e os dados se mantém, pois foram salvos no banco de dados.

