
public class ConversionDatos {

	public static void main(String args[]) {
		
		byte numero1 = 10;
		short numero2 = numero1;
		int numero3 = numero2;
		long numero4 = numero3;
		
		int numero5 = (int)numero4; //Conversion a int de un float
		short numero6 = (short)numero3;
		short numero7 = (short)(numero5 + numero6);
		byte numero8 = (byte)(numero5+numero6);
		
	}
}
