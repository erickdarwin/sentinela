package pe.edu.upeupoo.clase1;

import java.text.ParseException;
import java.text.SimpleDateFormat;



public class primero {

	public static void main(String[] args) {

		Persona erick = new Persona();
		erick.nombre = "erick darwin";
		erick.apePaterno = "supo";
		erick.apeMaterno = "quispe";
		erick.celular = "969149732";
		erick.altura = 1.65;
		erick.dni = "75832921";
		erick.email = "erick12396@gamil.com";
		erick.estadocivil = "soltero";
		erick.religion = "otros";
		erick.sexo = "hombre";
		erick.vive = true;
		erick.tipodesangre = "A+";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			erick.fechadenacimiento = sdf.parse("04/08/1998");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println(erick);
	}

}
