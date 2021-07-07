
public class VariablesApp {

	public static void main(String[] args) {
		ejercicio1();
		System.out.println();
		ejercicio2();
		System.out.println();
		ejercicio3();

		ejercicio4();

		ejercicio5();
		
	}
	
	public static void ejercicio1() {
		int a = 5;
		int b = 10;
		System.out.println("A="+a+" B="+b);
		System.out.println("La suma es "+(a+b));
		System.out.println("La resta es "+(a-b));
		System.out.println("La multiplicación es "+(a*b));
		System.out.println("La división es "+(a/b));
		System.out.println("El módulo es "+(a%b));
	}
	
	public static void ejercicio2() {
		int n = 10;
		double a = 5.5;
		char c = 'a';
		
		System.out.println("Valor de N: " + n + "\nValor de A: " + a + "\nValor de C: " + c);
		System.out.println("Suma N + A = "+(n+a));
		System.out.println("Diferencia de A - N = "+(a-n));
		System.out.println("Valor numérico correspondiente a C: " + (int)c);
	}
	
	public static void ejercicio3() {
		int x = 6;
		int y = 3;
		
		double n = 7.8;
		double m = 4.9;
		
		System.out.println("x = " + x + "y = " + y + "\nn = " + n + "m = " + m);
		System.out.println("x+y="+(x+y));
		System.out.println("x-y="+(x-y));
		System.out.println("x*y="+(x*y));
		System.out.println("x/y="+(x/y));
		System.out.println("resto de x/y="+(x%y));
		System.out.println("n+m="+(n+m));
		System.out.println("n-m="+(n-m));
		System.out.println("n*m="+(n*m));
		System.out.println("n/m="+(n/m));
		System.out.println("n%m="+(n%m));
		System.out.println("x+n="+(x+n));
		System.out.println("y/m="+(y/m));
		System.out.println("y%m="+(y%m));
		System.out.println("Doble de cada variable: "+ "\nX=" + x*2 + "\nY=" + y*2 + "\nN=" + n*2+ "\nM=" + m*2);
		System.out.println("Suma de cada variable: "+ "\nX=" + x+2 + "\nY=" + y+2 + "\nN=" + n+2+ "\nM=" + m+2);
		System.out.println("Producto de cada variable: "+ x*y*n*m);
	}
	
	public static void ejercicio4() {
		int n = 30;
		
		n = n+77;
		n = n-3;
		n = n*2;
	}
	
	public static void ejercicio5() {
		int a = 2;
		int b = 4;
		int c = 3;
		int d = 9;

		b = c;
		c = a;
		a = d;
		d = b;

	}

}
