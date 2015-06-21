package chapterTwo;

public class ListNode {
  int val;
  ListNode next;

  public ListNode(int val2) {
    val = val2;
  }

  public void appendToTail(int val3) {
    ListNode end = new ListNode(val3);
    ListNode curr = this;
    while (curr.next != null) {
      curr = curr.next;
    }
    curr.next = end;
  }
}
