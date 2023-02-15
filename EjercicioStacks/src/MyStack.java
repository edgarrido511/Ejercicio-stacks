
public class MyStack {
	char[] stack;
	int top;
	int MAX;
	
	public void myStack (int stackSize) {
		this.stack = new char[stackSize];
		MAX = stack.length;
		top = 0;
	}
	public void push (char caracter) {
		if(top == MAX) {
			System.out.println("El arreglo esta lleno");
			return;
		}
		stack[top] = caracter;
		top++;
	}

	public char pop() {
		if(top==0) {
			System.out.println("El arreglo esta vacio:");
			return('0');
		}
		else {
			char eliminado = stack[top-1];
			stack[top-1]=' ';
			top--;
			System.out.println(eliminado);
			return(eliminado);
		}
	}

}
