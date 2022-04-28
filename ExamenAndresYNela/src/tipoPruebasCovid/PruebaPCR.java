package tipoPruebasCovid;

import pacientes.Paciente;

public final class PruebaPCR implements PruebaCovid19{
	
	private Paciente p;
	
	public PruebaPCR(Paciente paciente) {
		this.p = new Paciente(paciente.getEdad(),paciente.getNombre(),paciente.getTemperatura(),paciente.isVomito());
	}

	@Override
	public boolean isPositiveCase() {
		if(this.p.getTemperatura() >= 39 && p.isVomito() == true) {
			return true;
		}
		return false;
	}

	@Override
	public String getNombrePaciente() {
		return p.getNombre();
	}

	
}
