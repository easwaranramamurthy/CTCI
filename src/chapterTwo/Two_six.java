package chapterTwo;

public class Two_six {

  public ListNode findLoopBeg(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        break;
      }
    }
    if (fast == null || fast.next == null) {
      return null;
    }
    ListNode start = head;

    while (start != slow) {
      start = start.next;
      slow = slow.next;
    }

    return slow;

  }
}
