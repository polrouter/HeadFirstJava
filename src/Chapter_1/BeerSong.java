/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_1;



/**
 *
 * @author Егор
 */


public class BeerSong
{
    public static void main(String[] args){
      int beerNum = 99;
      String word = "бутылок (бутылки)";
      
      while (beerNum > 1){
        if (beerNum == 0){
            word = "бутылка";
        }
          System.out.println(beerNum + " " + word +" "+ "пива на стене");
          System.out.println(beerNum + " " + word +" "+ "пива");
          System.out.println("Возьми одну.");
          System.out.println("Пусти по кругу.");
          beerNum = beerNum - 1;
          if (beerNum == 0 ){
          System.out.println(beerNum + " " + word + "пива на стене");    
          } else {
          System.out.println("нет бутылок пива на стене");
          }//end else
         }//end while
    }//end main 
}//end class Solution