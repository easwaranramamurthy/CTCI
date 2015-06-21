package chapterTwo;

public class Two_five {

  public ListNode addNumbers(ListNode head1, ListNode head2) {
    if (head1 == null) {
      return head2;
    }
    if (head2 == null) {
      return head1;
    }

    ListNode curr1 = head1;
    ListNode curr2 = head2;

    int carry = 0;
    ListNode newHead = null;
    ListNode curr3 = newHead;

    while (curr1 != null || curr2 != null) {
      int newVal = carry;
      if (curr1 != null) {
        newVal += curr1.val;
        curr1 = curr1.next;
      }
      if (curr2 != null) {
        newVal += curr2.val;
        curr2 = curr2.next;
      }

      carry = newVal / 10;
      newVal = newVal % 10;

      if (newHead == null) {
        newHead = new ListNode(newVal);
        curr3 = newHead;
      } else {
        curr3.next = new ListNode(newVal);
        curr3 = curr3.next;
      }
    }
    if (carry != 0) {
      curr3.next = new ListNode(carry);
    }
    return newHead;
  }

  public static void main(String[] args) {
    int[] data1 = { 9, 9, 9 };
    ListNode head1 = LinkedListUtil.createList(data1);
    int[] data2 = { 9, 9, 9 };
    ListNode head2 = LinkedListUtil.createList(data2);
    Two_five solution = new Two_five();
    ListNode sum = solution.addNumbers(head1, head2);
    LinkedListUtil.printList(sum);
  }

}
