public class RealNumber{
	private double value;

	public RealNumber(double v){
		value = v;
	}

	public double add(RealNumber other){

     //other can be ANY RealNumber, including a RationalNumber

     //or other subclasses of RealNumber (that aren't written yet)

		return value + other.value;
	}

  /*
  *Return the product of this and the other
  */
	public double multiply(RealNumber other){
		return value * other.value;
	}

  /*
  *Return the this divided by the other
  */
	public double divide(RealNumber other){
		return value / other.value;
	}
 
  /*
  *Return the this minus the other
  */
	public double subtract(RealNumber other){
		return value - other.value;
	}


	public double getValue(){
		return value;
	}

	public String toString(){
		return ""+value;
	}
}