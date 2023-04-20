package com.mall.phonemall.product.vo;

import lombok.Data;

@Data
public class AttrRespVo extends AttrVo{

   //分类分组的名字
   private String catelogName;
   private String groupName;


   private Long[] catelogPath;
}
