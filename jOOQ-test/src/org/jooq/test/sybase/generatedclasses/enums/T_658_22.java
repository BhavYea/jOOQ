/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.enums;

/**
 * This class is generated by jOOQ.
 */
public enum T_658_22 implements org.jooq.MasterDataType<java.lang.Integer> {

	/**
	 * 1
	 */
	_1(1, 1),

	/**
	 * 2
	 */
	_2(2, 2),

	/**
	 * 3
	 */
	_3(3, 3),
	;

	private final java.lang.Integer id;
	private final java.lang.Integer cd;

	private T_658_22(java.lang.Integer id, java.lang.Integer cd) {
		this.id = id;
		this.cd = cd;
	}

	@Override
	public java.lang.Integer getPrimaryKey() {
		return id;
	}

	/**
	 * The table column <code>DBA.t_658_22.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final java.lang.Integer getId() {
		return id;
	}

	/**
	 * The table column <code>DBA.t_658_22.cd</code>
	 */
	public final java.lang.Integer getCd() {
		return cd;
	}
}
