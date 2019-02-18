/**
 * BusinessHours.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class BusinessHours  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String fridayEnd;

    private java.lang.String fridayStart;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String mondayEnd;

    private java.lang.String mondayStart;

    private java.lang.String saturdayEnd;

    private java.lang.String saturdayStart;

    private java.lang.String sundayEnd;

    private java.lang.String sundayStart;

    private java.util.Calendar systemModstamp;

    private java.lang.String thursdayEnd;

    private java.lang.String thursdayStart;

    private java.lang.String tuesdayEnd;

    private java.lang.String tuesdayStart;

    private java.lang.String wednesdayEnd;

    private java.lang.String wednesdayStart;

    public BusinessHours() {
    }

    public BusinessHours(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String fridayEnd,
           java.lang.String fridayStart,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String mondayEnd,
           java.lang.String mondayStart,
           java.lang.String saturdayEnd,
           java.lang.String saturdayStart,
           java.lang.String sundayEnd,
           java.lang.String sundayStart,
           java.util.Calendar systemModstamp,
           java.lang.String thursdayEnd,
           java.lang.String thursdayStart,
           java.lang.String tuesdayEnd,
           java.lang.String tuesdayStart,
           java.lang.String wednesdayEnd,
           java.lang.String wednesdayStart) {
        super(
            fieldsToNull,
            id);
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.fridayEnd = fridayEnd;
        this.fridayStart = fridayStart;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.mondayEnd = mondayEnd;
        this.mondayStart = mondayStart;
        this.saturdayEnd = saturdayEnd;
        this.saturdayStart = saturdayStart;
        this.sundayEnd = sundayEnd;
        this.sundayStart = sundayStart;
        this.systemModstamp = systemModstamp;
        this.thursdayEnd = thursdayEnd;
        this.thursdayStart = thursdayStart;
        this.tuesdayEnd = tuesdayEnd;
        this.tuesdayStart = tuesdayStart;
        this.wednesdayEnd = wednesdayEnd;
        this.wednesdayStart = wednesdayStart;
    }


    /**
     * Gets the createdBy value for this BusinessHours.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this BusinessHours.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this BusinessHours.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this BusinessHours.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this BusinessHours.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this BusinessHours.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the fridayEnd value for this BusinessHours.
     * 
     * @return fridayEnd
     */
    public java.lang.String getFridayEnd() {
        return fridayEnd;
    }


    /**
     * Sets the fridayEnd value for this BusinessHours.
     * 
     * @param fridayEnd
     */
    public void setFridayEnd(java.lang.String fridayEnd) {
        this.fridayEnd = fridayEnd;
    }


    /**
     * Gets the fridayStart value for this BusinessHours.
     * 
     * @return fridayStart
     */
    public java.lang.String getFridayStart() {
        return fridayStart;
    }


    /**
     * Sets the fridayStart value for this BusinessHours.
     * 
     * @param fridayStart
     */
    public void setFridayStart(java.lang.String fridayStart) {
        this.fridayStart = fridayStart;
    }


    /**
     * Gets the lastModifiedBy value for this BusinessHours.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this BusinessHours.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this BusinessHours.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this BusinessHours.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this BusinessHours.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this BusinessHours.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the mondayEnd value for this BusinessHours.
     * 
     * @return mondayEnd
     */
    public java.lang.String getMondayEnd() {
        return mondayEnd;
    }


    /**
     * Sets the mondayEnd value for this BusinessHours.
     * 
     * @param mondayEnd
     */
    public void setMondayEnd(java.lang.String mondayEnd) {
        this.mondayEnd = mondayEnd;
    }


    /**
     * Gets the mondayStart value for this BusinessHours.
     * 
     * @return mondayStart
     */
    public java.lang.String getMondayStart() {
        return mondayStart;
    }


    /**
     * Sets the mondayStart value for this BusinessHours.
     * 
     * @param mondayStart
     */
    public void setMondayStart(java.lang.String mondayStart) {
        this.mondayStart = mondayStart;
    }


    /**
     * Gets the saturdayEnd value for this BusinessHours.
     * 
     * @return saturdayEnd
     */
    public java.lang.String getSaturdayEnd() {
        return saturdayEnd;
    }


    /**
     * Sets the saturdayEnd value for this BusinessHours.
     * 
     * @param saturdayEnd
     */
    public void setSaturdayEnd(java.lang.String saturdayEnd) {
        this.saturdayEnd = saturdayEnd;
    }


    /**
     * Gets the saturdayStart value for this BusinessHours.
     * 
     * @return saturdayStart
     */
    public java.lang.String getSaturdayStart() {
        return saturdayStart;
    }


    /**
     * Sets the saturdayStart value for this BusinessHours.
     * 
     * @param saturdayStart
     */
    public void setSaturdayStart(java.lang.String saturdayStart) {
        this.saturdayStart = saturdayStart;
    }


    /**
     * Gets the sundayEnd value for this BusinessHours.
     * 
     * @return sundayEnd
     */
    public java.lang.String getSundayEnd() {
        return sundayEnd;
    }


    /**
     * Sets the sundayEnd value for this BusinessHours.
     * 
     * @param sundayEnd
     */
    public void setSundayEnd(java.lang.String sundayEnd) {
        this.sundayEnd = sundayEnd;
    }


    /**
     * Gets the sundayStart value for this BusinessHours.
     * 
     * @return sundayStart
     */
    public java.lang.String getSundayStart() {
        return sundayStart;
    }


    /**
     * Sets the sundayStart value for this BusinessHours.
     * 
     * @param sundayStart
     */
    public void setSundayStart(java.lang.String sundayStart) {
        this.sundayStart = sundayStart;
    }


    /**
     * Gets the systemModstamp value for this BusinessHours.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this BusinessHours.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the thursdayEnd value for this BusinessHours.
     * 
     * @return thursdayEnd
     */
    public java.lang.String getThursdayEnd() {
        return thursdayEnd;
    }


    /**
     * Sets the thursdayEnd value for this BusinessHours.
     * 
     * @param thursdayEnd
     */
    public void setThursdayEnd(java.lang.String thursdayEnd) {
        this.thursdayEnd = thursdayEnd;
    }


    /**
     * Gets the thursdayStart value for this BusinessHours.
     * 
     * @return thursdayStart
     */
    public java.lang.String getThursdayStart() {
        return thursdayStart;
    }


    /**
     * Sets the thursdayStart value for this BusinessHours.
     * 
     * @param thursdayStart
     */
    public void setThursdayStart(java.lang.String thursdayStart) {
        this.thursdayStart = thursdayStart;
    }


    /**
     * Gets the tuesdayEnd value for this BusinessHours.
     * 
     * @return tuesdayEnd
     */
    public java.lang.String getTuesdayEnd() {
        return tuesdayEnd;
    }


    /**
     * Sets the tuesdayEnd value for this BusinessHours.
     * 
     * @param tuesdayEnd
     */
    public void setTuesdayEnd(java.lang.String tuesdayEnd) {
        this.tuesdayEnd = tuesdayEnd;
    }


    /**
     * Gets the tuesdayStart value for this BusinessHours.
     * 
     * @return tuesdayStart
     */
    public java.lang.String getTuesdayStart() {
        return tuesdayStart;
    }


    /**
     * Sets the tuesdayStart value for this BusinessHours.
     * 
     * @param tuesdayStart
     */
    public void setTuesdayStart(java.lang.String tuesdayStart) {
        this.tuesdayStart = tuesdayStart;
    }


    /**
     * Gets the wednesdayEnd value for this BusinessHours.
     * 
     * @return wednesdayEnd
     */
    public java.lang.String getWednesdayEnd() {
        return wednesdayEnd;
    }


    /**
     * Sets the wednesdayEnd value for this BusinessHours.
     * 
     * @param wednesdayEnd
     */
    public void setWednesdayEnd(java.lang.String wednesdayEnd) {
        this.wednesdayEnd = wednesdayEnd;
    }


    /**
     * Gets the wednesdayStart value for this BusinessHours.
     * 
     * @return wednesdayStart
     */
    public java.lang.String getWednesdayStart() {
        return wednesdayStart;
    }


    /**
     * Sets the wednesdayStart value for this BusinessHours.
     * 
     * @param wednesdayStart
     */
    public void setWednesdayStart(java.lang.String wednesdayStart) {
        this.wednesdayStart = wednesdayStart;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessHours)) return false;
        BusinessHours other = (BusinessHours) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.fridayEnd==null && other.getFridayEnd()==null) || 
             (this.fridayEnd!=null &&
              this.fridayEnd.equals(other.getFridayEnd()))) &&
            ((this.fridayStart==null && other.getFridayStart()==null) || 
             (this.fridayStart!=null &&
              this.fridayStart.equals(other.getFridayStart()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.mondayEnd==null && other.getMondayEnd()==null) || 
             (this.mondayEnd!=null &&
              this.mondayEnd.equals(other.getMondayEnd()))) &&
            ((this.mondayStart==null && other.getMondayStart()==null) || 
             (this.mondayStart!=null &&
              this.mondayStart.equals(other.getMondayStart()))) &&
            ((this.saturdayEnd==null && other.getSaturdayEnd()==null) || 
             (this.saturdayEnd!=null &&
              this.saturdayEnd.equals(other.getSaturdayEnd()))) &&
            ((this.saturdayStart==null && other.getSaturdayStart()==null) || 
             (this.saturdayStart!=null &&
              this.saturdayStart.equals(other.getSaturdayStart()))) &&
            ((this.sundayEnd==null && other.getSundayEnd()==null) || 
             (this.sundayEnd!=null &&
              this.sundayEnd.equals(other.getSundayEnd()))) &&
            ((this.sundayStart==null && other.getSundayStart()==null) || 
             (this.sundayStart!=null &&
              this.sundayStart.equals(other.getSundayStart()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.thursdayEnd==null && other.getThursdayEnd()==null) || 
             (this.thursdayEnd!=null &&
              this.thursdayEnd.equals(other.getThursdayEnd()))) &&
            ((this.thursdayStart==null && other.getThursdayStart()==null) || 
             (this.thursdayStart!=null &&
              this.thursdayStart.equals(other.getThursdayStart()))) &&
            ((this.tuesdayEnd==null && other.getTuesdayEnd()==null) || 
             (this.tuesdayEnd!=null &&
              this.tuesdayEnd.equals(other.getTuesdayEnd()))) &&
            ((this.tuesdayStart==null && other.getTuesdayStart()==null) || 
             (this.tuesdayStart!=null &&
              this.tuesdayStart.equals(other.getTuesdayStart()))) &&
            ((this.wednesdayEnd==null && other.getWednesdayEnd()==null) || 
             (this.wednesdayEnd!=null &&
              this.wednesdayEnd.equals(other.getWednesdayEnd()))) &&
            ((this.wednesdayStart==null && other.getWednesdayStart()==null) || 
             (this.wednesdayStart!=null &&
              this.wednesdayStart.equals(other.getWednesdayStart())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getFridayEnd() != null) {
            _hashCode += getFridayEnd().hashCode();
        }
        if (getFridayStart() != null) {
            _hashCode += getFridayStart().hashCode();
        }
        if (getLastModifiedBy() != null) {
            _hashCode += getLastModifiedBy().hashCode();
        }
        if (getLastModifiedById() != null) {
            _hashCode += getLastModifiedById().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getMondayEnd() != null) {
            _hashCode += getMondayEnd().hashCode();
        }
        if (getMondayStart() != null) {
            _hashCode += getMondayStart().hashCode();
        }
        if (getSaturdayEnd() != null) {
            _hashCode += getSaturdayEnd().hashCode();
        }
        if (getSaturdayStart() != null) {
            _hashCode += getSaturdayStart().hashCode();
        }
        if (getSundayEnd() != null) {
            _hashCode += getSundayEnd().hashCode();
        }
        if (getSundayStart() != null) {
            _hashCode += getSundayStart().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getThursdayEnd() != null) {
            _hashCode += getThursdayEnd().hashCode();
        }
        if (getThursdayStart() != null) {
            _hashCode += getThursdayStart().hashCode();
        }
        if (getTuesdayEnd() != null) {
            _hashCode += getTuesdayEnd().hashCode();
        }
        if (getTuesdayStart() != null) {
            _hashCode += getTuesdayStart().hashCode();
        }
        if (getWednesdayEnd() != null) {
            _hashCode += getWednesdayEnd().hashCode();
        }
        if (getWednesdayStart() != null) {
            _hashCode += getWednesdayStart().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessHours.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BusinessHours"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdById");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedById"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fridayEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FridayEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fridayStart");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FridayStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedById");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedById"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mondayEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MondayEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mondayStart");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MondayStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saturdayEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SaturdayEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saturdayStart");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SaturdayStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sundayEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SundayEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sundayStart");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SundayStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemModstamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SystemModstamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thursdayEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ThursdayEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thursdayStart");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ThursdayStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tuesdayEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TuesdayEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tuesdayStart");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TuesdayStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wednesdayEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "WednesdayEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wednesdayStart");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "WednesdayStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
