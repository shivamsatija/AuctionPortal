package session;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class AuctionPortalUtil {
	
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory==null){
			Configuration config=new Configuration().configure("/hibernate.cfg.xml");
			ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().
					applySettings(config.getProperties()).build();
			sessionFactory=config.buildSessionFactory(serviceRegistry);
		}
		
		return sessionFactory;
	}

	public static void setSessionFactory(SessionFactory sessionFactory) {
		AuctionPortalUtil.sessionFactory = sessionFactory;
	}
	
	

}
