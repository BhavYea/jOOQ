/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.enums;

/**
 * This class is generated by jOOQ.
 */
public enum T_658_32 implements org.jooq.MasterDataType<java.lang.Long> {

	/**
	 * 1
	 */
	_1(1L, 1L),

	/**
	 * 2
	 */
	_2(2L, 2L),

	/**
	 * 3
	 */
	_3(3L, 3L),
	;

	private final java.lang.Long id;
	private final java.lang.Long cd;

	private T_658_32(java.lang.Long id, java.lang.Long cd) {
		this.id = id;
		this.cd = cd;
	}

	@Override
	public java.lang.Long getPrimaryKey() {
		return id;
	}

	/**
	 * The table column <code>PUBLIC.T_658_32.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final java.lang.Long getId() {
		return id;
	}

	/**
	 * The table column <code>PUBLIC.T_658_32.CD</code>
	 */
	public final java.lang.Long getCd() {
		return cd;
	}
}
