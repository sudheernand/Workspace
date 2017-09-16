/**
 * CalcService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.indus.training.service;

public interface CalcService extends javax.xml.rpc.Service {
    public java.lang.String getCalcPortAddress();

    public com.indus.training.service.CalcWs getCalcPort() throws javax.xml.rpc.ServiceException;

    public com.indus.training.service.CalcWs getCalcPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
