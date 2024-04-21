package com.Clients.Profile.BuisnessLayer;

import org.springframework.stereotype.Service;

import com.Clients.Profile.Entity.ObjectOfTable;
import com.Clients.Profile.HibernateDal.HibernateDalInterface;

@Service
public class BuisnesLayer implements BuisnesLayerInterface{

	private HibernateDalInterface hibDalInter;
	
	
	
	public BuisnesLayer(HibernateDalInterface hibDalInter) {
		this.hibDalInter = hibDalInter;
	}

	@Override
	public void add(ObjectOfTable user) {
		hibDalInter.add(user);
	}

	@Override
	public String email(ObjectOfTable user) {
		return hibDalInter.email(user);
	}

	@Override
	public String name(ObjectOfTable user) {
		return hibDalInter.name(user);
	}

	@Override
	public String location(ObjectOfTable user) {
		return hibDalInter.location(user);
	}

	@Override
	public int age(ObjectOfTable user) {
		return hibDalInter.age(user);
	}

	@Override
	public String password(ObjectOfTable user) {
		return hibDalInter.password(user);
	}

}
