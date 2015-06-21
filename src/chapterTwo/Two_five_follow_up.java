package chapterTwo;

public class Two_five_follow_up {

  public ListNode addNumbers(ListNode head1, ListNode head2) {
    head1 = reverseList(head1);
    head2 = reverseList(head2);
    Two_five sol = new Two_five();
    ListNode ans = sol.addNumbers(head1, head2);
    head1 = reverseList(head1);
    head2 = reverseList(head2);
    return reverseList(ans);
  }

  private ListNode reverseList(ListNode head) {
    if (head == null) {
      return head;
    }

    ListNode prev = null;
    ListNode curr = head;

    while (curr != null) {
      ListNode temp = curr.next;
      curr.next = prev;
      prev = curr;
      curr = temp;
    }

    return prev;
  }

  public static void main(String[] args) {
    int[] data1 = { 1, 2 };
    ListNode head1 = LinkedListUtil.createList(data1);
    int[] data2 = {};
    ListNode head2 = LinkedListUtil.createList(data2);
    Two_five_follow_up solution = new Two_five_follow_up();
    ListNode sum = solution.addNumbers(head1, head2);
    LinkedListUtil.printList(sum);
  }

}
