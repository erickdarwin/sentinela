package pe.edu.upeupoo.Herencia;

import java.util.Date;


public class Persona {
	
		
	
	String nombres;
	String apePaterno;
	String apeMaterno;
	Double altura;
	String dni;
	String celular;
	Date fechaNacimiento;
	String email;
	String tipoSangre;
	String direccion;
	String religion;
	String sexo;
	String estadoCivil;
	Boolean vive;
	@Override
	public String toString() {
		return "Persona [nombres=" + nombres + ", apePaterno=" + apePaterno + ", apeMaterno=" + apeMaterno + ", altura="
				+ altura + ", dni=" + dni + ", celular=" + celular + ", fechaNacimiento=" + fechaNacimiento + ", email="
				+ email + ", tipoSangre=" + tipoSangre + ", direccion=" + direccion + ", religion=" + religion
				+ ", sexo=" + sexo + ", estadoCivil=" + estadoCivil + ", vive=" + vive + "]";
	}
	
	
	
}
	}


