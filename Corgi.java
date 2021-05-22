public class Corgi extends Dog {

	private int weight;
	private int age;

	public Corgi() {
		weight = 0;
		age = 0;
	}

	public void setWeight(int CorgiWeight) {
		weight = CorgiWeight;
	}

	public void setAge(int CorgiAge) {
		age = CorgiAge;
	}

	public String toString() {
		return (super.toString() + "\nThe Corgi is " + age + " years old and weighs " + weight + " pounds.");
	}
}