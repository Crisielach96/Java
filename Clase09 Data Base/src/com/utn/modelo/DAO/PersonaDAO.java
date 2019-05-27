package com.utn.modelo.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.utn.modelo.conexion.Conexion;
import com.utn.modelo.conexion.PersonaVO;

/*El patron DAO - Data Acces Object
 * basicamnete este patron consiste en que centralicemos todos los procesos de acceso a nuestra base de datos
 * 
 * evitando de esta manera inconsistencias y posibles problemas cuando se realice modificaciones de tipo update, read, delete, create
 * 
 * 
 * */

public class PersonaDAO {

	public void registrarPersona(PersonaVO miPersona) {
		Conexion conn = new Conexion();
		try {
			Statement estatuto = conn.getConecction().createStatement();
			estatuto.executeUpdate("INSERT INTO persona VALUES ('" + miPersona.getIdP() + "','" + miPersona.getNombreP()
					+ "','" + miPersona.getEdadP() + "','" + miPersona.getProfesionP() + "','"
					+ miPersona.getTelefonoP() + "')");
			System.out.println("Se registro la persona");
			estatuto.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se registro la persona", "INFORMACION",
					JOptionPane.INFORMATION_MESSAGE);
			System.out.println("No se pudo registrar en la base persona");
		} finally {
			conn.desconectar();
		}
	}

	public PersonaVO buscarPersona(int codigo) {
		Conexion conn = new Conexion();
		boolean existe = false;
		PersonaVO p1 = new PersonaVO();
		try {
			PreparedStatement consulta = conn.getConecction().prepareStatement("SELECT * FROM persona where id = ?");
			consulta.setInt(1, codigo);
			ResultSet res = consulta.executeQuery();
			while (res.next()) {
				existe = true;
				p1.setIdP(Integer.parseInt(res.getString("id")));
				p1.setNombreP((res.getString("nombre")));
				p1.setEdadP(Integer.parseInt(res.getString("edad")));
				p1.setProfesionP((res.getString("profesion")));
				p1.setTelefonoP(Integer.parseInt(res.getString("telefono")));
			}
			res.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "Error no se econecto a la DB persona");
		} finally {
			conn.desconectar();
		}

		if (existe) {
			return p1;
		} else {
			return null;
		}
	}

	public void eliminarPersona(int codigo) {
		Conexion conn = new Conexion();
		try {
			Statement estatuto = conn.getConecction().createStatement();
			estatuto.executeUpdate("DELETE FROM persona WHERE id='" + codigo + "'");
			System.out.println("Se pudo eliminar correctamente");
			estatuto.close();
		} catch (SQLException e) {
			System.out.println("No se pudo eliminar");
		} finally {
			conn.desconectar();
		}
	}

	public void modificarPersona(PersonaVO miPersona) {
		Conexion conn = new Conexion();

		try {
			String consulta = "UPDATE persona SET  id=?,nombre=?,edad=?,profesion=?,telefono=? WHERE id=?";
			PreparedStatement estatuto = conn.getConecction().prepareStatement(consulta);

			estatuto.setInt(1, miPersona.getIdP());
			estatuto.setString(2, miPersona.getNombreP());
			estatuto.setInt(3, miPersona.getEdadP());
			estatuto.setString(4, miPersona.getProfesionP());
			estatuto.setInt(5, miPersona.getTelefonoP());
			estatuto.setInt(6, miPersona.getIdP());

			estatuto.executeUpdate();
			System.out.println("Se modifico correctamente los datos de la persona.");
		} catch (SQLException e) {
			System.out.println("No se pudo modificar los datos.");
		} finally {
			conn.desconectar();
		}
	}

}
