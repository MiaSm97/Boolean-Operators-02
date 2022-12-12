package exercise.operators;

public class Start {
    public static void main(String[] args) {

        /*
           55 != 55 ---> false
           false ^ true ---> true
           false && true ---> false
           result: false
         */

        System.out.println((55 != 55) && (false ^ true));


        /*
           !true || !false ---> true
           c == d ---> false
           true || false ---> true
           result: true
         */

        boolean a = true;
        boolean b = false;
        int c = 2;
        char d ='2';
        System.out.println((!a || !b) || c == d);


        /*
           false && true ---> false
           false || false ---> false
           false && !false ---> false
           result: false
         */

        System.out.println(false && true || false && !false);


        /*
           false && true ---> false
           false || true ---> true
           false || true ---> true
           result: true
         */
        System.out.println((false && true) || (false || true));
    }
}
    /*Try to solve on paper the following boolean algebra operations:

        [A]: (55 != 55) && (false ^ true)
        [B]: considering that a=true, b=false, int c=2 and char d='2': (!a || !b) || c == d )
        [C]: false && true || false && !false
        [D]: (false && true) || (false || true))
        Then compare your solutions with a Java program that tests the validity of your assumptions.*/