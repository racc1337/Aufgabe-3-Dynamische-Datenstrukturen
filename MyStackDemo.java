@SuppressWarnings("unchecked")
// Demoprogramm fuer StackDynamic und StackArray
public class MyStackDemo{
	public static void main(String[] args){
		StackDynamic q = new StackDynamic();
		q.push(123);
		q.push(1234);
		q.push(12345);
		System.out.println(q);
		System.out.println(q.pick(1));
		System.out.println(q.contains(12345));
	}
}