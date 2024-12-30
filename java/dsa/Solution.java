
import java.util.LinkedList;

// Definition for singly-linked list.
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

public class Solution {
    public static void main(String[] args) {
        LinkedList <Integer> l1 =new LinkedList<>(); 
        LinkedList <Integer> l2 =new LinkedList<>(); 
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l2.add(6);
        l2.add(9);
        l2.add(8);
        ListNode list1 = toListNode(l1);
        ListNode list2 = toListNode(l2);
        System.out.println(addTwoNumbers(list1,list2));
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);  // Dummy head to simplify list construction
        ListNode current = dummyHead;
        int carry = 0;
        
        // Loop until both lists are exhausted and carry is 0
        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;  // Get the value of l1 node, or 0 if l1 is null
            int val2 = (l2 != null) ? l2.val : 0;  // Get the value of l2 node, or 0 if l2 is null
            
            int sum = val1 + val2 + carry;  // Calculate sum including carry
            carry = sum / 10;               // Update carry
            int digit = sum % 10;           // Get the last digit of sum
            
            current.next = new ListNode(digit);  // Create new node for the digit and link it
            current = current.next;              // Move to the next node in result
            
            // Move to the next nodes in l1 and l2
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        return dummyHead.next;  // Return the result list, skipping the dummy head
    }
}
