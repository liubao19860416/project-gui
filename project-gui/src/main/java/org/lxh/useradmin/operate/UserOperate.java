package org.lxh.useradmin.operate;

import java.util.Iterator;
import java.util.List;

import org.lxh.useradmin.factory.DAOFactory;
import org.lxh.useradmin.util.InputData;
import org.lxh.useradmin.vo.User;

public class UserOperate {
	public static void insert() {
		User user = new User();
		InputData input = new InputData();
		user.setName(input.getString("请输入姓名："));
		user.setSex(input.getString("请输入性别："));
		user.setBirthday(input.getDate("请输入生日：", "内容必须是日期（yyyy-mm-dd），"));
		try {
			DAOFactory.getIUserDAOInstance().doCreate(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void update() {
		InputData input = new InputData();
		int id = input.getInt("请输入要修改用户的编号：", "编号必须是数字，");
		User user = null;
		try {
			user = DAOFactory.getIUserDAOInstance().findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (user != null) {
			user.setName(input.getString("请输入姓名（原姓名：" + user.getName() + "）："));
			user.setSex(input.getString("请输入性别（原姓名：" + user.getSex() + "）："));
			user.setBirthday(input.getDate("请输入生日（原生日：" + user.getBirthday()
					+ "）：", "内容必须是日期（yyyy-mm-dd），"));
			try {
				DAOFactory.getIUserDAOInstance().doUpdate(user) ;
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("要查找的用户不存在！");
		}
	}

	public static void delete() {
		InputData input = new InputData();
		int id = input.getInt("请输入要删除的用户编号：", "编号必须是数字，");
		try {
			DAOFactory.getIUserDAOInstance().doDelete(id) ;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void findId() {
		InputData input = new InputData();
		int id = input.getInt("请输入要查询的编号：", "编号必须是数字，");
		User user = null;
		try {
			user = DAOFactory.getIUserDAOInstance().findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (user != null) {
			System.out.println(user);
		} else {
			System.out.println("要查找的用户不存在！");
		}
	}

	public static void findAll() {
		InputData input = new InputData();
		String keyWord = input.getString("请输入要查询的关键字：") ;
		List<User> allUser = null ;;
		try {
			allUser = DAOFactory.getIUserDAOInstance().findAll(keyWord);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Iterator<User> iter = allUser.iterator() ;
		while(iter.hasNext()){
			User user = iter.next() ;
			System.out.println(user);
		}
	}
}
