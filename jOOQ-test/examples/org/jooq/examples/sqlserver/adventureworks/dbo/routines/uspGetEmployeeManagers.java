/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.dbo.routines;

/**
 * This class is generated by jOOQ.
 */
public class uspGetEmployeeManagers extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1605441498;


	/**
	 * The procedure parameter <code>dbo.uspGetEmployeeManagers.EmployeeID</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> EmployeeID = createParameter("EmployeeID", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public uspGetEmployeeManagers() {
		super("uspGetEmployeeManagers", org.jooq.examples.sqlserver.adventureworks.dbo.dbo.dbo);

		addInParameter(EmployeeID);
	}

	/**
	 * Set the <code>EmployeeID</code> parameter IN value to the routine
	 */
	public void setEmployeeID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.routines.uspGetEmployeeManagers.EmployeeID, value);
	}
}
