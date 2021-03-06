package dev;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("web")
public class WebConfig extends WebMvcConfigurerAdapter{

	@Bean
	public ViewResolver viewResolver(){
		//配置JSP视图解析器
		InternalResourceViewResolver resolver = new InternalResourceViewResolver("/WEB-INF/views/",".jsp");
		resolver.setExposeContextBeansAsAttributes(true);
		
		return resolver;
	}
	
	//配置静态资源的处理
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
		configurer.enable();
	}
}
