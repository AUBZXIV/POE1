/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class MessageClass {
  
    public String MessageID;
    public String HashCode;
    public String Message;
    public  String Recipient;
    public Integer numOfmsg;
    
        static ArrayList<String> sentMessages = new ArrayList<>();

  public MessageClass(String MessageID, String HashCode,
            String Message, String Recipient, Integer numOfmsg) {

        this.MessageID = MessageID;
        this.HashCode = HashCode;
        this.Message = Message;
        this.Recipient = Recipient;
        this.numOfmsg = numOfmsg;
    }  
  public boolean checkMessageID(){
 return MessageID.length()<=10;
  
  }
  
  public String checkRecipientCell(){
  
      if (Recipient.contains("+27")||Recipient.length()<13) {
        return "Recipient's cellphone number has been captured";  
      }
      return "Recipient cellphone number is invalid*";
  }
  
  public String createMessageHash(){
   String[] words = Message.trim().split("\\s+");

        String firstWord = words.length > 0 ? words[0] : "";
        String lastWord = words.length > 0
                ? words[words.length - 1] : "";

        HashCode = (MessageID+ ":0:"
                + firstWord + lastWord).toUpperCase();

        return HashCode;
      
      
  
  }

     public String SentMessage(String Moption){
         if (Moption=="1") {
          return "Send message";
         }else if(Moption=="2"){
         return "Press 0 to delete message";
         }else if(Moption=="3"){
         return "Store message for later";
         }
              return "Invalid input. Please select an option";
}   

  
     public String printMessage(){
        return String.join("\n", sentMessages);
         
     }
  
  public Integer returnTotalMessages(){
  return sentMessages.size();
      
  }   
 public void storeMessage(){
  try (FileWriter writer = new FileWriter("messages.json", true)) {
            writer.write("{\"MessageID\":\"" + MessageID
                    + "\",\"HashCode\":\"" + HashCode
                    + "\",\"Recipient Cellphone number\":\"" +Recipient
                    + "\",\"Message\":\"" + Message.replace("\"", "\\\"") + "\"}\n");
            System.out.println("Message stored successfully!");
        } catch (IOException e) {
            System.out.println("Could not store message.");
        }
    }
 } 
 
 
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
