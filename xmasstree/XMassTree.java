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
import java.util.Scanner;

public class XMassTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char symbol;
        int count;
        String direction;

        count = getCount();
        symbol = getSymbol();
        direction = getDirection();

        switch (direction) {
            case "UP":
                UpTree.up(count, symbol);
                break;
            case "DOWN":
                DownTree.down(count, symbol);
                break;
            case "LEFT":
                LeftTree.left(count, symbol);
                break;
            case "RIGHT":
                RightTree.right(count, symbol);
                break;
            default:
                System.out.println("Wystapil nieoczekiwany blad");
        }

    }

    private static int getCount() {
        boolean condition = false;
        int count;

        System.out.println("Wpisz wielkosc choinki np. 5");
        while (condition != true) {

            Scanner number = new Scanner(System.in);
            if (number.hasNextInt()) {
                count = number.nextInt();
                //System.out.println(count);
//                condition = true;
                return count;
            } else {
                System.out.println("Wpisz liczbe np. 5");
            }
        }
        return 0;
    }

    private static char getSymbol() {
        char symbol;
        String s;

        System.out.println("Wpisz jeden znak np. x");

        Scanner token = new Scanner(System.in);
        if (token.hasNext()) {
            s = token.nextLine();
            symbol = s.charAt(0);
            // System.out.println(symbol);
            return symbol;
        } else {
            System.out.println("Wpisz jeden znak np. x");
        }
        return '*';
    }

    public enum Direction {
        UP, DOWN, LEFT, RIGHT;
    }

    private static String getDirection() {
        String direct;
        boolean condition = false;

        System.out.println("Podaj kierunek choinki, możliwe wartosci UP, DOWN, LEFT, RIGHT");
        while (condition != true) {
            Scanner direction = new Scanner(System.in);
            direct = direction.nextLine();
            direct = direct.toUpperCase();
            // System.out.println(direct);

            for (Direction dir : Direction.values()) {
                String name = dir.name();
                if (name.equals(direct)) {
                    //System.out.println("dobrze");
                    return direct;
                }
            }
            System.out.println("Podaj kierunek choinki, możliwe wartosci UP, DOWN, LEFT, RIGHT");

        }

        return "";
    }
}
