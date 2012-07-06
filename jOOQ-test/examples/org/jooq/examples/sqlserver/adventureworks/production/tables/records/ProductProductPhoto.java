/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "ProductProductPhoto", schema = "Production", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"ProductID", "ProductPhotoID"})
})
public class ProductProductPhoto extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductProductPhoto> {

	private static final long serialVersionUID = 738273061;

	/**
	 * The table column <code>Production.ProductProductPhoto.ProductID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_ProductProductPhoto_Product_ProductID
	 * FOREIGN KEY (ProductID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	public void setProductID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductProductPhoto.ProductProductPhoto.ProductID, value);
	}

	/**
	 * The table column <code>Production.ProductProductPhoto.ProductID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_ProductProductPhoto_Product_ProductID
	 * FOREIGN KEY (ProductID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ProductID", nullable = false, precision = 10)
	public java.lang.Integer getProductID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductProductPhoto.ProductProductPhoto.ProductID);
	}

	/**
	 * The table column <code>Production.ProductProductPhoto.ProductPhotoID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_ProductProductPhoto_ProductPhoto_ProductPhotoID
	 * FOREIGN KEY (ProductPhotoID)
	 * REFERENCES Production.ProductPhoto (ProductPhotoID)
	 * </pre></code>
	 */
	public void setProductPhotoID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductProductPhoto.ProductProductPhoto.ProductPhotoID, value);
	}

	/**
	 * The table column <code>Production.ProductProductPhoto.ProductPhotoID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_ProductProductPhoto_ProductPhoto_ProductPhotoID
	 * FOREIGN KEY (ProductPhotoID)
	 * REFERENCES Production.ProductPhoto (ProductPhotoID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ProductPhotoID", nullable = false, precision = 10)
	public java.lang.Integer getProductPhotoID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductProductPhoto.ProductProductPhoto.ProductPhotoID);
	}

	/**
	 * The table column <code>Production.ProductProductPhoto.Primary</code>
	 */
	public void setPrimary(java.lang.Boolean value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductProductPhoto.ProductProductPhoto.Primary, value);
	}

	/**
	 * The table column <code>Production.ProductProductPhoto.Primary</code>
	 */
	@javax.persistence.Column(name = "Primary", nullable = false)
	public java.lang.Boolean getPrimary() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductProductPhoto.ProductProductPhoto.Primary);
	}

	/**
	 * The table column <code>Production.ProductProductPhoto.ModifiedDate</code>
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductProductPhoto.ProductProductPhoto.ModifiedDate, value);
	}

	/**
	 * The table column <code>Production.ProductProductPhoto.ModifiedDate</code>
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductProductPhoto.ProductProductPhoto.ModifiedDate);
	}

	/**
	 * Create a detached ProductProductPhoto
	 */
	public ProductProductPhoto() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductProductPhoto.ProductProductPhoto);
	}
}
