package service;

import dao.SellerDAO;
import entity.Seller;

public class SellerService {
	private static SellerDAO sellerDAO;
	
	public SellerService() {
		sellerDAO = new SellerDAO();
	}
	
	public static void registerSeller(Seller seller) {
//		System.out.println(seller.getAddress());
//		Seller seller = new Seller(seller1.getSellerID(), seller1.getBusinessName(), seller1.getAddress(), seller1.getContact());
		try {
			sellerDAO.addSeller(seller);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
