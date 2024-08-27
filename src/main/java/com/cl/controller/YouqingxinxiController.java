package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.YouqingxinxiEntity;
import com.cl.entity.view.YouqingxinxiView;

import com.cl.service.YouqingxinxiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;
import com.cl.service.StoreupService;
import com.cl.entity.StoreupEntity;

/**
 * 友情信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-25 21:02:17
 */
@RestController
@RequestMapping("/youqingxinxi")
public class YouqingxinxiController {
    @Autowired
    private YouqingxinxiService youqingxinxiService;

    @Autowired
    private StoreupService storeupService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YouqingxinxiEntity youqingxinxi,
		HttpServletRequest request){
        EntityWrapper<YouqingxinxiEntity> ew = new EntityWrapper<YouqingxinxiEntity>();

		PageUtils page = youqingxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, youqingxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YouqingxinxiEntity youqingxinxi, 
		HttpServletRequest request){
        EntityWrapper<YouqingxinxiEntity> ew = new EntityWrapper<YouqingxinxiEntity>();

		PageUtils page = youqingxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, youqingxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YouqingxinxiEntity youqingxinxi){
       	EntityWrapper<YouqingxinxiEntity> ew = new EntityWrapper<YouqingxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( youqingxinxi, "youqingxinxi")); 
        return R.ok().put("data", youqingxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YouqingxinxiEntity youqingxinxi){
        EntityWrapper< YouqingxinxiEntity> ew = new EntityWrapper< YouqingxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( youqingxinxi, "youqingxinxi")); 
		YouqingxinxiView youqingxinxiView =  youqingxinxiService.selectView(ew);
		return R.ok("查询友情信息成功").put("data", youqingxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YouqingxinxiEntity youqingxinxi = youqingxinxiService.selectById(id);
		youqingxinxi = youqingxinxiService.selectView(new EntityWrapper<YouqingxinxiEntity>().eq("id", id));
        return R.ok().put("data", youqingxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YouqingxinxiEntity youqingxinxi = youqingxinxiService.selectById(id);
		youqingxinxi = youqingxinxiService.selectView(new EntityWrapper<YouqingxinxiEntity>().eq("id", id));
        return R.ok().put("data", youqingxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YouqingxinxiEntity youqingxinxi, HttpServletRequest request){
    	youqingxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(youqingxinxi);
        youqingxinxiService.insert(youqingxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YouqingxinxiEntity youqingxinxi, HttpServletRequest request){
    	youqingxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(youqingxinxi);
    	youqingxinxi.setUserid((Long)request.getSession().getAttribute("userId"));
        youqingxinxiService.insert(youqingxinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YouqingxinxiEntity youqingxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(youqingxinxi);
        youqingxinxiService.updateById(youqingxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        youqingxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
