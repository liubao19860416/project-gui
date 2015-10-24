package org.lxh.useradmin1.test;

import java.util.Date;

import org.lxh.useradmin1.factory.DAOFactory;
import org.lxh.useradmin1.vo.User;

public class TestInsert {

	public static void main(String[] args) throws Exception {
		User user = new User();
		user.setName("���˻�");
		user.setSex("��");
		user.setBirthday(new Date());
		DAOFactory.getIUserDAOInstance().doCreate(user);
	}

}
