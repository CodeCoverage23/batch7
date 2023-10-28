package com.maven.hibernate.hibenateMavenProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        final Configuration cfg = new Configuration();
        cfg.configure("com/maven/hibernate/hibenateMavenProject/hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        System.out.println(factory);
        Session session = factory.openSession();
         Student student = new Student();
         student.setName("sumit");
         student.setCity("Amravati");
         Transaction tx = session.beginTransaction();
        
         Certificate certificate = new Certificate();
         certificate.setCourse("java");
         certificate.setDuration("6 month");
         student.setCerti(certificate);

         Student student1 = new Student();
         student1.setName("sweety");
         student1.setCity("nagpur");
         
         
         Certificate certificate1 = new Certificate();
         certificate1.setCourse("python");
         certificate1.setDuration("5 month");
         student1.setCerti(certificate1);
         
         
         session.save(student);
         session.save(student1);
         tx.commit();

//         System.out.println(session.get(Student.class,102));
        
//         // get method call
//         Student st = session.get(Student.class,1);
//         Student st1 = session.get(Student.class,1);
//         Student st2 = session.get(Student.class,1);
//         Student st3 = session.get(Student.class,1);

//             System.out.println(st);
//             System.out.println("city= "+st.getCity()+ " : " +"name= "+st.getName());
       
         
         // load method call
         
//         Student load = session.load(Student.class,3) ;  
//         System.out.println(load);
         session.close();
         factory.close();    
        
    }
}
