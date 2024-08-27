package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscussyouqingxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussyouqingxinxiView;


/**
 * 友情信息评论表
 *
 * @author 
 * @email 
 * @date 2024-03-25 21:02:17
 */
public interface DiscussyouqingxinxiService extends IService<DiscussyouqingxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyouqingxinxiView> selectListView(Wrapper<DiscussyouqingxinxiEntity> wrapper);
   	
   	DiscussyouqingxinxiView selectView(@Param("ew") Wrapper<DiscussyouqingxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyouqingxinxiEntity> wrapper);
   	

}

