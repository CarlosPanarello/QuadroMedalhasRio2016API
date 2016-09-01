package com.solucaoti.rio2016medalsapi.model;

public class MedalsCountryVO extends MedalsVO {
	
	private int total_medals;
	private int position;
	private String name_country;
	
	public int getTotal_medals() {
		return total_medals;
	}
	public void setTotal_medals(int total_medals) {
		this.total_medals = total_medals;
	}
	public void setTotal_medals(String total_medals) {
		try{
			this.total_medals = new Integer(total_medals);
		} catch (Exception e) {
			this.total_medals = 0;
		}
	}
	public int getBronze_count() {
		return bronze_count;
	}
	public void setBronze_count(int bronze_count) {
		this.bronze_count = bronze_count;
	}
	public void setBronze_count(String bronze_count) {
		try{
			this.bronze_count = new Integer(bronze_count);
		} catch (Exception e) {
			this.bronze_count = 0;
		}
	}
	public int getSilver_count() {
		return silver_count;
	}
	public void setSilver_count(int silver_count) {
		this.silver_count = silver_count;
	}
	public void setSilver_count(String silver_count) {
		try{
			this.silver_count = new Integer(silver_count);
		} catch (Exception e) {
			this.silver_count = 0;
		}
	}
	public int getGold_count() {
		return gold_count;
	}
	public void setGold_count(int gold_count) {
		this.gold_count = gold_count;
	}
	public void setGold_count(String gold_count) {
		try{
			this.gold_count = new Integer(gold_count);
		} catch (Exception e) {
			this.gold_count = 0;
		}
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public void setPosition(String position) {
		try{
			this.position = new Integer(position);
		} catch (Exception e) {
			this.position = 0;
		}
	}
	public String getId_country() {
		return id_country;
	}
	public void setId_country(String id_country) {
		this.id_country = id_country;
	}
	public String getName_country() {
		return name_country;
	}
	public void setName_country(String name_country) {
		this.name_country = name_country;
	}

	@Override
	public String toString() {
		return "MedalsCountryVO [total_medals=" + total_medals + ", bronze_count=" + bronze_count + ", silver_count="
				+ silver_count + ", gold_count=" + gold_count + ", position=" + position + ", id_country=" + id_country
				+ ", name_country=" + name_country + "]";
	}


}
