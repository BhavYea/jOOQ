/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.dbo.routines;

/**
 * This class is generated by jOOQ.
 */
public class ufnGetProductDealerPrice extends org.jooq.impl.AbstractRoutine<java.math.BigDecimal> {

	private static final long serialVersionUID = 673969442;


	/**
	 * The procedure parameter <code>dbo.ufnGetProductDealerPrice.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * The procedure parameter <code>dbo.ufnGetProductDealerPrice.ProductID</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> ProductID = createParameter("ProductID", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The procedure parameter <code>dbo.ufnGetProductDealerPrice.OrderDate</code>
	 */
	public static final org.jooq.Parameter<java.sql.Timestamp> OrderDate = createParameter("OrderDate", org.jooq.impl.SQLDataType.TIMESTAMP);

	/**
	 * Create a new routine call instance
	 */
	public ufnGetProductDealerPrice() {
		super("ufnGetProductDealerPrice", org.jooq.examples.sqlserver.adventureworks.dbo.dbo.dbo, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(ProductID);
		addInParameter(OrderDate);
	}

	/**
	 * Set the <code>ProductID</code> parameter IN value to the routine
	 */
	public void setProductID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.routines.ufnGetProductDealerPrice.ProductID, value);
	}

	/**
	 * Set the <code>ProductID</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setProductID(org.jooq.Field<java.lang.Integer> field) {
		setField(ProductID, field);
	}

	/**
	 * Set the <code>OrderDate</code> parameter IN value to the routine
	 */
	public void setOrderDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.routines.ufnGetProductDealerPrice.OrderDate, value);
	}

	/**
	 * Set the <code>OrderDate</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setOrderDate(org.jooq.Field<java.sql.Timestamp> field) {
		setField(OrderDate, field);
	}
}
