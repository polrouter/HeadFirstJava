/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_1;

/**
 *
 * @author egorpavelyev
 */
public class Shuffle1 {
    public static void main(String[] args){
        int x = 3;
        while (x > 0){
            if (x > 2){
                System.out.print("a");
            }//end if 1
            x = x - 1;
            System.out.print("-");
            if (x == 2){
            System.out.print("b c");
            }//end if 2
            x = x - 1;
            System.out.print("-");
            if (x == 1){
            System.out.print("d");
            x = x - 1;
            }//end if 3
        }//end while 1
    }//end main
}//end class Shuffle1
