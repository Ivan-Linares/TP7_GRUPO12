package dominio;

public class Seguros 
{
	private int ID;
	private String descripcion;
	private TipoSeguro tipoSeguro;
	private float costoContratacion;
	private float costoMaxAsegurado;
	
	public Seguros() {}
	
	public Seguros(int ide, String desc, TipoSeguro tiposeguro, float costCont, float costMaxAseg)
	{
		this.ID = ide;
		this.descripcion = desc;
		this.tipoSeguro = tiposeguro;
		this.costoContratacion = costCont;
		this.costoMaxAsegurado = costMaxAseg;
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

	public TipoSeguro getTipoSeguro() 
	{
		return tipoSeguro;
	}

	public void setTipoSeguro(TipoSeguro tipoSeguro) 
	{
		this.tipoSeguro = tipoSeguro;
	}

	public float getCostoContratacion() 
	{
		return costoContratacion;
	}

	public void setCostoContratacion(float costoContratacion)
	{
		this.costoContratacion = costoContratacion;
	}

	public float getCostoMaxAsegurado() {
		return costoMaxAsegurado;
	}

	public void setCostoMaxAsegurado(float costoMaxAsegurado) 
	{
		this.costoMaxAsegurado = costoMaxAsegurado;
	}

	@Override
	public String toString() 
	{
		return ID + " - " + descripcion + " - " + tipoSeguro + " - " + costoContratacion + " - " + costoMaxAsegurado;
	}
}
