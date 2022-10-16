package oopWithNLayerdApp.dataAccess;

import oopWithNLayerdApp.entities.Product;

public class HibernateProductDao implements ProductDao{
	public void add(Product product) {
		//sadece db erişim kodları buraya yazılır... SQL
		System.out.println("Hibernate ile veritabanına eklendi");
	}
}
