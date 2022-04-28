package hospitales;

import java.util.List;

import oms.OMS;
import pacientes.Paciente;

public class HospitalNicoya extends OMS{
	
	private List<Paciente> listaPacientes;

	public HospitalNicoya(List<Paciente> pacientes) {
		super(pacientes);
		this.listaPacientes = pacientes;
	}

	@Override
	public Hospital getNombreHospital() {
		
		return Hospital.NICOYA;
	}

	@Override
	protected boolean isGamHospital() {
		
		return false;
	}

	public List<Paciente> getListaPacientes() {
		return listaPacientes;
	}
	
}
