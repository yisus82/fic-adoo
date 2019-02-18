/**
 * InternalCRM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.udc.mashup.internalcrm.service.wsdl;

public interface InternalCRM extends java.rmi.Remote {
    public es.udc.mashup.internalcrm.service.wsdl.LeadWTO[] findLeads(double in0, double in1, java.lang.String in2) throws java.rmi.RemoteException;
    public es.udc.mashup.internalcrm.service.wsdl.LeadWTO[] findLastLeads(java.util.Calendar in0, java.util.Calendar in1) throws java.rmi.RemoteException;
}
