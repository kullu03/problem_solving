import java.util.ArrayDeque;

public class TestDequeue {

	public static void main(String[] args) {
		ArrayDeque<String>stack = new ArrayDeque<>();
		stack.push("Kullu1");
		stack.push("Kullu2");
		stack.push("Kullu3");
		stack.push("Kullu4");
		stack.push("Kullu5");
		
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
		
		ArrayDeque<String>q = new ArrayDeque<>();
		q.addFirst(("Kullu1"));
		q.addFirst("Kullu2");
		q.addFirst("Kullu3");
		q.addFirst("Kullu4");
		q.addFirst("Kullu5");
		
		System.out.println("====================");
		while(!q.isEmpty()){
			System.out.println(q.removeLast());
		}
		
		
		
	}

}
