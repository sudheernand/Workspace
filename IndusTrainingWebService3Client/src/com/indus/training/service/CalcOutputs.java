/**
 * CalcOutputs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.indus.training.service;

public class CalcOutputs  implements java.io.Serializable {
    private java.lang.String operation;

    private java.lang.Double param1;

    private java.lang.Double param2;

    private java.lang.Double result;

    public CalcOutputs() {
    }

    public CalcOutputs(
           java.lang.String operation,
           java.lang.Double param1,
           java.lang.Double param2,
           java.lang.Double result) {
           this.operation = operation;
           this.param1 = param1;
           this.param2 = param2;
           this.result = result;
    }


    /**
     * Gets the operation value for this CalcOutputs.
     * 
     * @return operation
     */
    public java.lang.String getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this CalcOutputs.
     * 
     * @param operation
     */
    public void setOperation(java.lang.String operation) {
        this.operation = operation;
    }


    /**
     * Gets the param1 value for this CalcOutputs.
     * 
     * @return param1
     */
    public java.lang.Double getParam1() {
        return param1;
    }


    /**
     * Sets the param1 value for this CalcOutputs.
     * 
     * @param param1
     */
    public void setParam1(java.lang.Double param1) {
        this.param1 = param1;
    }


    /**
     * Gets the param2 value for this CalcOutputs.
     * 
     * @return param2
     */
    public java.lang.Double getParam2() {
        return param2;
    }


    /**
     * Sets the param2 value for this CalcOutputs.
     * 
     * @param param2
     */
    public void setParam2(java.lang.Double param2) {
        this.param2 = param2;
    }


    /**
     * Gets the result value for this CalcOutputs.
     * 
     * @return result
     */
    public java.lang.Double getResult() {
        return result;
    }


    /**
     * Sets the result value for this CalcOutputs.
     * 
     * @param result
     */
    public void setResult(java.lang.Double result) {
        this.result = result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CalcOutputs)) return false;
        CalcOutputs other = (CalcOutputs) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation()))) &&
            ((this.param1==null && other.getParam1()==null) || 
             (this.param1!=null &&
              this.param1.equals(other.getParam1()))) &&
            ((this.param2==null && other.getParam2()==null) || 
             (this.param2!=null &&
              this.param2.equals(other.getParam2()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        if (getParam1() != null) {
            _hashCode += getParam1().hashCode();
        }
        if (getParam2() != null) {
            _hashCode += getParam2().hashCode();
        }
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CalcOutputs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("service.training.indus.com", "calcOutputs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("param1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "param1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("param2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "param2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
