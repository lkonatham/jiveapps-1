
package com.vidyo.user;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "SeatLicenseExpiredFault", targetNamespace = "http://portal.vidyo.com/user/v1_1")
public class SeatLicenseExpiredFault_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private SeatLicenseExpiredFault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public SeatLicenseExpiredFault_Exception(String message, SeatLicenseExpiredFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public SeatLicenseExpiredFault_Exception(String message, SeatLicenseExpiredFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vidyo.user.SeatLicenseExpiredFault
     */
    public SeatLicenseExpiredFault getFaultInfo() {
        return faultInfo;
    }

}