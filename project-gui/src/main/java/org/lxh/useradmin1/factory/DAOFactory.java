package org.lxh.useradmin1.factory;

import org.lxh.useradmin1.dao.IUserDAO;
import org.lxh.useradmin1.dao.impl.IUserDAOImpl;

public class DAOFactory {
    
    public static IUserDAO getIUserDAOInstance() {
        return new IUserDAOImpl();
    }
}
