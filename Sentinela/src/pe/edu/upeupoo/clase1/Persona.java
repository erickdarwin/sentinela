package pe.edu.upeupoo.clase1;

import java.util.Date;

public class Persona {
	
	

	double altura;
	String dni;
	String celular;
	Date fechadenacimiento;
	String email;
	String tipodesangre;
	String religion;
	String sexo;
	String estadocivil;
	Boolean vive;
	
	public int getedad(){
		return 0;
		
		
		
	}

	String nombre; 
	String apePaterno;
	String apeMaterno;
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ",/n apePaterno=" + apePaterno + ", apeMaterno=" + apeMaterno + ", altura="
				+ altura + ", dni=" + dni + ", celular=" + celular + ", fechadenacimiento=" + fechadenacimiento
				+ ", email=" + email + ", tipodesangre=" + tipodesangre + ", religion=" + religion + ", sexo=" + sexo
				+ ", estadocivil=" + estadocivil + ", vive=" + vive + "]";
	
	}
}
