package oms;

import java.util.ArrayList;
import java.util.List;

import hospitales.Hospital;
import pacientes.Paciente;
import tipoPruebasCovid.PruebaCovid19;
import tipoPruebasCovid.PruebaPCR;
import tipoPruebasCovid.PruebaRapida;

public abstract class OMS {
	
	private List<Paciente> pacientes = new ArrayList<>();

	public OMS(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
	
	public abstract Hospital getNombreHospital();
	
	protected abstract boolean isGamHospital();
	
	private List<PruebaCovid19> diagnosticar() {
		
		List<PruebaCovid19> resultadoDiagnostico = new ArrayList<>();
		
		for(int i = 0; i < pacientes.size(); i++) {
			Paciente p = pacientes.get(i);
			if(isGamHospital()) {
				PruebaCovid19 prueba = new PruebaPCR(p);
				resultadoDiagnostico.add(prueba);
			}
			else {
				PruebaCovid19 prueba = new PruebaRapida(p);
				resultadoDiagnostico.add(prueba);
			}
			
			
		}
		
		return resultadoDiagnostico;
		
	}
	
	public final void imprimirReporte() {
		
		List<PruebaCovid19> resultado = diagnosticar();
		
		String listaResults = "";
		
		String reportePruebasInicio = "|**********" + getNombreHospital() + "**********|" + "\n";
		String reportePruebasFinal = "|**********" + "FINAL DE LISTA" + "**********|" + "\n";
		
		for(int i = 0; i< pacientes.size(); i++) {
			listaResults = listaResults + "Nombre" + resultado.get(i).getNombrePaciente() + " / " + (resultado.get(i).isPositiveCase()?"Positivo":"Negativo") + "\n";
		}
		
		System.out.println(reportePruebasInicio + listaResults + reportePruebasFinal);
	}

	public List<Paciente> getPacientes() {
		return pacientes;
	}

	
}
