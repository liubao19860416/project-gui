package org.lxh.useradmin1.test;

import org.lxh.useradmin1.factory.DAOFactory;
import org.lxh.useradmin1.vo.User;

public class TestId {

	public static void main(String[] args) throws Exception {
		User user = DAOFactory.getIUserDAOInstance().findById(1) ;
		System.out.println(user);
		
	}

}
