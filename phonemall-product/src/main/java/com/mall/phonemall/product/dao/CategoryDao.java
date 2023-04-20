package com.mall.phonemall.product.dao;

import com.mall.phonemall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chp
 * @email 839550877@qq.com
 * @date 2023-03-16 20:13:13
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
