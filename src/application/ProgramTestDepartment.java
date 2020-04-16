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
		
	}

}
