package shop.ChootayBikes.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    UserDetailsService userDetailService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/home/admin").hasAnyRole("OWNER","MANAGER")
                .antMatchers("/home/user").hasAnyRole("OWNER","USER")
                .antMatchers("/bike/listbikes").hasAnyRole("OWNER","SALESPERSON")
                .antMatchers("/sale/").hasAnyRole("OWNER","SALESPERSON","MANAGER")
                .antMatchers("/customer/").hasAnyRole("OWNER","SALESPERSON","MANAGER")
                .antMatchers("/repair/").hasAnyRole("OWNER","MECHANIC")
                .antMatchers("/sparepart/").hasAnyRole("OWNER","MECHANIC")
                .antMatchers("/partused/").hasAnyRole("OWNER","MECHANIC")
                .antMatchers("/").permitAll()
                .and().formLogin();
    }

    @Bean
    public PasswordEncoder getPasswordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
}
