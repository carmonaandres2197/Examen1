package hospitales;

import java.util.List;

import oms.OMS;
import pacientes.Paciente;

public class HospitalMexico extends OMS {
	
	private List<Paciente> listaPacientes;

	public HospitalMexico(List<Paciente> pacientes) {
		super(pacientes);
		this.listaPacientes = pacientes;
		
	}

	@Override
	public Hospital getNombreHospital() {
		return Hospital.MEXICO;
	}

	@Override
	protected boolean isGamHospital() {
		
		return true;
	}

	public List<Paciente> getListaPacientes() {
		return listaPacientes;
	}

}
