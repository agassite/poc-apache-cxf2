package com.ideo.poc.cxf;
import com.ideo.poc.cxf.AdditionRequest;
import com.ideo.poc.cxf.AdditionResponse;
import com.ideo.poc.cxf.OperationService;



public class OperationServiceImpl implements OperationService{

	public AdditionResponse addition(AdditionRequest additionRequest) {
		AdditionResponse response = new AdditionResponse();
		response.setReturn(additionRequest.getArg0() + additionRequest.getArg1());
		return response;
	}

}
