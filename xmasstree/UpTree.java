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
public class UpTree {

    public static void up(int count, char symbol) {
        for (int i = 0; i < count; i++) {
            generateBranch(count, i, symbol);
        }
    }

    private static void generateBranch(int count, int i, char symbol) {
        printCharacter(' ', count - i - 1);
        printCharacter(symbol, 2 * i + 1);

        System.out.println();
    }

    private static void printCharacter(char s, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(s);
        }
    }

}
