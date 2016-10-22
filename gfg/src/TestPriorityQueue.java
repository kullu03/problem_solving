import java.util.PriorityQueue;

public class TestPriorityQueue {

	public static void main(String[] args) {
		
		PriorityQueue<String> pq = new PriorityQueue<String>(new StringLengthComparator());
		pq.add("short");
		pq.add("Indeed a long one");
		pq.add("medium");
		pq.add("medium");
		
		while(!pq.isEmpty()){
			System.out.println(pq.remove());
		}

	}

}
