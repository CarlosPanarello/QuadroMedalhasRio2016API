package com.solucaoti.rio2016medalsapi;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.solucaoti.rio2016medalsapi.model.MedalsCountryVO;
import com.solucaoti.rio2016medalsapi.model.MedalsSportVO;
import com.solucaoti.rio2016medalsapi.model.MedalsVO;

public class Scrapping {
	private static String HTTP_SPORTS = "https://www.rio2016.com/quadro-de-medalhas-esportes";
	private static String HTTP_COUNTRY = "https://www.rio2016.com/quadro-de-medalhas-paises";

	public List<MedalsVO> getListMedalsBySport(String id_country){
		List<MedalsVO> itens = new ArrayList<MedalsVO>();
		
		Document doc;
		try {
			doc = Jsoup.connect(HTTP_SPORTS).get();
			
			for (Element table : doc.select("table.table-medal-sports__table")) {
				String id_sport = "";
				String sport_name = "";
				//String sport_event = "";
				int gold = 0;
				int silver = 0;
				int bronze = 0;
				
				id_sport = table.id();
				
				for (Element row : table.select("thead")) {
					sport_name = row.text();
				}
				
				for (Element row : table.select("tbody")) {
					for(Element column: row.select("tr")){
						Elements e = column.select("td");
						//sport_event = e.get(0).text();
						
						if(!e.get(1).text().isEmpty() &&
								e.get(1).text().contains(id_country)){
							gold++;
						}
						
						if(!e.get(3).text().isEmpty() &&
								e.get(3).text().contains(id_country)){
							silver++;
						}
						
						if(!e.get(5).text().isEmpty() &&
							e.get(5).text().contains(id_country)){
							bronze++;
						}
					}
				}
				
				MedalsSportVO medalsSport = new MedalsSportVO();
				
				medalsSport.setBronze_count(bronze);
				medalsSport.setSilver_count(silver);
				medalsSport.setGold_count(gold);
				medalsSport.setId_country(id_country);
				medalsSport.setId_sport(id_sport);
				//medalsSport.setSport_event(sport_event);
				medalsSport.setSport_name(sport_name);
				
				if(gold > 0 || silver > 0 || bronze > 0){
					itens.add(medalsSport);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return itens;
	}
	
	public List<MedalsVO> getListMedalsByCountry(){
		List<MedalsVO> itens = new ArrayList<MedalsVO>();
		
		Document doc;
		try {
			doc = Jsoup.connect(HTTP_COUNTRY).get();
			
			for (Element tr : doc.select("tr.table-medal-countries__link-table")) {
				Elements e = tr.select("td");
				
				MedalsCountryVO medalsCountry = new MedalsCountryVO();
				
				medalsCountry.setPosition(e.get(0).text());
				medalsCountry.setId_country(e.get(1).text());
				medalsCountry.setName_country(e.get(2).text());
				medalsCountry.setGold_count(e.get(3).text());
				medalsCountry.setSilver_count(e.get(4).text());
				medalsCountry.setBronze_count(e.get(5).text());
				medalsCountry.setTotal_medals(e.get(6).text());
				
				itens.add(medalsCountry);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return itens;
	}
}
