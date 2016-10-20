/**
 * 
 */
package com.song.jsf.crud;

import javax.management.Query;
import javax.persistence.Id;

import org.apache.catalina.manager.util.SessionUtils;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.internal.SQLQueryImpl;
import org.hibernate.internal.SessionFactoryImpl;
import org.hibernate.metamodel.binding.HibernateTypeDescriptor;

import antlr.collections.List;

import com.sun.org.glassfish.gmbal.Description;

/**
 * @author CientistadaComputaçã
 * @param <description>
 *
 */
public class DescriptionDaoImp<description> {
	public void save(Description description) throws InstantiationException, IllegalAccessException {
		Class session = Hibernate.getClass(description);
		Transaction t = (Transaction) session.newInstance() ; 
		
		save(description);
		t.commit();
		}
		public Class getDescription() {
		//Session session = HibernateUtil.getSessionFactory().openSession();
		Class session = Hibernate.getClass(getDescription());
	
		return session;
		
		//return (Description) session.getMethod(description);
		}
		public Description list() throws InstantiationException, IllegalAccessException {
		//Session session = Hibernate.getLobCreator(null)
			//Session session = Hibernate.getLobCreator(session);
			Class session = Hibernate.getClass(getDescription());
			
			Transaction t = (Transaction) session.newInstance() ; 
			@SuppressWarnings("unused")
			List messages = (List) createQuery("from Description").list();  

			//Transaction t = session. .beginTransaction();
	//	List lista = (List)	Query("from Description").list();
		
		t.commit();
		return (Description) list();
		}
		
		/**
		 * @param string
		 * @return
		 */
		private SQLQueryImpl createQuery(String string) {
			// TODO Auto-generated method stub
			final SQLQueryImpl query = createQuery(string);
			//final SQLQueryImpl query =  queryCreator.createQuery(conn, dialect);
			//final BooleanExpression where = convertQueryRulesToQueryExpression(query);
			if (string != null)
			{
				query.toString();
			}
			return query;
			//return null;
		}
		public void delete(Description description) throws InstantiationException, IllegalAccessException {
		//Session session = HibernateUtil.getSessionFactory().openSession();
			Class session = Hibernate.getClass(getDescription());
			
			Transaction t = (Transaction) session.newInstance() ; 
					
					delete(description);
			
		//	Transaction t = session.beginTransaction();
		
		
		//session.delete(description);
		
		t.commit();
		}
		public void update(Description description) throws InstantiationException, IllegalAccessException {
			Class session = Hibernate.getClass(getDescription());
			
			Transaction t = (Transaction) session.newInstance() ; 
			update(description);
		    t.commit();
		}


}
