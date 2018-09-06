package com.bala.adv_query;

/**
 * This class was automatically generated by the data modeler tool.
 * Modified to extend org.drools.persistence.jpa.marshaller.VariableEntity
 */

@javax.persistence.Entity
public class AppData extends org.drools.persistence.jpa.marshaller.VariableEntity implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "APPDATA_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "APPDATA_ID_SEQ", name = "APPDATA_ID_GENERATOR")
	private java.lang.Long id;

	private java.lang.String productType;

	private java.lang.String docType;

	private java.lang.String appId;

	private java.lang.String appType;

	public AppData() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getProductType() {
		return this.productType;
	}

	public void setProductType(java.lang.String productType) {
		this.productType = productType;
	}

	public java.lang.String getDocType() {
		return this.docType;
	}

	public void setDocType(java.lang.String docType) {
		this.docType = docType;
	}

	public java.lang.String getAppId() {
		return this.appId;
	}

	public void setAppId(java.lang.String appId) {
		this.appId = appId;
	}

	public java.lang.String getAppType() {
		return this.appType;
	}

	public void setAppType(java.lang.String appType) {
		this.appType = appType;
	}

	public AppData(java.lang.Long id, java.lang.String productType,
			java.lang.String docType, java.lang.String appId,
			java.lang.String appType) {
		this.id = id;
		this.productType = productType;
		this.docType = docType;
		this.appId = appId;
		this.appType = appType;
	}

}