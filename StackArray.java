// Die generische Klasse StackArray erstellt einen Stack (Kellerspeicher) nach LIFO Prinzip
// mit Hilfe der Klasse ArrayList
import java.util.ArrayList;
@SuppressWarnings("unchecked")
public class StackArray<E>{
	ArrayList list;
	// Erstellt einen leeren Stack
	public StackArray(){
		list = new ArrayList();
	}
	// Erstellt ein neues Objekt auf dem Stack
	public void push(E item){
		list.add(0,item);
	}
	// Gibt das oberste Element des Stacks aus und loescht es folglich
	public E pop(){
		if(list.size()==0){
			return null;
		}
		return (E)list.remove(0);
	}
	// Gibt das oberste Element des Stacks aus
	public E peek(){
		if(list.size()==0){
			return null;
		}
		return (E)list.get(0);
	}
	// Prueft ob der Stack leer ist, true falls ja
	public boolean isEmpty(){
		return list.isEmpty();
	}
	// Prueft ob sich ein bestimmtes Element im Stack befindet, gibt den Index zurueck falls ja, gibt -1 zurueck falls nein
	public int contains(E item){
		if(list.lastIndexOf(item)+1==0){
			return -1;
		}
		return list.lastIndexOf(item)+1;
	}
	// String represaentation des Stacks
	public String toString(){
		String out="";
		for(int i=0;i<list.size();i++){
			if(list.get(i)!=null){
				if(i==list.size()-1){
					out = out + list.get(i);
					break;
				}
				out = out + list.get(i)+", ";
			}
		}
		return "["+out+"]";
	}
	// Gibt die groesse des Stacks zurueck
	public int size(){
		return list.size();
	}
}