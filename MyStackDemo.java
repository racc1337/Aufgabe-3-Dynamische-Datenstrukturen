import java.util.Random;
import java.util.UUID;
@SuppressWarnings("unchecked")
// Demoprogramm fuer StackDynamic und StackArray
// Erzeugt fuer die Typen int, String und Line jeweils zwei Stacks (StackDynamic und StackArray) mit 1000 Elementen
// jener Typen und wendet 1000 zufaellige Operationen auf die Stacks an (push-, pop- und peek-Operationen,
// welche im Schnitt mit einem Verhaeltnis von 2:2:1 angwandt werden)
// Gibt jeweils vor und nach dem Durchlauf der Operationen, die ersten 10 Elemente des Stacks aus
public class MyStackDemo{
	public static void main(String[] args){
		System.out.println("--------------------");
		System.out.println("Int Demo StackArray");
		System.out.println("--------------------");
		StackArray a1 = new StackArray();
		for(int i = 0; i<=1000; i++){
			Random rand = new Random();
			int  n = rand.nextInt(1000) + 1;
			a1.push(n);
			if(i>990){
				System.out.println(a1.peek());
			}
		}
		System.out.println();
		for(int i=0;i<=1000;i++){
			Random rand=new Random();
			int n = rand.nextInt(5)+1;
			if(n==1||n==2){
				Random rand1=new Random();
				int n1=rand1.nextInt(1000)+1;
				a1.push(n1);
			}else if(n==3||n==4){
				a1.pop();
			}else if(n==5){
				a1.peek();
			}
			if(i>990){
				System.out.println(a1.peek());
			}
		}
		System.out.println("--------------------");
		System.out.println("Int Demo StackDynamic");
		System.out.println("--------------------");
		StackDynamic a2 = new StackDynamic();
		for(int i = 0; i<=1000; i++){
			Random rand = new Random();
			int  n = rand.nextInt(1000) + 1;
			a2.push(n);
			if(i>990){
				System.out.println(a2.peek());
			}
		}
		System.out.println();
		for(int i=0;i<=1000;i++){
			Random rand=new Random();
			int n = rand.nextInt(5)+1;
			if(n==1||n==2){
				Random rand1=new Random();
				int n1=rand1.nextInt(1000)+1;
				a2.push(n1);
			}else if(n==3||n==4){
				a2.pop();
			}else if(n==5){
				a2.peek();
			}
			if(i>990){
				System.out.println(a2.peek());
			}
		}
		System.out.println("--------------------");
		System.out.println("String Demo StackArray");
		System.out.println("--------------------");
		StackArray b1 = new StackArray();
		for(int i=0;i<=1000;i++){
			String n = generateString();
			b1.push(n);
			if(i>990){
				System.out.println(b1.peek());
			}
		}
		System.out.println();
		for(int i=0;i<=1000;i++){
			Random rand=new Random();
			int n = rand.nextInt(5)+1;
			if(n==1||n==2){
				String n1 = generateString();
				b1.push(n1);
			}else if(n==3||n==4){
				b1.pop();
			}else if(n==5){
				b1.peek();
			}
			if(i>990){
				System.out.println(b1.peek());
			}
		}
		System.out.println("--------------------");
		System.out.println("String Demo StackDynamic");
		System.out.println("--------------------");
		StackDynamic b2 = new StackDynamic();
		for(int i=0;i<=1000;i++){
			String n = generateString();
			b2.push(n);
			if(i>990){
				System.out.println(b2.peek());
			}
		}
		System.out.println();
		for(int i=0;i<=1000;i++){
			Random rand=new Random();
			int n = rand.nextInt(5)+1;
			if(n==1||n==2){
				String n1 = generateString();
				b2.push(n1);
			}else if(n==3||n==4){
				b2.pop();
			}else if(n==5){
				b2.peek();
			}
			if(i>990){
				System.out.println(b2.peek());
			}
		}
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
			Random rand=new Random();
			int n = rand.nextInt(5)+1;
			if(n==1||n==2){
				Line line = generateLine();
				c1.push(line);
			}else if(n==3||n==4){
				c1.pop();
			}else if(n==5){
				c1.peek();
			}
			if(i>990){
				System.out.println(c1.peek());
			}
		}
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
			Random rand=new Random();
			int n = rand.nextInt(5)+1;
			if(n==1||n==2){
				Line line = generateLine();
				c2.push(line);
			}else if(n==3||n==4){
				c2.pop();
			}else if(n==5){
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
	// Erzeugt ein Line Objekt mit belieber Laenge zwischen 1 und 1000
	public static Line generateLine(){
		Random rand = new Random();
		double  n = 1 + (1000 - 1) * rand.nextDouble();
		Line l = new Line(n);
		return l;
	}
}