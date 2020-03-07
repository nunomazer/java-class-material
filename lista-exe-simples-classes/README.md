# Lista de exercícios simples com classes

1) Implemente uma classe para conversão de temperaturas.

A fórmula de graus Celsius para Fahrenheit é: F <- (9 * C + 160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
A fórmula para Fahreinheit para Calsius é: C <- (F - 32) * (5 / 9), sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
Utilize o método main da classe principal para testar sua classe de conversões.

---

2) Implemente uma classe de aluno, onde ele recebe 4 notas. Um método para informar a média, e um método para informar se o aluno passou ou reprovou. Média maior ou igual a 7 significa que passou.

---

3) Implemente uma classe de paciente, os dados são nome, altura (em metros, por exemplo 1.8 = 1 mt e 80 cm), peso (em kg) e idade. Utilize uma classe de avaliação de saúde que possui um método de cálculo de IMC. Este método recebe um paciente e informa seu resultado:

Fórmula: IMC = Massa / Altura x Altura

Tabela de resultado:

    IMC abaixo de 16 = magreza grave
    IMC entre 16 e 17 = magreza moderada
    IMC entre 17 e 18,5 = magreza leve
    IMC entre 18,5 e 25 = saudável
    IMC entre 25 e 30 = sobrepeso
    IMC entre 30 e 35 = obesidade de grau I
    IMC entre 35 e 40 = obesidade de grau II (severa)
    IMC acima de 40 = obesidade de grau III (mórbida)

Se a pessoa for idosa (idade acima de 60), a tabela sofre alteração:

    IMC abaixo de 22 indica que o idoso está abaixo do peso.
    IMC entre 22 e 27 é o considerado saudável para a terceira idade.
    IMC entre 27 e 30 indica sobrepeso.
