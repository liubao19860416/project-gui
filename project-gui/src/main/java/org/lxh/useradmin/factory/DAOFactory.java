package org.lxh.useradmin.factory;

import org.lxh.useradmin.dao.IUserDAO;
import org.lxh.useradmin.dao.proxy.IUserDAOProxy;

public class DAOFactory {
    public static IUserDAO getIUserDAOInstance() {
        return new IUserDAOProxy();
    }
}
