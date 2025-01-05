package modelDao;

import Db.DB;
import modelDao.DepatmentDao;
import modelDao.SellerDao;
import modelDaoImpl.DepartmentDaoJDBC;
import modelDaoImpl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepatmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}