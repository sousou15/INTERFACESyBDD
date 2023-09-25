package Interfaz;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FilasT {
private JTable tablaUsuarios;
	
	public FilasT(JTable tablaUsuarios) {
		this.tablaUsuarios = tablaUsuarios;
	}
	
	public void cargarDatosTabla() {
	    try {
	        Conexion conexion = new Conexion();
	        Connection cn = conexion.conectar();
	        Statement stm = cn.createStatement();
	        ResultSet rs = stm.executeQuery("SELECT * FROM usuarios");

	        DefaultTableModel modelo = new DefaultTableModel();
	        modelo.addColumn("Usuario");
	        modelo.addColumn("Contraseña");
	        modelo.addColumn("CorreoElectrónico");
	        modelo.addColumn("Nombre");
	        modelo.addColumn("Apellidos");

	        while (rs.next()) {
	            Object[] fila = new Object[6];
	            fila[0] = rs.getString("Usuario");
	            fila[1] = rs.getString("Contraseña");
	            fila[2] = rs.getString("CorreoElectrónico");
	            fila[4] = rs.getInt("Nombre");
	            fila[5] = rs.getString("Apellidos");
	            modelo.addRow(fila);
	        }

	        tablaUsuarios.setModel(modelo);
	        rs.close();
	        cn.close();
	        stm.close();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
