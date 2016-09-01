package com.solucaoti.rio2016medalsapi.model;

public class MedalsSportVO extends MedalsVO {

	private String id_sport;
	private String sport_name;

	public int getBronze_count() {
		return bronze_count;
	}
	public void setBronze_count(int bronze_count) {
		this.bronze_count = bronze_count;
	}
	public int getSilver_count() {
		return silver_count;
	}
	public void setSilver_count(int silver_count) {
		this.silver_count = silver_count;
	}
	public int getGold_count() {
		return gold_count;
	}
	public void setGold_count(int gold_count) {
		this.gold_count = gold_count;
	}
	public String getId_sport() {
		return id_sport;
	}
	public void setId_sport(String id_sport) {
		this.id_sport = id_sport;
	}
	public String getSport_name() {
		return sport_name;
	}
	public void setSport_name(String sport_name) {
		this.sport_name = sport_name;
	}
	public String getId_country() {
		return id_country;
	}
	public void setId_country(String id_country) {
		this.id_country = id_country;
	}
	
	@Override
	public String toString() {
		return "MedalsSportVO [bronze_count=" + bronze_count + ", silver_count=" + silver_count + ", gold_count="
				+ gold_count + ", id_sport=" + id_sport + ", sport_name=" + sport_name + ", id_country=" + id_country
				+ "]";
	}
	
}
