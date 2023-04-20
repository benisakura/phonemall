package com.mall.phonemall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.phonemall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author chp
 * @email 839550877@qq.com
 * @date 2023-03-16 22:30:29
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

