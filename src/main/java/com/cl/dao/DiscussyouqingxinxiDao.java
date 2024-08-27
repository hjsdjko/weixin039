package com.cl.dao;

import com.cl.entity.DiscussyouqingxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussyouqingxinxiView;


/**
 * 友情信息评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-25 21:02:17
 */
public interface DiscussyouqingxinxiDao extends BaseMapper<DiscussyouqingxinxiEntity> {
	
	List<DiscussyouqingxinxiView> selectListView(@Param("ew") Wrapper<DiscussyouqingxinxiEntity> wrapper);

	List<DiscussyouqingxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyouqingxinxiEntity> wrapper);
	
	DiscussyouqingxinxiView selectView(@Param("ew") Wrapper<DiscussyouqingxinxiEntity> wrapper);
	

}
