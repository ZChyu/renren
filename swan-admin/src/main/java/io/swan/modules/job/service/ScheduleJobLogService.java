/**
 * Copyright (c) 2016-2019 SWAN开源 All rights reserved.
 *
 * https://www.swan.io
 *
 * 版权所有，侵权必究！
 */

package io.swan.modules.job.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.swan.common.utils.PageUtils;
import io.swan.modules.job.entity.ScheduleJobLogEntity;

import java.util.Map;

/**
 * 定时任务日志
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {

	PageUtils queryPage(Map<String, Object> params);
	
}
