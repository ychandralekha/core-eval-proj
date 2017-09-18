package com.cts.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cts.dao.AdminBankInsert;
import com.cts.dao.IAdmin;

public class AdminTesting {

	@Test
	public void test() {
		boolean result=false;
		IAdmin bank=new AdminBankInsert();
		result=bank.addBank("IOB");
		System.out.println(result);
		assertSame(true, result);
	}

}
