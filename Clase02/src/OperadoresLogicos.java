
public class OperadoresLogicos {

	public static void main(String[] args) {
		/*
		 * Iphone y Rojo
		 */
		boolean iphone;
		boolean rojo;
		// AND OR
		// &&
		System.out.println("AND");
		iphone = true;
		rojo = true;
		//
		System.out.println(iphone && rojo);

		iphone = true;
		rojo = false;
		//
		System.out.println(iphone && rojo);

		iphone = false;
		rojo = true;
		//
		System.out.println(iphone && rojo);

		iphone = false;
		rojo = false;
		//
		System.out.println(iphone && rojo);

		// iphone o rojo

		System.out.println("OR");
		iphone = true;
		rojo = true;
		//
		System.out.println(iphone || rojo);

		iphone = true;
		rojo = false;
		//
		System.out.println(iphone || rojo);

		iphone = false;
		rojo = true;
		//
		System.out.println(iphone || rojo);

		iphone = false;
		rojo = false;
		//
		System.out.println(iphone || rojo);

		System.out.println(iphone | rojo);
		
		
		// (edad > ???) & (octavio es colorado)
		
		// colorado desc

	}

}
