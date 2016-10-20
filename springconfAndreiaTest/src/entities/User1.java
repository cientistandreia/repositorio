/**
 * 
 */
package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import entities.Department;
import entities.Permission;

/**
 * @author CientistadaComputaçã
 *
 */
@Entity
public class User1 {

	    /**
	 * @author CientistadaComputaçã
	 *
	 */
	public @interface name {

	}
		/**
	 * @author CientistadaComputaçã
	 *
	 */
	public @interface description {

	}
	
	
		@Id private int id;
	    @name private int name;
	    @description private int description;
	    @ManyToOne
	    @JoinColumn(name="DEPT_ID")
	    private Department department;
	    @ManyToMany
	    private Permission permission;
	    
		public int getName() {
			return name;
		}
		public void setName(int name) {
			this.name = name;
		}
		public int getDescription() {
			return description;
		}
		public void setDescription(int description) {
			this.description = description;
		}
		public Permission getPermission() {
			return permission;
		}
		public void setPermission(Permission permission) {
			this.permission = permission;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public Department getDepartment() {
			return department;
		}
		public void setDepartment(Department department) {
			this.department = department;
		}
	    
	
}
