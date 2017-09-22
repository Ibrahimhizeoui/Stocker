package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class StockerSecurityConfig extends WebSecurityConfigurerAdapter  {
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	  auth.inMemoryAuthentication().withUser("mkyong").password("123456").roles("USER");
	  auth.inMemoryAuthentication().withUser("admin").password("123456").roles("ADMIN");
	  auth.inMemoryAuthentication().withUser("dba").password("123456").roles("DBA");
	}
 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
        .authorizeRequests()
        .antMatchers("/").anonymous()
        .antMatchers("/login*").anonymous()
        .anyRequest().authenticated()
        .and()
        .formLogin()
        .loginPage("/login")
        .and()
        .logout().logoutSuccessUrl("/login.html");
          
    }
    @Override
    public void configure(WebSecurity http) throws Exception {
    	http.ignoring().antMatchers("/WEB-INF/resources/**").anyRequest();
    }
    

}
