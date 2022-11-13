/*
Given two decimal numbers represented by two linked lists of size N and M respectively. 
The task is to return a linked list that represents the sum of these two numbers.

For example, the number 190 will be represented by the linked list, 1->9->0->null, similarly 25 by 2->5->null. Sum of these two numbers is 190 + 25 = 215, 
which will be represented by 2->1->5->null. You are required to return the head of the linked list 2->1->5->null.
*/
class Solution{
     static Node addTwoLists(Node first, Node second){
     first = reverse(first);
        second = reverse(second);
        Node result = addTwoNumbers(first, second);
        result = reverse(result);
        return result;
    }
    
    public static Node reverse(Node head){
        if(head == null || head.next == null)   return head;
        Node prev = null;
        while(head != null){
            Node Next = head.next;
            head.next = prev;
            prev = head;
            head = Next;
        }
        return prev;
    }
    
    public static Node addTwoNumbers(Node l1, Node l2) {
        Node dummy = new Node(-1);
        Node temp = dummy;
        int carry = 0;
        while(l1 != null || l2 != null || carry > 0){
            int sum = (l1 != null ? l1.data : 0) + (l2 != null ? l2.data : 0) + carry;
            temp.next = new Node(sum%10);
            temp = temp.next;
            carry = sum / 10;
            if(l1 != null)  l1 = l1.next;
            if(l2 != null)  l2 = l2.next;
        }
        return dummy.next;
    }
}
