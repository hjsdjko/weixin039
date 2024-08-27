package com.cl.entity.view;

import com.cl.entity.DiscussyouqingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 友情信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-25 21:02:17
 */
@TableName("discussyouqingxinxi")
public class DiscussyouqingxinxiView  extends DiscussyouqingxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussyouqingxinxiView(){
	}
 
 	public DiscussyouqingxinxiView(DiscussyouqingxinxiEntity discussyouqingxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussyouqingxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
