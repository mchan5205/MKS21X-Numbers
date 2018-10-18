public class Driver{
	public static void main(String[]args){
		RealNumber x = new RealNumber(5.0);
		RealNumber y = new RealNumber(3.0);
		System.out.println(x);
		System.out.println(x.add(y));
		System.out.println(x.divide(y));
		System.out.println(x.getValue());
		System.out.println(x.multiply(y));
		System.out.println(x.subtract(y));
	}	
}	