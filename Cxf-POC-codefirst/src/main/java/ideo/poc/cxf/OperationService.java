package ideo.poc.cxf;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface OperationService {
	
	@WebMethod
	public int addition (int a, int b);

}
