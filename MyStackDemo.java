import java.util.Random;
import java.util.UUID;
@SuppressWarnings("unchecked")
// Demoprogramm fuer StackDynamic und StackArray
public class MyStackDemo{
	public static void main(String[] args){
		// //int demo
		// StackArray q = new StackArray();
		// for(int i = 0; i<=1000; i++){
		// 	Random rand = new Random();
		// 	int  n = rand.nextInt(1000) + 1;
		// 	q.push(n);
		// }
		// for(int i=0;i<=1000;i++){
		// 	Random rand1=new Random();
		// 	int n1 = rand1.nextInt(5)+1;
		// 	if(n1==1){
		// 		Random rand2=new Randon();
		// 		int n2=rand2.nextInt(1000)+1;
		// 		q.push(n2);
		// 	}else if(n1==2){
		// 		Random rand3=new Randon();
		// 		int n3=rand3.nextInt(1000)+1;
		// 		q.push(n3);
		// 	}else if(n1==3){
		// 		q.pop();
		// 	}else if(n1==4){
		// 		q.pop();
		// 	}else if(n1==5){
		// 		q.peek();
		// 	}
		// }
		System.out.println("--------------------");
		System.out.println("String Demo StackArray");
		System.out.println("--------------------");
		StackArray b1 = new StackArray();
		for(int i=0;i<=1000;i++){
			String n = generateString();
			x.push(n);
			if(i>990){
				System.out.println(b1.peek());
			}
		}
		for(int i=0;i<=1000;i++){
			Random rand1=new Random();
			int n1 = rand1.nextInt(5)+1;
			if(n1==1){
				Random rand2=new Randon();
				int n2=rand2.nextInt(1000)+1;
				a.push(n2);
			}else if(n1==2){
				Random rand3=new Randon();
				int n3=rand3.nextInt(1000)+1;
				a.push(n3);
			}else if(n1==3){
				a.pop();
			}else if(n1==4){
				a.pop();
			}else if(n1==5){
				a.peek();
			}
			if(i>990){
				System.out.println(a.peek());
			}
		}
		// System.out.println("--------------------");
		// System.out.println("String Demo StackDynamic");
		// StackDynamic a = new StackDynamic();
		// for(int i=0;i<=1000;i++){
		// 	String n = generateString();
		// 	x.push(n);
		// 	if(i>990){
		// 		System.out.println(a.peek());
		// 	}
		// }
		// for(int i=0;i<=1000;i++){
		// 	Random rand1=new Random();
		// 	int n1 = rand1.nextInt(5)+1;
		// 	if(n1==1){
		// 		Random rand2=new Randon();
		// 		int n2=rand2.nextInt(1000)+1;
		// 		a.push(n2);
		// 	}else if(n1==2){
		// 		Random rand3=new Randon();
		// 		int n3=rand3.nextInt(1000)+1;
		// 		a.push(n3);
		// 	}else if(n1==3){
		// 		a.pop();
		// 	}else if(n1==4){
		// 		a.pop();
		// 	}else if(n1==5){
		// 		a.peek();
		// 	}
		// 	if(i>990){
		// 		System.out.println(a.peek());
		// 	}
		// }
		System.out.println("--------------------");
		System.out.println("Line Demo StackArray");
		System.out.println("--------------------");
		StackArray c1 = new StackArray();
		for(int i=0;i<=1000;i++){
			Line line = generateLine();
			c1.push(line);
			if(i>990){
				System.out.println(c1.peek());
			}
		}
		System.out.println();
		for(int i=0;i<=1000;i++){
			Random rand4=new Random();
			int n4 = rand4.nextInt(5)+1;
			if(n4==1||n4==2){
				Line line = generateLine();
				c1.push(line);
			}else if(n4==3||n4==4){
				c1.pop();
			}else if(n4==5){
				c1.peek();
			}
			if(i>990){
				System.out.println(c1.peek());
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("--------------------");
		System.out.println("Line Demo StackDynamic");
		System.out.println("--------------------");
		StackDynamic c2 = new StackDynamic();
		for(int i=0;i<=1000;i++){
			Line line = generateLine();
			c2.push(line);
			if(i>990){
				System.out.println(c2.peek());
			}
		}
		System.out.println();
		for(int i=0;i<=1000;i++){
			Random rand4=new Random();
			int n4 = rand4.nextInt(5)+1;
			if(n4==1||n4==2){
				Line line = generateLine();
				c2.push(line);
			}else if(n4==3||n4==4){
				c2.pop();
			}else if(n4==5){
				c2.peek();
			}
			if(i>990){
				System.out.println(c2.peek());
			}
		}

	}
	// Erzeugt einen zufaelligen String und gibt diesen zurueck
	public static String generateString(){
		String uuid = UUID.randomUUID().toString();
		return uuid;
	}
	// Erzeugt ein Line Objekt mit belieber Länge zwischen 1 und 1000
	public static Line generateLine(){
		Random rand5 = new Random();
		double  n5 = 1 + (1000 - 1) * rand5.nextDouble();
		Line l1 = new Line(n5);
		return l1;
	}
}