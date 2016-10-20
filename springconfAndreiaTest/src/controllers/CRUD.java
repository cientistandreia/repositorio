/**
 * 
 */
package controllers;

/**
 * @author CientistadaComputaçã
 *
 */
public @interface CRUD {

	/**
	 * @author CientistadaComputaçã
	 *
	 */
	public @interface For {

		Class<User> value();

	}

}
