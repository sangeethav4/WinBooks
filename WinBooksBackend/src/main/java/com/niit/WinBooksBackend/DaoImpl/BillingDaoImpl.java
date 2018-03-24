package com.niit.WinBooksBackend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.WinBooksBackend.Dao.BillingDao;
import com.niit.WinBooksBackend.Model.Billing;
import com.niit.WinBooksBackend.Model.Category;

@Repository("BillingDao")
@EnableTransactionManagement 
@Transactional
public class BillingDaoImpl implements BillingDao {
	@Autowired
	SessionFactory sessionFactory;

	   public  BillingDaoImpl (SessionFactory sessionFactory)
	   {
			this.sessionFactory=sessionFactory;
		}
		
		public boolean saveorupdate(Billing billing) {
			
			sessionFactory.getCurrentSession().saveOrUpdate(billing);
			return true;
		}

		
		public boolean delete(Category category) {
			sessionFactory.getCurrentSession().delete(category);
			return true;
		}

		
		public boolean delete(Billing billing) {
			// TODO Auto-generated method stub
			return true;
			}
		

		
		public Billing getBilling(String billId) {
			String cat="From Billing where billId='"+billId+"'";
			Query q1=sessionFactory.getCurrentSession().createQuery(cat);
			List<Billing> billlist= (List<Billing>)q1.list();
					if(billlist==null||billlist.isEmpty())
					{
						System.out.println("Billing list not found");
						return null;
					}
					else
				{
					System.out.println("Billing list");
					return billlist.get(0);
				}
		}
		

			
		

		
		public List<Billing> list() {
			List<Billing> billing=(List<Billing>) sessionFactory.getCurrentSession().createCriteria(Billing.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			
			return billing;
		
 
}
		}
		




