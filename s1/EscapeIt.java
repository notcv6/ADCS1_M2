package s1;

/**
 * 
 * Name/Programmer: I love Kotoha
 * Date: 8/15/2023
 * Assignment: 2.1.0: EscapeIt part 2
 * Purpose: To generate a template for future use.
 * 
 */

public class EscapeIt
{
    // Output header information.
    public static void main(String[]args) {
        System.out.println("\nName/Programmer: I love Kotoha" 
            + "\nDate: 8/15/2023" 
            + "\nAssignment: 2.1.4: EscapeIt part 2" 
            + "\nPurpose: To generate a template for future use."
            + "\n*****************************************************************\n");
        
        System.out.println( "samben" );
        System.out.print( "samben" ); 
        System.out.println( "\nsamben" );
        System.out.print( "\nsamben\n" );
        System.out.print( "samben\n" );
        System.out.println( "\nsamben\n" );
        System.out.println( "sam\tben" ); 
        System.out.println( "sam\\ben" );
        System.out.println( 7 + 8 + 9 );
        System.out.println( 3 + " " + 6 );
        System.out.println("\" samben  \"");
        System.out.println( "\\t\\sam ");
        System.out.println( "\\\\ben" );
        System.out.println( 5 + " " + 6 + 7); 
        System.out.println( 5 + 6 + " " + 6 + 7);
        
        System.out.println("\nThis\ndemonstrates the 'backslash-n' escape sequence");
        System.out.println("This\tdemonstrates the 'backslash-t' escape sequence");
        System.out.println("\'This\' shows the 'backslash-single quote' escape sequence");
        System.out.println("\"This\" shows the 'backslash-double quote' escape sequence");
        System.out.println("This\bdemonstrates the 'backslash-b' escape sequence");
        System.out.println("\\r clears the characters after it");
        System.out.println("\\f clears the screen");
    }
}
