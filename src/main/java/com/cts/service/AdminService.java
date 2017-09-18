package com.cts.service;

import java.util.ArrayList;
import java.util.List;

import com.cts.dao.AdminBankInsert;
import com.cts.dao.IAdmin;

public class AdminService {
public boolean adminAddBank(String bankName)
{
	boolean result;
	IAdmin bank=new AdminBankInsert();
	result=bank.addBank(bankName);
	return result;
}
public boolean adminModifyBank(String oldName,String newName)
{
	boolean result;
	IAdmin bank=new AdminBankInsert();
	result=bank.modifyBank(oldName, newName);
	return result;
}
public boolean adminDeleteBank(String bankName)
{
	boolean result;
	IAdmin bank=new AdminBankInsert();
	result=bank.deleteBank(bankName);
	return result;
}
public List<String> displayBanks()
{
	List<String>banks=new ArrayList<String>();
	IAdmin displayBanks=new AdminBankInsert();
	banks=displayBanks.displayBanks();
	return banks;
}
}
