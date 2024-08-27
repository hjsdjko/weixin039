package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 友情信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-25 21:02:17
 */
@TableName("youqingxinxi")
public class YouqingxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YouqingxinxiEntity() {
		
	}
	
	public YouqingxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 链接名称
	 */
					
	private String lianjiemingcheng;
	
	/**
	 * 友情链接图
	 */
					
	private String youqinglianjietu;
	
	/**
	 * 链接名
	 */
					
	private String lianjieming;
	
	/**
	 * 显示顺序
	 */
					
	private Integer xianshishunxu;
	
	/**
	 * 创建时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date chuangjianshijian;
	
	/**
	 * 更新时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date gengxinshijian;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	/**
	 * 收藏数量
	 */
					
	private Integer storeupnum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：链接名称
	 */
	public void setLianjiemingcheng(String lianjiemingcheng) {
		this.lianjiemingcheng = lianjiemingcheng;
	}
	/**
	 * 获取：链接名称
	 */
	public String getLianjiemingcheng() {
		return lianjiemingcheng;
	}
	/**
	 * 设置：友情链接图
	 */
	public void setYouqinglianjietu(String youqinglianjietu) {
		this.youqinglianjietu = youqinglianjietu;
	}
	/**
	 * 获取：友情链接图
	 */
	public String getYouqinglianjietu() {
		return youqinglianjietu;
	}
	/**
	 * 设置：链接名
	 */
	public void setLianjieming(String lianjieming) {
		this.lianjieming = lianjieming;
	}
	/**
	 * 获取：链接名
	 */
	public String getLianjieming() {
		return lianjieming;
	}
	/**
	 * 设置：显示顺序
	 */
	public void setXianshishunxu(Integer xianshishunxu) {
		this.xianshishunxu = xianshishunxu;
	}
	/**
	 * 获取：显示顺序
	 */
	public Integer getXianshishunxu() {
		return xianshishunxu;
	}
	/**
	 * 设置：创建时间
	 */
	public void setChuangjianshijian(Date chuangjianshijian) {
		this.chuangjianshijian = chuangjianshijian;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getChuangjianshijian() {
		return chuangjianshijian;
	}
	/**
	 * 设置：更新时间
	 */
	public void setGengxinshijian(Date gengxinshijian) {
		this.gengxinshijian = gengxinshijian;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getGengxinshijian() {
		return gengxinshijian;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
	/**
	 * 设置：收藏数量
	 */
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	/**
	 * 获取：收藏数量
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}

}
