/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static void main(String[] args) {
        String nn = "somehing";
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = null;
        ListNode node1 = list1;
        ListNode node2 = list2;
        while (node1 != null && node2 != null) {
            if (node1.val < node2.val) {
                if (result == null) {
                    result = new ListNode(node1.val);
                } else {
                    result.next = new ListNode(node1.val);
                    result = result.next;
                }
                node1 = node1.next;

            } else if (node1.val == node2.val) {
                if (result == null) {
                    result = new ListNode(node1.val);
                    result.next = new ListNode(node2.val);
                    result = result.next;
                } else {
                    result.next = new ListNode(node1.val);
                    result.next.next = new ListNode(node2.val);
                    result = result.next.next;

                }
                node1 = node1.next;
                node2 = node2.next;
            } else {
                if (result == null) {
                    result = new ListNode(node2.val);
                } else {
                    result.next = new ListNode(node2.val);
                    result = result.next;
                }
                node2 = node2.next;

            }
        }
        while (node1 != null) {
            if (result == null) {
                result = new ListNode(node1.val);
            } else {
                result.next = new ListNode(node1.val);
            }
            node1 = node1.next;
        }
        while (node2 != null) {
            if (result == null) {
                result = new ListNode(node2.val);
            } else {
                result.next = new ListNode(node2.val);
            }
            node2 = node2.next;
        }
        return result;
    }
}