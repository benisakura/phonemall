package com.mall.phonemall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.phonemall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author chp
 * @email 839550877@qq.com
 * @date 2023-03-17 20:43:40
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

