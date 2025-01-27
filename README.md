# Documentação de Projeto

Este documento fornece informações sobre a API de Desenvolvimento de Projeto 2, um sistema desenvolvido para facilitar a entrega e confirmação de mensagens enviadas pelo NAI.

## Requisitos

Antes de instalar o software, verifique se o seu sistema atende aos seguintes requisitos:

```
Dependências:
    > Java JDK-23
    > MySql
    > Maven
    > WildFly
```

## Instalação

Realizando a Instalação

```
> Inicie o seu terminal
> Vá para a pasta onde o arquivo está localizado
> Após chegar na pasta rode o seguinte comando: mvn clean package
> Realize o deploy no WildFly do .war que está localizado na pasta ./target/projeto2-<Versão>.war

```

## Documentação da API

#### Endpoints

Todas as requisições são realizadas por meio de protocolos *HTTP* definidos nos controllers:

* /api/confirmation - Caminho para requisições de login de usuários;

## Uso/Exemplos

#### Usuário

```http
> GET /api/confirmation
> GET /api/confirmation/${ra}
> POST /api/confirmation
```

| Requisição | Onde | Parâmetro                                                      | Tipo                                                 | Descrição                                                                       | **Retorno**                                              | Tipo                                       |
| :----------: | :--: | --------------------------------------------------------------- | ---------------------------------------------------- | --------------------------------------------------------------------------------- | -------------------------------------------------------------- | ------------------------------------------ |
|     GET     |      |                                                                 |                                                      |                                                                                   | `List<{ email, professor, emailReceived, EmailRead, date }>` | `String, String, Boolean, Boolean, Date` |
|     GET     | URL | `ra`                                                          | `String`                                           | **Obrigatório.** O RA do aluno que você quer                             | `List<{ email, professor, emailReceived, EmailRead, date }>` | `String, String, Boolean, Boolean, Date` |
|     POST     | Body | `{ ra, student, email, professor, emailReceived, emailRead }` | `String, String, String, String, Boolean, Boolean` | **Obrigatório** Ra, Student, Email, Professor, EmailReceived e EmailRead. | `{ email, professor, emailReceived, EmailRead, date }`       | `String, String, Boolean, Boolean, Date` |

## Autores

- [@Marcos Gomes](https://github.com/marcos221-Br) - BackEnd
- [@Lucas Delfrate](https://github.com/LucasDelfrate) - FrontEnd
