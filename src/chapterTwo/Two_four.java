package chapterTwo;

public class Two_four {

  public ListNode partition(ListNode head, int x) {
    if (head == null) {
      return head;
    }
    ListNode head1 = new ListNode(-1);
    ListNode head2 = new ListNode(-1);
    ListNode curr1 = head1;
    ListNode curr2 = head2;

    ListNode curr = head;
    while (curr != null) {
      if (curr.val < x) {
        curr1.next = curr;
        curr1 = curr;
      } else {
        curr2.next = curr;
        curr2 = curr;
      }
      curr = curr.next;
    }

    curr1.next = null;
    curr2.next = null;

    if (head1.next == null) {
      return head2.next;
    }
    if (head2.next == null) {
      return head1.next;
    }

    curr1.next = head2.next;
    return head1.next;

  }

  public static void main(String[] args) {
    int[] data = { 8, 7, 6, 4, 4, 3, 2, 1, 5 };
    ListNode head = LinkedListUtil.createList(data);
    Two_four solution = new Two_four();
    ListNode newHead = solution.partition(head, 1);
    LinkedListUtil.printList(newHead);
  }

}
