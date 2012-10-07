package com.ideo.poc.cxf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2012-09-22T16:15:02.333+02:00
 * Generated source version: 2.6.2
 * 
 */
@WebService(targetNamespace = "http://cxf.poc.ideo.com/", name = "OperationService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface OperationService {

    @WebResult(name = "additionResponse", targetNamespace = "http://cxf.poc.ideo.com/", partName = "additionResponse")
    @WebMethod
    public AdditionResponse addition(
        @WebParam(partName = "additionRequest", name = "additionRequest", targetNamespace = "http://cxf.poc.ideo.com/")
        AdditionRequest additionRequest
    );
}
