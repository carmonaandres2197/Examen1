package test;

import java.util.ArrayList;

import hospitales.HospitalMexico;
import hospitales.HospitalNicoya;
import pacientes.Paciente;

public class Test {
	public static void main(String[] args) {
		
		Paciente p1 = new Paciente(20,"Andres",45, true);
		Paciente p2 = new Paciente(12,"Carlos",36, true);
		Paciente p3 = new Paciente(45,"Nela",38, true);
		Paciente p4 = new Paciente(60,"Luis",50, true);
		Paciente p5 = new Paciente(32,"Paco",20, true);
		Paciente p6 = new Paciente(50,"Maria",24, true);
		
		ArrayList<Paciente> lista1 = new ArrayList<Paciente>();
		ArrayList<Paciente> lista2 = new ArrayList<Paciente>();
		
		lista1.add(p1);
		lista1.add(p2);
		lista1.add(p3);
		
		lista2.add(p4);
		lista2.add(p5);
		lista2.add(p6);
		
		HospitalMexico hosMexico = new HospitalMexico(lista1);
		HospitalNicoya hosNicoya = new HospitalNicoya(lista2);
		
		hosMexico.imprimirReporte();
		hosNicoya.imprimirReporte();
	}
   
	 

}
