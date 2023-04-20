package com.mall.phonemall.product;






import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mall.phonemall.product.entity.BrandEntity;
import com.mall.phonemall.product.service.BrandService;

import com.mall.phonemall.product.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class PhonemallProductApplicationTests {

	@Autowired
	BrandService brandService;

	@Autowired
	CategoryService categoryService;

	@Test
	public void testfindPath(){
		Long[] catelogPath = categoryService.findcatelogPath(225L);
		log.info("完整路径:{}", Arrays.asList(catelogPath));
	}


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
