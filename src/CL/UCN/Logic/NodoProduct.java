package CL.UCN.Logic;

import CL.UCN.Domain.Product;

public class NodoProduct
{
	private Product dat;
	private NodoProduct next;
	public NodoProduct(Product dat)
	{
		this.dat = dat;
	}
	
	public Product getDat()
	{
		return this.dat;
	}
	public NodoProduct getNext()
	{
		return this.next;
	}
}
