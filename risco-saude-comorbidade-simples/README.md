# Risco de Saúde por Comorbidades - V1

Exercício que utilizei em Prova de Programação Orientada a Objetos, nível 1

Disponível também o vídeo explicativo da implementação no [Youtube](https://youtu.be/PvS4CtxZqic)

## v1 - controle simples

### Classe Paciente

Escreva uma classe em Java para o contexto de domínio de um Paciente. 

Ela deve conter atributos para nome, cpf e email. 

Seus atributos devem ser encapsulados de forma que a alteração de seus valores e o acesso a eles somente possa ser realizado por métodos modificadores de acesso. 

Não é necessário escrever validações para atribuição de valores.

### Classe Comorbidade

Escreva uma classe Java para o contexto de Comorbidade. 

Ela deve conter atributos para nome e nível. 

Seus atributos devem ser encapsulados de forma que a alteração de seus valores e o acesso a eles somente possa ser realizado por métodos modificadores de acesso. 

Níveis de comorbidade são de 1 a 5. Os nomes aceitos são: Câncer, Cardiaco, Pulmonar, Diabetes.


### Relacionamento Paciente x Comorbidades

Altere a classe Paciente para que seja possível associar uma série de comorbidades a ele. As regras de encapsulamento e acesso são as mesmas da definição inicial de Paciente.

### Controle de pacientes

Crie uma classe em Java para controle de pacientes, ela deve manter uma lista dos pacientes atuais no hospital. 

Seus atributos devem ser encapsulados de forma que a alteração de seus valores e o acesso a eles somente possa ser realizado por métodos modificadores de acesso. 

Deve existir um método para adicionar novo paciente sem a necessidade de atribuir uma lista completa. 

### Cálculo Risco de saúde

Altere a classe de controle de pacientes, adicione um método que recebe um paciente e retorne o índice de risco de saúde. 

O risco de saúde é a a soma do nível de suas doenças.

### Risco de saúde do Paciente

Altere a classe de controle de pacientes, adicione um método que recebe o cpf de um paciente e retorna seu índice de risco de saúde.

### Cálculo Complexidade

Altere a classe de controle de pacientes, adicione um método que recebe um índice de risco de saúde e retorna a complexidade do paciente. 

A complexidade é definida pela tabela: 

* 1 a 2-Baixa
* 3 a 6 - Média
* 7 a 10 - Alta
* Acima de 10 - Altíssima.

### Complexidade do Paciente

Altere a classe de controle de pacientes, adicione um método que recebe o cpf de um paciente e retorna sua complexidade.


