package modelDao;

import modelEntities.Department;

import java.util.List;

public interface DepatmentDao {

    void insert(Department obj);
    void update(Department obj);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();

}
