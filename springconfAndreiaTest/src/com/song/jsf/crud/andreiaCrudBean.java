package com.song.jsf.crud;
    
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
    

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.xml.registry.infomodel.User;
    


/**
 * @author CientistadaComputaçã
 * @param <id>
 *
 */
@ManagedBean
@SessionScoped
public class andreiaCrudBean<id> implements Serializable{
	  private static final long serialVersionUID = 1L;

	private static final User item = null;
	    
	    private List<User> list;
	    private List<id> list1;
	    //private User item = new User();
	    private User beforeEditItem = null;
	    private boolean edit;
	    
	    @PostConstruct
	    public void init() {
	        list = new ArrayList<User>();
	    }
	    
	    /*Create JSF pages for:
	     *  list
	     *  create
	     *  update
	     *  delete
	     *   all of the 3 entities and relationships.
- Implement a REST endpoint (using json) for Create/Read/Update/Delete (CRUD) Users
- Add a JMS destination that can receive XML messages representing a Department, transform
them to objects and persist in the database*/
	  
	    /*public void add() {
	        // DAO save the add
	        item.setId(list.isEmpty() ? 1 : list.get(list.size() - 1).getId() + 1);
	        list.add(item);
	        item = new User();
	    }
	    
	    public void resetAdd() {
	        item = new User();
	    }
	    
	    public void edit(User item) {
	        beforeEditItem = item.clone();
	        this.item = item;
	        edit = true;
	    }
	    
	    public void cancelEdit() {
	        this.item.restore(beforeEditItem);
	        this.item = new User();
	        edit = false;
	    }
	    
	    //update
	    public void saveEdit() {
	        // DAO save the edit
	        this.item = new User();
	        edit = false;
	    }
	    
*/	    public void delete(User item) throws IOException {
	        // DAO save the delete
	        list.remove(item);
	    }
	    
	    public List<User> getList() {
	        return list;
	    }
	    
	    public User getItem() {
	        return this.item;
	    }
	    
	    public boolean isEdit() {
	        return this.edit;
	    }
	    
	

}
