/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media.ui;

import java.util.Scanner;

/**
 *
 * @author nunomazer
 */
public class Console {
    Scanner sc = new Scanner(System.in);

    public int readInt(String text) {
        System.out.print(text);
        return sc.nextInt();
    }

    public double readDouble(String text) {
        System.out.print(text);
        return sc.nextDouble();
    }
}
