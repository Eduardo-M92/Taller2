package CL.UCN.Domain;

import CL.UCN.Logic.FakeStoreSystem;
import CL.UCN.Logic.UserList;
import Win.Interface;

public class FakeStoreSystemImpl implements FakeStoreSystem
{
    UserList userList = new UserList();
    @Override
    public boolean login(String userName, String pass) {
        User tempUser = userList.find(userName);
        if(tempUser!=null)
        {
            if(tempUser.getPassword().equals(pass))
        {
            return true;
        }
        else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    @Override
    public boolean register(String userName, String fName, String mail, String phone, String password)
    {
        User user = new User(userName, fName, mail, phone, password);
        userList.addUser(user);
        System.out.println("Registradoooo");
        return true;
    }
}
