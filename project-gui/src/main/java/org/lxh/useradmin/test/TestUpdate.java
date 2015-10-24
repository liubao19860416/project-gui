package org.lxh.useradmin.test;

import java.util.Date;

import org.lxh.useradmin.factory.DAOFactory;
import org.lxh.useradmin.vo.User;

public class TestUpdate {

	public static void main(String[] args) throws Exception {
		User user = new User();
		user.setName("ÕÅÐÄ");
		user.setSex("Å®");
		user.setId(2) ;
		user.setBirthday(new Date());
		DAOFactory.getIUserDAOInstance().doUpdate(user);
	}

}
