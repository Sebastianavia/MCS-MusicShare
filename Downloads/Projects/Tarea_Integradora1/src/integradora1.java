import java.util.Scanner;

public class integradora1{
		
	public static final int BLACK = 1300000 ;
	public static final int WHITE = 2600000 ;
	public static final int PAINTING = 980000 ;
		
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de materiales que hay en la lista");
		
		int materials = sc.nextInt();
		String [] names = new String [materials];
		double [] amount = new double [materials];
		String [] worktype = new String [materials];
		
		
		for (int j = 0; j < materials; j++){
        
		System.out.println("Ingrese el nombre del material");
		names[j] = sc.nextLine().toLowerCase();
		sc.nextLine();
		
		System.out.println("Ingrese la cantidad de " + names[j]);
		amount[j] = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Ingrese el tipo de la utildad del material " + names[j]);
		worktype[j] = sc.nextLine().toLowerCase();
		sc.nextLine();
		}
		
	}	
}


