/**
 * LoginResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise;

public class LoginResult  implements java.io.Serializable {
    private boolean passwordExpired;

    private java.lang.String serverUrl;

    private java.lang.String sessionId;

    private java.lang.String userId;

    private com.sforce.soap.enterprise.GetUserInfoResult userInfo;

    public LoginResult() {
    }

    public LoginResult(
           boolean passwordExpired,
           java.lang.String serverUrl,
           java.lang.String sessionId,
           java.lang.String userId,
           com.sforce.soap.enterprise.GetUserInfoResult userInfo) {
           this.passwordExpired = passwordExpired;
           this.serverUrl = serverUrl;
           this.sessionId = sessionId;
           this.userId = userId;
           this.userInfo = userInfo;
    }


    /**
     * Gets the passwordExpired value for this LoginResult.
     * 
     * @return passwordExpired
     */
    public boolean isPasswordExpired() {
        return passwordExpired;
    }


    /**
     * Sets the passwordExpired value for this LoginResult.
     * 
     * @param passwordExpired
     */
    public void setPasswordExpired(boolean passwordExpired) {
        this.passwordExpired = passwordExpired;
    }


    /**
     * Gets the serverUrl value for this LoginResult.
     * 
     * @return serverUrl
     */
    public java.lang.String getServerUrl() {
        return serverUrl;
    }


    /**
     * Sets the serverUrl value for this LoginResult.
     * 
     * @param serverUrl
     */
    public void setServerUrl(java.lang.String serverUrl) {
        this.serverUrl = serverUrl;
    }


    /**
     * Gets the sessionId value for this LoginResult.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this LoginResult.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the userId value for this LoginResult.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this LoginResult.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the userInfo value for this LoginResult.
     * 
     * @return userInfo
     */
    public com.sforce.soap.enterprise.GetUserInfoResult getUserInfo() {
        return userInfo;
    }


    /**
     * Sets the userInfo value for this LoginResult.
     * 
     * @param userInfo
     */
    public void setUserInfo(com.sforce.soap.enterprise.GetUserInfoResult userInfo) {
        this.userInfo = userInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoginResult)) return false;
        LoginResult other = (LoginResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.passwordExpired == other.isPasswordExpired() &&
            ((this.serverUrl==null && other.getServerUrl()==null) || 
             (this.serverUrl!=null &&
              this.serverUrl.equals(other.getServerUrl()))) &&
            ((this.sessionId==null && other.getSessionId()==null) || 
             (this.sessionId!=null &&
              this.sessionId.equals(other.getSessionId()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.userInfo==null && other.getUserInfo()==null) || 
             (this.userInfo!=null &&
              this.userInfo.equals(other.getUserInfo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += (isPasswordExpired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getServerUrl() != null) {
            _hashCode += getServerUrl().hashCode();
        }
        if (getSessionId() != null) {
            _hashCode += getSessionId().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getUserInfo() != null) {
            _hashCode += getUserInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoginResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "LoginResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordExpired");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "passwordExpired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "serverUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "userInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "GetUserInfoResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
