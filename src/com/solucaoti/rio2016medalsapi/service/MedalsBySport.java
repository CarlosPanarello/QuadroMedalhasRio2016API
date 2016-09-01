package com.solucaoti.rio2016medalsapi.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import com.google.gson.Gson;
import com.solucaoti.rio2016medalsapi.Scrapping;
import com.solucaoti.rio2016medalsapi.model.MedalsResponseVO;
import com.solucaoti.rio2016medalsapi.model.MedalsVO;

@Path("/medalsbysport")
public class MedalsBySport {

	@Path("{id}")
	@GET
	@Produces("application/json; charset=UTF-8")
	public Response convertFtoCfromInput(@PathParam("id") String id) throws JSONException {
		Gson gson = new Gson();
		
		Scrapping scrap = new Scrapping();
		List<MedalsVO> itens =  scrap.getListMedalsBySport(id);
		
		MedalsResponseVO medals = new MedalsResponseVO(itens);
		
		String jsonInString = gson.toJson(itens);
		
		return Response.status(200).entity(jsonInString) .build();
	}
}
