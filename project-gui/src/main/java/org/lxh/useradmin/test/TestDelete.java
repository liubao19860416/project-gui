package org.lxh.useradmin.test;

import org.lxh.useradmin.factory.DAOFactory;

public class TestDelete {

	public static void main(String[] args) throws Exception {
		DAOFactory.getIUserDAOInstance().doDelete(2);
	}

}
