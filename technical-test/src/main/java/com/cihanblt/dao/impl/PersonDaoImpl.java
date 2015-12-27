package com.cihanblt.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cihanblt.dao.PersonDao;
import com.cihanblt.models.Person;

@Repository
public class PersonDaoImpl implements PersonDao{
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate = new JdbcTemplate();
	{
		jdbcTemplate.setDataSource(dataSource);
	}
	
	public void addPerson(){
		
	}
	public List<Person> getAllPerson(){
		return null;
	}
	public Person getOnePerson(long record_id){
		String sql = "select * from person where record_id = ?";
		Person person = (Person)jdbcTemplate.queryForObject(sql,new Object[]{record_id}, new PersonMapper());
		return person;
	}
	
	private final static class PersonMapper implements RowMapper<Person>{

		@Override
		public Person mapRow(ResultSet rs, int arg1) throws SQLException {
			Person person = new Person();
			person.setId(rs.getLong("record_id"));
			person.setName(rs.getString("name"));
			person.setAge(rs.getInt("age"));
			return person;
		}
		
	}
}
