package org.lxh.useradmin.test;

import java.util.Date;

import org.lxh.useradmin.factory.DAOFactory;
import org.lxh.useradmin.vo.User;

public class TestInsert {

	public static void main(String[] args) throws Exception {
		User user = new User();
		user.setName("���˻�");
		user.setSex("��");
		user.setBirthday(new Date());
		DAOFactory.getIUserDAOInstance().doCreate(user);
	}

}
