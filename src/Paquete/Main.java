package Paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //Para realizar entrada de datos por el teclado
		
		int as,pp,tp,ef,notaf; //declaracion de variables tipo entero
		String nl;
		
		System.out.println("=========\tUNIVERSIDAD DOMINICANA O&M\t=========="); //msj 
		System.out.println("***Departamento de Registro"); //msj
		System.out.println("***Reporte de calificaciones"); //msj
		System.out.println("**********************************************************\n");//msj
		System.out.println("Carrera: Ingenieria en Sistema y Computacion");
		System.out.println("Asignatura: PROGRAMACION ORIENTADA A OBJETO");
		System.out.println("Seccion: 0422");
		System.out.println("Horario: Miercoles 3:30 PM - 06:20 PM");
		System.out.println("Profesor: JOSE RAFAEL ROJAS\n");
		System.out.println("**********************************************************");//msj
		System.out.println("Nombre: ----aqui-----");
		System.out.println("Matricula: ----aqui-----");
		System.out.println("**********************************************************\n");//msj
		
		try{//el try-catch: es para validar de que solo se acepten datos tipos entero 
			
			System.out.print("AS: ");
			as =sc.nextInt();
			
			System.out.print("PP: ");
			pp =sc.nextInt();
			
			System.out.print("TP: ");
			tp =sc.nextInt();
			
			System.out.print("EF: ");
			ef =sc.nextInt();
			
			notaf= as+pp+tp+ef; //proceso de suma
			System.out.println("");
			
			//verificacion de datos
			if( (as>=0 && as<=10) && (pp>=0 && pp<=20) && (tp>=0 && tp<=20) && (ef>=0 && ef<=50)  ){
			
			//evalucion de la calificaciones	
			if(notaf>=90 )
				{
					nl="A";
					System.out.println("AS \tPP \tTP \tEF. \tNOTA NL");
					System.out.println(as+"\t"+pp+"\t"+tp+"\t"+ef+". \t"+notaf+"  "+nl);
				}
			else if(notaf >= 80 )
				{
					nl="B";
					System.out.println("AS \tPP \tTP \tEF. \tNOTA NL");
					System.out.println(as+"\t"+pp+"\t"+tp+"\t"+ef+". \t"+notaf+"  "+nl);
				}
			else if(notaf >= 75 )
				{
					nl="C";
					System.out.println("AS \tPP \tTP \tEF. \tNOTA NL");
					System.out.println(as+"\t"+pp+"\t"+tp+"\t"+ef+". \t"+notaf+"  "+nl);
				}
			else if(notaf >= 70 )
				{
					nl="D";
					System.out.println("AS \tPP \tTP \tEF. \tNOTA NL");
					System.out.println(as+"\t"+pp+"\t"+tp+"\t"+ef+". \t"+notaf+"  "+nl);
				}
			else
				{
					nl="F";
					System.out.println("AS \tPP \tTP \tEF. \tNOTA NL");
					System.out.println(as+"\t"+pp+"\t"+tp+"\t"+ef+". \t"+notaf+"  "+nl);
				}
			
			}
			else
				{
				System.out.println("Error!, verifique los datos\nAS<=10\nPP<=20\nTP<=20\nEX<=50.");
					
				}
		
		}catch(Exception e){System.out.println("Caracter no valido!\nEl programa solo acepta numero entero"+e);}
		
		
		
		
		
		
		
		
				
		
		
		
		

	}

}
