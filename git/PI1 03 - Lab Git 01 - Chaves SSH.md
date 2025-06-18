# Lab Git 01 - Chaves SSH

Neste roteiro, será criada uma chave SSH para acesso ao repositório remoto no GitHub por este protocolo de transferência.

1. Caso ainda não tenha, crie uma conta no [GitHub](https://github.com/);

2. Num terminal, crie um par de chaves assimétricas (_public key_, _private key_) com o seguinte comando (substitua o e-mail de exemplo pelo seu, preferecialmente o utilizado no GitHub; ao ser solicitado, crie uma senha para suas chaves locais): `ssh-keygen -t ed25519 -C "fulano@examplo.com.br"`

3. Copie o conteúdo da chave pública, que estará em `~/.ssh/id_ed25519.pub`;

4. Abra https://github.com/settings/keys (ou clique no seu perfil > **Settings**, **SSH and GPG keys**);

5. Clique em **New SSH Key** e cole o conteúdo da chave pública. Dê um nome à chave (ex.: LabGrad 3) e salve.


Caso seja uma preocupação sua, lembre-se de no final da aula remover as chaves geradas na máquina local e também no GitHub, repetindo este procedimento sempre que quiser acessar o GitHub do LabGrad:

```
rm ~/.ssh/id_ed25519
rm ~/.ssh/id_ed25519.pub
```
