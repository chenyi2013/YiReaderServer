package com.yireader.app;

import com.yireader.dao.DatabaseUtils;

public class Main {

	public static void main(String[] args) {
		String a = null;
		String b = null;

		String username = "kevin";
		String password = "eeee";
		boolean sex = false;
		int age = 15;
		String qq = "343434524";
		String email = "2453434243@qq.com";

		DatabaseUtils utils = new DatabaseUtils();
		String sql = "insert into mysql.user_table(username,password,sex,age,qq,email)values ('"
				+ username
				+ "','"
				+ password
				+ "',"
				+ sex
				+ ","
				+ age
				+ ",'"
				+ qq + "','" + email + "')";
		utils.insert(sql);

	}

}
