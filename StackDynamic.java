// Die generische Klasse StackDynamic erstellt einen Stack (Kellerspeicher) nach LIFO Prinzip
// mit Hilfe von Zeigerarithmetik
public class StackDynamic<E>{
	// Elemente der Wartschlange werden als Node Objekte dargestellt
	public class Node{
		//next ist ein Verweis auf das nachfolgende Node Objekt
		Node next;
		E data;
		public Node(E data){
			this.data = data;
		}
	}
	// head ist das erste Element des Stacks; Stack pointer
	Node head;
	// Erstellt einen leeren Stack
	public StackDynamic(){
		head=null;
	}
	// Erstellt ein neues Element auf dem Stack
	public void push(E data){
		if(head==null){
			head = new Node(data);
			return;
		}
		Node current = head;
		this.head = new Node(data);
		this.head.next = current;
	}
	// Gibt das erste Element des Stacks aus, und loescht es folglich
	public E pop(){
		if(head==null){
			return null;
		}else{
			Node help = head;
			head = head.next;
			return help.data;
		}
	}
	// Gibt das erste Element des Stacks aus
	public E peek(){
		if(head==null){
			return null;
		}else{
			return head.data;
		}
	}
	// Gibt an, ob der Stack leer ist. True falls leer, sonst false
	public boolean isEmpty(){
		if(head==null){
			return true;
		}
		return false;
	}
	// Gibt Element am Index j des Stacks aus
	public E pick(int j){
		Node current = head;
		for(int i=1;i<=j;i++){
			if(i==j){
				return current.data;
			}
			current = current.next;
		}
		return null;
	}
	// Gibt den Index des gesuchten Elements zurueck. (Stack pointer = position 1) Gibt -1 zurueck, falls das Element nicht im Stack zu finden ist
	public int contains(E item){
		for(int i=1;i<=this.size();i++){
			if(item.equals(this.pick(i))){
				return i;
			}
		}
		return -1;
	}
	// Gibt eine String Repraesentation des Stacks zurueck
	public String toString(){
		if(this.size()==-1){
			return null;
		}
		String out = "";
		for(int i=1;i<=this.size();i++){
			if(i==this.size()){
				out = out + this.pick(i);
				break;
			}
			out = out + this.pick(i)+", ";
		}
		return "["+out+"]";
	}
	// Gibt an, wieviele Elemente sich im Stack befinden
	public int size(){
		if(this.head==null){
			return -1;
		}
		int count = 1;
		Node current = head;
		while(current.next!=null){
			count += 1;
			current = current.next;
		}
		return count;
	}
	// Gibt alle Elemente von head bis Index b aus
	public void printData(int b){
		Node current = head;
		int count = 1;
		while(count<=b&&(current!=null)){
			System.out.println(count+". "+current.data);
			current = current.next;
			count++;
		}
	}
}