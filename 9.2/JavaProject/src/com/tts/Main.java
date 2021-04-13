package com.tts;

public class Main {
/*Exercises:
 Create a small program that defines some fields. Try creating some illegal
  field names and see what kind of error the compiler produces. Use the naming
   rules and conventions as a guide. In the program you created, try leaving the
   fields uninitialized and print out their values. Try the same with a local variable
   and see what kind of compiler errors you can produce. Becoming familiar with common
   compiler errors will make it easier to recognize bugs in your code.
 */

    public static void main(String[] args) {
	// write your code here

        /*
        Here we tested creating a String variable that was assigned to  nothing
        When compiled, we were given an error stating that it had an illegal start of expression.
            String thisString = ;
            System.out.println(thisString);
        */

        /*
        Here we tested declaring a int variable that had a non alphanumeric value in it's name.
        When compiled, our compiler gave us an error stating that a ";" was expected.
        This is because it didn't recognize the non-alphanumerical  values and couldn't read past that.
            int excitedNumber! = 1;
         */
    /*
            Here we tested declaring a string variable and leaving the value uninitialized.
            When compiled we were given an  error stating that the variable might not have been
            initialized.  This is because we are trying to output a variable  that does not have a
            value assigned to it ,which the function expects.
                String nothingHere;
                System.out.println(nothingHere);
     */
    /*
    Here we tested declaring a string variable in a nested statement, then tried to print
    out the variable outside of that nested statement.
    When compiled, we were given an error that java cannot find the variable. Since the variable
    was declared in a nested statement, the rest of the code  "outside of that loop cannot access it.
         int isOne = 1;
         if (isOne ==1) {
         String thisOne = "This is One.";
    }
        System.out.println(thisOne);
     */

    }
}
