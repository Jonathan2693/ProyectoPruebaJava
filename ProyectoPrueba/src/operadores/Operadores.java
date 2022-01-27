package operadores;

public class Operadores {
	public static void main (String[] args) {
		//Operadores aritmeticos
		//+ - * / %
		int a = 10;
		int b = 20;
		double c = 10.0;
		
		int suma = a + b;
		System.out.println(suma);
		
		String cadena1 = "El resultado de la suma es ";
		System.out.println(cadena1 + suma);
		System.out.println("El resultado de la resta es " + (a-b));
		
		int division = b/a;
		System.out.println("La division es " + division);
		
		double division2 = (double)a/b;
		System.out.println("La division2 es "+ division2);
		
		double multiplicacion = c*a;
		System.out.println("El resultado es " + (int)multiplicacion);
		
		int modulo = a%b;
		System.out.println("El modulo es " + modulo);
		
		/*Operadores de asignacion
		 * =
		 */
		int d = 5,e; //Inicializar las variables
		e = 6;
		
		System.out.println("La variable d es " + d + ", y la variable e es "+ e);
		int f=0, g=5;
		f+=5;
		System.out.println("El resultado de f+=5 es "+ f);
		
		/*Operadores relacionales
		 * ==, <, > , == !==
		 */
		int i = 15, j = 25;
		String cadena2 = "Hola";
		System.out.println("i es igual a j = " + (i!=j));
		
		/*Operador unario
		 * ++ --
		 */
		int k=10,l=21;
		System.out.println(++k);
		System.out.println(--l);
		
		//Jerarquia de operadores
		int operacion = 4+6*5/3;
		System.out.println(operacion);
		
		/*Operador ternario 
		 * 
		 */
		int edad = 18, valor = 0;
		valor = (edad<=18) ? 2:1;
		System.out.println(valor);
		
		/*Operadores booleanos
		 * && ||
		 */
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(true||false);
		System.out.println(!(true&&true));
		
		
	}	
}
