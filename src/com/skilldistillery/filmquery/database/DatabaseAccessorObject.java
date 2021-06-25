package com.skilldistillery.filmquery.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.skilldistillery.filmquery.entities.Actor;
import com.skilldistillery.filmquery.entities.Film;

public class DatabaseAccessorObject implements DatabaseAccessor {
	private static final String URL = "jdbc:mysql://localhost:3306/sdvid?useSSL=false";
	private String user = "student";
	private String pass = "student";

	static {
		try {
			Class.forName("com..mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Film findFilmById(int filmId) {
		Film film = null;
		try {
			Connection conn = DriverManager.getConnection(URL, user, pass);
			String sql = "SELECT id, title, description, release_year, language_id, rental_duration, ";
			sql += " rental_rate, length, replacement_cost, rating, special_features "
					+ " FROM film JOIN film_actor ON film.id = film_actor.film_id " + " WHERE actor_id = ?";
			 PreparedStatement stmt = conn.prepareStatement(sql);
			    stmt.setInt(1, filmId);
			    ResultSet rs = stmt.executeQuery();
			    while (rs.next()) {
			      filmId = rs.getInt(1);
			      String title = rs.getString(2);
			      String desc = rs.getString(3);
			      int releaseYear = rs.getShort(4);
			      int langId = rs.getInt(5);
			      int rentDur = rs.getInt(6);
			      double rate = rs.getDouble(7);
			      int length = rs.getInt(8);
			      double repCost = rs.getDouble(9);
			      String rating = rs.getString(10);
			      String features = rs.getString(11);
			      film = new Film(filmId, title, desc, releaseYear, langId,
			                           rentDur, rate, length, repCost, rating, features);
			      
			    }
			    rs.close();
			    stmt.close();
			    conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return film;
	}

	@Override
	public Actor findActorById(int actorId) {
		Actor actor = null;
		// ...
		String sql = "SELECT id, first_name, last_name FROM actor WHERE id = ?";
		Connection conn;
		try {
			conn = DriverManager.getConnection(URL, user, pass);
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, actorId);
			ResultSet actorResult = stmt.executeQuery();
			if (actorResult.next()) {
				actor = new Actor(actorId, sql, sql);
				actor.setActorId(actorResult.getInt(1));
				actor.setActorFname(actorResult.getString(2));
				actor.setActorLname(actorResult.getString(3));
				// actor.setFilms(findFilmsByActorId(actorId)); // An Actor has Films
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// ...
		return actor;
	}

	@Override
	public List<Actor> findActorsByFilmId(int filmId) {
		return null;
	}

}
