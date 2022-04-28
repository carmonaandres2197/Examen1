package tipoPruebasCovid;

import pacientes.Paciente;

public final class PruebaRapida implements PruebaCovid19{ //Composicion
	
private Paciente p;
	

//Inyeccion de dependencias
	public PruebaRapida(Paciente paciente) {
		this.p = new Paciente(paciente.getEdad(),paciente.getNombre(),paciente.getTemperatura(),paciente.isVomito());
	}

	@Override
	public boolean isPositiveCase() {
		if(this.p.getTemperatura() >= 37 && p.getEdad() >= 60) {
			return true;
		}
		return false;
	}

	@Override
	public String getNombrePaciente() {
		
		return p.getNombre();
	}

}
