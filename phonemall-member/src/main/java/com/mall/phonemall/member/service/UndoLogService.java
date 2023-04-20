package com.mall.phonemall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.phonemall.member.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author chp
 * @email 839550877@qq.com
 * @date 2023-03-16 22:30:29
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

