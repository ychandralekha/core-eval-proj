package com.cts.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.cts.constants.SqlConstants;

public class AdminBankInsert implements IAdmin{
public static final Logger LOG=Logger.getLogger(AdminBankInsert.class);
	public boolean addBank(String bank) {
		boolean result=false;
		PreparedStatement preparedStatement;
		try {
			preparedStatement = DbConnection.getConnection().prepareStatement(SqlConstants.insertBank);
			preparedStatement.setString(1, bank);
			preparedStatement.executeUpdate();
			result=true;
			LOG.info("bank added");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return result;
		
	}

	public boolean modifyBank(String oldBankName, String newBankName) {
		boolean result=false;
		PreparedStatement preparedStatement;
		System.out.println(oldBankName+":"+newBankName);
		try {
			preparedStatement = DbConnection.getConnection().prepareStatement(SqlConstants.modifyBank);
		
		preparedStatement.setString(2, oldBankName);
		preparedStatement.setString(1,newBankName);
		preparedStatement.executeUpdate();
		result=true;
		LOG.info("bank modified");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public boolean deleteBank(String bankName) {
		boolean result=false;
		PreparedStatement preparedStatement;
		try {
			preparedStatement = DbConnection.getConnection().prepareStatement(SqlConstants.deleteBank);
		preparedStatement.setInt(1, 0);
			preparedStatement.setString(2, bankName);
		preparedStatement.executeUpdate();
		result=true;
		LOG.info("bank deleted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public List<String> displayBanks()
	{
		List<String>banks=new ArrayList<String>();
		PreparedStatement preparedStatement;
		try {
			preparedStatement = DbConnection.getConnection().prepareStatement(SqlConstants.displayBank);
		preparedStatement.setInt(1, 1);
		ResultSet result=preparedStatement.executeQuery();
		while(result.next())
		{
			String bankName=result.getString(1);
			banks.add(bankName);
		}
		LOG.info("bank displayed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return banks;

	}

}
