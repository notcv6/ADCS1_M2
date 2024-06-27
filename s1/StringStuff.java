package s1;


/**
 * Name/Programmer: I love Kotoha
 * Date: October 4, 2023
 * Assignment: 2.8.1: String Stuff
 * Purpose: To learn about Strings
 */

import java.util.Scanner;
public class StringStuff
{
    public static void main(String[] args)
    {
        // Output Header Information
        System.out.println("\nName/Programmer: I love Kotoha");
        System.out.println("Date: October 4, 2023");
        System.out.println("Assignment: 2.8.1: String Stuff");
        System.out.println("Purpose: To learn about Strings");
        System.out.println();
        System.out.println("**************************************************");
        
        // Variable declarations
        Scanner keyboard = new Scanner(System.in);
        String firstName = "Miyako";
        String lastName = "Kujou";
        String schoolName = "Hakusen";
        String yearName = "junior";
        String mySchool = "Hakusen Academy";

        String fullName = "";
        String tempString = "";
        String noName = "";
        String halfLastName = "";

        String s = "";
        String c = "";
        String t = "";
        String a = "";

        String str1 = "Hakusen";
        String str2 = "Hakusen";
        String str3 = new String("Hakusen");
        String str4 = "SECTA";

        // Demonstrate concatenation
        System.out.println("Using +: "+firstName+" "+lastName+" is a "
            +yearName+" at "+schoolName+".");
        
        tempString = tempString.concat("Using concat(): "+firstName+" "
            +lastName+" is a "+yearName+" at "+schoolName+".");
        System.out.println(tempString);
        
        System.out.println();

        // Demonstrate length() and isEmpty()
        fullName = fullName.concat(firstName+" "+lastName);
        System.out.println("The length of my full name \""+fullName
            +"\" is: "+fullName.length());
        System.out.println("fullName is empty: "+fullName.isEmpty());

        System.out.println("The length of a \"noName\" student is: "
            +noName.length());
        System.out.println("noName is empty: "+noName.isEmpty());
        
        System.out.println();

        // Demonstrate substring()
        halfLastName = lastName.substring(4);
        System.out.println("The last half of my last name \""
            +lastName+"\" is: "+halfLastName);

        s = mySchool.substring(0,9);
        c = mySchool.substring(10,11);
        t = mySchool.substring(21,22);
        a = mySchool.substring(31,32);
        System.out.println("I am a student at "+s+" "+c+t+a);
        
        System.out.println();

        // Demonstrate equals() vs. ==
        System.out.println("Using == and common String declaration,");
        if (str1 == str2) {
            System.out.println("\t"+str1+" and "+str2+" is equal.");
        } else {
            System.out.println("\t"+str1+" and "+str2+" is not equal.");
        }
        
        System.out.println("Using == and common String declaration,");
        if (str1 == str3) {
            System.out.println("\t"+str1+" and "+str3+" is equal.");
        } else {
            System.out.println("\t"+str1+" and "+str3+" is not equal.");
        }
        
        System.out.println("Using == and common String declaration,");
        if (str1 == str4) {
            System.out.println("\t"+str1+" and "+str4+" is equal.");
        } else {
            System.out.println("\t"+str1+" and "+str4+" is not equal.");
        }
        
        System.out.println("Using equals() and common String declaration,");
        if (str1.equals(str3)) {
            System.out.println("\t"+str1+" and "+str3+" is equal.");
        } else {
            System.out.println("\t"+str1+" and "+str3+" is not equal.");
        }
        
        System.out.println("Using equals() and common String declaration,");
        if (str3.equals(str4)) {
            System.out.println("\t"+str3+" and "+str4+" is equal.");
        } else {
            System.out.println("\t"+str3+" and "+str4+" is not equal.");
        }
        
        // Ending statement
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Ending Assignment <2.8.1>: String Stuff");
    }
}
