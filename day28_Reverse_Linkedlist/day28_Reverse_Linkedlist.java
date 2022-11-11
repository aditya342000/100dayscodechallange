/*
Given a linked list of N nodes. The task is to reverse this list.

Example 1:

Input:
LinkedList: 1->2->3->4->5->6
Output: 6 5 4 3 2 1
Explanation: After reversing the list, 
elements are 6->5->4->3->2->1.
*/class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        ArrayList<Integer>list = new ArrayList<>();
        while(head!=null)
        {
            list.add(head.data);
            head = head.next;
        }
        
        Collections.reverse(list);
        
        Node newHead = new Node(0);
        Node tempHead = newHead;
        for(int n: list)
        {
            tempHead.next = new Node(n);
            tempHead = tempHead.next;
        }
        return newHead.next;
    }
}
