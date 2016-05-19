package com.coolweather.app.model;

/**
 * Created by LG on 2016/5/19 0019.
 */
public class Province {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	private int id;
	private String provinceName;
	private String provinceCode;
}
