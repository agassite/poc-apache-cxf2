package com.ideo.poc;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.ideo.poc.cxf.AdditionRequest;
import com.ideo.poc.cxf.AdditionResponse;
import com.ideo.poc.cxf.OperationService;
import com.ideo.poc.cxf.OperationWS;

/**
 * Unit test for simple App.
 */
public class TestWebService 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestWebService( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestWebService.class );
    }

    
    
   public void testWebServiceAddition () {
    	/*OperationWS service = new OperationWS();
    	OperationService webservice = service.getOperationServiceImplPort();
    	AdditionRequest request = new AdditionRequest();
    	request.setArg0(1);
    	request.setArg1(2);
    	AdditionResponse response = webservice.addition(request);
    	assertEquals(3, response.getReturn());*/
    }

    
}
