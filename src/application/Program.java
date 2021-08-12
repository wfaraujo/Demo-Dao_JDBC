package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.etities.Department;
import model.etities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== test 1 - findById  Seller ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n=== test2  - findByDepartment ===");

		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);

		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== test3  - findByAll ===");

		list = sellerDao.findAll();

		for (Seller obj : list) {
			System.out.println(obj);

		}

	}
}
