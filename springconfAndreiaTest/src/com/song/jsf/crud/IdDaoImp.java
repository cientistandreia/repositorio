/**
 * 
 */
package com.song.jsf.crud;

import javax.persistence.Id;
import javax.xml.soap.Name;

import org.hibernate.Hibernate;
import org.hibernate.Transaction;
import org.hibernate.internal.SQLQueryImpl;

import antlr.collections.List;

import com.sun.org.glassfish.gmbal.Description;

/**
 * @author CientistadaComputaçã
 *
 */
public class IdDaoImp {
	
	public void save(Id id) throws InstantiationException, IllegalAccessException {

		Class session = Hibernate.getClass(getId());
		
		
		Transaction t = (Transaction) session.newInstance() ; 
				
		save(id);
		t.commit();
		}
		
		/**
	 * @return
	 */
	
		public Class getId() {
		Class session = Hibernate.getClass(getId());

		return session;
		
		}
		public Id list() throws InstantiationException, IllegalAccessException {
			Class session = Hibernate.getClass(getId());
			
			Transaction t = (Transaction) session.newInstance() ; 
			@SuppressWarnings("unused")
			List messages = (List) createQuery("from Id").list();  
	
		t.commit();
		return (Id) list();
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
		}
		public void delete(Id id) throws InstantiationException, IllegalAccessException {
			Class session = Hibernate.getClass(getId());
			
			Transaction t = (Transaction) session.newInstance() ; 
					
					delete(id);
				
		t.commit();
		}
		public void update(Id id) throws InstantiationException, IllegalAccessException {
			Class session = Hibernate.getClass(getId());
			
			Transaction t = (Transaction) session.newInstance() ; 
			update(id);
		    t.commit();
		}


}
