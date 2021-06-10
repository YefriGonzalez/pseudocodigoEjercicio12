import java.util.*;
public class Ejercicio12{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		double alturaHombres=0;
		double alturaMujeres=0;
		int hombres=0;
		int mujeres=0;
		int totalParticipantes=0;
		double altura;
		int edad;
		int edadTotal=0;
		double promedioAlturaMujeres;
		double promedioAlturaHombres;
		double promedioEdadParticipantes;
		String sexo;
		System.out.print("Ingrese la edad: ");
		edad=scanner.nextInt();
		System.out.print("Ingrese la altura en Metros: ");
		altura=scanner.nextDouble();
		System.out.print("Ingrese el sexo, Femenino=F,Masculino=M.  ");
		sexo=scanner.next();
		while(altura>=0){
			totalParticipantes=totalParticipantes+1;
			edadTotal=edadTotal+edad;
			if (sexo.equals("F") | sexo.equals("f")) {
				alturaMujeres=alturaMujeres+altura;
				mujeres=mujeres+1;
				System.out.println("Persona Femenina Registrada");
			} else if(sexo.equals("M") | sexo.equals("m")){
				alturaHombres=alturaHombres+altura;
				hombres=hombres+1;
				System.out.println("Persona Masculina registrad");
			}else {
				System.out.println("Ingrese el sexo incorrectamente");
			}
			System.out.print("Ingrese la edad: ");
			edad=scanner.nextInt();
			System.out.print("Ingrese la altura en Metros: ");
			altura=scanner.nextDouble();
			System.out.print("Ingrese el sexo, Femenino=F,Masculino=M.  ");
			sexo=scanner.next();
		}
		promedioAlturaHombres=alturaHombres/hombres;
		promedioAlturaMujeres=alturaMujeres/mujeres;
		promedioEdadParticipantes=edadTotal/totalParticipantes;
		System.out.println("El promedio de altura de mujeres es: "+promedioAlturaMujeres+" mts.");
		System.out.println("El promedio de altura de hombres es: "+promedioAlturaHombres+" mts.");
		System.out.println("El promedio de edad de los participantes es: "+promedioEdadParticipantes+" años");
	}

}