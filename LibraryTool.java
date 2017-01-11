/*
 This simple Library tool  analyzes completed books in a small, personal library. The tool prints out the books that a user has fully read. The books and their completion status are stored in a HashMap.
  
 */
import java.util.HashMap;

class Library {
  public Library() { //constructor
    
  }
  public void getFinishedBooks(HashMap<String, Boolean> library) {
    if (library.size()<1){
      System.out.println("Error! Empty!");
    }
    else {
      for (String each: library.keySet()){
         //print out all finished books
        if(library.get(each)==true)
        {
          System.out.println(each);
        }
      }
    }
    
  }
  public static void main (String [] args){
    HashMap<String,Boolean>myBooks= new HashMap<String, Boolean>();
   
    myBooks.put("Road Down The Funnel", true);
    myBooks.put("Rat: A Biology", false);
    myBooks.put("TimeIn",true);
 
    Library myLibrary= new Library();
    myLibrary.getFinishedBooks(myBooks);
    
  }
}