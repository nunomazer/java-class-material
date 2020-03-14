/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media.ui;

import media.rn.Aluno;

/**
 *
 * @author nunomazer
 */
public class App {
    Console console = new Console();

    protected void readQtdeNotas(Aluno a) {
        boolean res;
        int q;

        do {
            q = console.readInt("Informe a quantidade de notas da média: ");

            res = a.setQtdeNotas(q);

            if (res == false) {
                System.out.println("Quantidade de notas informada não está no intervalo permitidos");
            }

        } while (res == false);
    }

    protected void readNota(Aluno a, int n) {
        boolean res;
        double nota;

        do {
            nota = console.readDouble("Informe a nota "+ (n+1) +": ");

            res = a.setNota(n, nota);

            if (res == false) {
                System.out.println("Notas informada não está no intervalo permitido");
            }

        } while (res == false);
    }

    public void start() {
        Console console = new Console();

        Aluno a = new Aluno();

        readQtdeNotas(a);

        for (int i=0; i < a.getQtdeNotas(); i++) {
            readNota(a, i);
        }

        System.out.println("Notas do aluno: ");
        for (double n : a.getNotas()) {
            System.out.print(n + ", ");
        }
        System.out.println("Com média " + a.getMedia() + " e status " + a.getSituacao());

    }
}
