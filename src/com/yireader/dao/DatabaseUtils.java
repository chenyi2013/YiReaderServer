package com.yireader.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

;

public class DatabaseUtils {

	private String mUrl = "jdbc:mysql://localhost:3306/mysql";
	private String mDriver = "com.mysql.jdbc.Driver";
	private String mUser = "root";
	private String mPwd = "891019";
	private Connection mConnection;
	private Statement mStatement;
	private ResultSet mResultSet;

	public DatabaseUtils() {
		try {
			Class.forName(mDriver);
			mConnection = DriverManager.getConnection(mUrl, mUser, mPwd);
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public boolean insert(String sql) {
		boolean tag = false;
		try {
			mStatement = mConnection.prepareStatement(sql,
					Statement.RETURN_GENERATED_KEYS);
			tag = mStatement.execute(sql);
			mStatement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return tag;
	}

	public ResultSet queueResultSet(String sql) {

		try {
			mStatement = mConnection.createStatement();
			mResultSet = mStatement.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mResultSet;
	}

	public void close() {

		try {
			if (mResultSet != null && !mResultSet.isClosed()) {
				mResultSet.close();
			}

			if (mStatement != null && !mStatement.isClosed()) {
				mStatement.close();
			}

			if (mConnection != null && !mConnection.isClosed()) {
				mConnection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
