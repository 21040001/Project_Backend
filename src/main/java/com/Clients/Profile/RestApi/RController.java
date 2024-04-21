package com.Clients.Profile.RestApi;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Clients.Profile.BuisnessLayer.BuisnesLayerInterface;
import com.Clients.Profile.Entity.ObjectOfTable;

@RestController
@RequestMapping("/")
@CrossOrigin
public class RController {

	private BuisnesLayerInterface buisnesLayInter;

	public RController(BuisnesLayerInterface buisnesLayInter) {
		this.buisnesLayInter = buisnesLayInter;
	}
	
	@PostMapping("/add")
	public void add(@RequestBody ObjectOfTable user) {
		buisnesLayInter.add(user);
	}
	
	@GetMapping("/name")
	public String name( ObjectOfTable user) {
		
		return buisnesLayInter.name(user);
	}
	@GetMapping("/email")
	public String email( ObjectOfTable user) {
		
		return buisnesLayInter.email(user);
	}
	@GetMapping("/location")
	public String location( ObjectOfTable user) {
	
	return buisnesLayInter.location(user);
	}
	@GetMapping("/age")
	public int age( ObjectOfTable user) {
	return buisnesLayInter.age(user);
	}
	@GetMapping("/password")
	public String password( ObjectOfTable user) {
	return buisnesLayInter.password(user);
	}
}
