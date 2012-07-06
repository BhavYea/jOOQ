/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
public class NicerButSlowerFilmList extends org.jooq.impl.TableImpl<org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord> {

	private static final long serialVersionUID = -1476711992;

	/**
	 * The singleton instance of sakila.nicer_but_slower_film_list
	 */
	public static final org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList NICER_BUT_SLOWER_FILM_LIST = new org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord> getRecordType() {
		return org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord.class;
	}

	/**
	 * The table column <code>sakila.nicer_but_slower_film_list.FID</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord, java.lang.Short> FID = createField("FID", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>sakila.nicer_but_slower_film_list.title</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord, java.lang.String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>sakila.nicer_but_slower_film_list.description</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The table column <code>sakila.nicer_but_slower_film_list.category</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord, java.lang.String> CATEGORY = createField("category", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>sakila.nicer_but_slower_film_list.price</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord, java.math.BigDecimal> PRICE = createField("price", org.jooq.impl.SQLDataType.DECIMAL, this);

	/**
	 * The table column <code>sakila.nicer_but_slower_film_list.length</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord, java.lang.Short> LENGTH = createField("length", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>sakila.nicer_but_slower_film_list.rating</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord, org.jooq.examples.mysql.sakila.enums.NicerButSlowerFilmListRating> RATING = createField("rating", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(org.jooq.examples.mysql.sakila.enums.NicerButSlowerFilmListRating.class), this);

	/**
	 * The table column <code>sakila.nicer_but_slower_film_list.actors</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord, java.lang.String> ACTORS = createField("actors", org.jooq.impl.SQLDataType.VARCHAR, this);

	public NicerButSlowerFilmList() {
		super("nicer_but_slower_film_list", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}

	public NicerButSlowerFilmList(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.Sakila.SAKILA, org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST);
	}

	@Override
	public org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList(alias);
	}
}
