/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 */
public class Country extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.mysql.sakila.tables.records.CountryRecord> {

	private static final long serialVersionUID = -1875267236;

	/**
	 * The singleton instance of sakila.country
	 */
	public static final org.jooq.examples.mysql.sakila.tables.Country COUNTRY = new org.jooq.examples.mysql.sakila.tables.Country();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.CountryRecord> getRecordType() {
		return org.jooq.examples.mysql.sakila.tables.records.CountryRecord.class;
	}

	/**
	 * The table column <code>sakila.country.country_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CountryRecord, java.lang.Short> COUNTRY_ID = createField("country_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>sakila.country.country</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CountryRecord, java.lang.String> COUNTRY_ = createField("country", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>sakila.country.last_update</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CountryRecord, java.sql.Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public Country() {
		super("country", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}

	public Country(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.Sakila.SAKILA, org.jooq.examples.mysql.sakila.tables.Country.COUNTRY);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.CountryRecord, java.lang.Short> getIdentity() {
		return org.jooq.examples.mysql.sakila.Keys.IDENTITY_COUNTRY;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.CountryRecord> getMainKey() {
		return org.jooq.examples.mysql.sakila.Keys.KEY_COUNTRY_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.CountryRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.CountryRecord>>asList(org.jooq.examples.mysql.sakila.Keys.KEY_COUNTRY_PRIMARY);
	}

	@Override
	public org.jooq.examples.mysql.sakila.tables.Country as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.Country(alias);
	}
}
