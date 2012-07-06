/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 */
public class TBooleans extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TBooleansRecord> {

	private static final long serialVersionUID = -1351668654;

	/**
	 * The singleton instance of TEST.T_BOOLEANS
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.tables.TBooleans T_BOOLEANS = new org.jooq.test.oracle.generatedclasses.test.tables.TBooleans();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.tables.records.TBooleansRecord> getRecordType() {
		return org.jooq.test.oracle.generatedclasses.test.tables.records.TBooleansRecord.class;
	}

	/**
	 * The table column <code>TEST.T_BOOLEANS.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TBooleansRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>TEST.T_BOOLEANS.ONE_ZERO</code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_10> ONE_ZERO = createField("ONE_ZERO", org.jooq.impl.SQLDataType.INTEGER.asConvertedDataType(new org.jooq.test._.converters.Boolean_10_Converter()), this);

	/**
	 * The table column <code>TEST.T_BOOLEANS.TRUE_FALSE_LC</code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_TF_LC> TRUE_FALSE_LC = createField("TRUE_FALSE_LC", org.jooq.impl.SQLDataType.VARCHAR.asConvertedDataType(new org.jooq.test._.converters.Boolean_TF_LC_Converter()), this);

	/**
	 * The table column <code>TEST.T_BOOLEANS.TRUE_FALSE_UC</code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_TF_UC> TRUE_FALSE_UC = createField("TRUE_FALSE_UC", org.jooq.impl.SQLDataType.VARCHAR.asConvertedDataType(new org.jooq.test._.converters.Boolean_TF_UC_Converter()), this);

	/**
	 * The table column <code>TEST.T_BOOLEANS.YES_NO_LC</code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_YES_NO_LC> YES_NO_LC = createField("YES_NO_LC", org.jooq.impl.SQLDataType.VARCHAR.asConvertedDataType(new org.jooq.test._.converters.Boolean_YES_NO_LC_Converter()), this);

	/**
	 * The table column <code>TEST.T_BOOLEANS.YES_NO_UC</code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_YES_NO_UC> YES_NO_UC = createField("YES_NO_UC", org.jooq.impl.SQLDataType.VARCHAR.asConvertedDataType(new org.jooq.test._.converters.Boolean_YES_NO_UC_Converter()), this);

	/**
	 * The table column <code>TEST.T_BOOLEANS.Y_N_LC</code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_YN_LC> Y_N_LC = createField("Y_N_LC", org.jooq.impl.SQLDataType.CHAR.asConvertedDataType(new org.jooq.test._.converters.Boolean_YN_LC_Converter()), this);

	/**
	 * The table column <code>TEST.T_BOOLEANS.Y_N_UC</code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_YN_UC> Y_N_UC = createField("Y_N_UC", org.jooq.impl.SQLDataType.CHAR.asConvertedDataType(new org.jooq.test._.converters.Boolean_YN_UC_Converter()), this);

	/**
	 * The table column <code>TEST.T_BOOLEANS.VC_BOOLEAN</code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TBooleansRecord, java.lang.Boolean> VC_BOOLEAN = createField("VC_BOOLEAN", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>TEST.T_BOOLEANS.C_BOOLEAN</code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TBooleansRecord, java.lang.Boolean> C_BOOLEAN = createField("C_BOOLEAN", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>TEST.T_BOOLEANS.N_BOOLEAN</code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TBooleansRecord, java.lang.Boolean> N_BOOLEAN = createField("N_BOOLEAN", org.jooq.impl.SQLDataType.BOOLEAN, this);

	public TBooleans() {
		super("T_BOOLEANS", org.jooq.test.oracle.generatedclasses.test.Test.TEST);
	}

	public TBooleans(java.lang.String alias) {
		super(alias, org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBooleansRecord> getMainKey() {
		return org.jooq.test.oracle.generatedclasses.test.Keys.PK_T_BOOLEANS;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBooleansRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBooleansRecord>>asList(org.jooq.test.oracle.generatedclasses.test.Keys.PK_T_BOOLEANS);
	}

	@Override
	public org.jooq.test.oracle.generatedclasses.test.tables.TBooleans as(java.lang.String alias) {
		return new org.jooq.test.oracle.generatedclasses.test.tables.TBooleans(alias);
	}
}
