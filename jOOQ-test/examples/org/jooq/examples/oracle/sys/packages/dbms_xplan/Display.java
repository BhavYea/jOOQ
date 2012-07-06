/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.oracle.sys.packages.dbms_xplan;

/**
 * This class is generated by jOOQ.
 */
public class Display extends org.jooq.impl.AbstractRoutine<org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeTableRecord> {

	private static final long serialVersionUID = 445820689;


	/**
	 * The procedure parameter <code>SYS.DBMS_XPLAN.DISPLAY.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeTableRecord> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.examples.oracle.sys.udt.DbmsXplanType.DBMS_XPLAN_TYPE.getDataType().asArrayDataType(org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeTableRecord.class));

	/**
	 * The procedure parameter <code>SYS.DBMS_XPLAN.DISPLAY.TABLE_NAME</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> TABLE_NAME = createParameter("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR, true);

	/**
	 * The procedure parameter <code>SYS.DBMS_XPLAN.DISPLAY.STATEMENT_ID</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> STATEMENT_ID = createParameter("STATEMENT_ID", org.jooq.impl.SQLDataType.VARCHAR, true);

	/**
	 * The procedure parameter <code>SYS.DBMS_XPLAN.DISPLAY.FORMAT</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> FORMAT = createParameter("FORMAT", org.jooq.impl.SQLDataType.VARCHAR, true);

	/**
	 * The procedure parameter <code>SYS.DBMS_XPLAN.DISPLAY.FILTER_PREDS</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> FILTER_PREDS = createParameter("FILTER_PREDS", org.jooq.impl.SQLDataType.VARCHAR, true);

	/**
	 * Create a new routine call instance
	 */
	public Display() {
		super("DISPLAY", org.jooq.examples.oracle.sys.Sys.SYS, org.jooq.examples.oracle.sys.packages.DbmsXplan.DBMS_XPLAN, org.jooq.examples.oracle.sys.udt.DbmsXplanType.DBMS_XPLAN_TYPE.getDataType().asArrayDataType(org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeTableRecord.class));

		setReturnParameter(RETURN_VALUE);
		addInParameter(TABLE_NAME);
		addInParameter(STATEMENT_ID);
		addInParameter(FORMAT);
		addInParameter(FILTER_PREDS);
	}

	/**
	 * Set the <code>TABLE_NAME</code> parameter IN value to the routine
	 */
	public void setTableName(java.lang.String value) {
		setValue(org.jooq.examples.oracle.sys.packages.dbms_xplan.Display.TABLE_NAME, value);
	}

	/**
	 * Set the <code>TABLE_NAME</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setTableName(org.jooq.Field<java.lang.String> field) {
		setField(TABLE_NAME, field);
	}

	/**
	 * Set the <code>STATEMENT_ID</code> parameter IN value to the routine
	 */
	public void setStatementId(java.lang.String value) {
		setValue(org.jooq.examples.oracle.sys.packages.dbms_xplan.Display.STATEMENT_ID, value);
	}

	/**
	 * Set the <code>STATEMENT_ID</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setStatementId(org.jooq.Field<java.lang.String> field) {
		setField(STATEMENT_ID, field);
	}

	/**
	 * Set the <code>FORMAT</code> parameter IN value to the routine
	 */
	public void setFormat(java.lang.String value) {
		setValue(org.jooq.examples.oracle.sys.packages.dbms_xplan.Display.FORMAT, value);
	}

	/**
	 * Set the <code>FORMAT</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setFormat(org.jooq.Field<java.lang.String> field) {
		setField(FORMAT, field);
	}

	/**
	 * Set the <code>FILTER_PREDS</code> parameter IN value to the routine
	 */
	public void setFilterPreds(java.lang.String value) {
		setValue(org.jooq.examples.oracle.sys.packages.dbms_xplan.Display.FILTER_PREDS, value);
	}

	/**
	 * Set the <code>FILTER_PREDS</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setFilterPreds(org.jooq.Field<java.lang.String> field) {
		setField(FILTER_PREDS, field);
	}
}
