package com.ideo.poc.cxf;

public class OperationWSMain {
	
	public static void main(String [] args) {
		OperationWS service = new OperationWS();
    	OperationService webservice = service.getOperationServiceImplPort();
    	AdditionRequest request = new AdditionRequest();
    	request.setArg0(1);
    	request.setArg1(2);
    	AdditionResponse response = webservice.addition(request);
    	System.out.println("La somme est égale à " + response.getReturn());
	}

}
