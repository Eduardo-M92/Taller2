package CL.UCN.Logic;

import CL.UCN.Domain.User;

public class NodoUser
{
	private User dat;
	private NodoUser next;
	public NodoUser(User dat)
	{
		this.dat = dat;
	}
	
	public User getDat()
	{
		return this.dat;
	}
	public NodoUser getNext()
	{
		return this.next;
	}
	public void setNext(NodoUser next)
	{
		this.next = next;
	}
}
