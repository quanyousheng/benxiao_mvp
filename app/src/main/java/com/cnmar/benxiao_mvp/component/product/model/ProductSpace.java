package com.cnmar.benxiao_mvp.component.product.model;

import com.alibaba.fastjson.annotation.JSONField;

import component.common.model.BaseModel;

/** 成品仓位 */
public class ProductSpace extends BaseModel {

	@JSONField(ordinal = 1)
	private String code; // 仓位
	@JSONField(serialize = false)
	private String qrcode; // 二维码相对路径

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getQrcode() {
		return qrcode;
	}

	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}

}
