package com.mall.phonemall.product.dao;

import com.alibaba.nacos.client.utils.JSONUtils;
import com.mall.phonemall.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 品牌分类关联
 * 
 * @author chp
 * @email 839550877@qq.com
 * @date 2023-03-16 20:13:13
 */

@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {

    void updateCategory(@Param("catId") Long catId,@Param("name") String name);

}
