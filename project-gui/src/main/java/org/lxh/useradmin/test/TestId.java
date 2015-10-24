package org.lxh.useradmin.test;

import org.lxh.useradmin.factory.DAOFactory;
import org.lxh.useradmin.vo.User;

public class TestId {

	public static void main(String[] args) throws Exception {
		User user = DAOFactory.getIUserDAOInstance().findById(1) ;
		System.out.println(user);
		
	}

}
