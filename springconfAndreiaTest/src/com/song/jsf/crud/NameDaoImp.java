/**
 * 
 */
package com.song.jsf.crud;

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
public abstract class NameDaoImp implements Name {
	public void save(Name name) throws InstantiationException, IllegalAccessException {
	Class session = Hibernate.getClass(getName());

	Transaction t = (Transaction) session.newInstance() ; 
			
	save(name);
	t.commit();
	}
	
	public Class getName() {
	Class session = Hibernate.getClass(getName());

	return session;
	
	}
	
	public Name list() throws InstantiationException, IllegalAccessException {
	Class session = Hibernate.getClass(getName());
		
		Transaction t = (Transaction) session.newInstance() ; 
		@SuppressWarnings("unused")
		List messages = (List) createQuery("from Name").list();  

		
	t.commit();
	return (Name) list();
	}
	
	/**
	 * @param string
	 * @return
	 */
	private SQLQueryImpl createQuery(String string) {
		// TODO Auto-generated method stub
		final SQLQueryImpl query = createQuery(string);
	
		if (string != null)
		{
			query.toString();
		}
		return query;
	}
	public void delete(Name name) throws InstantiationException, IllegalAccessException {
	Class session = Hibernate.getClass(getName());
		
		Transaction t = (Transaction) session.newInstance() ; 
				
				delete(name);
		
	t.commit();
	}
	public void update(Name name) throws InstantiationException, IllegalAccessException {
		Class session = Hibernate.getClass(getName());
		
		Transaction t = (Transaction) session.newInstance() ; 
		update(name);
	    t.commit();
	}

}
