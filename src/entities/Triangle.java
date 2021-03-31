package entities;

public class Triangle {
	public double a, b, c;

	public double area() {
		double p, result;

		p = (a + b + c) / 2.0;
		result = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		return result;
	}
}
