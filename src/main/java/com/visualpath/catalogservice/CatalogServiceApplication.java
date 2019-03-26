package com.visualpath.catalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;

@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableResourceServer
@EnableDiscoveryClient
public class CatalogServiceApplication {
	


	public static void main(String[] args) {
		SpringApplication.run(CatalogServiceApplication.class, args);
	}
	
	

	
	// allow to specify how to contact the token management services on the authorization server
    @Primary
	@Bean
    public RemoteTokenServices tokenServices() {
        RemoteTokenServices tokenServices = new RemoteTokenServices();
        // to validate token received
        tokenServices.setCheckTokenEndpointUrl("http://localhost:9191/uaa/oauth/check_token");
        //
        tokenServices.setClientId("user-service");
        tokenServices.setClientSecret("secret");
        return tokenServices;
    }

   /* @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/ecommerce");
        dataSource.setUsername("root");
        dataSource.setPassword("2023*Laddu");
        return dataSource;
    }*/
  /*  @Bean
    public JwtAccessTokenConverter accessTokenConverter() {
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
       // converter.setSigningKey("ganesh");
        return converter;
    }*/

   /* @Bean
    public TokenStore tokenStore() {
        return new JdbcTokenStore(dataSource()); 
    	// this way TokenStore will know how to connect to jdbc to look up the tokens
    	//return new JwtTokenStore(accessTokenConverter());
    }
*/
   
}


