// --== CS400 Project One File Header ==--
// Name: Prathik Gadiraju
// CSL Username: prathik
// Email: pgadiraju@wisc.edu
// Lecture #: 003 @2:25pm
// Notes to Grader:

import java.util.HashMap;
import java.util.NoSuchElementException;

public class HashtableMapTests {

  public static void main(String[] args) {
    if (test1() && test2() && test3() && test4() && test5()) {
      System.out.println("true");
    }
    else {
      System.out.println("false");
    }
    
  }
  
  /**
   * Test the functionality of remove() function
   * 
   * @return true is test passes, false if otherwise
   */
  public static boolean test1() {
    HashtableMap<Integer, String> htmaps = new HashtableMap<>();
    htmaps.put(1, "apple0");
    htmaps.put(2, "apple1");
    htmaps.remove(1);
    
    if(htmaps.size() != 1) {
      System.out.println("Wrong size");
      return false;
    }
    
    try {
      htmaps.get(1);
      System.out.println("get() was supposed to throw error");
      return false;
    }
    catch (NoSuchElementException e) {
    }
    catch(Exception e) {
      System.out.println("Wrong Exception was thrown; NoSuchElementException should be thrown");
      return false;
    }
    return true; 
  }
  
  /**
   * Test the functionality of clear() function.
   * 
   * @return true if test passed, false if otherwise
   */
  public static boolean test2() {
    HashtableMap<Integer, Integer> htmaps = new HashtableMap<>();
    htmaps.put(3, 8);
    htmaps.put(1, 4);
    htmaps.put(5, 3);
    htmaps.put(6, 1);
    if(htmaps.size() != 4) {
      System.out.println("Map size is wrong");
      return false;
    }
    
    htmaps.clear();
    if(htmaps.size() != 0) {
      System.out.println("Map size is wrong");
    }
    
    try {
      htmaps.get(5);
      System.out.println("get() function did not throw error");
      return false;
    }
    catch(NoSuchElementException nsse) {
    }
    catch(Exception e) {
      System.out.println("Threw wrong exception; should be NoSuchElementException");
      return false;
    }
    return true;
  }
  
  /**
   * Test containsKey() functionality
   * 
   * @return true is test passes, false if otherwise
   */
  
  public static boolean test3() {
    HashtableMap<Integer, String> htmaps = new HashtableMap<>();
    
    if (!htmaps.put(5, "apple")) {
      System.out.println("containsKey() should not return true because it added to duplicate.");
      return false;
    }
    
    if (!htmaps.containsKey(5)) {
      System.out.println("containsKey() did not compute element");
      return false;
    }
    return true;
  }
  
  
  
  /**
   * Tests reHashed() functionality
   * 
   * @return true is test passes, false if otherwise
   */
  
  public static boolean test4() {
    HashtableMap<Integer, String> htmaps = new HashtableMap<>(5);
    htmaps.put(1, "apple");
    htmaps.put(2, "banana");
    htmaps.put(3, "grape");
    htmaps.put(4, "pear");
    htmaps.put(5, "berry");
    
    if (!htmaps.get(3).equals("grape")) {
      System.out.println("Rehashing not done properly");
      return false;
    }
    if (!htmaps.get(1).equals("apple")) {
      System.out.println("Rehashing not done properly");
      return false;
    }
    if (!htmaps.get(5).equals("berry")) {
      System.out.println("Rehashing not done properly");
      return false;
    }
    if (!htmaps.get(2).equals("banana")) {
      System.out.println("Rehashing not done properly");
      return false;
    }
    if (!htmaps.get(4).equals("pear")) {
      System.out.println("Rehashing not done properly");
      return false;
    }
    if(htmaps.size() != 5) {
      System.out.println("incorrect size");
      return false;
    }
    
    return true;
  }
  
  
  /**
   * Tests size() functionality
   * 
   * @return true if test passes, false if otherwise
   */
  public static boolean test5() {
    HashtableMap<Integer, String> htmaps = new HashtableMap<>();
    htmaps.put(2, "apple");
    htmaps.put(4, "banana");
    htmaps.put(6, "grape");
    
    if(htmaps.size() != 3) {
      System.out.println("Size() is not working, should return 3");
      return false;
    }
    
    htmaps.remove(2);
    if(htmaps.size() != 2) {
      System.out.println("Size() is not working, should return 2");
      return false;
    }
    return true;
  }
  
  
  
  
  
  

}
