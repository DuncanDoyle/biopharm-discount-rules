package com.myspace.drug_orders.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.xml.bind.annotation.XmlRootElement
public class OrderRegulationViolations implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Violations")
	private java.util.List<java.lang.String> violations;

	public OrderRegulationViolations() {
	}

	public java.util.List<java.lang.String> getViolations() {
		return this.violations;
	}

	public void setViolations(java.util.List<java.lang.String> violations) {
		this.violations = violations;
	}

	public OrderRegulationViolations(java.util.List<java.lang.String> violations) {
		this.violations = violations;
	}

}
