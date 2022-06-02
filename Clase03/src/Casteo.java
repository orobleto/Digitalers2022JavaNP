
public class Casteo {
	public static void main(String[] args) {
		// casteo Implicita y Explicita

		byte miByte = 5;
		short miShort = 6;
		int miInt = 5;
		long miLong = 8;
		float miFloat = 9;
		double miDouble = 10.69999;

		miLong = miByte; // -128 127 9999999999999999

		miShort = (short) miInt;// 999999999 9999999999999999999999

		System.out.println(miShort);

		miByte = (byte) miDouble;

		System.out.println(miByte);

		char caracter = '©';

		System.out.println("El caracter es: " + caracter + ", en numeros es: " + ((int) caracter));

		// Casteo

		int edad = Integer.parseInt("85");
		float sueldo = Float.parseFloat("52.36");
		
		System.out.println(edad);
		
		boolean activo = Boolean.parseBoolean("truE");
		
		int anio = Integer.valueOf("25");
		System.out.println(activo);
		
		//    Integer, Byte, Long Short Boolean Character Float Double
		
		
		

		//

	}
}
