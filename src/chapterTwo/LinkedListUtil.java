package chapterTwo;

public class LinkedListUtil {
  public static ListNode createList(int[] data) {
    ListNode head = null;
    if(data.length>0){
      head = new ListNode(data[0]);
    }
    for(int i=1;i<data.length;i++){
      head.appendToTail(data[i]);
    }
    return head;
  }
  
  
  public static void printList(ListNode head) {
    if(head==null){
      return;
    }
    ListNode curr = head;
    System.out.print(curr.val);
    while(curr.next!=null){
      curr = curr.next;
      System.out.print(", ");
      System.out.print(curr.val);
    }
    System.out.println();
  }
  
}
