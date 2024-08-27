package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.YouqingxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YouqingxinxiView;


/**
 * 友情信息
 *
 * @author 
 * @email 
 * @date 2024-03-25 21:02:17
 */
public interface YouqingxinxiService extends IService<YouqingxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YouqingxinxiView> selectListView(Wrapper<YouqingxinxiEntity> wrapper);
   	
   	YouqingxinxiView selectView(@Param("ew") Wrapper<YouqingxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YouqingxinxiEntity> wrapper);
   	

}

