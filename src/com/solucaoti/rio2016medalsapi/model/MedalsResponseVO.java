package com.solucaoti.rio2016medalsapi.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class MedalsResponseVO {

	private List<MedalsVO> medals;
	
	private String timestamp;
	
	public MedalsResponseVO(List<MedalsVO> medals) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		timestamp = sdf.format(new Date());
		this.medals = medals;
	}

	public List<MedalsVO> getMedals() {
		return medals;
	}

	public void setMedals(List<MedalsVO> medals) {
		this.medals = medals;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
}
