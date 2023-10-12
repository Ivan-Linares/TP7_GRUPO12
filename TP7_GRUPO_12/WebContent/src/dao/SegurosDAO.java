package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import dominio.Seguros;

public class SegurosDAO 
{
	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "root";
	private String dbName = "segurosgroup";

	public int eliminarSeguro(int id)
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		int filas = 0;
		Connection cn = null;
		try
		{
			cn = DriverManager.getConnection(host + dbName, user, pass);
			Statement st = cn.createStatement();
			String query = "delete from seguros where id=" + id;
			filas=st.executeUpdate(query);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return filas;
	}

	
	public int agregarSeguro(Seguros seguros)
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		int filas=0;
		Connection cn = null;
		
		try
		{
			cn = DriverManager.getConnection(host + dbName, user, pass);
			Statement st = cn.createStatement();
			String query = "Insert into seguros(idSeguro, descripcion, idTipo, costoContratacion, costoAsegurado) values ('"+seguros.getID()+"','"+seguros.getDescripcion()+"','"+seguros.getTipoSeguro()+"','"+seguros.getCostoContratacion()+"','"+seguros.getCostoMaxAsegurado()+"')";
			filas = st.executeUpdate(query);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return filas;
	}
}
