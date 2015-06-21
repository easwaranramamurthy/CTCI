package chapterTwo;

public class Two_three {

  public boolean deleteReferencedNode(ListNode n) {
    if (n == null || n.next == null) {
      return false;
    }

    n.val = n.next.val;
    n.next = n.next.next;
    return true;
  }

  public static void main(String[] args) {
    int[] data = { 1, 2, 3, 4 };
    ListNode head = LinkedListUtil.createList(data);
    Two_three solution = new Two_three();
    System.out.println(solution.deleteReferencedNode(head.next.next.next.next));
    LinkedListUtil.printList(head);
    System.out.println(solution.deleteReferencedNode(head.next.next.next));
    LinkedListUtil.printList(head);
    System.out.println(solution.deleteReferencedNode(head.next.next));
    LinkedListUtil.printList(head);
    System.out.println(solution.deleteReferencedNode(head.next));
    LinkedListUtil.printList(head);
    System.out.println(solution.deleteReferencedNode(head.next));
    LinkedListUtil.printList(head);

  }

}
