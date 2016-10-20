/**
 * 
 */
package com.song.jsf.crud;
//package Dao;

//import Model.Livro;
import java.util.List;
import java.util.jar.Attributes.Name;

import javax.xml.registry.infomodel.User;

import com.sun.org.glassfish.gmbal.Description;

import entities.User1.description;
import entities.User1.name;
 
/**
 * @author CientistadaComputaçã
 * @param <user>
 *
 */
public interface UserDao<user> {
	// Create/Read/Update/Delete
	public void save(User user);
	public User getUser(long id);
	public List<user> list();
	public void remove(User user);
	public void update(User user);
	
	

	public void save(Name name);
	//public User getUser(long id);
	public List<name> listName();
	public void remove(Name name);
	public void update(Name name);
	
	public void save(Description description);
	//public User getUser(long id);
	public List<description> listDescription();
	public void remove(Description description);
	public void update(Description description);
	
	
}
