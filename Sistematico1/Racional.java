package Sistematico1;
import java.util.Scanner;
public class Racional {

public double suma, resta, multiplicacion,  division, comparacion;
public int numerador, denominador, numerador1, denominador2;
	Scanner tc = new Scanner(System.in);

public void leer(){
System.out.println("Numerador");
numerador = tc.nextInt();
System.out.println("Denominador");
denominador = tc.nextInt();
if(denominador == 0) {
	System.out.println("Error");
System.exit(0);
}
System.out.println("Numerador");
numerador1 = tc.nextInt();
System.out.println("Denominador");
denominador2 = tc.nextInt();
if(denominador2 == 0) {
	System.out.println("Error");
System.exit(0);
}
}
public void suma() {
    if (denominador == denominador2) {
        suma = (numerador + numerador1) / (double) denominador;
    } else {
        int denominador3 = denominador * denominador2;
        suma = ((denominador3 / denominador) * numerador + (denominador3 / denominador2) * numerador1) / (double) denominador3;
    }
    System.out.println("Suma: " + suma);
}

public void resta() {
    if (denominador == denominador2) {
        resta = (numerador - numerador1) / (double) denominador;
    } else {
        int denominador3 = denominador * denominador2;
        resta = ((denominador3 / denominador) * numerador - (denominador3 / denominador2) * numerador1) / (double) denominador3;
    }
    System.out.println("Resta: " + resta);
}

public void multiplicar() {
    int nuevoNumerador = numerador * numerador1;
    int nuevoDenominador = denominador * denominador2;
    System.out.println("Multiplicación: " + nuevoNumerador + "/" + nuevoDenominador);
}

public void dividir() {
    int nuevoNumerador = numerador * denominador2;
    int nuevoDenominador = denominador * numerador1;
    System.out.println("División: " + nuevoNumerador + "/" + nuevoDenominador);
}

public void comparaion() {
	if(numerador/denominador > numerador1/denominador2) {
		System.out.println("La fracción 1 es mayor");
	}else {
		System.out.println("La fracción 2 es mayor");
	}
}

}
