package com.indus.training.domain;

public class TempInputs {
	private Double param1;
	private String operation;

	public Double getParam1() {
		return param1;
	}

	public TempInputs() {
		super();
	}

	public void setParam1(Double param1) {
		this.param1 = param1;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	@Override
	public String toString() {
		return "TempInputs [param1=" + param1 + ", operation=" + operation + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((operation == null) ? 0 : operation.hashCode());
		result = prime * result + ((param1 == null) ? 0 : param1.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof TempInputs))
			return false;
		TempInputs other = (TempInputs) obj;
		if (operation == null) {
			if (other.operation != null)
				return false;
		} else if (!operation.equals(other.operation))
			return false;
		if (param1 == null) {
			if (other.param1 != null)
				return false;
		} else if (!param1.equals(other.param1))
			return false;
		return true;
	}
}
