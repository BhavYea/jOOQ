/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class TBookStore extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookStoreRecord> {

	private static final long serialVersionUID = 533397646;

	/**
	 * The singleton instance of dbo.t_book_store
	 */
	public static final org.jooq.test.sqlserver.generatedclasses.tables.TBookStore T_BOOK_STORE = new org.jooq.test.sqlserver.generatedclasses.tables.TBookStore();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookStoreRecord> getRecordType() {
		return org.jooq.test.sqlserver.generatedclasses.tables.records.TBookStoreRecord.class;
	}

	/**
	 * The table column <code>dbo.t_book_store.NAME</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookStoreRecord, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	public TBookStore() {
		super("t_book_store", org.jooq.test.sqlserver.generatedclasses.Dbo.DBO);
	}

	public TBookStore(java.lang.String alias) {
		super(alias, org.jooq.test.sqlserver.generatedclasses.Dbo.DBO, org.jooq.test.sqlserver.generatedclasses.tables.TBookStore.T_BOOK_STORE);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookStoreRecord> getMainKey() {
		return org.jooq.test.sqlserver.generatedclasses.Keys.UK_T_BOOK_STORE_NAME;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookStoreRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookStoreRecord>>asList(org.jooq.test.sqlserver.generatedclasses.Keys.UK_T_BOOK_STORE_NAME);
	}

	@Override
	public org.jooq.test.sqlserver.generatedclasses.tables.TBookStore as(java.lang.String alias) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.TBookStore(alias);
	}
}
