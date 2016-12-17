
public class PrintPatteren {

	public static void main(String[] args) {
		printPatterenUtil(10);
		System.out.println("====");
		printPatterenUtil(16);
		
	}

	private static void printPatterenUtil(int i) {
		System.out.print(i + " ");
		
		printPattern(i,i-5,false);
	}

	private static void printPattern(int i, int j,boolean flag) {
	
		if( i == j){
			System.out.print( j + " ");
			return ;
		}
		
		System.out.print(j + " ");
		if(j > 0 && !flag){
			j = j-5;
			
		}else{
			flag = true;
			j = j +5;
		}
		
		printPattern(i,j,flag);
	}

}
