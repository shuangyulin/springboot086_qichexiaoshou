package com.entity.vo;

import com.entity.WeixiucailiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 维修材料
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-26 11:54:44
 */
public class WeixiucailiaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 材料分类
	 */
	
	private String cailiaofenlei;
		
	/**
	 * 规格
	 */
	
	private String guige;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 材料介绍
	 */
	
	private String cailiaojieshao;
				
	
	/**
	 * 设置：材料分类
	 */
	 
	public void setCailiaofenlei(String cailiaofenlei) {
		this.cailiaofenlei = cailiaofenlei;
	}
	
	/**
	 * 获取：材料分类
	 */
	public String getCailiaofenlei() {
		return cailiaofenlei;
	}
				
	
	/**
	 * 设置：规格
	 */
	 
	public void setGuige(String guige) {
		this.guige = guige;
	}
	
	/**
	 * 获取：规格
	 */
	public String getGuige() {
		return guige;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：材料介绍
	 */
	 
	public void setCailiaojieshao(String cailiaojieshao) {
		this.cailiaojieshao = cailiaojieshao;
	}
	
	/**
	 * 获取：材料介绍
	 */
	public String getCailiaojieshao() {
		return cailiaojieshao;
	}
			
}
