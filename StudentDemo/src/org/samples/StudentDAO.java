package org.samples;
import java.util.List;

import javax.sql.DataSource;
public interface StudentDAO {
//user defined interface
	
	
	/** This is the method to be used to intialize * database resource connection.
	 */
	
	public void setDataSource(DataSource ds); //abstract method
	
	/** This is the metod to be used to create a record in the student table */
	
	public void createStudent(Integer id, String name, Integer age);
	
	/** This is the method to be used to list down a record from the student 
	 * table corresponding to a passed student id */
	public Student getStudent(Integer id);
	/**  This is the method to be used to list down all the records from the student table
	 */
	public List<Student> listStudent();
	
	/** This is the method to be used to delete a record from the student
	 */
	public void delete(Integer id);
	/** This is the method to be used to update a record into the Student
	 */
	
	public void update(Integer id, Integer age);
}
