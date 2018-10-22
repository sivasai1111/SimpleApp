package com.myproject.application;

import javax.servlet.ServletConfig;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.ServletConfigAware;

import com.myproject.Simple.App;

@Configuration
@ApplicationPath("rest")
public class JerseyConfig extends ResourceConfig  implements ServletConfigAware
{
   
    private ServletConfig servletConfig;
     
        public JerseyConfig()
    {
        	register(App.class);
    }
		public void setServletConfig(ServletConfig servletConfig) {

			 this.servletConfig = servletConfig;
			
		}
  
        
     
     
   
}