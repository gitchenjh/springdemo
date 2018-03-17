package priv.chenjh.springdemo.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import priv.chenjh.springdemo.dao.DAO;
import priv.chenjh.springdemo.dao.IUserDao;
import priv.chenjh.springdemo.entity.User;

@Repository
public class UserDao implements IUserDao {
	
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public User selectByPrimaryKey(Integer id) {
		User user = new User();
		String sql = "select id, name, address, sex from user where id = ?";
		Connection conn;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DAO.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
	        while (rs.next()) {
	        	user.setId(rs.getInt("id"));
	        	user.setName(rs.getString("name"));
	        	user.setAddress(rs.getString("address"));
	        	user.setSex(rs.getString("sex"));
	        }
		} catch (SQLException e) {
			e.printStackTrace();
		} 
        return user;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
