import  java.util.Scanner;
public class palindrom {

    static boolean isPalindrom (int number ){
      int temp = number , ilkSayi =0, sonSayi;

      while ( temp!=0){
          System.out.println("=======");
          System.out.println("sayı = "+temp );
          sonSayi=temp%10;
          System.out.println("son basamak =");
          ilkSayi =(ilkSayi*10)+sonSayi;
          System.out.println( "yeni sayi ="+ ilkSayi);
          temp/=10;
      }

      
     if (number==temp)
         return true;
     else
         return  false;


    }



    public  static  void  main (String[]args){
     System.out.println   (isPalindrom ( 457));
    }
}
