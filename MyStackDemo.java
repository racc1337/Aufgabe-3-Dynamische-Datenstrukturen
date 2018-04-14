@SuppressWarnings("unchecked")
// Demoprogramm fuer StackDynamic und StackArray
public class MyStackDemo{
	public static void main(String[] args){
		StackArray q = new StackArray();
		q.push(123);
		q.push(1234);
		q.push(12345);
		System.out.println(q);
		q.pop();
		q.pop();
		q.pop();
		q.pop();
		q.pop();
		// System.out.println(q.size());
		System.out.println(q);
	}
}