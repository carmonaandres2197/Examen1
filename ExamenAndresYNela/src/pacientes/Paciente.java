package pacientes;

public class Paciente {

//Inmutabilidad y Encapsulacion
private final int edad;
private final String nombre;
private final int temperatura;
private final boolean vomito;



public Paciente(int edad, String nombre, int temperatura, boolean vomito) {
	this.edad = edad;
	this.nombre = nombre;
	this.temperatura = temperatura;
	this.vomito = vomito;
}



public int getEdad() {
	return edad;
}

public String getNombre() {
	return nombre;
}

public int getTemperatura() {
	return temperatura;
}

public boolean isVomito() {
	return vomito;
}



}
