# Tratamento de Excessões Com Java!

Este projeto contém três versões de tratamentos de excessões.<br/>
Iniciando com a solução ruin até a melhor e mais <b>adequada solução de tratamento de excessões<b>.<br/>

## Solução muito ruim 

Aqui utilizamos as condicionais diretamente na classe principal.<br/>
Temos a resolução do problema,mas , com muitas linhas de código que deixam a classe mais ilegível e completamente bagunçada. <br/>

## Solução ruim

Aqui ja passamos uma parte do comando de excessões para o metodo updateDates no pacote entities, tirando parte da responsabilidade da classe principal. <br/>
Ainda fazemos muito uso das condicionais, deixando o código bagunçado, mas, com uma legibilidade melhor.<br/>

## Uma boa solução

Aqui a utilização de try catch onde delegamos completamente as excessões que já temos em mente que podem ocorrer no decorrer do projeto.<br/>
Criando uma exception personalizada e utilizando o Runtime para excessões que não iremos prever,mas , que pode ocorrer.


