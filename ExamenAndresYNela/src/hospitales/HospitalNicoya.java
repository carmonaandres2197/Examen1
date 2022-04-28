package hospitales;

import java.util.List;

import oms.OMS;
import pacientes.Paciente;

public class HospitalNicoya extends OMS{ // Patron diseño template 
	
	private List<Paciente> listaPacientes;

	public HospitalNicoya(List<Paciente> pacientes) {
		super(pacientes);
		this.listaPacientes = pacientes;
	}

	@Override //Sobreescritura de metodos
	public Hospital getNombreHospital() {
		
		return Hospital.NICOYA;
	}

	@Override //Sobreescritura de metodos
	protected boolean isGamHospital() {
		
		return false;
	}

	public List<Paciente> getListaPacientes() {
		return listaPacientes;
	}
	
}
