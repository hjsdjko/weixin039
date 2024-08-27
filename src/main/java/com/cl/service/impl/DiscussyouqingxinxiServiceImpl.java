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


import com.cl.dao.DiscussyouqingxinxiDao;
import com.cl.entity.DiscussyouqingxinxiEntity;
import com.cl.service.DiscussyouqingxinxiService;
import com.cl.entity.view.DiscussyouqingxinxiView;

@Service("discussyouqingxinxiService")
public class DiscussyouqingxinxiServiceImpl extends ServiceImpl<DiscussyouqingxinxiDao, DiscussyouqingxinxiEntity> implements DiscussyouqingxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyouqingxinxiEntity> page = this.selectPage(
                new Query<DiscussyouqingxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussyouqingxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyouqingxinxiEntity> wrapper) {
		  Page<DiscussyouqingxinxiView> page =new Query<DiscussyouqingxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscussyouqingxinxiView> selectListView(Wrapper<DiscussyouqingxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyouqingxinxiView selectView(Wrapper<DiscussyouqingxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
