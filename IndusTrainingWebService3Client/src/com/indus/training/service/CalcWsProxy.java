package com.indus.training.service;

public class CalcWsProxy implements com.indus.training.service.CalcWs {
  private String _endpoint = null;
  private com.indus.training.service.CalcWs calcWs = null;
  
  public CalcWsProxy() {
    _initCalcWsProxy();
  }
  
  public CalcWsProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalcWsProxy();
  }
  
  private void _initCalcWsProxy() {
    try {
      calcWs = (new com.indus.training.service.CalcServiceLocator()).getCalcPort();
      if (calcWs != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calcWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calcWs)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calcWs != null)
      ((javax.xml.rpc.Stub)calcWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.indus.training.service.CalcWs getCalcWs() {
    if (calcWs == null)
      _initCalcWsProxy();
    return calcWs;
  }
  
  public com.indus.training.service.CalcOutputs add(com.indus.training.service.CalcInputs arg0) throws java.rmi.RemoteException, com.indus.training.service.CalcException{
    if (calcWs == null)
      _initCalcWsProxy();
    return calcWs.add(arg0);
  }
  
  
}