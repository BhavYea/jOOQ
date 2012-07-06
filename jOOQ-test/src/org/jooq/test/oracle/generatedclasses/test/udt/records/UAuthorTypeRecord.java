/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.udt.records;

/**
 * This class is generated by jOOQ.
 */
public class UAuthorTypeRecord extends org.jooq.impl.UDTRecordImpl<org.jooq.test.oracle.generatedclasses.test.udt.records.UAuthorTypeRecord> {

	private static final long serialVersionUID = -1269981274;


	/**
	 * The UDT column <code>TEST.U_AUTHOR_TYPE.ID</code>
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.udt.UAuthorType.ID, value);
	}

	/**
	 * The UDT column <code>TEST.U_AUTHOR_TYPE.ID</code>
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.udt.UAuthorType.ID);
	}

	/**
	 * The UDT column <code>TEST.U_AUTHOR_TYPE.FIRST_NAME</code>
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.udt.UAuthorType.FIRST_NAME, value);
	}

	/**
	 * The UDT column <code>TEST.U_AUTHOR_TYPE.FIRST_NAME</code>
	 */
	public java.lang.String getFirstName() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.udt.UAuthorType.FIRST_NAME);
	}

	/**
	 * The UDT column <code>TEST.U_AUTHOR_TYPE.LAST_NAME</code>
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.udt.UAuthorType.LAST_NAME, value);
	}

	/**
	 * The UDT column <code>TEST.U_AUTHOR_TYPE.LAST_NAME</code>
	 */
	public java.lang.String getLastName() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.udt.UAuthorType.LAST_NAME);
	}

	/**
	 * Call TEST.U_AUTHOR_TYPE.COUNT_BOOKS
	 *
	 * @param self
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public java.math.BigDecimal countBooks() {
		org.jooq.test.oracle.generatedclasses.test.udt.u_author_type.CountBooks f = new org.jooq.test.oracle.generatedclasses.test.udt.u_author_type.CountBooks();
		f.setSelf(this);

		f.execute(getConfiguration());
		return f.getReturnValue();
	}

	/**
	 * Call TEST.U_AUTHOR_TYPE.GET_BOOKS
	 *
	 * @param self IN OUT parameter
	 * @param book1 OUT parameter
	 * @param book2 OUT parameter
	 * @param books OUT parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public org.jooq.test.oracle.generatedclasses.test.udt.u_author_type.GetBooks getBooks() {
		org.jooq.test.oracle.generatedclasses.test.udt.u_author_type.GetBooks p = new org.jooq.test.oracle.generatedclasses.test.udt.u_author_type.GetBooks();
		p.setSelf(this);

		p.execute(getConfiguration());
		from(p.getSelf());
		return p;
	}

	/**
	 * Call TEST.U_AUTHOR_TYPE.LOAD
	 *
	 * @param self IN OUT parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UAuthorTypeRecord load() {
		org.jooq.test.oracle.generatedclasses.test.udt.u_author_type.Load p = new org.jooq.test.oracle.generatedclasses.test.udt.u_author_type.Load();
		p.setSelf(this);

		p.execute(getConfiguration());
		from(p.getSelf());
		return p.getSelf();
	}

	public UAuthorTypeRecord() {
		super(org.jooq.test.oracle.generatedclasses.test.udt.UAuthorType.U_AUTHOR_TYPE);
	}
}
