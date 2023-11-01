package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product") 
public class Product {
	
	@Id
	private Integer id;
	private String name;

}
