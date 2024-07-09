package cl.praxis.model.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	private static  Connection con = null;
	
	private Conexion() {
		
		try {
			
			Class.forName("org.postgresql.Driver");
			
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/desafio_proveedores", "postgres", "postgres987");
			//con = DriverManager.getConnection("jdbc:mvsql://localhost:5432/desafio_proveedores", "postgres", "Admin2024");
			// Para verificar error en conexión probar con el metodo siguiente a postgresql
			//mostrara en consola este error: Error al conectar con la BD: No suitable driver found for jdbc:mvsql://localhost:5432/desafio_proveedores
			boolean isValid = con.isValid(50000);
			System.out.println(isValid ? "TEST OK POSTGRESQL" : "TEST FAILED POSTGRESQL");
			
		}catch (ClassNotFoundException | SQLException ex){
			System.out.println("Error al conectar con la BD: " + ex.getMessage());
		}
		
	}

	public static Connection getCon() {
		
		if (con == null) {
			new Conexion();
		}
		return con;
	}
	
	

}
