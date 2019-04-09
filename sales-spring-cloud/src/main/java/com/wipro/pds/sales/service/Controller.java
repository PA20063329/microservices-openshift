package com.wipro.pds.sales.service;


import java.time.format.DateTimeFormatter;
import java.util.logging.Logger;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.sleuth.Tracer;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.pds.sales.model.Flight;
import com.wipro.pds.sales.model.Itinerary;

@RestController
public class Controller
{
	private static Logger logger = Logger.getLogger( Controller.class.getName() );
	private DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern( "yyyyMMdd" );

	//@Autowired
	//private Tracer tracer;

	@RequestMapping( value = "/price", method = RequestMethod.POST )
	public Itinerary price(@RequestBody Flight flight)
	{
		//tracer.addTag( "Operation", "Determine Price for a Flight" );
		logger.info( "Operation Determine Price for a Flight" );
		Itinerary itinerary = SalesTicketingService.price( flight );
		logger.info("Priced ticket at " + itinerary.getPrice() );
		return itinerary;
	}
	
	@RequestMapping( value = "/hello", method = RequestMethod.GET )
	public String price(@RequestParam(value="name", defaultValue="World") String name)
	{
		return "Hello World "+name;
	}
	
		
}