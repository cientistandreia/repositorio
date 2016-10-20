package com.song.jsf.crud;
    
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
    



import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.xml.registry.infomodel.User;

import entities.User1.description;
import entities.User1.name;
    


/**
 * @author CientistadaComputaçã
 * @param <description>
 *
 */
@ManagedBean
@SessionScoped
public class andreiaCrudBeanDescription<id> implements Serializable{
	  private static final long serialVersionUID = 1L;

	private static final description item = null;
	    
	    private List<description> list;
	    //private User item = new User();
	    private name beforeEditItem = null;
	    private boolean edit;
	    
	    @PostConstruct
	    public void init() {
	        list = new ArrayList<description>();
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
	    
*/	    public void delete(description item) throws IOException {
	        // DAO save the delete
	        list.remove(item);
	    }
	    
	    public List<description> getList() {
	        return list;
	    }
	    
	    public description getItem() {
	        return this.item;
	    }
	    
	    public boolean isEdit() {
	        return this.edit;
	    }
	    
	

}
