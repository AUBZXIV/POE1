/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe1;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class POE1 {

    public static void main(String[] args) {
   Scanner scanner = new Scanner( System.in);
   // 
   String username="";
  
  
   String under="_";
        System.out.println("Welcome to the APP!!");
        System.out.println("Please create your account below");
        
       
        int count=0;
     /*   
        System.out.println("PLEASE CREATE YOUR USERNAME :");
        username=scanner.nextLine();
        int ulen=username.length();
        
       while(ulen < 5 || !username.contains(under)){// either of the conditions must be false not both, hence"||"
       //count++;
         System.out.println("Username is INVALID.");
    System.out.println("Username must be at least 5 characters and contain '_'.");
        
    System.out.println("PLEASE CREATE YOUR USERNAME:");
    username = scanner.nextLine();
    
    ulen = username.length();
           
       }
      System.out.println("Username is valid!");
      
     //---- cellphone validation
      String cellphone;
        System.out.println("PLEASE ENTER YOUR CELLPHONE NUMBER");
        cellphone=scanner.nextLine();
        
       String codesa="+27";
       int clen=cellphone.length();
       String number="728638153";
       
       String con=codesa.concat(number);
       int pplen=con.length();
        System.out.println(pplen);
        
        
       
        while (clen>12||!cellphone.startsWith(codesa)) {            
            System.out.println("Cellphone format is invalid");
            System.out.println("Number should start with country code");
            System.out.println("Cellphone shouldnt be longer than 10 digits");
            
            System.out.println("Please REenter your cellphone number");
            cellphone=scanner.nextLine();
             
        }
        System.out.println("CELLPHONE NUMBER IS VALID!!");
        
        //--- PASSWORD VALIDATION
        */
  
  /*
     System.out.println("Please enter your password:");
String password = scanner.nextLine();

int plen = password.length();

System.out.println("Password length: " + plen);
    
  */
  
  String password=scanner.nextLine();
  int whilecount=0;
        System.out.println("PLEASE CREATE YOUR PASSWORD BELOW");

        while(password.isBlank()){
            System.out.println("Password field is empty");
            System.out.println("Please kindly fill in your password😂");
            password=scanner.nextLine();
            whilecount++;
        }
          
   int plen=password.length();
        System.out.println(plen);
   while(plen<8){
       System.out.println("Password format is invalid");
       System.out.println("Password should atleast be 8 characters long...:");
       password=scanner.nextLine();
      
        plen = password.length(); 
       String wwe="";
   }     
        System.out.println("Password is valid"); ////
        Character ch;
     
        for (int i = 0; i <plen; i++) {
        ch=password.charAt(i);
        
           
        
        
        }
        
   
        
        
        
        
        
        /* 
           while(plen<8 ||!Character.isUpperCase(ch) ||!Character.isDigit(ch)&&!Character.isAlphabetic(ch)  &&!Character.isWhitespace(ch) &&!Character.isDigit(ch)){
               System.out.println("Password format is incorrect");  
               System.out.println("Please enter a correct password format");
               password=scanner.nextLine();
               
           }
           
            
        }
        System.out.println("Password format is VALID");
         */   
        }
   
      /*
         
  int Plen=Password.length();
  System.out.println("Please create your password below");
        Password=scanner.next();
        for (int i = 0; i <Plen; i++) {
        ch=Password.charAt(i);
       if(Plen>=8){
       Length=true;
        }
            if (Character.isUpperCase(ch)) {
            containsUP=true;    
            }
            if (Character.isDigit(ch)) {
              containsNumber=true;  
            }
            if (!Character.isDigit(ch)&&!Character.isWhitespace(ch)&&!Character.isLetter(ch)) {
               containsSpecial=true;  
            }
        */
      
      
      
      
      
      
      
      
      
       
   /*
       System.out.println("PLEASE CREATE YOUR USERNAME:");
username = scanner.nextLine();

ulen = username.length();

while (ulen < 5 || !username.contains(under)) {

    System.out.println("Username is INVALID.");
    System.out.println("Username must be at least 5 characters and contain '_'.");
    
    System.out.println("PLEASE CREATE YOUR USERNAME:");
    username = scanner.nextLine();
    
    ulen = username.length();
}

System.out.println("Username is valid!");
       */
             
   
        
        
        
        
        
        
        
    }



