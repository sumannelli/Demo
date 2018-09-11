package com.qezy;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
    private DataSource ds;

  /*  @Bean
    @ConfigurationProperties("spring.datasource")
    public DataSource ds() {
        return DataSourceBuilder.create().build();
    }*/
	   public DataSource getDs() {
				return ds;
			}

			public void setDs(DataSource ds) {
				this.ds = ds;
			}
	
	
	
	
			//@Resource(name = "userDetailService")
			private UserDetailsService userDetailsService;
	    // Spring Security Configurations Start 
	    @Autowired
	  
	    public void configureAMBuilder(AuthenticationManagerBuilder auth) throws Exception {
	        auth.jdbcAuthentication().dataSource(ds)
	            .authoritiesByUsernameQuery("select name, role FROM login where name=?")
	            .usersByUsernameQuery("select name,password, 1 FROM login where name=?").passwordEncoder(new BCryptPasswordEncoder() );
	    	/*
	    	//auth
            .userDetailsService(userDetailsService)
            .passwordEncoder(new BCryptPasswordEncoder());
	    	
	    }

	 

		@Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http
	            .httpBasic()
	            .and()
	            .authorizeRequests()
	            .anyRequest().authenticated();
	        http.csrf().disable();
	    }
	    /* Spring Security Configurations End */
	
}}