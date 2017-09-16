/**
 * CalcServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.indus.training.service;

public class CalcServiceLocator extends org.apache.axis.client.Service implements com.indus.training.service.CalcService {

    public CalcServiceLocator() {
    }


    public CalcServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CalcServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CalcPort
    private java.lang.String CalcPort_address = "http://localhost:9010/console/IndusTrainingWebService2/CalcService";

    public java.lang.String getCalcPortAddress() {
        return CalcPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CalcPortWSDDServiceName = "CalcPort";

    public java.lang.String getCalcPortWSDDServiceName() {
        return CalcPortWSDDServiceName;
    }

    public void setCalcPortWSDDServiceName(java.lang.String name) {
        CalcPortWSDDServiceName = name;
    }

    public com.indus.training.service.CalcWs getCalcPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CalcPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCalcPort(endpoint);
    }

    public com.indus.training.service.CalcWs getCalcPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.indus.training.service.CalcPortBindingStub _stub = new com.indus.training.service.CalcPortBindingStub(portAddress, this);
            _stub.setPortName(getCalcPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCalcPortEndpointAddress(java.lang.String address) {
        CalcPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.indus.training.service.CalcWs.class.isAssignableFrom(serviceEndpointInterface)) {
                com.indus.training.service.CalcPortBindingStub _stub = new com.indus.training.service.CalcPortBindingStub(new java.net.URL(CalcPort_address), this);
                _stub.setPortName(getCalcPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CalcPort".equals(inputPortName)) {
            return getCalcPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("service.training.indus.com", "CalcService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("service.training.indus.com", "CalcPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CalcPort".equals(portName)) {
            setCalcPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
