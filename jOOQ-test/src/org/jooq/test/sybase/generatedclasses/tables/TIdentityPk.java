/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class TIdentityPk extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sybase.generatedclasses.tables.records.TIdentityPkRecord> {

	private static final long serialVersionUID = 1698602079;

	/**
	 * The singleton instance of DBA.t_identity_pk
	 */
	public static final org.jooq.test.sybase.generatedclasses.tables.TIdentityPk T_IDENTITY_PK = new org.jooq.test.sybase.generatedclasses.tables.TIdentityPk();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.TIdentityPkRecord> getRecordType() {
		return org.jooq.test.sybase.generatedclasses.tables.records.TIdentityPkRecord.class;
	}

	/**
	 * The table column <code>DBA.t_identity_pk.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TIdentityPkRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>DBA.t_identity_pk.val</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TIdentityPkRecord, java.lang.Integer> VAL = createField("val", org.jooq.impl.SQLDataType.INTEGER, this);

	public TIdentityPk() {
		super("t_identity_pk", org.jooq.test.sybase.generatedclasses.Dba.DBA);
	}

	public TIdentityPk(java.lang.String alias) {
		super(alias, org.jooq.test.sybase.generatedclasses.Dba.DBA, org.jooq.test.sybase.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK);
	}

	@Override
	public org.jooq.Identity<org.jooq.test.sybase.generatedclasses.tables.records.TIdentityPkRecord, java.lang.Integer> getIdentity() {
		return org.jooq.test.sybase.generatedclasses.Keys.IDENTITY_T_IDENTITY_PK;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TIdentityPkRecord> getMainKey() {
		return org.jooq.test.sybase.generatedclasses.Keys.T_IDENTITY_PK__PK_T_IDENTITY_PK;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TIdentityPkRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TIdentityPkRecord>>asList(org.jooq.test.sybase.generatedclasses.Keys.T_IDENTITY_PK__PK_T_IDENTITY_PK);
	}

	@Override
	public org.jooq.test.sybase.generatedclasses.tables.TIdentityPk as(java.lang.String alias) {
		return new org.jooq.test.sybase.generatedclasses.tables.TIdentityPk(alias);
	}
}
