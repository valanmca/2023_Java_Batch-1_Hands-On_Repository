package com.mms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import com.mms.bean.Movies;
import com.mms.util.DBUtill;

public class MoviesDAO {

	public int insertMovie(Movies bean) {
		int n1 = 0;
		try {

			Connection con = DBUtill.getDBConnection();
			String sql = "insert into movies_details values (?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, bean.getMovie_Id());
			ps.setString(2, bean.getMovie_Name());
			ps.setString(3, bean.getMovie_Type());
			ps.setString(4, bean.getMovie_Language());
			ps.setString(5, bean.getMovie_Duration());
			n1 = ps.executeUpdate();

		} catch (Exception e) {

			System.out.println(e);
		}

		return n1;
	}

	public int deleteMovie(int Movie_Id) {
		int n2 = 0;

		try {

			Connection con = DBUtill.getDBConnection();
			String sql = "delete from Movies_Details where Movie_id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, Movie_Id);
			n2 = ps.executeUpdate();

		} catch (Exception e) {

			System.out.println(e);
		}
		return n2;
	}

	public int updateMovie(Movies bean) {
		int n3 = 0;

		try {

			Connection con = DBUtill.getDBConnection();
			String sql = "UPDATE Movies_Details SET Movie_name = ?, Movie_Type = ? , Movie_Language =? ,Movie_Duration = ? WHERE Movie_Id = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(5, bean.getMovie_Id());
			ps.setString(1, bean.getMovie_Name());
			ps.setString(2, bean.getMovie_Type());
			ps.setString(3, bean.getMovie_Language());
			ps.setString(4, bean.getMovie_Duration());
			n3 = ps.executeUpdate();

		} catch (Exception e) {

			System.out.println(e);
		}
		return n3;

	}

	public Movies findMovie(int Movie_Id) {
		Movies bean = null;

		try {
			Connection con = DBUtill.getDBConnection();
			String sql = "Select * from Movies_Details where Movie_Id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, Movie_Id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				bean = new Movies();
				bean.setMovie_Id(rs.getInt("Movie_Id"));
				bean.setMovie_Name(rs.getString("Movie_Name"));
				bean.setMovie_Type(rs.getString("Movie_Type"));
				bean.setMovie_Language(rs.getString("Movie_Language"));
				bean.setMovie_Duration(rs.getString("Movie_Duration"));

			}
			rs.close();
		}

		catch (Exception e) {

			System.out.println(e);
		}

		return bean;
	}

	public List<Movies> findAllMovies() {
		Movies bean = null;
		List<Movies> list = new LinkedList<Movies>();
		try {
			Connection con = DBUtill.getDBConnection();
			String sql = "Select * from Movies_Details";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				bean = new Movies();
				bean.setMovie_Id(rs.getInt("Movie_Id"));
				bean.setMovie_Name(rs.getString("Movie_Name"));
				bean.setMovie_Type(rs.getString("Movie_Type"));
				bean.setMovie_Language(rs.getString("Movie_Language"));
				bean.setMovie_Duration(rs.getString("Movie_Duration"));
				list.add(bean);
			}

			rs.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

}
