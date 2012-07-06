/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
public class T_BOOK extends org.jooq.impl.UpdatableTableImpl<org.jooq.Record> implements java.lang.Cloneable {

	private static final long serialVersionUID = 738675781;

	/**
	 * The singleton instance of TEST.T_BOOK
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.T_BOOK T_BOOK = new org.jooq.test.oracle3.generatedclasses.tables.T_BOOK();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The book ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The author ID in entity 'author'
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_BOOK_AUTHOR_ID
	 * FOREIGN KEY (AUTHOR_ID)
	 * REFERENCES TEST.T_AUTHOR (ID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>TEST.T_BOOK.CO_AUTHOR_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_BOOK_CO_AUTHOR_ID
	 * FOREIGN KEY (CO_AUTHOR_ID)
	 * REFERENCES TEST.T_AUTHOR (ID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> CO_AUTHOR_ID = createField("CO_AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>TEST.T_BOOK.DETAILS_ID</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The book's title
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The year the book was published in
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The language of the book
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_BOOK_LANGUAGE_ID
	 * FOREIGN KEY (LANGUAGE_ID)
	 * REFERENCES TEST.T_LANGUAGE (ID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.Record, org.jooq.test.oracle3.generatedclasses.enums.T_LANGUAGE> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.INTEGER.asMasterDataType(org.jooq.test.oracle3.generatedclasses.enums.T_LANGUAGE.class), this);

	/**
	 * Some textual content of the book
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * Some binary content of the book
	 */
	public final org.jooq.TableField<org.jooq.Record, byte[]> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.SQLDataType.BLOB, this);

	public T_BOOK() {
		super("T_BOOK", org.jooq.test.oracle3.generatedclasses.TEST.TEST);
	}

	public T_BOOK(java.lang.String alias) {
		super(alias, org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.Record> getMainKey() {
		return org.jooq.test.oracle3.generatedclasses.Keys.PK_T_BOOK;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.Record>>asList(org.jooq.test.oracle3.generatedclasses.Keys.PK_T_BOOK);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.Record, ?>>asList(org.jooq.test.oracle3.generatedclasses.Keys.FK_T_BOOK_AUTHOR_ID, org.jooq.test.oracle3.generatedclasses.Keys.FK_T_BOOK_CO_AUTHOR_ID);
	}

	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.T_BOOK as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.T_BOOK(alias);
	}
}
