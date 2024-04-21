package com.Clients.Profile.BuisnessLayer;

import com.Clients.Profile.Entity.ObjectOfTable;

public interface BuisnesLayerInterface {

	void add(ObjectOfTable user);
	String email(ObjectOfTable user);
	String name(ObjectOfTable user);
	String location(ObjectOfTable user);
	int age(ObjectOfTable user);
	String password(ObjectOfTable user);
}
