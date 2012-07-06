/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class TArrays extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.h2.generatedclasses.tables.records.TArraysRecord> {

	private static final long serialVersionUID = 1345808291;

	/**
	 * The singleton instance of PUBLIC.T_ARRAYS
	 */
	public static final org.jooq.test.h2.generatedclasses.tables.TArrays T_ARRAYS = new org.jooq.test.h2.generatedclasses.tables.TArrays();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.h2.generatedclasses.tables.records.TArraysRecord> getRecordType() {
		return org.jooq.test.h2.generatedclasses.tables.records.TArraysRecord.class;
	}

	/**
	 * The table column <code>PUBLIC.T_ARRAYS.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TArraysRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_ARRAYS);

	/**
	 * The table column <code>PUBLIC.T_ARRAYS.STRING_ARRAY</code>
	 * <p>
	 * The SQL type of this item (ARRAY) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TArraysRecord, java.lang.Object[]> STRING_ARRAY = createField("STRING_ARRAY", org.jooq.impl.SQLDataType.OTHER.getArrayDataType(), T_ARRAYS);

	/**
	 * The table column <code>PUBLIC.T_ARRAYS.NUMBER_ARRAY</code>
	 * <p>
	 * The SQL type of this item (ARRAY) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TArraysRecord, java.lang.Object[]> NUMBER_ARRAY = createField("NUMBER_ARRAY", org.jooq.impl.SQLDataType.OTHER.getArrayDataType(), T_ARRAYS);

	/**
	 * The table column <code>PUBLIC.T_ARRAYS.DATE_ARRAY</code>
	 * <p>
	 * The SQL type of this item (ARRAY) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TArraysRecord, java.lang.Object[]> DATE_ARRAY = createField("DATE_ARRAY", org.jooq.impl.SQLDataType.OTHER.getArrayDataType(), T_ARRAYS);

	/**
	 * No further instances allowed
	 */
	private TArrays() {
		super("T_ARRAYS", org.jooq.test.h2.generatedclasses.Public.PUBLIC);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.TArraysRecord> getMainKey() {
		return org.jooq.test.h2.generatedclasses.Keys.PK_T_ARRAYS;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.TArraysRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.TArraysRecord>>asList(org.jooq.test.h2.generatedclasses.Keys.PK_T_ARRAYS);
	}
}
