import java.util.Scanner;

public class E08_U02 {

	public static Scanner sc = new Scanner(System.in);
	public static void main (String [] args){
		
		//creamos las variables para el precio de la multa
		int multa = 0;
		int baja = 300;
		int legal = 0;
		int media = 600;
		int alta = 1000; 

		//pedimos una velocidad 
		System.out.print("Velocidad (kms/h): ");
		int velocidad = sc.nextInt();
		
		//Hacemos la operación ternaria para que muestre un resultado diferente dependiendo de la velocidad
		multa = (velocidad<=60)?baja:(velocidad>60 && velocidad <=120)?legal:(velocidad>120 && velocidad <=140)?baja:(velocidad>140 && velocidad <=180)?media:(velocidad>180)?alta:alta;
		double pagar = multa;
	
		//Imprimimos la multa
		System.out.print("multa: "+ (String.format("%.2f",pagar )));

	}
}