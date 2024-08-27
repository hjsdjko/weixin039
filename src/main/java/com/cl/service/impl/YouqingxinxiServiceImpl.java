package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.YouqingxinxiDao;
import com.cl.entity.YouqingxinxiEntity;
import com.cl.service.YouqingxinxiService;
import com.cl.entity.view.YouqingxinxiView;

@Service("youqingxinxiService")
public class YouqingxinxiServiceImpl extends ServiceImpl<YouqingxinxiDao, YouqingxinxiEntity> implements YouqingxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YouqingxinxiEntity> page = this.selectPage(
                new Query<YouqingxinxiEntity>(params).getPage(),
                new EntityWrapper<YouqingxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YouqingxinxiEntity> wrapper) {
		  Page<YouqingxinxiView> page =new Query<YouqingxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<YouqingxinxiView> selectListView(Wrapper<YouqingxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YouqingxinxiView selectView(Wrapper<YouqingxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
