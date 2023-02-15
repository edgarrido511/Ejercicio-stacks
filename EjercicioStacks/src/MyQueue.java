
public class MyQueue {
	char[] queue;
	int tail;
	int max;
	
	public void myQueue (int queueSize) {
		queue = new char[queueSize];
		max = queue.length;
		tail = 0;
	}
	
	public void insertar(char value) {
		if(tail == max) {
			System.out.println("La cola esta llena");
		}
		else {
			queue[tail] = value;
			tail++;
		}
	}
	public char delete() {
		if(tail == 0) {
			System.out.println("la cola esta vacia");
			return'#';
		}
		else {
			char eliminado = queue[0];
			for(int i = 0; i<tail;i++) {
				int j = i+1;
				queue[i] = queue[j];
			}
			tail--;
			return eliminado;
		}
			
	}
	
}
