/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_639_NUMBERS_TABLE", schema = "TEST")
public class T_639NumbersTableRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.T_639NumbersTableRecord> {

	private static final long serialVersionUID = 110670945;

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.ID, value);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.ID);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.BYTE</code>
	 */
	public void setByte(java.lang.Byte value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.BYTE, value);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.BYTE</code>
	 */
	@javax.persistence.Column(name = "BYTE", precision = 2)
	public java.lang.Byte getByte() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.BYTE);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.SHORT</code>
	 */
	public void setShort(java.lang.Short value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.SHORT, value);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.SHORT</code>
	 */
	@javax.persistence.Column(name = "SHORT", precision = 4)
	public java.lang.Short getShort() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.SHORT);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.INTEGER</code>
	 */
	public void setInteger(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.INTEGER, value);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.INTEGER</code>
	 */
	@javax.persistence.Column(name = "INTEGER", precision = 7)
	public java.lang.Integer getInteger() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.INTEGER);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.LONG</code>
	 */
	public void setLong(java.lang.Long value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.LONG, value);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.LONG</code>
	 */
	@javax.persistence.Column(name = "LONG", precision = 18)
	public java.lang.Long getLong() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.LONG);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.BYTE_DECIMAL</code>
	 */
	public void setByteDecimal(java.lang.Byte value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.BYTE_DECIMAL, value);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.BYTE_DECIMAL</code>
	 */
	@javax.persistence.Column(name = "BYTE_DECIMAL", precision = 2)
	public java.lang.Byte getByteDecimal() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.BYTE_DECIMAL);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.SHORT_DECIMAL</code>
	 */
	public void setShortDecimal(java.lang.Short value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.SHORT_DECIMAL, value);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.SHORT_DECIMAL</code>
	 */
	@javax.persistence.Column(name = "SHORT_DECIMAL", precision = 4)
	public java.lang.Short getShortDecimal() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.SHORT_DECIMAL);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.INTEGER_DECIMAL</code>
	 */
	public void setIntegerDecimal(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.INTEGER_DECIMAL, value);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.INTEGER_DECIMAL</code>
	 */
	@javax.persistence.Column(name = "INTEGER_DECIMAL", precision = 9)
	public java.lang.Integer getIntegerDecimal() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.INTEGER_DECIMAL);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.LONG_DECIMAL</code>
	 */
	public void setLongDecimal(java.lang.Long value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.LONG_DECIMAL, value);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.LONG_DECIMAL</code>
	 */
	@javax.persistence.Column(name = "LONG_DECIMAL", precision = 18)
	public java.lang.Long getLongDecimal() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.LONG_DECIMAL);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.BIG_INTEGER</code>
	 */
	public void setBigInteger(java.math.BigInteger value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.BIG_INTEGER, value);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.BIG_INTEGER</code>
	 */
	@javax.persistence.Column(name = "BIG_INTEGER", precision = 22)
	public java.math.BigInteger getBigInteger() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.BIG_INTEGER);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.BIG_DECIMAL</code>
	 */
	public void setBigDecimal(java.math.BigDecimal value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.BIG_DECIMAL, value);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.BIG_DECIMAL</code>
	 */
	@javax.persistence.Column(name = "BIG_DECIMAL", precision = 22, scale = 5)
	public java.math.BigDecimal getBigDecimal() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.BIG_DECIMAL);
	}

	/**
	 * Create a detached T_639NumbersTableRecord
	 */
	public T_639NumbersTableRecord() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE);
	}
}
