package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramTestDepartment {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("====== Test FindById method ======");
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		System.out.println("====== Test FindAll method ======");
		List<Department> listDepartment = departmentDao.findAll();
		
		for (Department obj : listDepartment) {
			System.out.println(obj);
		}
		
		/*System.out.println("====== Test Insert method ======");
		department = new Department(null,"Technologie des informations");
		departmentDao.insert(department);
		System.out.println("Insert done! new department: " + department.getId());*/
		
		System.out.println("====== Test Update method ======");
		department = departmentDao.findById(5);
		department.setName("Technologie de l'information");
		departmentDao.update(department);
		System.out.println("Update done!");
		
		System.out.println("====== Test FindById method ======");
		departmentDao.deleteById(8);
		System.out.println("Delete done!");
		
		
	}

}
