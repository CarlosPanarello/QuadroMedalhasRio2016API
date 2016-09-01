package com.solucaoti.rio2016medalsapi.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;

import com.google.gson.Gson;
import com.solucaoti.rio2016medalsapi.Scrapping;
import com.solucaoti.rio2016medalsapi.model.MedalsResponseVO;
import com.solucaoti.rio2016medalsapi.model.MedalsVO;

@Path("/medalsbycountry")
public class MedalsByCountry {
	
	@GET
	@Produces("application/json; charset=UTF-8")
	public Response getMedalsBySport() throws JSONException {
		Gson gson = new Gson();
		
		Scrapping scrap = new Scrapping();
		List<MedalsVO> itens =  scrap.getListMedalsByCountry();
				
		MedalsResponseVO medals = new MedalsResponseVO(itens);
		
		String jsonInString = gson.toJson(itens);
		
		return Response.status(200).entity(jsonInString) .build();
	}

}
