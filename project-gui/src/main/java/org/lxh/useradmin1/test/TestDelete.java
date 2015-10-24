package org.lxh.useradmin1.test;

import org.lxh.useradmin1.factory.DAOFactory;

public class TestDelete {

	public static void main(String[] args) throws Exception {
		DAOFactory.getIUserDAOInstance().doDelete(2);
	}

}
