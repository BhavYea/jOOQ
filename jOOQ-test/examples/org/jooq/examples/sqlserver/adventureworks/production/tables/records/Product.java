/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "Product", schema = "Production")
public class Product extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product> {

	private static final long serialVersionUID = 1892754616;

	/**
	 * The table column <code>Production.Product.ProductID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setProductID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ProductID, value);
	}

	/**
	 * The table column <code>Production.Product.ProductID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ProductID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getProductID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ProductID);
	}

	/**
	 * The table column <code>Production.Product.Name</code>
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.Name, value);
	}

	/**
	 * The table column <code>Production.Product.Name</code>
	 */
	@javax.persistence.Column(name = "Name", nullable = false, length = 50)
	public java.lang.String getName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.Name);
	}

	/**
	 * The table column <code>Production.Product.ProductNumber</code>
	 */
	public void setProductNumber(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ProductNumber, value);
	}

	/**
	 * The table column <code>Production.Product.ProductNumber</code>
	 */
	@javax.persistence.Column(name = "ProductNumber", nullable = false, length = 25)
	public java.lang.String getProductNumber() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ProductNumber);
	}

	/**
	 * The table column <code>Production.Product.MakeFlag</code>
	 */
	public void setMakeFlag(java.lang.Boolean value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.MakeFlag, value);
	}

	/**
	 * The table column <code>Production.Product.MakeFlag</code>
	 */
	@javax.persistence.Column(name = "MakeFlag", nullable = false)
	public java.lang.Boolean getMakeFlag() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.MakeFlag);
	}

	/**
	 * The table column <code>Production.Product.FinishedGoodsFlag</code>
	 */
	public void setFinishedGoodsFlag(java.lang.Boolean value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.FinishedGoodsFlag, value);
	}

	/**
	 * The table column <code>Production.Product.FinishedGoodsFlag</code>
	 */
	@javax.persistence.Column(name = "FinishedGoodsFlag", nullable = false)
	public java.lang.Boolean getFinishedGoodsFlag() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.FinishedGoodsFlag);
	}

	/**
	 * The table column <code>Production.Product.Color</code>
	 */
	public void setColor(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.Color, value);
	}

	/**
	 * The table column <code>Production.Product.Color</code>
	 */
	@javax.persistence.Column(name = "Color", length = 15)
	public java.lang.String getColor() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.Color);
	}

	/**
	 * The table column <code>Production.Product.SafetyStockLevel</code>
	 */
	public void setSafetyStockLevel(java.lang.Short value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.SafetyStockLevel, value);
	}

	/**
	 * The table column <code>Production.Product.SafetyStockLevel</code>
	 */
	@javax.persistence.Column(name = "SafetyStockLevel", nullable = false, precision = 5)
	public java.lang.Short getSafetyStockLevel() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.SafetyStockLevel);
	}

	/**
	 * The table column <code>Production.Product.ReorderPoint</code>
	 */
	public void setReorderPoint(java.lang.Short value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ReorderPoint, value);
	}

	/**
	 * The table column <code>Production.Product.ReorderPoint</code>
	 */
	@javax.persistence.Column(name = "ReorderPoint", nullable = false, precision = 5)
	public java.lang.Short getReorderPoint() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ReorderPoint);
	}

	/**
	 * The table column <code>Production.Product.StandardCost</code>
	 */
	public void setStandardCost(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.StandardCost, value);
	}

	/**
	 * The table column <code>Production.Product.StandardCost</code>
	 */
	@javax.persistence.Column(name = "StandardCost", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getStandardCost() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.StandardCost);
	}

	/**
	 * The table column <code>Production.Product.ListPrice</code>
	 */
	public void setListPrice(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ListPrice, value);
	}

	/**
	 * The table column <code>Production.Product.ListPrice</code>
	 */
	@javax.persistence.Column(name = "ListPrice", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getListPrice() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ListPrice);
	}

	/**
	 * The table column <code>Production.Product.Size</code>
	 */
	public void setSize(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.Size, value);
	}

	/**
	 * The table column <code>Production.Product.Size</code>
	 */
	@javax.persistence.Column(name = "Size", length = 5)
	public java.lang.String getSize() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.Size);
	}

	/**
	 * The table column <code>Production.Product.SizeUnitMeasureCode</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_Product_UnitMeasure_SizeUnitMeasureCode
	 * FOREIGN KEY (SizeUnitMeasureCode)
	 * REFERENCES Production.UnitMeasure (UnitMeasureCode)
	 * </pre></code>
	 */
	public void setSizeUnitMeasureCode(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.SizeUnitMeasureCode, value);
	}

	/**
	 * The table column <code>Production.Product.SizeUnitMeasureCode</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_Product_UnitMeasure_SizeUnitMeasureCode
	 * FOREIGN KEY (SizeUnitMeasureCode)
	 * REFERENCES Production.UnitMeasure (UnitMeasureCode)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "SizeUnitMeasureCode", length = 3)
	public java.lang.String getSizeUnitMeasureCode() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.SizeUnitMeasureCode);
	}

	/**
	 * The table column <code>Production.Product.WeightUnitMeasureCode</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_Product_UnitMeasure_WeightUnitMeasureCode
	 * FOREIGN KEY (WeightUnitMeasureCode)
	 * REFERENCES Production.UnitMeasure (UnitMeasureCode)
	 * </pre></code>
	 */
	public void setWeightUnitMeasureCode(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.WeightUnitMeasureCode, value);
	}

	/**
	 * The table column <code>Production.Product.WeightUnitMeasureCode</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_Product_UnitMeasure_WeightUnitMeasureCode
	 * FOREIGN KEY (WeightUnitMeasureCode)
	 * REFERENCES Production.UnitMeasure (UnitMeasureCode)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "WeightUnitMeasureCode", length = 3)
	public java.lang.String getWeightUnitMeasureCode() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.WeightUnitMeasureCode);
	}

	/**
	 * The table column <code>Production.Product.Weight</code>
	 */
	public void setWeight(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.Weight, value);
	}

	/**
	 * The table column <code>Production.Product.Weight</code>
	 */
	@javax.persistence.Column(name = "Weight", precision = 8, scale = 2)
	public java.math.BigDecimal getWeight() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.Weight);
	}

	/**
	 * The table column <code>Production.Product.DaysToManufacture</code>
	 */
	public void setDaysToManufacture(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.DaysToManufacture, value);
	}

	/**
	 * The table column <code>Production.Product.DaysToManufacture</code>
	 */
	@javax.persistence.Column(name = "DaysToManufacture", nullable = false, precision = 10)
	public java.lang.Integer getDaysToManufacture() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.DaysToManufacture);
	}

	/**
	 * The table column <code>Production.Product.ProductLine</code>
	 */
	public void setProductLine(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ProductLine, value);
	}

	/**
	 * The table column <code>Production.Product.ProductLine</code>
	 */
	@javax.persistence.Column(name = "ProductLine", length = 2)
	public java.lang.String getProductLine() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ProductLine);
	}

	/**
	 * The table column <code>Production.Product.Class</code>
	 */
	public void setClass_(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.Class, value);
	}

	/**
	 * The table column <code>Production.Product.Class</code>
	 */
	@javax.persistence.Column(name = "Class", length = 2)
	public java.lang.String getClass_() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.Class);
	}

	/**
	 * The table column <code>Production.Product.Style</code>
	 */
	public void setStyle(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.Style, value);
	}

	/**
	 * The table column <code>Production.Product.Style</code>
	 */
	@javax.persistence.Column(name = "Style", length = 2)
	public java.lang.String getStyle() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.Style);
	}

	/**
	 * The table column <code>Production.Product.ProductSubcategoryID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_Product_ProductSubcategory_ProductSubcategoryID
	 * FOREIGN KEY (ProductSubcategoryID)
	 * REFERENCES Production.ProductSubcategory (ProductSubcategoryID)
	 * </pre></code>
	 */
	public void setProductSubcategoryID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ProductSubcategoryID, value);
	}

	/**
	 * The table column <code>Production.Product.ProductSubcategoryID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_Product_ProductSubcategory_ProductSubcategoryID
	 * FOREIGN KEY (ProductSubcategoryID)
	 * REFERENCES Production.ProductSubcategory (ProductSubcategoryID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ProductSubcategoryID", precision = 10)
	public java.lang.Integer getProductSubcategoryID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ProductSubcategoryID);
	}

	/**
	 * The table column <code>Production.Product.ProductModelID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_Product_ProductModel_ProductModelID
	 * FOREIGN KEY (ProductModelID)
	 * REFERENCES Production.ProductModel (ProductModelID)
	 * </pre></code>
	 */
	public void setProductModelID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ProductModelID, value);
	}

	/**
	 * The table column <code>Production.Product.ProductModelID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_Product_ProductModel_ProductModelID
	 * FOREIGN KEY (ProductModelID)
	 * REFERENCES Production.ProductModel (ProductModelID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ProductModelID", precision = 10)
	public java.lang.Integer getProductModelID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ProductModelID);
	}

	/**
	 * The table column <code>Production.Product.SellStartDate</code>
	 */
	public void setSellStartDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.SellStartDate, value);
	}

	/**
	 * The table column <code>Production.Product.SellStartDate</code>
	 */
	@javax.persistence.Column(name = "SellStartDate", nullable = false)
	public java.sql.Timestamp getSellStartDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.SellStartDate);
	}

	/**
	 * The table column <code>Production.Product.SellEndDate</code>
	 */
	public void setSellEndDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.SellEndDate, value);
	}

	/**
	 * The table column <code>Production.Product.SellEndDate</code>
	 */
	@javax.persistence.Column(name = "SellEndDate")
	public java.sql.Timestamp getSellEndDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.SellEndDate);
	}

	/**
	 * The table column <code>Production.Product.DiscontinuedDate</code>
	 */
	public void setDiscontinuedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.DiscontinuedDate, value);
	}

	/**
	 * The table column <code>Production.Product.DiscontinuedDate</code>
	 */
	@javax.persistence.Column(name = "DiscontinuedDate")
	public java.sql.Timestamp getDiscontinuedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.DiscontinuedDate);
	}

	/**
	 * The table column <code>Production.Product.rowguid</code>
	 */
	public void setrowguid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.rowguid, value);
	}

	/**
	 * The table column <code>Production.Product.rowguid</code>
	 */
	@javax.persistence.Column(name = "rowguid", nullable = false)
	public java.lang.String getrowguid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.rowguid);
	}

	/**
	 * The table column <code>Production.Product.ModifiedDate</code>
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ModifiedDate, value);
	}

	/**
	 * The table column <code>Production.Product.ModifiedDate</code>
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ModifiedDate);
	}

	/**
	 * Create a detached Product
	 */
	public Product() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product);
	}
}
