# vote
Voting application to exemplify the use of spring boot in building an API

# Correções

## O **contrato da interface** (`AssociateService`) usa ​**String como identificador**​, mas a implementação pensa que o ID é **Long** (`Long.parseLong(id)`).

Se criarmos outra implementação que use UUID ou outro tipo de identificador, ela **não poderá substituir** a implementação atual sem quebrar o comportamento esperado.

Isso ​**viola o Princípio de Liskov**​, pois:

* O subtipo (`AssociateServiceImpl`) altera a semântica do contrato definido pela interface.
* Um consumidor do serviço não pode usar outra implementação sem quebrar a compatibilidade.

## Marcelo Henrique Rosendo da Silva