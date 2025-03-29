package com.fst.first;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Entities.Medicament;

@SpringBootApplication
public class DsSbApplication {
	public static List<Medicament> medicaments=new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(DsSbApplication.class, args);
		Medicament m1=new Medicament(1,"Panadol",200,5000);
		Medicament m2=new Medicament(2,"Doliprane",100,6000);
		Medicament m3=new Medicament(3,"Spasfon",150,11000);
		medicaments.add(m1);
		medicaments.add(m2);
		medicaments.add(m3);
	}

}
