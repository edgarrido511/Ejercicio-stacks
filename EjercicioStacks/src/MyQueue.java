
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
	public void delete() {
		if(tail == 0) {
			System.out.println("#");
		}
		else {
			for(int i = 0; i<queue.length-1;i++) {
				queue[i] = queue[(i+1)];
			}

		}
			
	}
	
}
