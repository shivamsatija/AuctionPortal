package soaPackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UserDAO {
	
	public static UserBean login(UserBean user, SessionFactory sessionFactory){
//		Configuration config=new Configuration().configure();
//		ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().
//				applySettings(config.getProperties()).build();
//		SessionFactory sessionFactory=config.buildSessionFactory(serviceRegistry);
		Session session=sessionFactory.openSession();

		//		Put it in a try catch block 
		//		and if transaction is not successful then
		//		roll back the transaction
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();


		//		Put it in a try catch block 
		//		and if transaction is not successful then
		//		roll back the transaction
		session=sessionFactory.openSession();
		session.beginTransaction();
		UserBean newUser=(UserBean) session.get(UserBean.class,user.getEmailId());
		if(newUser==null)
			user.setValid(false);
		else
			user.setValid(true);
		session.getTransaction().commit();
		session.close();
		return user;
	}
}