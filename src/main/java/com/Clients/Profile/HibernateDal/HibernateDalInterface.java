package com.Clients.Profile.HibernateDal;

import com.Clients.Profile.Entity.ObjectOfTable;

public interface HibernateDalInterface {

	void add(ObjectOfTable user);
	String email(ObjectOfTable user);
	String name(ObjectOfTable user);
	String location(ObjectOfTable user);
	String password(ObjectOfTable user);
	int age(ObjectOfTable user);
	
}
