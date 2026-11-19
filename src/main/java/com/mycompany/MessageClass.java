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
 * @author aubrey chisembele
 */

public class MessageClass {
  
    public String MessageID;
    public String HashCode;
    public String Message;
    public  String Recipient;
    public Integer numOfmsg;
    
    // Arrays to maintain state for reporting and tracking
    public static ArrayList<String> sentMessagesArr = new ArrayList<>();
    public static ArrayList<String> messageHashArr = new ArrayList<>();
    public static ArrayList<String> messageIdArr = new ArrayList<>();
    public static ArrayList<String> recipientArr = new ArrayList<>();
    public static ArrayList<String> storeMessageArr = new ArrayList<>();
     public static ArrayList<String> deleteMessageArr = new ArrayList<>();



    
  public MessageClass(String MessageID, String HashCode,
            String Message, String Recipient, Integer numOfmsg) {

        this.MessageID = MessageID;
        this.HashCode = HashCode;
        this.Message = Message;
        this.Recipient = Recipient;
        this.numOfmsg = numOfmsg;
    } 
  
  // Ensures that the message ID is not more than 10 characters
  public boolean checkMessageID(){
 if (MessageID == null) return false;
        return MessageID.length() <= 10;
  
  }
 
  
  // Ensures recipient cell number starts with international code and matches format rules
  public String checkRecipientCell(){
  
     String regex = "^\\+27[0-9]{9}$";
        if (Recipient != null && Recipient.matches(regex)) {
            return "Cell phone number successfully captured.";
        }
        return "Cell phone number is incorrectly formatted or does not contain an international code. Please correct the number and try again.";
  }
  
  
 // Checks if message is under 250 characters, returns appropriate status string 
  public String checkMessageLength() {
    if (Message == null) {
        return "Message cannot be empty.";
    }

    if (Message.length() > 250) {
        int over = Message.length() - 250;
        return "Message exceeds 250 characters by " + over
                + "; please reduce the size.";
    }

    return "Message ready to send.";
}
  
  
// Creates and returns the Message Hash (e.g., 00:0:HITONIGHT) 
public String createMessageHash() {

    if (MessageID == null || Message == null) {
        return "";
    }

    if (MessageID.length() < 2) {
        return "";
    }

    String first2 = MessageID.substring(0, 2);

    String[] words = Message.trim().split(" ");

    String firstWord = words[0].toUpperCase();
    String lastWord = words[words.length - 1].toUpperCase();

    HashCode = first2 + ":" + numOfmsg + ":" + firstWord + lastWord;

    return HashCode;
}


     // Handles user selection for sending, disregarding, or storing messages
    public String SentMessage(String Moption) {
        if (Moption.equals("1")) {
            sentMessagesArr.add(Message);
            messageHashArr.add(HashCode);
            messageIdArr.add(MessageID);
            recipientArr.add(Recipient);
            return "Message successfully sent.";
        } else if (Moption.equals("2")) {
            return "Press 0 to delete the message.";
        } else if (Moption.equals("3")) {
            storeMessage();
            return "Message successfully stored.";
        }
        return "Invalid input. Please select an option";
    } 

  
    // Prints all sent messages formatted cleanly
    public String printMessage() {
        if (sentMessagesArr.isEmpty()) {
            return "No messages sent yet.";
        }
        String result = "";
        for (int i = 0; i < sentMessagesArr.size(); i++) {
            result += "Hash: " + messageHashArr.get(i) 
                    + " | To: " + recipientArr.get(i) 
                    + " | Message: " + sentMessagesArr.get(i) + "\n";
        }
        return result;
    }
  
  // Returns the total number of sent messages
    public Integer returnTotalMessages() {
        return sentMessagesArr.size();
    }
  
// Stores message details into a JSON file format
    public void storeMessage() {
        try (FileWriter writer = new FileWriter("messages.json", true)) {
            writer.write("{\"MessageID\":\"" + MessageID
                    + "\",\"HashCode\":\"" + HashCode
                    + "\",\"Recipient Cellphone number\":\"" + Recipient
                    + "\",\"Message\":\"" + Message.replace("\"", "\\\"") + "\"}\n");
            System.out.println("Message stored successfully!");
        } catch (IOException e) {
            System.out.println("Could not store message.");
        }
    }
    
    // POE PART 3 code below
    // Option a
   static void displayStoredRecipients() {
       if (storeMessageArr.isEmpty()) {
            System.out.println("No message has been stored.");
            return;
        }
        for (int i = 0; i <storeMessageArr.size(); i++) {
            System.out.println("Recipient: " + recipientArr.get(i)
                             + " | Message: " + storeMessageArr.get(i));
        }
       
    } 
    
   // option b dissplaying longest message
    static void displayLongestMessage() {
       if (sentMessagesArr.isEmpty()) {
            System.out.println("No message has been found.");
            return;
        }
        String longestmsg = sentMessagesArr.get(0);
        for (int i = 1; i < sentMessagesArr.size(); i++) {
            if (sentMessagesArr.get(i).length() > longestmsg.length()) {
                longestmsg = sentMessagesArr.get(i);
            }
        }
        System.out.println("Longest message: " + longestmsg);
    }
    // option c
    
    
    
 } 
 /*
// a) displays recipient and message for all stored messages
    static void displayStoredRecipients() {
       if (storedMessagesArr.isEmpty()) {
            System.out.println("No stored messages.");
            return;
        }
        for (int i = 0; i < storedMessagesArr.size(); i++) {
            System.out.println("Recipient: " + recipientArr.get(i)
                             + " | Message: " + storedMessagesArr.get(i));
        }
       
    }

    // b) finds and displays the longest message in the array
    static void displayLongestMessage() {
       if (sentMessagesArr.isEmpty()) {
            System.out.println("No messages.");
            return;
        }
        String longest = sentMessagesArr.get(0);
        for (int i = 1; i < sentMessagesArr.size(); i++) {
            if (sentMessagesArr.get(i).length() > longest.length()) {
                longest = sentMessagesArr.get(i);
            }
        }
        System.out.println("Longest message: " + longest);
    }

    // c) searches for a message using its ID and displays it
    static void searchById(String searchId) {
       boolean found = false;
        for (int i = 0; i < messageIdArr.size(); i++) {
            if (messageIdArr.get(i).equals(searchId)) {
                System.out.println("Recipient: " + recipientArr.get(i));
                System.out.println("Message: " + sentMessagesArr.get(i));
                found = true;
            }
        }
        if (!found) {
            System.out.println("No message found with that ID.");
        }
    }

    // d) finds all messages sent to a specific recipient
    static void searchByRecipient(String searchRecipient) {
       boolean found = false;
        for (int i = 0; i < messageIdArr.size(); i++) {
            if (messageIdArr.get(i).equals(searchRecipient)) {
                System.out.println("Recipient: " + recipientArr.get(i));
                System.out.println("Message: " + sentMessagesArr.get(i));
                found = true;
            }
        }
        if (!found) {
            System.out.println("No message found with that ID.");
        }
    }

    // e) deletes a message from the array using its hash
    static void deleteByHash(String searchHash) {
      boolean found = false;
        for (int i = 0; i < messageHashArr.size(); i++) {
            if (messageHashArr.get(i).equals(searchHash)) {
                System.out.println("Message: \"" + sentMessagesArr.get(i)
                                 + "\" successfully deleted.");
                sentMessagesArr.remove(i);
                messageHashArr.remove(i);
                messageIdArr.remove(i);
                recipientArr.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No message found with that hash.");
        }
    }

    // f) prints a full report of all messages with hash, recipient and message
    static void displayReport() {
        if (sentMessagesArr.isEmpty()) {
            System.out.println("No messages to report.");
            return;
        }
        System.out.println("\n--- FULL REPORT ---");
        for (int i = 0; i < sentMessagesArr.size(); i++) {
            System.out.println("Message Hash: " + messageHashArr.get(i));
            System.out.println("Recipient:    " + recipientArr.get(i));
            System.out.println("Message:      " + sentMessagesArr.get(i));
            System.out.println("-------------------");
        }
    }
}
*/
 
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
