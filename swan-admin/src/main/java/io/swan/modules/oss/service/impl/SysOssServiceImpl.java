/**
 * Copyright (c) 2016-2019 SWAN开源 All rights reserved.
 *
 * https://www.swan.io
 *
 * 版权所有，侵权必究！
 */

package io.swan.modules.oss.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.swan.common.utils.PageUtils;
import io.swan.common.utils.Query;
import io.swan.modules.oss.dao.SysOssDao;
import io.swan.modules.oss.entity.SysOssEntity;
import io.swan.modules.oss.service.SysOssService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("sysOssService")
public class SysOssServiceImpl extends ServiceImpl<SysOssDao, SysOssEntity> implements SysOssService {

	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		IPage<SysOssEntity> page = this.page(
			new Query<SysOssEntity>().getPage(params)
		);

		return new PageUtils(page);
	}
	
}
