package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println("====== Test FindById method ======");
		System.out.println(seller);
		
		System.out.println("\n====== Test FindByDepartment method ======");
		List<Seller> selllers = sellerDao.findByDepartment(new Department(2, null));
		for (Seller obj : selllers) {
			System.out.println(obj);
		}
		
		System.out.println("\n====== Test FindAll method ======");
		selllers = sellerDao.findAll();
		for (Seller obj : selllers) {
			System.out.println(obj);
		}
		
		System.out.println("\n====== Test Saller Insert method ======");
		Seller newSeller = new Seller(null, "Tobias", "tobias@gmail.com", new Date(), 5520.0, new Department(2, null)); 
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = "+newSeller.getId());
	}

}
