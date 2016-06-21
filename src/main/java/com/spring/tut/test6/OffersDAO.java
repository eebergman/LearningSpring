package com.spring.tut.test6;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component("offersDAO")
public class OffersDAO {

	private JdbcTemplate jdbc;

	// this is a setter for the JbdcTemplate
	@Autowired
	public void setDataSource(DataSource jdbc) {
		this.jdbc = new JdbcTemplate(jdbc);
	}

	public List<Offer> getOffers() {

		return jdbc.query("SELECT * FROM `learning_spring`.`offers`", new RowMapper<Offer>() {

			public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Offer offer = new Offer();

				offer.setId(rs.getInt("id"));
				offer.setName(rs.getString("name"));
				offer.setEmail(rs.getString("email"));
				offer.setText(rs.getString("text"));

				return offer;
			}
		});
	}

}
