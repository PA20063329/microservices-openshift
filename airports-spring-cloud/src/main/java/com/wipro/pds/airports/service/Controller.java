package com.wipro.pds.airports.service;

import java.util.Collection;
import java.util.Locale;
import java.util.logging.Logger;

//import org.springframework.cloud.sleuth.Tracer;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.pds.airports.model.Airport;

@RestController
public class Controller
{
	//@Autowired
	//private Tracer tracer;
	private static Logger logger = Logger.getLogger( Controller.class.getName() );
	@RequestMapping( value = "/airports", method = RequestMethod.GET )
	public Collection<Airport> airports(@RequestParam( value = "filter", required = false ) String filter)
	{
		//tracer.addTag( "Operation", "Look Up Airports" );
		logger.info( "Operation Look Up Airports" );
		if( StringUtils.isEmpty( filter ) )
		{
			logger.info( "Operation Look Up Airports finished with empty filters" );
			return AirportsService.getAirports();
		}
		else
		{
			logger.info( "Operation Look Up Airports finished with filters" );
			return AirportsService.filter( filter );
		}
	}

	@RequestMapping( value = "/airports/{code}", method = RequestMethod.GET )
	public Airport getAirport(@PathVariable( "code" ) String code)
	{
		//tracer.addTag( "Operation", "Look Up Single Airport" );
		logger.info( "Operation Get an Airport" );
		return AirportsService.getAirport( code.toUpperCase( Locale.US ) );
	}
}