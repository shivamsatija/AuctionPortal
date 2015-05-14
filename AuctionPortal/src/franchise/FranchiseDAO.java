package franchise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import session.AuctionPortalUtil;


public class FranchiseDAO {
	
	public static FranchiseDetails login(FranchiseDetails franchiseDetails){
		SessionFactory sessionFactory=AuctionPortalUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		franchiseDetails=(FranchiseDetails) session.get(FranchiseDetails.class, franchiseDetails.getFranchiseId());
		if(franchiseDetails==null){
			franchiseDetails=new FranchiseDetails();
			franchiseDetails.setValid(false);
		}
			
		else
			franchiseDetails.setValid(true);
		session.getTransaction().commit();
		session.close();
		return franchiseDetails;		
	}
	
	public static FranchiseDetails signUp(FranchiseDetails franchiseDetails){
		SessionFactory sessionFactory=AuctionPortalUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(franchiseDetails);
		session.getTransaction().commit();
		session.close();
		
		session=sessionFactory.openSession();
		session.beginTransaction();
		franchiseDetails=(FranchiseDetails) session.get(FranchiseDetails.class, franchiseDetails.getFranchiseId());
		if(franchiseDetails!=null)
			franchiseDetails.setValid(true);
//		else
//			franchiseDetails.setValid(false);
		session.getTransaction().commit();
		session.close();
		return franchiseDetails;
	}

}
