package dubbo.provider.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import dubbo.api.model.User;

@Repository
public class UserDao {
	
	@Autowired
	private JdbcTemplate JdbcTemplate;
	
	public User getUserByName(String name) {
		String sql = "select * from user_info where name=?";
		RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
		return JdbcTemplate.queryForObject(sql, new Object[]{name}, rowMapper);
	}
}
