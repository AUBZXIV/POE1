/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to license this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import java.util.Scanner;

/**
 * The Login class handles user registration input validations, 
 * password complexity rules, cell phone format checks, and user login status.
 * It also includes a main method to execute the login and registration workflow.
 * 
 * @author USER
 */
public class Login {
    
    // Instance variables for user credentials and registration details
    public String username;
    public String password;
    public String cellphone;
    
    public String regUser;
    public String regCell;
    public String regPassword;
    
    /**
     * Parameterized constructor to initialize a Login object with user credentials.
     * 
     * @param username The entered username
     * @param password The entered password
     * @param cellphone The entered cell phone number
     */
    public Login(String username, String password, String cellphone) {
        this.username = username;
        this.password = password;
        this.cellphone = cellphone;
    }
    
    // Default constructor
    public Login() {
    this.username = "";
    this.password = "";
    this.cellphone = "";
}
    
    /**
     * Checks if the username meets the required criteria:
     * Must contain an underscore ('_') and be no longer than 5 characters.
     * 
     * @return true if valid, false otherwise
     */
    public Boolean checkUsername() {
        if (username == null) return false;
        return username.contains("_") && username.length() <= 5;
    }
    
    /**
     * Checks if the cell phone number meets formatting criteria using a strict regex pattern.
     * 
     * @return true if valid, false otherwise
     */
    public Boolean checkCellphone() {
        String regex = "^\\+27[0-9]{9}$";
        if (cellphone == null) return false;
        return cellphone.matches(regex);
    }
    
    /**
     * Evaluates password complexity:
     * Must be at least 8 characters long, not blank, and contain at least 
     * one uppercase letter, one digit, and one special character.
     * 
     * @return true if password meets all criteria, false otherwise
     */
    public Boolean checkPasswordcomplexity() {
        if (password == null || password.length() < 8 || password.isBlank()) {
            return false;
        }
        
        Boolean hasUP = false;
        Boolean hasNum = false;
        Boolean hasSpecial = false;
        
        for (int i = 0; i < password.length(); i++) {
            Character ch = password.charAt(i);
            
            if (Character.isUpperCase(ch)) {
                hasUP = true;
            } else if (Character.isDigit(ch)) {
                hasNum = true;
            } else if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                hasSpecial = true;
            }
        }
        
        return (hasUP && hasNum && hasSpecial);
    }
    
    /**
     * Validates user registration by checking username and password rules.
     * 
     * @return A success or descriptive error message based on validation results
     */
    public String registerUser() {
        if (!checkUsername()) {
            return "Username should contain an underscore and must be no longer than 5 characters";
        }
        if (!checkPasswordcomplexity()) {
            return "Password should have at least an Uppercase letter, a digit, and a special character, and be at least 8 characters long.";
        }
        
        // Save to registered fields upon success
        regUser = username;
        regPassword = password;
        regCell = cellphone;
        
        return "The conditions have been met, Account has been registered successfully";
    } 
    
    /**
     * Overloaded registerUser method to accept fields directly from interactive input.
     */
    public String registerUser(String firstName, String lastName, String userName, String password, String phone) {
        this.username = userName;
        this.password = password;
        this.cellphone = phone;
        
        if (!checkUsername()) {
            return "Username should contain an underscore and must be no longer than 5 characters";
        }
        if (!checkPasswordcomplexity()) {
            return "Password should have at least an Uppercase letter, a digit, and a special character, and be at least 8 characters long.";
        }
        if (!checkCellphone()) {
    return "Cell phone number is incorrectly formatted.";
}
        regUser = userName;
        regPassword = password;
        regCell = phone;
        
        return "Registration successful.";
    }
    
    /**
     * Validates cell phone format constraints and provides status feedback.
     * 
     * @return Status message
     */
    public String checkCell() {
        if (!checkCellphone()) {
            return "Cell phone number is incorrectly formatted or does not contain an international code. Please correct the number and try again.";
        }
        return "Cell phone number successfully captured.";
    }
    
    /**
     * Compares entered credentials against registered user values.
     * 
     * @return true if credentials match, false otherwise
     */
    public Boolean loginUser() {
        if (username == null || password == null) {
            return false;
        }
        return username.equals(regUser) && password.equals(regPassword);
    }
    
    /**
     * Overloaded loginUser method taking specific username and password parameters.
     */
   public Boolean loginUser(String enteredUser, String enteredPass) {
    if (regUser == null || regPassword == null
            || enteredUser == null || enteredPass == null) {
        return false;
    }

    return enteredUser.equals(regUser)
            && enteredPass.equals(regPassword);
}
    
    /**
     * Returns a string message indicating whether login was successful or not.
     * 
     * @return Success or failure status message
     */
    public String returnLoginStatus() {
        if (loginUser()) {
            return "Login has been successful";
        } else {
            return "Login is unsuccessful";
        }
    }
    
    /**
     * Overloaded returnLoginStatus taking a boolean flag.
     */
    public String returnLoginStatus(boolean isLoggedIn) {
        if (isLoggedIn) {
            return "Login has been successful";
        } else {
            return "Login is unsuccessful";
        }
    }

    /**
     * Main method to run the login and registration process directly from this class.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Login loginSystem = new Login();

        System.out.println("=== USER REGISTRATION ===");
        String regResult = "";
        
        // Loop registration until successful
        do {
            System.out.print("Enter username (must contain '_' and max 5 chars): ");
            String uName = input.nextLine();

            System.out.print("Enter password (min 8 chars, 1 uppercase, 1 digit, 1 special): ");
            String pWord = input.nextLine();

            System.out.print("Enter cell number (e.g., +27831234567): ");
            String phone = input.nextLine();

            // Set temporary values to check cell formatting
            loginSystem.cellphone = phone;
            System.out.println(loginSystem.checkCell());

            // Run full registration check
            regResult = loginSystem.registerUser("Test", "User", uName, pWord, phone);
            System.out.println(regResult);
            
        } while (!regResult.equals("Registration successful."));

        System.out.println("\n=== USER LOGIN ===");
        boolean loggedIn = false;

        // Loop login until successful
        do {
            System.out.print("Enter username: ");
            String enteredUser = input.nextLine();

            System.out.print("Enter password: ");
            String enteredPass = input.nextLine();

            loggedIn = loginSystem.loginUser(enteredUser, enteredPass);
            System.out.println(loginSystem.returnLoginStatus(loggedIn));
            
        } while (!loggedIn);

        System.out.println("Program execution completed successfully.");
        input.close();
    }
}