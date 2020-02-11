package com.oauthSSOClient.order.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableOAuth2Sso
@Configuration
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(WebSecurity web) throws Exception {
		//super.configure(web);
		web.ignoring().antMatchers("/bootstrap/**");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//super.configure(http);
		http.logout().logoutSuccessUrl("http://localhost:8080/logout")
        	.and()
        	.authorizeRequests()
        	.anyRequest().authenticated()
        	.and()
        	.csrf().disable();
	}
	
}
