package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


import dominio.Seguros;

public class SegurosDao {
	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "782782";
	private String dbName = "segurosgroup";

	
	public int UltimoID(){
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		
		int id=0;
		Connection conn = null;
		try
		{
			conn = DriverManager.getConnection(host + dbName, user, pass);
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery("select idseguro from seguros");
			
			while(rs.next())
			{
				Seguros segurosRs = new Seguros();
				segurosRs.setID(rs.getInt("idseguro"));
				
				id=segurosRs.getID();
			}
			
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return id;
	}
	
	
	public int eliminarSeguro(int id)
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
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
