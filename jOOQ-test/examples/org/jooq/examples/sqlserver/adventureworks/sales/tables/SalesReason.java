/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables;

/**
 * This class is generated by jOOQ.
 */
public class SalesReason extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesReason> {

	private static final long serialVersionUID = -616640952;

	/**
	 * The singleton instance of Sales.SalesReason
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesReason SalesReason = new org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesReason();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesReason> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesReason.class;
	}

	/**
	 * The table column <code>Sales.SalesReason.SalesReasonID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesReason, java.lang.Integer> SalesReasonID = createField("SalesReasonID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>Sales.SalesReason.Name</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesReason, java.lang.String> Name = createField("Name", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>Sales.SalesReason.ReasonType</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesReason, java.lang.String> ReasonType = createField("ReasonType", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>Sales.SalesReason.ModifiedDate</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesReason, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public SalesReason() {
		super("SalesReason", org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales);
	}

	public SalesReason(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesReason.SalesReason);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesReason, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.IDENTITY_SalesReason;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesReason> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_SalesReason_SalesReasonID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesReason>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesReason>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_SalesReason_SalesReasonID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesReason as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesReason(alias);
	}
}
