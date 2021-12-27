package com.bookmyaction.tickettakie.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@Order(1)
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class BookMyActionSecurityConfig extends WebSecurityConfigurerAdapter  {
	

	@Override
    protected void configure(AuthenticationManagerBuilder auth) 
      throws Exception {
        auth.inMemoryAuthentication()
          .withUser("spring")
          .password("secret")
          .roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
          .antMatchers("/rest/bookmyaction/**")
          .authenticated()
          .antMatchers("/rest/myadmin/**")
          .permitAll()
          .and()
          .httpBasic();
    }
	private static final String[] IGNORED_URLS = {
            "/v2/api-docs/**",
            "/swagger-resources/**",
            "/swagger-ui.html**",
            "/webjars/**"
    };
	
	public void preConfigure(HttpSecurity http) throws Exception {
		
//    	http.authorizeRequests().antMatchers("/rest/**").permitAll();
		http.addFilterAfter(new Filter() {
			
			@Override
			public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
					throws IOException, ServletException {
				
			}
		}, UsernamePasswordAuthenticationFilter.class);
	}
	
	   @Override				
	    public void configure(WebSecurity web) throws Exception {
	        web.ignoring().antMatchers(IGNORED_URLS);
	        super.configure(web);
	    }

}
