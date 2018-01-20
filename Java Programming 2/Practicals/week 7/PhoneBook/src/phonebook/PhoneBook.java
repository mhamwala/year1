/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

import java.util.*;


/**
 *
 * @author q5110442
 */
public class PhoneBook {

    
    
    
    public static void main(String[] args) {
        
       Scanner in = new Scanner(System.in);
        
       Map<String, String> map = new LinkedHashMap<String, String>();
        
       Set set = map.entrySet();
       
       Iterator itr = set.iterator();
       
       System.out.println("1. Add Contact \n 2. view all\n 3. Search Name\n 4. remove contact\n 5. searc number 0. Close");
       int user = in.nextInt();
       System.out.println(" ");
       
       map.put("Nathan","07759161564");
       map.put("musa","07817211853");
       map.put("james","07742754483");
       map.put("alex","07784566563");
       
        
        while(user != 0){
            
                if(user == 1){
                    addContact(in,map);
                    
                }
                else if(user == 2){
                    viewAll(in,map);
                    
                }
                else if(user == 3){
                    SearchName(in,map);
                   
                }
                else if(user == 4){
                    RemoveContact(in,map);
                    
                }else if(user == 5){
                    searchNumber(in,map,itr);
                }
                
                System.out.println("1. Add Contact\n 2. view all\n 3. Search Name\n 4. remove contact\n 0. Close");
                user = in.nextInt();
                System.out.println(" ");
            
        }
       
    }

    public static void addContact(Scanner in,Map map) {
        
        System.out.println("add users name : ");
        String name = in.next();
        
        System.out.println("add users number : ");
        String number = in.next();
        
        map.put(name,number);
        System.out.println(" ");
        
        
    }

    public static void viewAll(Scanner in,Map<String,String> map) {
        
        //System.out.println(map);
        
        for(String key : map.keySet()){
            System.out.println("key : "+key);
            System.out.println(map.get(key));
            
        }
        System.out.println(" ");
    }

    public static void SearchName(Scanner in,Map map) {
        System.out.println("what name would you like to search : ");
        
        String name = in.next();
        
        System.out.println(map.get(name));
    }

    public static void RemoveContact(Scanner in,Map map) {
        
        System.out.println("what name would you like to search : ");
        
        String name = in.next();
        
        map.remove(name);
        
        
    }
    public static void searchNumber(Scanner in,Map<String,String> map,Iterator itr){
        
        System.out.println("The Answer is 42, wubbu lubbu dub dub!! ");
        
        
        }
    
    }
    

