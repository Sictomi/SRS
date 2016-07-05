package dao;

import java.sql.SQLException;
import java.util.List;

import model.Professor;
import model.Student;

public interface PersonDao {
	
	public List<Professor> findAllProfessors() throws SQLException;
	public Boolean addProfessors(Professor professor) throws SQLException;
	public Boolean deletePerson(String ssn) throws SQLException;
	public List<Professor> findProfessors(Professor professor) throws SQLException;	public Professor findBySsn(String ssn) throws SQLException;  
	public Boolean updateProfessor(Professor professor) throws SQLException;
	public Student findByStuSsn(String ssn) throws SQLException;
}
