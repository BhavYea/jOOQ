/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class T_785Record extends org.jooq.impl.TableRecordImpl<org.jooq.test.db2.generatedclasses.tables.records.T_785Record> {

	private static final long serialVersionUID = -825577091;

	/**
	 * The table column <code>LUKAS.T_785.ID</code>
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.db2.generatedclasses.tables.T_785.ID, value);
	}

	/**
	 * The table column <code>LUKAS.T_785.ID</code>
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.db2.generatedclasses.tables.T_785.ID);
	}

	/**
	 * The table column <code>LUKAS.T_785.NAME</code>
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.test.db2.generatedclasses.tables.T_785.NAME, value);
	}

	/**
	 * The table column <code>LUKAS.T_785.NAME</code>
	 */
	public java.lang.String getName() {
		return getValue(org.jooq.test.db2.generatedclasses.tables.T_785.NAME);
	}

	/**
	 * The table column <code>LUKAS.T_785.VALUE</code>
	 */
	public void setValue(java.lang.String value) {
		setValue(org.jooq.test.db2.generatedclasses.tables.T_785.VALUE, value);
	}

	/**
	 * The table column <code>LUKAS.T_785.VALUE</code>
	 */
	public java.lang.String getValue() {
		return getValue(org.jooq.test.db2.generatedclasses.tables.T_785.VALUE);
	}

	/**
	 * Create a detached T_785Record
	 */
	public T_785Record() {
		super(org.jooq.test.db2.generatedclasses.tables.T_785.T_785);
	}
}
