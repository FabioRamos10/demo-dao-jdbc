package modelDao;

import modelDaoImpl.SallerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SallerDaoJDBC();
    }
}