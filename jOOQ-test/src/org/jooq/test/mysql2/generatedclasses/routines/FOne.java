/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 *
 * 1 constant value
 */
public class FOne extends org.jooq.impl.AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = -231204823;


	/**
	 * The procedure parameter <code>test2.f_one.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public FOne() {
		super("f_one", org.jooq.test.mysql2.generatedclasses.Test2.TEST2, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
	}
}
