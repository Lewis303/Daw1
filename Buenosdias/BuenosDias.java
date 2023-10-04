import java.util.Scanner;


public class BuenosDias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Buenos dias
		System.out.println("Buenos días");
		
		   
		
		//2.area del cuadrado
		int a = 5;
		int areaa=  a * a;
		System.out.println("el area de un cuadrado de lado 5 es: " + areaa);
		
		
		
		//3.area del cuadrado por teclado
		Scanner reader = new Scanner(System.in);	
		System.out.print("Escriba el lado del cuadrado: ");
		double lado = reader.nextDouble();
		Double area = lado*lado;
		System.out.println("El area es: " + area);
		
		
		
		//4.suma,resta,producto y division
		System.out.println("introduzca 2 numeros: ");
		double num1 = reader.nextDouble();
		double num2 = reader.nextDouble();
		double suma = num1 + num2;
		double resta = num1 - num2;
		double producto = num1 * num2;
		double division = num1 / num2;
		System.out.println(("suma: " + suma) + (" resta: " + resta) + (" division: "
				+ division) + (" producto: " + producto));
		
		
		
		//5.longitud,area,volumen
		System.out.println("escriba el radio de una circuferencia");
		reader = new Scanner(System.in);
		double long1 = reader.nextDouble();
		double long2 = long1 * Math.PI * 2 ;
		double are = long1 * long1 * Math.PI;
		double vol = Math.pow(long1 , 3) * (3.0 / 4.0) * Math.PI;
		System.out.println("la longitud es: " + long2 + " el area es: " + are + " y el volumen: " + vol );
		
		
		
	    //6.Descuento de un articulo
		reader = new Scanner(System.in);
		System.out.println("escriba el precio del articulo inicial: ");
		double precio1 = reader.nextDouble();
		System.out.println( precio1 + " ;y el valor con descuento: ");
		double precio2 = reader.nextDouble();
		double prfinal = ((precio2 - precio1)/precio1) * -100;
		System.out.println("El descuento es de: " + prfinal + "%");
		
		
		
		//7.millas marinas->metros
		reader = new Scanner(System.in);
		System.out.println("Escriba las millas");
		double millas = reader.nextDouble();
		double mtros = millas*1.852;
		System.out.println( millas + " son en metros: " + mtros);
		
		
		
        //8.numeros en orden ascendente
		System.out.println("escriba dos numeros");
		reader = new Scanner(System.in);
		double n1 = reader.nextDouble();
		double n2 = reader.nextDouble();
		System.out.println("son iguales: " + (n1 == n2) );
		System.out.println("n1 es menor: " + ( n1 < n2 ));
		System.out.println("n1 es mayor: " + (n1 > n2) );
		
		
		
		//9.comparativa dos numeros
		System.out.println("escriba dos numeros");
		reader = new Scanner(System.in);
		double l1 = reader.nextDouble();
		double l2 = reader.nextDouble();
		System.out.println("son iguales: " + (l1 == l2) );
		System.out.println("n1 es menor: " + ( l1 < l2 ));
		System.out.println("n1 es mayor: " + (l1 > l2) );
		
		
		
		//10.Programa que lee 3 numeros y lee el mayor
		System.out.println("escriba tres numeros");
		reader = new Scanner(System.in);
		double p1 = reader.nextDouble();
		double p2 = reader.nextDouble();
		double p3 = reader.nextDouble();
		System.out.println("P1 es el mayor que p2: " +(p1 > p2) );
		System.out.println("P3 es el mayor que p2: " +(p3 > p2) );
		System.out.println("P1 es el mayor que p3: " +(p1 > p3) );
		System.out.println("P1 es el igual que p2: " +(p1 == p2) );
		System.out.println("P2 es el igual que p3: " +(p2 == p3) );
		
		
		
		//11.Dos numeoros calcular su suma.resta,division y producto
		System.out.println("Escriba dos numeros distintos de 0");
		reader = new Scanner(System.in);
		double m1 = reader.nextDouble();
		double m2 = reader.nextDouble();
		System.out.println("suma: " + (m1 + m2));
		System.out.println("resta: " + (m1 - m2));
		System.out.println("producto: " + (m1 * m2));
		System.out.println("division: " + (m1 / m2));
		
		
		
		//12.programa que lee dos numeros y muestra el mayor
		System.out.println("escriba dos numeros A y B: ");
		reader = new Scanner(System.in);
		double A = reader.nextDouble();
		double B = reader.nextDouble();
		System.out.println("El numero A es mayor que B " + (A > B));
		System.out.println("El numero B es mayor que A " + (B > A));
		
		
		
		//13.programa que lee un numero y dice si es positivo o negativo(el 0 es positivo)
		System.out.println("Elija un numero para comprobar si es positivo o negativo: ");
		reader = new Scanner(System.in);
		double NP = reader.nextDouble();
		System.out.println("Es menor que 0(negativo): " + (0 > NP));
		System.out.println("Es mayor o igual a 0(positivo): " + (NP > 0));
		
		
		
		}

}
