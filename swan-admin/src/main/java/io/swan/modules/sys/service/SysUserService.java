/**
 * Copyright (c) 2016-2019 SWAN开源 All rights reserved.
 *
 * https://www.swan.io
 *
 * 版权所有，侵权必究！
 */

package io.swan.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.swan.common.utils.PageUtils;
import io.swan.modules.sys.entity.SysUserEntity;

import java.util.List;
import java.util.Map;


/**
 * 系统用户
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface SysUserService extends IService<SysUserEntity> {

	PageUtils queryPage(Map<String, Object> params);
	
	/**
	 * 查询用户的所有菜单ID
	 */
	List<Long> queryAllMenuId(Long userId);
	
	/**
	 * 保存用户
	 */
	void saveUser(SysUserEntity user);
	
	/**
	 * 修改用户
	 */
	void update(SysUserEntity user);

	/**
	 * 修改密码
	 * @param userId       用户ID
	 * @param password     原密码
	 * @param newPassword  新密码
	 */
	boolean updatePassword(Long userId, String password, String newPassword);
}
