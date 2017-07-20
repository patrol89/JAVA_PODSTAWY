//definiowanie zmiennych i output w terminalu
// nazwe klasy zaczynamy od duzej litery

package helloworld;

public class helloworld {

    public static void main(String[] args) {
    	 
     /*ZMIENNE
     */
    	 double num1 = 65.0;
    	 float num2 = 65.0f;

         long num3 = 65;
         int num4 = 65;
         short num5 = 65;
         byte num6 = 65;

         boolean isHappy = true;
         boolean isSad = false;

         char letterA = 'A';
         char alternativeLetterA = 65;
        
      
        
     // These all make a reference with the words "Hello !" in them.
        String msg1 = new String("Hello !");
        String msg2 = new String(new char[] { 'H', 'e', 'l', 'l', 'o', ' ', '!' });
        String msg3 = "Hello !";

        System.out.println(msg1);
        System.out.println(msg2);
        System.out.println(msg3);

     // different ways to declare and initialize
        String a;
        a = "alfa";

        String b = "bravo";

        String c, d, e;
        c = "charlie";
        d = "delta";
        e = "echo";

        String f = "foxtrot", g, h = "hotel";
        g = "golf";

        String i;
        String j;
        String k;
        i = "india";
        j = "juliett";
        k = "kilo";

String l = "lima", m = "mike";
        
    }

}
