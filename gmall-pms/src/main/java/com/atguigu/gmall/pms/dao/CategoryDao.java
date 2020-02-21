package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author caojiaming
 * @email caojiaming@talkweb.com.cn
 * @date 2020-02-20 15:05:26
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
