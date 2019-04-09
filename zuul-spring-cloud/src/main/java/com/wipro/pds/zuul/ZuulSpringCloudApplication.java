package com.wipro.pds.zuul;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;


@SpringBootApplication
@EnableZuulProxy
public class ZuulSpringCloudApplication {
	private static Logger logger = Logger.getLogger( ZuulSpringCloudApplication.class.getName() );

	public static void main(String[] args)
	{
/*		List<Object> sources = new ArrayList<>();
		List<Class> sourcesClass = new ArrayList<>();
		//Class<Object> [] classes = new Class<Object> [10];
		
		sources.add( ZuulSpringCloudApplication.class );
		sourcesClass.add( ZuulSpringCloudApplication.class );
		try
		{
			for( Resource resource : new PathMatchingResourcePatternResolver().getResources( "file:/groovy/*.groovy" ) )
			{
				logger.info( "Found and will load groovy script " + resource.getFilename() );
				sources.add( resource );
				sourcesClass.add(Resource.class);
			}
			if( sources.size() == 1 )
			{
				logger.info( "No groovy script found under /groovy/*.groovy" );
			}
		}
		catch( IOException e )
		{
			logger.log( Level.WARNING, "Failed to query classpath for groovy scripts", e );
		}
		//SpringApplication.run( sources.toArray(), args );
	//	Class [] classes = sourcesClass.toArray();
		//TODO:I think this wont work
		SpringApplication.run(sourcesClass.toArray().getClass(), args );
		*/
		SpringApplication.run(ZuulSpringCloudApplication.class);
	}
}
