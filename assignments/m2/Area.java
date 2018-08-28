import java.util.Scanner;
class Area
{
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		double r = s.nextDouble();
		
		double a = area(r);
		System.out.println(a);
	}
	static double area( double r){
		return pi() * r * r;
	}
	static double pi(){
		return 3.14;
	}
}