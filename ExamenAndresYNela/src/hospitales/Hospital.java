package hospitales;

public enum Hospital { //Encapsulacion de valores
	
		NICOYA("Hospital de Nicoya"), MEXICO("Hospital Mexico");
		
		
		private final String nombreHospital;
		
		
		private Hospital (String nombreHospital){
			this.nombreHospital = nombreHospital;
		}

		public String getEnum() {
			
			return this.nombreHospital;
		}
		
			}

