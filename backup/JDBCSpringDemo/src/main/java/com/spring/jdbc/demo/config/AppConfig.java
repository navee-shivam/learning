package com.spring.jdbc.demo.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.demo.dao.StudentDao;
import com.spring.jdbc.demo.dao.StudentDaoImpl;
import com.spring.jdbc.demo.service.StudentService;
import com.spring.jdbc.demo.service.StudentServiceImpl;

@Configuration
@ComponentScan
// @PropertySources({ @PropertySource("classpath:ds/datasource-cfg.properties")
// })
public class AppConfig {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/student");
		dataSource.setUsername("root");
		dataSource.setPassword("9909");
		return dataSource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource());
		return jdbcTemplate;
	}

	@Bean
	public StudentDao studentDao() {
		return new StudentDaoImpl(jdbcTemplate());
	}

	@Bean
	public StudentService studentService() {
		return new StudentServiceImpl(studentDao());
	}

}
