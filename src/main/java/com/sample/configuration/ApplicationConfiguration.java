package com.sample.configuration;

import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration // Tells it's a configuration file defining the spring beans
@EnableWebMvc // Enable the spring mvc mode
@ComponentScan(basePackages = { "com.sample" }) // same as component scan in xml configuration scans the package for annotated beans
//@PropertySource("classpath:app.properties") // Loads up the properties file
public class ApplicationConfiguration extends WebMvcConfigurerAdapter {

	/*
	 * PropertySourcesPlaceHolderConfigurer Bean only required for @Value("{}")
	 * annotations. Remove this bean if you are not using @Value annotations for
	 * injecting properties.
	 */
	@Bean
	public static PropertySourcesPlaceholderConfigurer placeHolderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	// This converter is needed to convert the responsebody to JSON message
	@Override
	public void configureMessageConverters(
			List<HttpMessageConverter<?>> converters) {
		converters.add(getJacksonHttpMessageConverter());
		super.configureMessageConverters(converters);
	}
	
	private MappingJacksonHttpMessageConverter getJacksonHttpMessageConverter(){
		MappingJacksonHttpMessageConverter converter = new MappingJacksonHttpMessageConverter();
		converter.setObjectMapper(new ObjectMapper());
		return converter;
	}
	
}
