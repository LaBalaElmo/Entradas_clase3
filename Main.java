package cuarentena;

import java.sql.SQLException;
import java.util.ArrayList;

import cuarentena.Conector;

public class Main {

	public static void main(String[] args) {
//		Conector instancia = Conector.getInstancia();
//		try {
//			ArrayList<String> listNombres = instancia.getNombres();
//			for(String nombre:listNombres) {
//				System.out.println(nombre);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
//		Conector instancia = Conector.getInstancia();
//		try {
//			ArrayList<String> listConsultorio = instancia.getConsultorio();
//			for(String consultorio:listConsultorio) {
//				System.out.println(consultorio);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		Conector instancia = Conector.getInstancia();
		try {
			ArrayList<String> listConsultorio = instancia.getConsultorioDoctor();
			ArrayList<String> listDoctor = instancia.getDoctor();
			for(int i = 0; i <= listConsultorio.size() - 1; i++) {
				System.out.println(listConsultorio.get(i) +" " + listDoctor.get(i));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
