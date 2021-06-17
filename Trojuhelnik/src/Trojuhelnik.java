
public class Trojuhelnik {
    double a;
    double b;
    double c;
    double d;
   
	public Trojuhelnik(double a, double b, double c ) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	public void vypocetObvodu() {
	    System.out.println("\n"+"Obvod trojuhelniku je: "+ (double) (a + b + c));
		   
	}
	
	public void vypocetObsahu(double d) {
		System.out.println("\n"+"Obsah trojuhelniku je: "+ Math.sqrt(d* (d-a) * (d-b) * (d-c) ));
		   
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}
}