package org.lxh.useradmin.dao.proxy;

import java.util.List;

import org.lxh.useradmin.dao.IUserDAO;
import org.lxh.useradmin.dao.impl.IUserDAOImpl;
import org.lxh.useradmin.dbc.DataBaseConnection;
import org.lxh.useradmin.vo.User;

public class IUserDAOProxy implements IUserDAO {
    private DataBaseConnection dbc = null;
    private IUserDAO dao = null;

    public IUserDAOProxy() {
        this.dbc = new DataBaseConnection();
        this.dao = new IUserDAOImpl(this.dbc.getConnection());
    }

    @Override
    public boolean doCreate(User user) throws Exception {
        boolean flag = true;
        try {
            flag = this.dao.doCreate(user);
        } catch (Exception e) {
            throw e;
        } finally {
            this.dbc.close();
        }
        return flag;
    }

    @Override
    public boolean doDelete(int id) throws Exception {
        boolean flag = true;
        try {
            flag = this.dao.doDelete(id);
        } catch (Exception e) {
            throw e;
        } finally {
            this.dbc.close();
        }
        return flag;
    }

    @Override
    public boolean doUpdate(User user) throws Exception {
        boolean flag = true;
        try {
            flag = this.dao.doUpdate(user);
        } catch (Exception e) {
            throw e;
        } finally {
            this.dbc.close();
        }
        return flag;
    }

    @Override
    public List<User> findAll(String keyWord) throws Exception {
        List<User> all = null;
        try {
            all = this.dao.findAll(keyWord);
        } catch (Exception e) {
            throw e;
        } finally {
            this.dbc.close();
        }
        return all;
    }

    @Override
    public User findById(int id) throws Exception {
        User user = null;
        try {
            user = this.dao.findById(id);
        } catch (Exception e) {
            throw e;
        } finally {
            this.dbc.close();
        }
        return user;
    }

}
