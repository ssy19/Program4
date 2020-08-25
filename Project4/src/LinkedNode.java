public class LinkedNode
{
   private int nodeData; //node data
   private LinkedNode nodeNext; //points to next node
  
   //constructor for initializing data and sets to null
   public LinkedNode(int data)
   {
       this.nodeData = data;
       nodeNext = null;
   }
  
   //constructor for initializing current and subsequent data
   public LinkedNode(int data, LinkedNode next)
   {
       this.nodeData = data;
       this.nodeNext = next;
   }
  
   //gets data
   public int getData()
   {
       return nodeData;
   }
  
   public LinkedNode getNext()
   {
       return nodeNext;
   }
  
   //sets data
   public void setData(int data)
   {
       this.nodeData = data;
   }
  
   public void setNext(LinkedNode next)
   {
       this.nodeNext = next;
   }
}