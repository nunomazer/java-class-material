/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

/**
 *
 * @author nunomazer
 */
public class AvaliacaoSaude {
    double calculaImc(Paciente p) {
        double imc;

        imc = p.peso / (p.altura * p.altura);

        return imc;
    }

    String situacaoImc(Paciente p) {
        double imc = calculaImc(p);

        if (imc < 16) return "magreza grave";
        if (imc >= 16 && imc < 17) return "magreza moderada";

        if (p.idade < 60 ) {
            if (imc >= 17 && imc < 18.5) return "magreza leve";
            if (imc >= 18.5 && imc < 25) return "saudável";
            if (imc >= 25 && imc < 30) return "sobrepeso";
        } else {
            // idoso
            if (imc >= 17 && imc < 22) return "magreza leve";
            if (imc >= 22 && imc < 27) return "saudável";
            if (imc >= 27 && imc < 30) return "sobrepeso";
        }

        if (imc >= 30 && imc < 35) return "obesidade de grau I";
        if (imc >= 34 && imc < 40) return "obesidade de grau II (severa)";

        return "obesidade de grau III (mórbida)";
    }
}
