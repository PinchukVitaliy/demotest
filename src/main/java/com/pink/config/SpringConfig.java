package com.pink.config;

import com.pink.dao.UserDao;
import com.pink.dao.UserDaoImp;
import com.pink.service.UserService;
import com.pink.service.UserServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
//@ComponentScan(basePackages = {"com.pink.service", "com.pink.dao"})
public class SpringConfig {

   @Bean
    public JdbcTemplate getJdbcTemtlate(){
      return new JdbcTemplate(getDataSource());
   }
    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://den1.mysql1.gear.host:3306/javaeeproject?useSll=false");
        dataSource.setUsername("javaeeproject");
        dataSource.setPassword("Kn0tFjfN~!35");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return dataSource;
    }

    //можно определить таким образом @ComponentScan(basePackages = "com.pink.service") или
    //@ComponentScan(basePackages = {"com.pink.service", "com.pink.dao"}) если несколько
    @Bean
    public UserDao getUserDao(){
        return new UserDaoImp( getJdbcTemtlate());
    }

    @Bean
    public UserService getUserService(){
       return new UserServiceImp();
    }
}
