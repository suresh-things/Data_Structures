//linked list creation and printing
import java.util.*;

public class Linked_list {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}

	public void printList()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linked_list li=new Linked_list();
		li.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		li.head.next=second;
		second.next=third;
		li.printList();

	}

}
