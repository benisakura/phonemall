package com.mall.phonemall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mall.phonemall.product.entity.BrandEntity;
import com.mall.phonemall.product.service.BrandService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PhonemallProductApplicationTests {

	@Autowired
	BrandService brandService;
	@Test
	public void contextLoads() {
//		BrandEntity brandEntity = new BrandEntity();
//		brandEntity.setBrandId(18L);
//		brandEntity.setDescript("华为");
//		brandEntity.setName("荣耀");
//		brandService.save(brandEntity);
//		System.out.println("保存成功.....");
//		brandService.updateById(brandEntity);
		List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 18L));
		list.forEach((item)->{
			System.out.println(item);
		});
	}
}
