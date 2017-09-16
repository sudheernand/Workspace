/**
 * CalcInputs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.indus.training.service;

public class CalcInputs  implements java.io.Serializable {
    private double input1;

    private double input2;

    public CalcInputs() {
    }

    public CalcInputs(
           double input1,
           double input2) {
           this.input1 = input1;
           this.input2 = input2;
    }


    /**
     * Gets the input1 value for this CalcInputs.
     * 
     * @return input1
     */
    public double getInput1() {
        return input1;
    }


    /**
     * Sets the input1 value for this CalcInputs.
     * 
     * @param input1
     */
    public void setInput1(double input1) {
        this.input1 = input1;
    }


    /**
     * Gets the input2 value for this CalcInputs.
     * 
     * @return input2
     */
    public double getInput2() {
        return input2;
    }


    /**
     * Sets the input2 value for this CalcInputs.
     * 
     * @param input2
     */
    public void setInput2(double input2) {
        this.input2 = input2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CalcInputs)) return false;
        CalcInputs other = (CalcInputs) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.input1 == other.getInput1() &&
            this.input2 == other.getInput2();
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
        _hashCode += new Double(getInput1()).hashCode();
        _hashCode += new Double(getInput2()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CalcInputs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("service.training.indus.com", "calcInputs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("input1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "input1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("input2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "input2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
