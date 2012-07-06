/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 */
public class Customer extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord> {

	private static final long serialVersionUID = 586192263;

	/**
	 * The singleton instance of sakila.customer
	 */
	public static final org.jooq.examples.mysql.sakila.tables.Customer CUSTOMER = new org.jooq.examples.mysql.sakila.tables.Customer();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord> getRecordType() {
		return org.jooq.examples.mysql.sakila.tables.records.CustomerRecord.class;
	}

	/**
	 * The table column <code>sakila.customer.customer_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord, java.lang.Short> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>sakila.customer.store_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_customer_store
	 * FOREIGN KEY (store_id)
	 * REFERENCES sakila.store (store_id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord, java.lang.Byte> STORE_ID = createField("store_id", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The table column <code>sakila.customer.first_name</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord, java.lang.String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>sakila.customer.last_name</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord, java.lang.String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>sakila.customer.email</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord, java.lang.String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>sakila.customer.address_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_customer_address
	 * FOREIGN KEY (address_id)
	 * REFERENCES sakila.address (address_id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord, java.lang.Short> ADDRESS_ID = createField("address_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>sakila.customer.active</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord, java.lang.Byte> ACTIVE = createField("active", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The table column <code>sakila.customer.create_date</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord, java.sql.Timestamp> CREATE_DATE = createField("create_date", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The table column <code>sakila.customer.last_update</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord, java.sql.Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public Customer() {
		super("customer", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}

	public Customer(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.Sakila.SAKILA, org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord, java.lang.Short> getIdentity() {
		return org.jooq.examples.mysql.sakila.Keys.IDENTITY_CUSTOMER;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord> getMainKey() {
		return org.jooq.examples.mysql.sakila.Keys.KEY_CUSTOMER_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord>>asList(org.jooq.examples.mysql.sakila.Keys.KEY_CUSTOMER_PRIMARY);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord, ?>>asList(org.jooq.examples.mysql.sakila.Keys.FK_CUSTOMER_STORE, org.jooq.examples.mysql.sakila.Keys.FK_CUSTOMER_ADDRESS);
	}

	@Override
	public org.jooq.examples.mysql.sakila.tables.Customer as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.Customer(alias);
	}
}
