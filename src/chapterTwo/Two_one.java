package chapterTwo;

import java.util.HashSet;
import java.util.Set;

public class Two_one {

  public void removeDuplicates(ListNode head) {
    Set<Integer> seen = new HashSet<Integer>();
    if (head == null) {
      return;
    }
    ListNode prev = head;
    seen.add(prev.val);
    ListNode curr = head.next;

    while (curr != null) {
      if (seen.contains(curr.val)) {
        prev.next = curr.next;
        curr = curr.next;
      } else {
        seen.add(curr.val);
        prev = curr;
        curr = curr.next;
      }
    }

  }

  public static void main(String[] args) {
    int[] data = { 10, 10, 11, 10 };
    ListNode head = LinkedListUtil.createList(data);
    Two_one solution = new Two_one();
    solution.removeDuplicates(head);
    LinkedListUtil.printList(head);

  }

}
