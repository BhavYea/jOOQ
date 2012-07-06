/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables;

/**
 * This class is generated by jOOQ.
 */
public class JobCandidate extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.JobCandidate> {

	private static final long serialVersionUID = -2134604913;

	/**
	 * The singleton instance of HumanResources.JobCandidate
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.humanresources.tables.JobCandidate JobCandidate = new org.jooq.examples.sqlserver.adventureworks.humanresources.tables.JobCandidate();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.JobCandidate> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.JobCandidate.class;
	}

	/**
	 * The table column <code>HumanResources.JobCandidate.JobCandidateID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.JobCandidate, java.lang.Integer> JobCandidateID = createField("JobCandidateID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>HumanResources.JobCandidate.EmployeeID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_JobCandidate_Employee_EmployeeID
	 * FOREIGN KEY (EmployeeID)
	 * REFERENCES HumanResources.Employee (EmployeeID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.JobCandidate, java.lang.Integer> EmployeeID = createField("EmployeeID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>HumanResources.JobCandidate.Resume</code>
	 * <p>
	 * The SQL type of this item (xml, ) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.JobCandidate, java.lang.Object> Resume = createField("Resume", org.jooq.util.sqlserver.SQLServerDataType.getDefaultDataType("xml"), this);

	/**
	 * The table column <code>HumanResources.JobCandidate.ModifiedDate</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.JobCandidate, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public JobCandidate() {
		super("JobCandidate", org.jooq.examples.sqlserver.adventureworks.humanresources.HumanResources.HumanResources);
	}

	public JobCandidate(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.humanresources.HumanResources.HumanResources, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.JobCandidate.JobCandidate);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.JobCandidate, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.IDENTITY_JobCandidate;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.JobCandidate> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.PK_JobCandidate_JobCandidateID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.JobCandidate>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.JobCandidate>>asList(org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.PK_JobCandidate_JobCandidateID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.JobCandidate, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.JobCandidate, ?>>asList(org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.FK_JobCandidate_Employee_EmployeeID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.humanresources.tables.JobCandidate as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.humanresources.tables.JobCandidate(alias);
	}
}
