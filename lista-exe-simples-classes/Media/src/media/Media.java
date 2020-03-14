/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media;

/**
 *
 * @author nunomazer
 */
public class Media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.nota[0] = 8;
        a.nota[1] = 4.8;
        a.nota[2] = 5.2;
        a.nota[3] = 9;

        System.out.println("Media " + a.media() + " - " + a.situacao());

        a.nota[0] = 8;
        a.nota[1] = 9.8;
        a.nota[2] = 5.2;
        a.nota[3] = 9;

        System.out.println("Media " + a.media() + " - " + a.situacao());
    }

}
