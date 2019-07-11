package com.revature.pojos;

import java.util.List;

public class UserInformation {
	private User user;
	private List<Accountinfo> account;
	
}

class Accountinfo{
	private int id;
	private double balance;
	private String type;
}