/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmasstree;

/**
 *
 * @author Mateusz
 */
public class RightTree {

    public static void right(int count, char symbol) {
        generate_right_up(count, symbol);
        generate_center(count, symbol);
        generate_right_down(count, symbol);

    }

    private static void generate_right_down(int count, char symbol) {
        for (int i = 0; i < count - 1; i++) {
            for (int k = 0; k < count - i - 1; k++) {
                System.out.print(symbol);
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");

            }
            System.out.println("");
        }
    }

    private static void generate_center(int count, char symbol) {
        for (int i = 0; i < count; i++) {
            System.out.print(symbol);
        }
        System.out.println("");
    }

    private static void generate_right_up(int count, char symbol) {
        for (int i = count - 1; i > 0; i--) {
            for (int k = count - i; k > 0; k--) {
                System.out.print(symbol);
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            System.out.println("");
        }
    }

}
