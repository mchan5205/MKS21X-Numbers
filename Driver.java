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
		RationalNumber z = new RationalNumber(3, 4);
		RationalNumber g = new RationalNumber(5, 7);
		RationalNumber f = new RationalNumber(4, 4);
		RationalNumber j = new RationalNumber(1, 1);
		System.out.println(z);
		System.out.println(z.multiply(g));
		System.out.println(z.multiply(f));
		System.out.println(f);
		System.out.println(z.multiply(j));
		System.out.println(z.getNumerator());
		System.out.println(z.getDenominator());
		System.out.println(z.reciprocal());
		System.out.println(z.divide(g));
		System.out.println(z.add(g));
		System.out.println(z.subtract(g));
		System.out.println(g.subtract(z));
	}	
}	