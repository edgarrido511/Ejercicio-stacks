
public class Stack {

	public static void main(String[] args) {
		MyStack a = new MyStack();
		MyQueue b = new MyQueue();
		a.myStack(5);
		a.push('a');
		a.push('s');
		a.push('y');
		a.push('p');
		a.push('i');
		/*for (int i = 0; i<a.stack.length;i++) {
			System.out.println(a.stack[i]);
		}*/
		//a.pop();
		
		b.myQueue(5);
		b.insertar('r');
		b.insertar('t');
		b.insertar('y');
		b.insertar('h');
		b.insertar('o');
		for (int i = 0; i<b.queue.length;i++) {
			System.out.println(b.queue[i]);
		}
		b.delete();
		b.delete();
		b.delete();
		b.delete();
		b.delete();
		for (int i = 0; i<b.queue.length;i++) {
			System.out.println(b.queue[i]);
		}
		
	}
}
