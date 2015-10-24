package org.lxh.useradmin.dao;

import java.util.List;

import org.lxh.useradmin.vo.User;

public interface IUserDAO {
	/**
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public boolean doCreate(User user) throws Exception;

	public boolean doUpdate(User user) throws Exception;

	/**
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public boolean doDelete(int id) throws Exception;

	/**
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public User findById(int id) throws Exception;

	/**
	 * @param keyWord
	 * @return
	 * @throws Exception
	 */
	public List<User> findAll(String keyWord) throws Exception;
}
