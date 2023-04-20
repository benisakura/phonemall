package com.mall.phonemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.phonemall.product.entity.SpuInfoDescEntity;
import com.mall.phonemall.product.entity.SpuInfoEntity;
import com.mall.phonemall.product.vo.SpuSaveVo;

import java.util.Map;

/**
 * spu信息
 *
 * @author chp
 * @email 839550877@qq.com
 * @date 2023-03-16 20:13:13
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSpuInfo(SpuSaveVo vo);

    void saveBaseSpuInfo(SpuInfoEntity infoEntity);


    PageUtils queryPageByCondition(Map<String, Object> params);
}

