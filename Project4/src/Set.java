public class Set
{
   private LinkedNode initial;
  
   // constructor creates empty set
   public Set()
   {
	   initial = null;
   }
  
   //method for inserting i into list
   public void add(int i)
   {
       if(!exists(i)) //if i is not in the list
       {
           //creates a new node with data as i
           LinkedNode node = new LinkedNode(i, initial);
           initial = node; // make node the new head
       }
   }
  
   //method deletes i from data set
   public void delete(int i)
   {
       LinkedNode current = initial;
       LinkedNode previous = null;
      
       //looping until node with i in data is found
       while((current != null) && (current.getData() != i))
       {
    	   previous = current;
           current = current.getNext();
       }
      
       //i in the list
       if(current != null)
       {
           if(previous == null) // x is the head node
        	   initial = initial.getNext();
           else // delete the current node
        	   previous.setNext(current.getNext());
       }
   }
  
   //method for returning true if i in list
   public boolean exists(int i)
   {
       LinkedNode curr = initial; //sets curr to head
      
       //looping until node with i in data is found
       while(curr != null)
       {
           if(curr.getData() == i ) // x found, return true
               return true;
           curr = curr.getNext();
       }
      
       return false; //i not in set
   }
  
   //method returns string for set
   public String toString()
   {
       String str = ""; //sets str to empty
       LinkedNode current = initial; //sets current to head
      
       //loops over set to append at current
       while(current != null)
       {
           str += current.getData()+" ";
           current = current.getNext();
       }
      
       return str;
   }
}