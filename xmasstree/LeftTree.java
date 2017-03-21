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
public class LeftTree {

    public static void left(int count, char symbol) {
        generate_left_up(count, symbol);
        generate_center(count, symbol);
        generate_left_down(count, symbol);

    }

    private static void generate_left_up(int count, char symbol) {
        for (int i = 0; i < count - 1; i++) {
            for (int k = 0; k < count - i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(symbol);

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

    private static void generate_left_down(int count, char symbol) {
        for (int i = count - 1; i > 0; i--) {
            for (int k = count - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(symbol);

            }
            System.out.println("");
        }
    }

}
