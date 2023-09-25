package Interfaz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class AñadirUsuario {
	public void agregarUsuario(String Usuario , String Contraseña, String correoElectronico, String Nombre, String Apellidos) {
		Conexion conexion = new Conexion();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {
			cn = conexion.conectar();
			PreparedStatement stm2 = cn.prepareStatement("INSERT INTO usuarios(Usuario,Contraseña,CorreoElectrónico,Nombre,Apellidos) VALUES (?,?,?,?,?)");
			stm2.setString(1 , Usuario);
			stm2.setString(2 , Contraseña);
			stm2.setString(3 , correoElectronico);
			stm2.setString(4, Nombre);
			stm2.setString(5, Apellidos);
			
			stm2.executeUpdate();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
			
		} finally {
			try {
				if (rs!= null) {
					rs.close();
				}
				
				if (stm != null) {
					stm.close();
				}
				
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
