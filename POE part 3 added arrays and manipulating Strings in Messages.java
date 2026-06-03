/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login1;
import java.util.ArrayList;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author User
 */
public class Messages {
//Private Fields Storing each messages details
private String messageID;
private int messageNumber;
private String recipient;
private String messageText;
private String messageHash;
    
// part 3 of POE Static variables shared across all message objects using  fully arrays and manipulating Strings 
private static int totalMessagesSent = 0;
private static ArrayList <String> sentMessages = new ArrayList<>();
private static ArrayList<String> disregardedMessages =new ArrayList<>();
private static ArrayList<String> storedMessages =new ArrayList<>();
private static ArrayList<String> messageHashes =new ArrayList<>();
private static ArrayList<String> messageIDs =new ArrayList<>();
private static ArrayList<String> recipients =new ArrayList<>();
