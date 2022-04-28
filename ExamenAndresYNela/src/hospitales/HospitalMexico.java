package hospitales;

import java.util.List;

import oms.OMS;
import pacientes.Paciente;

public class HospitalMexico extends OMS { // Patron diseño template 
	
	private List<Paciente> listaPacientes;

	public HospitalMexico(List<Paciente> pacientes) {
		super(pacientes);
		this.listaPacientes = pacientes;
		
	}

	@Override //Sobreescritura de metodos
	public Hospital getNombreHospital() {
		return Hospital.MEXICO;
	}

	@Override //Sobreescritura de metodos
	protected boolean isGamHospital() {
		
		return true;
	}

	public List<Paciente> getListaPacientes() {
		return listaPacientes;
	}

}
