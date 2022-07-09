package CL.UCN.Logic;

import CL.UCN.Domain.User;

public class UserList
{
	NodoUser first;
	
	public UserList()
	{
	}
	public User find(String userName)
        {
            NodoUser temp = first;
            while(temp!=null)
            {
                if(temp.getDat().getUserName().equals(userName))
                {
                    return temp.getDat();
                }
                temp  = temp.getNext();
            }
            return null;
        }
	public void addUser(User user)
	{
            NodoUser nodo = new NodoUser(user);
            if(first==null)
            {
                nodo.setNext(first);
		first = nodo;
            }else
            {
                first = nodo;
            }
		
	}
        public void setFirst(NodoUser first)
        {
            this.first=first;
        }
}
