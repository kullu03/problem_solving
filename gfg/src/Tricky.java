
public class Tricky {

	public static void main(String[] args) {
		int a = 4;
		fun(a);
	}

	static void fun(int x) {
		if (x > 0) {
			--x;
			fun(x);
			System.out.print(x + " ");
			--x;
			fun(x);
		}
	}
}
