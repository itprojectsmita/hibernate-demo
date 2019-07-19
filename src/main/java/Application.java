import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Application {

	public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg = cfg.configure();
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	Transaction tx = session.beginTransaction();
	
	Employee emp = new Employee();
	emp.setEmpID(9);
	emp.setName("VS");
	emp.setSalary(90000f);
	
	session.save(emp);
	
	
	tx.commit();
	session.close();
	factory.close();
	}

}
