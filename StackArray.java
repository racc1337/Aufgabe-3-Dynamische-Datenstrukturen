import java.util.ArrayList;
@SuppressWarnings("unchecked")
public class StackArray<E>{
	ArrayList list;
	public StackArray(){
		list = new ArrayList();
	}
	public void push(E item){
		list.add(0,item);
	}
	public E pop(){
		if(list.size()==0){
			return null;
		}
		return (E)list.remove(0);
	}
	public E peek(){
		if(list.size()==0){
			return null;
		}
		return (E)list.get(0);
	}
	public boolean isEmpty(){
		return list.isEmpty();
	}
	public int contains(E item){
		if(list.lastIndexOf(item)+1==0){
			return -1;
		}
		return list.lastIndexOf(item)+1;
	}
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
	public int size(){
		return list.size();
	}
}