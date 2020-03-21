package cuarentena;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cuarentena.Conector;

public class Conector {
	/**
	 * Atributos de clase
	 */
	private static Connection con;
	private static Conector INSTANCE = null;

	/**
	 * Consructor
	 */
	private Conector() {

	}

	/**
	 * Crear instancia
	 */

	private synchronized static void crearInstancia() {
		if (INSTANCE == null) {
			INSTANCE = new Conector();
			crearConexion();
		}
	}

	/**
	 * Obtener instancia
	 */

	public static Conector getInstancia() {
		if (INSTANCE == null) {
			crearInstancia();
		}
		return INSTANCE;
	}

	/**
	 * Crear Conexion
	 */
	private static void crearConexion() {
		String host = "127.0.0.1";
		String user = "Rodrigo";
		String password = "Solomeo123"; // Poner su password
		String dataBase = "cuarentena";
		try {
			// Importando la libreria de conexion de mysql
			Class.forName("com.mysql.jdbc.Driver");
			// Url de conexion
			String urlConexion = "jdbc:mysql://" + host + "/" + dataBase + "?user=" + user + "&password=" + password;
			con = DriverManager.getConnection(urlConexion);
			System.out.println("Lo lograste :')");
		} catch (Exception e) {
			System.out.println("Error al conectar a la base de datos");
		}
	}
	
//	public ArrayList<String> getVendors() throws SQLException {
//		ArrayList<String> listaVendors = new ArrayList<String>();
//		PreparedStatement ps = con.prepareStatement("Select * from vendors");
//		ResultSet rs = ps.executeQuery();
//		while (rs.next()) {
//			listaVendors.add(rs.getString("companyname"));
//		}
//		rs.close();
//		return listaVendors;
//	}
	public ArrayList<String> getNombres() throws SQLException {
		ArrayList<String> listaNombres = new ArrayList<String>();
		PreparedStatement ps = con.prepareStatement("Select * from persona inner join paciente on CI_Persona = CI");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			listaNombres.add(rs.getString("Nombre"));
		}
		rs.close();
		return listaNombres;
	}
	
	public ArrayList<String> getConsultorio() throws SQLException {
		ArrayList<String> listaConsultorio = new ArrayList<String>();
		PreparedStatement ps = con.prepareStatement("select * from consultorio inner join doctor on doctor.ID_consultorio = consultorio.ID inner join consulta on consulta.ID_Doctor = doctor.ID inner join paciente on consulta.ID_Paciente = paciente.ID");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			listaConsultorio.add(rs.getString("nro"));
		}
		rs.close();
		return listaConsultorio;
	}
	
	public ArrayList<String> getConsultorioDoctor() throws SQLException {
		ArrayList<String> listaConsultorio = new ArrayList<String>();
		ArrayList<String> listaDoctor = new ArrayList<String>(); 
		PreparedStatement ps = con.prepareStatement("select * from persona inner join doctor on doctor.CI_Persona = persona.CI inner join consultorio on consultorio.ID = doctor.ID_consultorio");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			listaConsultorio.add(rs.getString("nro"));
			listaDoctor.add(rs.getString("Nombre"));
		}
		rs.close();
		return listaConsultorio;
	}
	
	public ArrayList<String> getDoctor() throws SQLException {
		ArrayList<String> listaDoctor = new ArrayList<String>(); 
		PreparedStatement ps = con.prepareStatement("select * from persona inner join doctor on doctor.CI_Persona = persona.CI inner join consultorio on consultorio.ID = doctor.ID_consultorio");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			listaDoctor.add(rs.getString("Nombre"));
		}
		rs.close();
		return listaDoctor;
	}
	
	/**
	 * Crear un nuevo usuario en mysql
	 * conectarse a la base cuarentena con el nuevo usuario
	 * mostrar los nombres de los pacientes
	 * mostrar el consultario de los pacientes
	 * mostrar el consultorio y nombre de los doctores
	 */
}
