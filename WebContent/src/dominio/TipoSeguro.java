package dominio;

public class TipoSeguro 
{
	private int ID;
	private String descripcion;
		
	public TipoSeguro() 
	{
		super();
	}
	
	public TipoSeguro(int id, String desc)
	{
		super();
		this.ID = id;
		this.descripcion = desc;
	}

	public int getID()
	{
		return ID;
	}

	public void setID(int iD)
	{
		ID = iD;
	}

	public String getDescripcion()
	{
		return descripcion;
	}

	public void setDescripcion(String descripcion) 
	{
		this.descripcion = descripcion;
	}

	@Override
	public String toString()
	{
		return descripcion;
	}
}
