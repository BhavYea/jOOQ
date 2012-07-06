/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class TArraysRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.TArraysRecord> implements org.jooq.test.hsqldb.generatedclasses.tables.interfaces.ITArrays {

	private static final long serialVersionUID = 308579226;

	/**
	 * The table column <code>PUBLIC.T_ARRAYS.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TArrays.T_ARRAYS.ID, value);
	}

	/**
	 * The table column <code>PUBLIC.T_ARRAYS.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TArrays.T_ARRAYS.ID);
	}

	/**
	 * The table column <code>PUBLIC.T_ARRAYS.STRING_ARRAY</code>
	 */
	@Override
	public void setStringArray(java.lang.String[] value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TArrays.T_ARRAYS.STRING_ARRAY, value);
	}

	/**
	 * The table column <code>PUBLIC.T_ARRAYS.STRING_ARRAY</code>
	 */
	@Override
	public java.lang.String[] getStringArray() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TArrays.T_ARRAYS.STRING_ARRAY);
	}

	/**
	 * The table column <code>PUBLIC.T_ARRAYS.NUMBER_ARRAY</code>
	 */
	@Override
	public void setNumberArray(java.lang.Integer[] value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TArrays.T_ARRAYS.NUMBER_ARRAY, value);
	}

	/**
	 * The table column <code>PUBLIC.T_ARRAYS.NUMBER_ARRAY</code>
	 */
	@Override
	public java.lang.Integer[] getNumberArray() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TArrays.T_ARRAYS.NUMBER_ARRAY);
	}

	/**
	 * The table column <code>PUBLIC.T_ARRAYS.DATE_ARRAY</code>
	 */
	@Override
	public void setDateArray(java.sql.Date[] value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TArrays.T_ARRAYS.DATE_ARRAY, value);
	}

	/**
	 * The table column <code>PUBLIC.T_ARRAYS.DATE_ARRAY</code>
	 */
	@Override
	public java.sql.Date[] getDateArray() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TArrays.T_ARRAYS.DATE_ARRAY);
	}

	/**
	 * Create a detached TArraysRecord
	 */
	public TArraysRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.TArrays.T_ARRAYS);
	}
}
