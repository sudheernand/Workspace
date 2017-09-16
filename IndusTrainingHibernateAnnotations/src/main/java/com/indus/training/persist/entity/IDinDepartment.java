package com.indus.training.persist.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class IDinDepartment {
	@Column(name = "department_id")
	private Integer departmentId;

	@Column(name = "location_id")
	private Integer locationId;

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

}
