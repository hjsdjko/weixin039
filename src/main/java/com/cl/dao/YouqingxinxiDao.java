package com.cl.dao;

import com.cl.entity.YouqingxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YouqingxinxiView;


/**
 * 友情信息
 * 
 * @author 
 * @email 
 * @date 2024-03-25 21:02:17
 */
public interface YouqingxinxiDao extends BaseMapper<YouqingxinxiEntity> {
	
	List<YouqingxinxiView> selectListView(@Param("ew") Wrapper<YouqingxinxiEntity> wrapper);

	List<YouqingxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YouqingxinxiEntity> wrapper);
	
	YouqingxinxiView selectView(@Param("ew") Wrapper<YouqingxinxiEntity> wrapper);
	

}
