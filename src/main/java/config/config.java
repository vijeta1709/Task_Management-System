
	package config;

	import javax.sql.DataSource;

	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.ComponentScan;
	import org.springframework.context.annotation.Configuration;
	import org.springframework.jdbc.core.JdbcTemplate;
	import org.springframework.jdbc.datasource.DriverManagerDataSource;

	@Configuration
	@ComponentScan({ "Dao", "Service" })
	public class config {
		@Bean
		public DataSource getDataSource() {
			DriverManagerDataSource source = new DriverManagerDataSource();
			source.setDriverClassName("com.mysql.cj.jdbc.Driver");
			source.setUrl("jdbc:mysql://localhost:3306/tasksystemspringboot");
			source.setUsername("root");
			source.setPassword("Vijeta@1234");
			return source;
		}

		@Bean
		public JdbcTemplate getJdbcTemplate() {
			return new JdbcTemplate(getDataSource());
		}
	}




