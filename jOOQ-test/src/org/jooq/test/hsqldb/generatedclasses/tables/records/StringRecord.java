/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class StringRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.StringRecord> implements org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IString {

	private static final long serialVersionUID = 1862906916;

	/**
	 * The table column <code>PUBLIC.STRING.ID</code>
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.String.STRING.ID, value);
	}

	/**
	 * The table column <code>PUBLIC.STRING.ID</code>
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.String.STRING.ID);
	}

	/**
	 * The table column <code>PUBLIC.STRING.OTHER</code>
	 */
	@Override
	public void setOther(java.lang.String value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.String.STRING.OTHER, value);
	}

	/**
	 * The table column <code>PUBLIC.STRING.OTHER</code>
	 */
	@Override
	public java.lang.String getOther() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.String.STRING.OTHER);
	}

	/**
	 * Create a detached StringRecord
	 */
	public StringRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.String.STRING);
	}
}
