package ua.logos.orm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ua.logos.orm.entity.Teacher;
import ua.logos.orm.entity.TeacherDetails;

public class App {
	public static void main(String[] args) {
		
		EntityManagerFactory managerFactory = 
				Persistence.createEntityManagerFactory("mysql");
		EntityManager em = managerFactory.createEntityManager();
		 
		
		
		
		em.getTransaction().begin();
		
//		TeacherDetails teacherDetails = new TeacherDetails();
//		teacherDetails.setEmail("teacher@gmail.com");
//		teacherDetails.setHobby("Programming");
//		em.persist(teacherDetails);
//		
//		Teacher teacher = new Teacher();
//		teacher.setFirstName("Tom");
//		teacher.setLastName("Doe");
//		teacher.setAge(32);
//		teacher.setDescription("Tom's Description");
//		teacher.setTeacherDetails(teacherDetails);
//		em.persist(teacher);
		
		Teacher teacher = em.find(Teacher.class, 1);
		System.out.println(teacher.getFirstName() + " " + teacher.getId());
		
		
		em.getTransaction().commit();
		
		em.close();
		managerFactory.close();
	}
	// META-INF
}
