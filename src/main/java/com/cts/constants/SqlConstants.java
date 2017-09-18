package com.cts.constants;

public class SqlConstants {
public static final String insertBank="insert into banks(bankname) value(?)";
public static final String modifyBank="update banks set bankname=? where bankname=?";
public static final String deleteBank="update banks set display_bank=? where bankname=?";
public static final String displayBank="select bankname from banks where display_bank=?";
}
