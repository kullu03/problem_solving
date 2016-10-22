
public enum Operation {
	PLUS("+") {
		@Override
		public double apply(double x, double y) {
			return x +y;
		}
	},
	MINUS("-") {
		@Override
		public double apply(double x, double y) {
			return x-y;
		}
	},
	MULTIPLY("*") {
		@Override
		public double apply(double x, double y) {
			return x*y;
		}
	},
	DIVIDE("/") {
		@Override
		public double apply(double x, double y) {
			return x/y;
		}
	};
	
	private String symbolName;
	private Operation(String symbolName){
		this.symbolName = symbolName;
	}
	
	public abstract double apply(double x, double y);

}
