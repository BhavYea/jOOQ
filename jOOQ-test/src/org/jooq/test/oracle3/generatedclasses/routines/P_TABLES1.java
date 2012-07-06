/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class P_TABLES1 extends org.jooq.impl.AbstractRoutine<java.lang.Void> implements java.lang.Cloneable {

	private static final long serialVersionUID = -1958856344;


	/**
	 * The procedure parameter <code>TEST.P_TABLES1.IN_TABLE</code>
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_TABLE> IN_TABLE = createParameter("IN_TABLE", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_TABLE.class));

	/**
	 * The procedure parameter <code>TEST.P_TABLES1.OUT_TABLE</code>
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_TABLE> OUT_TABLE = createParameter("OUT_TABLE", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_TABLE.class));

	/**
	 * Create a new routine call instance
	 */
	public P_TABLES1() {
		super("P_TABLES1", org.jooq.test.oracle3.generatedclasses.TEST.TEST);

		addInParameter(IN_TABLE);
		addOutParameter(OUT_TABLE);
	}

	/**
	 * Set the <code>IN_TABLE</code> parameter IN value to the routine
	 */
	public void setIN_TABLE(org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_TABLE value) {
		setValue(org.jooq.test.oracle3.generatedclasses.routines.P_TABLES1.IN_TABLE, value);
	}

	/**
	 * Get the <code>OUT_TABLE</code> parameter OUT value from the routine
	 */
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_TABLE getOUT_TABLE() {
		return getValue(OUT_TABLE);
	}
}
