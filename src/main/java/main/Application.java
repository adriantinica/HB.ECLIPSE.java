package main;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("local-pg");

	}

}
