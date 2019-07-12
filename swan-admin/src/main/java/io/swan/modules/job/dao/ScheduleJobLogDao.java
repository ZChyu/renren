/**
 * Copyright (c) 2016-2019 SWAN开源 All rights reserved.
 *
 * https://www.swan.io
 *
 * 版权所有，侵权必究！
 */

package io.swan.modules.job.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.swan.modules.job.entity.ScheduleJobLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 *
 * @author Mark sunlightcs@gmail.com
 */
@Mapper
public interface ScheduleJobLogDao extends BaseMapper<ScheduleJobLogEntity> {
	
}
