package com.sunny;

public class Add_Two_Number {

	public static void main(String[] args) {
		ListNode a = new ListNode(2);
		a.next = new ListNode(4);
		a.next.next = new ListNode(3);
		ListNode b = new ListNode(5);
		b.next = new ListNode(6);
		b.next.next = new ListNode(4);
		addTwoNumbers(a,b);
	}
	
	static public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	 
	
	static public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode re = new ListNode(0);
    	ListNode head = re;
    	int a=0,b=0,c =0;
        while(l1!=null || l2!=null){
        	a = l1==null?0:l1.val;
        	if(l1 != null) l1 = l1.next;
        	b = l2==null?0:l2.val;
        	if(l2 != null) l2 = l2.next;
        	re.next = new ListNode((a+b+c)%10);
        	c = (a+b+c)/10;
        	re= re.next;
        }
        if(c!=0)
        {
        	re.next = new ListNode(1); 
        }
        return head.next;
    }

}
