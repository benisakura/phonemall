package com.mall.phonemall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.phonemall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author chp
 * @email 839550877@qq.com
 * @date 2023-03-16 22:43:28
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

