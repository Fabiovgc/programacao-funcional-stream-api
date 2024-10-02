# Stream API
> Aborda uma nova opção de manipulação de coleções em Java seguindo os princípios da programação funcional
> Poderosa solução para processar coleções de maneira DECLARATIVA ao invés da traducional IMPERATIVA

### Expressões LAMBDA
`.mapToDouble(item -> item.getPreco() * item -> item.getQuant())`
`.sum();`
> Combinada com as expressões LAMBDA e METHOD reference, eles proporcionam uma maneira mais simples e concisa de escrever codigo que resulta em facilidade de manutenção e paralelização sem efeitos indesejados em tempo de execução.

> As expressões LAMBDA permitem representar interfaces funcionais (com um unico metodo abstrato) de forma mais concisa e permitem escrever codigo no estilo funcional

> As interfaces funcionais servem de base para o uso das expressões lAMBDA

> Uma função LAMBDA é uma função sem declaração, isto é , não é necessário colocar um nome, um tipo de retorno e o modificador de acesso. A ideia é que o metodo seja declarado no mesmo lugar que será usado

> As funções LAMBDA tem sintaxe definida com (argumento) -> (corpo)