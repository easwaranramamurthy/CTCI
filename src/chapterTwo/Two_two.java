package chapterTwo;

public class Two_two {

  public ListNode getKthFromLast(ListNode head, int k){
    if(k<=0||head==null){
      return null;
    }
    
    ListNode fast = head;
    for(int i=0;i<k-1;i++){
      if(fast==null){
        return null;
      }      
      fast = fast.next;
    }
    
    if(fast==null){
      return null;
    }
    
    ListNode slow = head;
    while(fast.next!=null){
      fast = fast.next;
      slow = slow.next;
    }
    
    return slow;
    
  }
  
  public static void main(String[] args) {
    int[] data = {1, 2, 3, 4};    
    ListNode head = LinkedListUtil.createList(data);
    Two_two solution = new Two_two();
    
    System.out.println(solution.getKthFromLast(head, 0));
    System.out.println(solution.getKthFromLast(head, 1).val);
    System.out.println(solution.getKthFromLast(head, 2).val);
    System.out.println(solution.getKthFromLast(head, 3).val);
    System.out.println(solution.getKthFromLast(head, 4).val);
    System.out.println(solution.getKthFromLast(head, 5));

  }

}
