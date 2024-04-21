package com.Clients.Profile.HibernateDal;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Clients.Profile.Entity.ObjectOfTable;

import jakarta.persistence.EntityManager;
@Repository 
public class HibernateDal implements HibernateDalInterface{
	
	private EntityManager entityManager;
	
	
	@Autowired
	public HibernateDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public void add(ObjectOfTable user) {
		Session session =entityManager.unwrap(Session.class);
		session.createNativeQuery("insert into Clients.dbo.list (Email, Name, Location, Age, Password) values ('"+user.getEmail()+"', '"+user.getName()+"', '"+user.getLocation()+"',"+ user.getAge()+",'"+user.getPassword()+"')", ObjectOfTable.class).executeUpdate();
	}

	@Override
	@Transactional
	public String email(ObjectOfTable user) {
		Session session = entityManager.unwrap(Session.class);
		ObjectOfTable mail = session.createNativeQuery("Select * FROM Clients.dbo.list Where email='"+user.getEmail()+"'",ObjectOfTable.class).getSingleResult();
		String newMail = mail.getEmail();
		return newMail;
	}

	

	@Override
	@Transactional
	public int age(ObjectOfTable user) {
		Session session = entityManager.unwrap(Session.class);
		ObjectOfTable mail = session.createNativeQuery("Select * FROM Clients.dbo.list Where email='"+user.getEmail()+"'",ObjectOfTable.class).getSingleResult();
		int age = mail.getAge();
		return age;
	}

	@Override
	@Transactional
	public String name(ObjectOfTable user) {
		Session session = entityManager.unwrap(Session.class);
		ObjectOfTable mail =  session.createNativeQuery("Select * FROM Clients.dbo.list Where email='"+user.getEmail()+"'", ObjectOfTable.class).getSingleResult(); //session.get(ObjectOfTable.class, user.getEmail());
		String name = mail.getName();
		return name;
	}

	@Override
	@Transactional
	public String location(ObjectOfTable user) {
		Session session = entityManager.unwrap(Session.class);
		ObjectOfTable mail = session.createNativeQuery("Select * FROM Clients.dbo.list Where email='"+user.getEmail()+"'",ObjectOfTable.class).getSingleResult();
		String location = mail.getLocation();
		return location;
	}

	@Override
	public String password(ObjectOfTable user) {
		Session session = entityManager.unwrap(Session.class);
		ObjectOfTable mail = session.createNativeQuery("Select * FROM Clients.dbo.list Where email='"+user.getEmail()+"'",ObjectOfTable.class).getSingleResult();
		String password = mail.getPassword();
		return password;
	}

}
