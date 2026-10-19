/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestClass;

import com.mycompany.MessageClass;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;


/**
 * public MessageTest() {
    }
 * @author USER
 */
public class MessageTest {
    
  
    
   // testing below
    
       @Test
    public void testMessageID() {
        MessageClass messageclass= new MessageClass(
            "1234567890", "", "Hello Mike",
            "+27718693032", 1
        );

        assertTrue(messageclass.checkMessageID());
    }

    @Test
    public void testRecipientCell() {
        MessageClass messageclass = new MessageClass(
            "1234567890", "", "Hello Bruno",
            "+27718693032", 1
        );

        
        
                                 assertEquals(
            "Recipient's cellphone number has been captured",
            messageclass.checkRecipientCell()
        );
    }

    @Test
                    public void testMessageHash() {
        MessageClass messageclass = new MessageClass(
            "1234567890", "", "Hi Mike",
            "+27718693002", 1
        );

                   assertEquals(
            "1234567890:0:HI John",
            messageclass.createMessageHash()
        );
    }

                    
     ////               
                    
                 //---------------------------------   
    @Test
    public void testSendMessage() {
        MessageClass messageclass = new MessageClass(
            "1234567890", "", "Hello",
            "+27718693002", 1
        );

                    assertEquals("Send message", messageclass.SentMessage("1"));
    }

    @Test
                public void testDisregardMessage() {
        MessageClass messageclass = new MessageClass(
            "1234567890", "", "Hey",
            "+27718693002", 1
        );

        assertEquals(
            "Press 0 to delete message",
                            messageclass.SentMessage("2")
        );
    }

    @Test
                 public void testStoreMessage() {
        MessageClass messageclass = new MessageClass(
            "1234567890", "", "Hi how are you",
            "+27718693002", 1
               );

        assertEquals(
            "Store message for later",
                       messageclass.SentMessage("3")
        );
    }

    @Test
                public void testTotalMessages() {
                MessageClass messageclass = new MessageClass(
                         "1234567890", "", "Hello",
            "+27718693002", 1
        );

                                     assertEquals(
            MessageClass.sentMessages.size(),
                      messageclass.returnTotalMessages()
        );
    }
    
    
    
    
    
     
}








