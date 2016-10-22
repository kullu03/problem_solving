
public class TestEnum {

	public static void main(String[] args) {
		
		double x = 9;
		double y = 3;
		
		for(Operation op : Operation.values()){
			
			System.out.println(op.apply(x, y));
		}

	}

}
