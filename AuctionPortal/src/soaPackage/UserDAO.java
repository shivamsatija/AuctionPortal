package soaPackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import session.AuctionPortalUtil;

public class UserDAO {
	
	public static UserBean login(UserBean user){
		SessionFactory sessionFactory=AuctionPortalUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
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