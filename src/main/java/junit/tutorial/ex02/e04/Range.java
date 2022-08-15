package junit.tutorial.ex02.e04;

public class Range {

	private double min;
	private double max;

	public Range(double min, double max) {
		this.min = min;
		this.max = max;
	}
	
	public boolean contains(double value) {
		return min <= value && value <= max;
	}

	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

}
