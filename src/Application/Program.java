package Application;
import java.util.Date;

import modelDao.DaoFactory;
import modelDao.SellerDao;
import modelEntities.Department;
import modelEntities.Seller;


public class Program {

    public static void main(String[] args) {

        Department obj = new Department(1, "Books");

        Seller seller = new Seller(21, "Fabio", "Fabioffer6@gamil.com", new Date(), 3000.0, obj);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);

    }
}