package com.cts.dao;

import java.util.List;

public interface IAdmin {
public boolean addBank(String bank);
public boolean modifyBank(String oldBankName,String newBankName);
public boolean deleteBank(String bankName);
public List<String> displayBanks();
}
