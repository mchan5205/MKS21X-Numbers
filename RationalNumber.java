public class RationalNumber extends RealNumber{
	private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
	public RationalNumber(int nume, int deno){
		super(0.0);//this value is ignored!
		int GCD = gcd(nume, deno);
		numerator = nume / GCD;
		denominator = deno / GCD;
		if (deno == 0){
			numerator = 0;
			denominator = 1;
		}
		if (denominator < 0 && numerator > 0){
			numerator = numerator * - 1;
			denominator = denominator * - 1;
		}
	}

	public double getValue(){
		return (double) numerator / denominator;
	}

  /**
  *@return the numerator
  */
	public int getNumerator(){
		return numerator;
	}
  /**
  *@return the denominator
  */
	public int getDenominator(){
		return denominator;
	}
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
	public RationalNumber reciprocal(){
		RationalNumber newnum = new RationalNumber(this.denominator, this.numerator);
		newnum.reduce();
		return newnum;
	}
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
	public boolean equals(RationalNumber other){
		return numerator == other.numerator && denominator == other.denominator;
	}


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
	public String toString(){
		return "" + numerator + "/" + denominator;
	}

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
	private static int gcd(int a, int b){
		int storage = 1;
		int remain1;
		int remain2;
		if (a > b){
			remain1 = Math.abs(a);
			remain2 = Math.abs(b);
		}
		else{
			remain1 = Math.abs(b);
			remain2 = Math.abs(a);
		}
		while (remain1 != 0){
			storage = remain1 % remain2;
			if (storage == 0){
				return remain2;
			}
			remain1 = remain2;
			remain2 = storage;
		}
		return 1;
	}

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
	private void reduce(){
		int GCD = gcd(numerator, denominator);
		numerator = numerator / GCD;
		denominator = denominator / GCD;
		if (denominator < 0 && numerator > 0){
			numerator = numerator * - 1;
			denominator = denominator * - 1;
		}
		if (denominator < 0 && numerator < 0){
			numerator = Math.abs(numerator);
			denominator = Math.abs(denominator);
		}
	}
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
	public RationalNumber multiply(RationalNumber other){
		RationalNumber newnum = new RationalNumber(numerator * other.numerator, denominator * other.denominator);
		newnum.reduce();
		return newnum;
	}

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
	public RationalNumber divide(RationalNumber other){
		RationalNumber newnum = new RationalNumber(this.multiply(other.reciprocal()).numerator, this.multiply(other.reciprocal()).denominator);
		newnum.reduce();
		return newnum;
	}

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
	public RationalNumber add(RationalNumber other){
		RationalNumber newnum = new RationalNumber(numerator * other.denominator + other.numerator * denominator, denominator * other.denominator);
		newnum.reduce();
		return newnum;
	}
  /**
  *Return a new RationalNumber that this minus the other
  */
	public RationalNumber subtract(RationalNumber other){
		RationalNumber newnum = new RationalNumber(numerator * other.denominator - other.numerator * denominator, denominator * other.denominator);
		newnum.reduce();
		return newnum;
	}
}