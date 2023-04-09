package practica1;
import java.util.Scanner;
/**
 * Clase que permite ingresar y calcular notas de un estudiante.
 * @author Pedro Lalvay
 * @version 1.0
 * @since 06-04-2023
 */

public class notas {
	/**
	 * Declaramos las variables necesarias para el cálculo de notas
	 */
	double uf1, uf2, uf3;
	double t1, t2, t3, fin;
	//utilizames ecaner para poder introducir datos
	Scanner entrada = new Scanner(System.in);
	
	/**
	 * Método para ingresar notas del estudiante.
	 * @param uf1 Nota 1.
	 * @param uf2 Nota 2.
	 * @param uf3 Nota 3.
	 */
	
	public void IngresaNotas() {
		//cuando ejeuctamos este metodo lo primnero que queremos es que nos pida notas
		System.out.println("ingrese las notas del estudiante");
		
		System.out.print("ingrese nota 1: ");
		
		uf1= entrada.nextDouble();

		
		
		System.out.print("ingrese nota 2: ");
		
		uf2= entrada.nextDouble();
		System.out.print("ingrese nota 3: ");
		
		uf3= entrada.nextDouble();
		
	
	}
	
	/**
	 * Método para comprobar que las notas ingresadas son válidas.
	 */
	
	public void comprobarcion(){
		
		if (uf1>10) {
			System.out.println(" nota1 mal introducida");
			
		}else {
			System.out.println(" nota1 correcta");
		}
		
		if (uf2>10) {
			System.out.println(" nota2 mal introducida");
			
		}else {
			System.out.println(" nota2 correcta");
		}
		if (uf3>10) {
			System.out.println(" nota3 mal introducida");
			
		}else {
			System.out.println(" nota3 correcta");
		}
		
			
		
		
	}
	/**
	 * Método para calcular la nota definitiva del estudiante.
	 */
	
	public void Calculonotas() {
		t1= uf1*0.35;
		t2 = uf2 * 0.35;
		t3 = uf3 * 0.30;
		
		fin = t1 + t2+ t3;
		
		//hasta aqui la tenemos calculada peor no la mostramos
	}
	/**
	 * Método para mostrar las notas y el resultado del cálculo.
	 */
	public void Mostrar() {
		//print ln lo que hace es que al terminar el print baja la linea
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf1);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);
		
		System.out.println(" acumuado 1 = "+ t1);
		System.out.println(" acumuado 2 = "+ t2);
		System.out.println(" acumuado 3 = "+ t3);
		
		System.out.println(" nota definitiva es = "+ fin);
		
	}
	/**
	 * Método para determinar si el estudiante aprobó o no.
	 */
	public void aprobado() {
			
			if(fin<5 && fin>=0) {
				System.out.println("suspendio");
			}else {
				if (fin>=5 && fin<=10 ) {
				System.out.println("aprobado");
				}else {
					System.out.println(" error en la notas");
				}
			}
		}
		
	/**
	 * Método principal que permite llamar a los métodos de la clase.
	 */
	public static void main(String[] args) {
		// creamos mecanimos para llamar a cualquier metodo fuero de la clase
		notas fc= new notas();
		
		fc.IngresaNotas();
		
		fc.comprobarcion();
		

		fc.Calculonotas();
		
		fc.Mostrar();
		
		fc.aprobado();
		
	}

}
