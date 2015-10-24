package org.lxh.useradmin1.test;

import java.util.Date;

import org.lxh.useradmin1.factory.DAOFactory;
import org.lxh.useradmin1.vo.User;

public class TestUpdate {

	public static void main(String[] args) throws Exception {
		User user = new User();
		user.setName("����");
		user.setSex("Ů");
		user.setId(2) ;
		user.setBirthday(new Date());
		DAOFactory.getIUserDAOInstance().doUpdate(user);
	}

}
