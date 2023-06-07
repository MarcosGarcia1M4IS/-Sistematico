package Sistematico1_2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Persona {
public String nombre, DNI, edad1 = "Oculto";
public int edad;
Scanner tc = new Scanner(System.in);
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDNI() {
	return DNI;
}
public void setDNI(String dNI) {
	DNI = dNI;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}

public void Datos() {
	System.out.print("Ingrese su Nombre: ");
	nombre = tc.nextLine();
	System.out.print("Ingrese su Edad: ");
	edad = tc.nextInt();
	tc.nextLine();
	if(edad >= 16) {
		System.out.println("Ingrese su DNI");
		DNI = tc.nextLine();
	}else if (edad < 16 && edad > 0){
		DNI = "No tiene DNI";
	} else {
		System.out.println("Edad sin sentido");
	}
}



public void MayorDeEdad() {
	if(edad >= 18 && edad < 120) {
		System.out.println("Usted es mayor de edad");
	}else if(edad < 18 && edad > 0) {
		System.out.println("Usted es menor de edad");
	}
}
	
	public void mostrar() {
	if(edad <= 0) {
System.out.println(" ");		
	}else {
		System.out.println("Nombre: " + nombre);
		System.out.println("DNI: " + DNI);
	    System.out.println("Edad: " + edad);	
		
	}
}
}
