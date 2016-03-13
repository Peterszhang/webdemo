package chapter16.dao.interfaces;

import chapter16.model.*;

public interface UserDAO
{
    public boolean validateUser(User user) throws Exception;
    public void addUser(User user) throws Exception;    
}
