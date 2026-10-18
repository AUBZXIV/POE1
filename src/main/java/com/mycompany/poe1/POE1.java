/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe1;
import java.util.Scanner;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author USER
 */
public class POE1 {

    public static void main(String[] args) {
   Scanner scanner = new Scanner( System.in);
   Random random = new Random();
      
   String username="";
   String under="_";
   int ulen=username.length();
        System.out.println("WELCOME TO WAVE!");
        System.out.println("Please create your account below(Press OK to continue)");
        String answer=scanner.nextLine();
        
        
        System.out.println("Please create your username");
        username=scanner.nextLine();
        while(username.isBlank()){
            System.out.println("Please fill in your username*");
            username=scanner.nextLine();
        }
        while (ulen>5||!username.contains(under)) {            
            System.out.println("Username is invalid");
            System.out.println("Username should contain an underscore and must be 5 characters long");
            System.out.println("Please re enter user name");
            username=scanner.nextLine();
        }
         System.out.println("Username is valid!");
          System.out.println("(Press OK to continue)");
         answer=scanner.nextLine();
         
         String codesa="+27";
         String cellphone=scanner.nextLine();
         int lcell=cellphone.length();
         
        System.out.println("Please enter your cellphone number");
        cellphone=scanner.nextLine();
        
        while (cellphone.isBlank()) {            
            System.out.println("Please fill in your cellphone number*");  
            cellphone=scanner.nextLine();
        }
        
        
        while (lcell>12||!cellphone.startsWith(codesa)) {            
            System.out.println("Cellphone is INVALID!");
            System.out.println("Cellphone should not be longer than 10 characters and should start with your country code");
             System.out.println("Please re enter your cellphone number");    
            cellphone=scanner.nextLine();
        }
         System.out.println("Cellphone number is valid!"); 
          System.out.println("(Press OK to continue)");
        answer=scanner.nextLine();
//----------------------------------------------------
        String password="";
        int lpen=password.length();
        Boolean hasUP=false;
        Boolean hasLow=false;
        Boolean hasSpecial=false;
        Boolean hasNum=false;
        Character ch;

        
        
         System.out.println("PLEASE CREATE YOUR PASSWORD BELOW");
         password=scanner.nextLine();
         while (password.isBlank()) {            
           System.out.println("Please fill in your password*");
             password=scanner.nextLine();
         }
         
         while (lpen<8) {            
             System.out.println("Password should atleast be 8 chracters in length*"); 
             password=scanner.nextLine();
             lpen = password.length();
             
        }
         
     for (int i = 0; i < password.length(); i++){
      ch = password.charAt(i);
      
         if (Character.isUpperCase(ch)) {
             hasUP=true;
             }
        if(Character.isDigit(ch)){
            hasNum=true;
        
        
        }
        if(!Character.isDigit(ch)&&!Character.isLetter(ch)&&!Character.isWhitespace(ch)){
        hasSpecial=true;
            
            
        }
       
        
         
         
     }
      while (!hasUP || !hasNum || !hasSpecial) {

    System.out.println("Password must contain:");
    System.out.println("- At least one uppercase letter");
    System.out.println("- At least one number");
    System.out.println("- At least one special character");
    System.out.println("TRY AGAIN:");

    password = scanner.nextLine();

    hasUP = false;
    hasNum = false;
    hasSpecial = false;

    for (int i = 0; i < password.length(); i++) {
        ch = password.charAt(i);

        if (Character.isUpperCase(ch)) {
            hasUP = true;
        }

        if (Character.isDigit(ch)) {
            hasNum = true;
        }

        if (!Character.isDigit(ch) && 
            !Character.isLetter(ch) && 
            !Character.isWhitespace(ch)) {
            hasSpecial = true;
        }
    }
}
     
     
     
        System.out.println("Account has been succesfully created welcome on board!");      
       
Boolean bPasswrd = false;
Boolean bUser = false;
String Lpass;
String Luser;

System.out.println("Please login into your account below");
System.out.println("Press Enter to continue");
answer = scanner.nextLine();

// Username login
System.out.println("Please enter your Username");
Luser = scanner.nextLine();

while (!Luser.equals(username)) {
    System.out.println("Username is invalid. Please re-enter:");
    Luser = scanner.nextLine();
}

bUser = true;
System.out.println("Username is valid!");

// Password login
System.out.println("Please enter your password");
Lpass = scanner.nextLine();

while (!Lpass.equals(password)) {
    System.out.println("Password is incorrect. Please re-enter:");
    Lpass = scanner.nextLine();
}

bPasswrd = true;
System.out.println("Password is valid!");

System.out.println("Login successful!");
        System.out.println("Press OK to continue");
answer=scanner.nextLine();
// MESSAGES



String option =scanner.nextLine();

while(!option.equals("3")){
        System.out.println("WELCOME TO QUICK CHAT");
        System.out.println("Please select an option");
        System.out.println("1) Send messages"
                + "2) show recent messages"
                + "3) Quit");
       option=scanner.nextLine();
        if(option.equals("1")) {
            System.out.println("Sending messages has been selected");  
        
    }
        
        else if(option.equals("2")) {        
          System.out.println("The show recent messages are coming soon!");  
    }
        else if(option.equals("3")) {        
          System.out.println("Thank you for using quick chat, see you soon");
    }
      System.out.println("Application has been closed");
        
}


































/* 

String option = "";

System.out.println("WELCOME TO QUICK CHAT");

while (!option.equals("3")) {

    System.out.println("\nPlease select an option:");
    System.out.println("1) Send messages");
    System.out.println("2) Show recent messages");
    System.out.println("3) Quit");

    option = scanner.nextLine();

    switch (option) {
        case "1":
            System.out.println("Send messages selected.");
            // Add your send message code here
            break;

        case "2":
            System.out.println("Coming Soon.");
            break;

        case "3":
            System.out.println("Thank you for using Quick Chat.");
            break;

        default:
            System.out.println("Invalid option. Please select 1, 2, or 3.");
            break;
    }
}

System.out.println("Application closed.");

*/
        
        
        
        
        
        
      
            
          
        
        
        
        
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
        
    }



