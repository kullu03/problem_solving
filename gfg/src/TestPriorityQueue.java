import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {

	public static void main(String[] args) {
		
		Queue<String> pq = new PriorityQueue<String>(new StringLengthComparator());
		
		pq.add("short");
		pq.add("Indeed a long one");
		pq.add("medium");
		pq.add("medium");
		
		
		
		while(!pq.isEmpty()){
			System.out.println(pq.remove());
		}

	}

}
