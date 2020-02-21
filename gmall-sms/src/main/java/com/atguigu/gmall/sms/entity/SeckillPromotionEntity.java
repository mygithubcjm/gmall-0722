package com.atguigu.gmall.sms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 秒杀活动
 * 
 * @author caojiaming
 * @email caojiaming@talkweb.com.cn
 * @date 2020-02-21 10:22:00
 */
@ApiModel
@Data
@TableName("sms_seckill_promotion")
public class SeckillPromotionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "id")
	private Long id;
	/**
	 * 活动标题
	 */
	@ApiModelProperty(name = "title",value = "活动标题")
	private String title;
	/**
	 * 开始日期
	 */
	@ApiModelProperty(name = "startTime",value = "开始日期")
	private Date startTime;
	/**
	 * 结束日期
	 */
	@ApiModelProperty(name = "endTime",value = "结束日期")
	private Date endTime;
	/**
	 * 上下线状态
	 */
	@ApiModelProperty(name = "status",value = "上下线状态")
	private Integer status;
	/**
	 * 创建时间
	 */
	@ApiModelProperty(name = "createTime",value = "创建时间")
	private Date createTime;
	/**
	 * 创建人
	 */
	@ApiModelProperty(name = "userId",value = "创建人")
	private Long userId;

}