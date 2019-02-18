/**
 * Profile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Profile  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String description;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String licenseType;

    private java.lang.String name;

    private java.lang.Boolean permissionsApiUserOnly;

    private java.lang.Boolean permissionsConvertLeads;

    private java.lang.Boolean permissionsCreateMultiforce;

    private java.lang.Boolean permissionsCustomizeApplication;

    private java.lang.Boolean permissionsDisableNotifications;

    private java.lang.Boolean permissionsEditActivatedOrders;

    private java.lang.Boolean permissionsEditEvent;

    private java.lang.Boolean permissionsEditForecast;

    private java.lang.Boolean permissionsEditOppLineItemUnitPrice;

    private java.lang.Boolean permissionsEditPublicDocuments;

    private java.lang.Boolean permissionsEditReadonlyFields;

    private java.lang.Boolean permissionsEditReports;

    private java.lang.Boolean permissionsEditTask;

    private java.lang.Boolean permissionsImportLeads;

    private java.lang.Boolean permissionsInstallMultiforce;

    private java.lang.Boolean permissionsManageCallCenters;

    private java.lang.Boolean permissionsManageCases;

    private java.lang.Boolean permissionsManageCategories;

    private java.lang.Boolean permissionsManageCssUsers;

    private java.lang.Boolean permissionsManageDashboards;

    private java.lang.Boolean permissionsManageLeads;

    private java.lang.Boolean permissionsManageMobile;

    private java.lang.Boolean permissionsManageSelfService;

    private java.lang.Boolean permissionsManageSolutions;

    private java.lang.Boolean permissionsManageTerritories;

    private java.lang.Boolean permissionsManageUsers;

    private java.lang.Boolean permissionsModifyAllData;

    private java.lang.Boolean permissionsPasswordNeverExpires;

    private java.lang.Boolean permissionsPublishMultiforce;

    private java.lang.Boolean permissionsRunReports;

    private java.lang.Boolean permissionsSendSitRequests;

    private java.lang.Boolean permissionsSolutionImport;

    private java.lang.Boolean permissionsTransferAnyEntity;

    private java.lang.Boolean permissionsTransferAnyLead;

    private java.lang.Boolean permissionsUseTeamReassignWizards;

    private java.lang.Boolean permissionsViewAllData;

    private java.lang.Boolean permissionsViewSetup;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult users;

    public Profile() {
    }

    public Profile(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String description,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String licenseType,
           java.lang.String name,
           java.lang.Boolean permissionsApiUserOnly,
           java.lang.Boolean permissionsConvertLeads,
           java.lang.Boolean permissionsCreateMultiforce,
           java.lang.Boolean permissionsCustomizeApplication,
           java.lang.Boolean permissionsDisableNotifications,
           java.lang.Boolean permissionsEditActivatedOrders,
           java.lang.Boolean permissionsEditEvent,
           java.lang.Boolean permissionsEditForecast,
           java.lang.Boolean permissionsEditOppLineItemUnitPrice,
           java.lang.Boolean permissionsEditPublicDocuments,
           java.lang.Boolean permissionsEditReadonlyFields,
           java.lang.Boolean permissionsEditReports,
           java.lang.Boolean permissionsEditTask,
           java.lang.Boolean permissionsImportLeads,
           java.lang.Boolean permissionsInstallMultiforce,
           java.lang.Boolean permissionsManageCallCenters,
           java.lang.Boolean permissionsManageCases,
           java.lang.Boolean permissionsManageCategories,
           java.lang.Boolean permissionsManageCssUsers,
           java.lang.Boolean permissionsManageDashboards,
           java.lang.Boolean permissionsManageLeads,
           java.lang.Boolean permissionsManageMobile,
           java.lang.Boolean permissionsManageSelfService,
           java.lang.Boolean permissionsManageSolutions,
           java.lang.Boolean permissionsManageTerritories,
           java.lang.Boolean permissionsManageUsers,
           java.lang.Boolean permissionsModifyAllData,
           java.lang.Boolean permissionsPasswordNeverExpires,
           java.lang.Boolean permissionsPublishMultiforce,
           java.lang.Boolean permissionsRunReports,
           java.lang.Boolean permissionsSendSitRequests,
           java.lang.Boolean permissionsSolutionImport,
           java.lang.Boolean permissionsTransferAnyEntity,
           java.lang.Boolean permissionsTransferAnyLead,
           java.lang.Boolean permissionsUseTeamReassignWizards,
           java.lang.Boolean permissionsViewAllData,
           java.lang.Boolean permissionsViewSetup,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult users) {
        super(
            fieldsToNull,
            id);
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.description = description;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.licenseType = licenseType;
        this.name = name;
        this.permissionsApiUserOnly = permissionsApiUserOnly;
        this.permissionsConvertLeads = permissionsConvertLeads;
        this.permissionsCreateMultiforce = permissionsCreateMultiforce;
        this.permissionsCustomizeApplication = permissionsCustomizeApplication;
        this.permissionsDisableNotifications = permissionsDisableNotifications;
        this.permissionsEditActivatedOrders = permissionsEditActivatedOrders;
        this.permissionsEditEvent = permissionsEditEvent;
        this.permissionsEditForecast = permissionsEditForecast;
        this.permissionsEditOppLineItemUnitPrice = permissionsEditOppLineItemUnitPrice;
        this.permissionsEditPublicDocuments = permissionsEditPublicDocuments;
        this.permissionsEditReadonlyFields = permissionsEditReadonlyFields;
        this.permissionsEditReports = permissionsEditReports;
        this.permissionsEditTask = permissionsEditTask;
        this.permissionsImportLeads = permissionsImportLeads;
        this.permissionsInstallMultiforce = permissionsInstallMultiforce;
        this.permissionsManageCallCenters = permissionsManageCallCenters;
        this.permissionsManageCases = permissionsManageCases;
        this.permissionsManageCategories = permissionsManageCategories;
        this.permissionsManageCssUsers = permissionsManageCssUsers;
        this.permissionsManageDashboards = permissionsManageDashboards;
        this.permissionsManageLeads = permissionsManageLeads;
        this.permissionsManageMobile = permissionsManageMobile;
        this.permissionsManageSelfService = permissionsManageSelfService;
        this.permissionsManageSolutions = permissionsManageSolutions;
        this.permissionsManageTerritories = permissionsManageTerritories;
        this.permissionsManageUsers = permissionsManageUsers;
        this.permissionsModifyAllData = permissionsModifyAllData;
        this.permissionsPasswordNeverExpires = permissionsPasswordNeverExpires;
        this.permissionsPublishMultiforce = permissionsPublishMultiforce;
        this.permissionsRunReports = permissionsRunReports;
        this.permissionsSendSitRequests = permissionsSendSitRequests;
        this.permissionsSolutionImport = permissionsSolutionImport;
        this.permissionsTransferAnyEntity = permissionsTransferAnyEntity;
        this.permissionsTransferAnyLead = permissionsTransferAnyLead;
        this.permissionsUseTeamReassignWizards = permissionsUseTeamReassignWizards;
        this.permissionsViewAllData = permissionsViewAllData;
        this.permissionsViewSetup = permissionsViewSetup;
        this.systemModstamp = systemModstamp;
        this.users = users;
    }


    /**
     * Gets the createdBy value for this Profile.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Profile.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Profile.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Profile.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Profile.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Profile.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the description value for this Profile.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Profile.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the lastModifiedBy value for this Profile.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Profile.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Profile.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Profile.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Profile.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Profile.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the licenseType value for this Profile.
     * 
     * @return licenseType
     */
    public java.lang.String getLicenseType() {
        return licenseType;
    }


    /**
     * Sets the licenseType value for this Profile.
     * 
     * @param licenseType
     */
    public void setLicenseType(java.lang.String licenseType) {
        this.licenseType = licenseType;
    }


    /**
     * Gets the name value for this Profile.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Profile.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the permissionsApiUserOnly value for this Profile.
     * 
     * @return permissionsApiUserOnly
     */
    public java.lang.Boolean getPermissionsApiUserOnly() {
        return permissionsApiUserOnly;
    }


    /**
     * Sets the permissionsApiUserOnly value for this Profile.
     * 
     * @param permissionsApiUserOnly
     */
    public void setPermissionsApiUserOnly(java.lang.Boolean permissionsApiUserOnly) {
        this.permissionsApiUserOnly = permissionsApiUserOnly;
    }


    /**
     * Gets the permissionsConvertLeads value for this Profile.
     * 
     * @return permissionsConvertLeads
     */
    public java.lang.Boolean getPermissionsConvertLeads() {
        return permissionsConvertLeads;
    }


    /**
     * Sets the permissionsConvertLeads value for this Profile.
     * 
     * @param permissionsConvertLeads
     */
    public void setPermissionsConvertLeads(java.lang.Boolean permissionsConvertLeads) {
        this.permissionsConvertLeads = permissionsConvertLeads;
    }


    /**
     * Gets the permissionsCreateMultiforce value for this Profile.
     * 
     * @return permissionsCreateMultiforce
     */
    public java.lang.Boolean getPermissionsCreateMultiforce() {
        return permissionsCreateMultiforce;
    }


    /**
     * Sets the permissionsCreateMultiforce value for this Profile.
     * 
     * @param permissionsCreateMultiforce
     */
    public void setPermissionsCreateMultiforce(java.lang.Boolean permissionsCreateMultiforce) {
        this.permissionsCreateMultiforce = permissionsCreateMultiforce;
    }


    /**
     * Gets the permissionsCustomizeApplication value for this Profile.
     * 
     * @return permissionsCustomizeApplication
     */
    public java.lang.Boolean getPermissionsCustomizeApplication() {
        return permissionsCustomizeApplication;
    }


    /**
     * Sets the permissionsCustomizeApplication value for this Profile.
     * 
     * @param permissionsCustomizeApplication
     */
    public void setPermissionsCustomizeApplication(java.lang.Boolean permissionsCustomizeApplication) {
        this.permissionsCustomizeApplication = permissionsCustomizeApplication;
    }


    /**
     * Gets the permissionsDisableNotifications value for this Profile.
     * 
     * @return permissionsDisableNotifications
     */
    public java.lang.Boolean getPermissionsDisableNotifications() {
        return permissionsDisableNotifications;
    }


    /**
     * Sets the permissionsDisableNotifications value for this Profile.
     * 
     * @param permissionsDisableNotifications
     */
    public void setPermissionsDisableNotifications(java.lang.Boolean permissionsDisableNotifications) {
        this.permissionsDisableNotifications = permissionsDisableNotifications;
    }


    /**
     * Gets the permissionsEditActivatedOrders value for this Profile.
     * 
     * @return permissionsEditActivatedOrders
     */
    public java.lang.Boolean getPermissionsEditActivatedOrders() {
        return permissionsEditActivatedOrders;
    }


    /**
     * Sets the permissionsEditActivatedOrders value for this Profile.
     * 
     * @param permissionsEditActivatedOrders
     */
    public void setPermissionsEditActivatedOrders(java.lang.Boolean permissionsEditActivatedOrders) {
        this.permissionsEditActivatedOrders = permissionsEditActivatedOrders;
    }


    /**
     * Gets the permissionsEditEvent value for this Profile.
     * 
     * @return permissionsEditEvent
     */
    public java.lang.Boolean getPermissionsEditEvent() {
        return permissionsEditEvent;
    }


    /**
     * Sets the permissionsEditEvent value for this Profile.
     * 
     * @param permissionsEditEvent
     */
    public void setPermissionsEditEvent(java.lang.Boolean permissionsEditEvent) {
        this.permissionsEditEvent = permissionsEditEvent;
    }


    /**
     * Gets the permissionsEditForecast value for this Profile.
     * 
     * @return permissionsEditForecast
     */
    public java.lang.Boolean getPermissionsEditForecast() {
        return permissionsEditForecast;
    }


    /**
     * Sets the permissionsEditForecast value for this Profile.
     * 
     * @param permissionsEditForecast
     */
    public void setPermissionsEditForecast(java.lang.Boolean permissionsEditForecast) {
        this.permissionsEditForecast = permissionsEditForecast;
    }


    /**
     * Gets the permissionsEditOppLineItemUnitPrice value for this Profile.
     * 
     * @return permissionsEditOppLineItemUnitPrice
     */
    public java.lang.Boolean getPermissionsEditOppLineItemUnitPrice() {
        return permissionsEditOppLineItemUnitPrice;
    }


    /**
     * Sets the permissionsEditOppLineItemUnitPrice value for this Profile.
     * 
     * @param permissionsEditOppLineItemUnitPrice
     */
    public void setPermissionsEditOppLineItemUnitPrice(java.lang.Boolean permissionsEditOppLineItemUnitPrice) {
        this.permissionsEditOppLineItemUnitPrice = permissionsEditOppLineItemUnitPrice;
    }


    /**
     * Gets the permissionsEditPublicDocuments value for this Profile.
     * 
     * @return permissionsEditPublicDocuments
     */
    public java.lang.Boolean getPermissionsEditPublicDocuments() {
        return permissionsEditPublicDocuments;
    }


    /**
     * Sets the permissionsEditPublicDocuments value for this Profile.
     * 
     * @param permissionsEditPublicDocuments
     */
    public void setPermissionsEditPublicDocuments(java.lang.Boolean permissionsEditPublicDocuments) {
        this.permissionsEditPublicDocuments = permissionsEditPublicDocuments;
    }


    /**
     * Gets the permissionsEditReadonlyFields value for this Profile.
     * 
     * @return permissionsEditReadonlyFields
     */
    public java.lang.Boolean getPermissionsEditReadonlyFields() {
        return permissionsEditReadonlyFields;
    }


    /**
     * Sets the permissionsEditReadonlyFields value for this Profile.
     * 
     * @param permissionsEditReadonlyFields
     */
    public void setPermissionsEditReadonlyFields(java.lang.Boolean permissionsEditReadonlyFields) {
        this.permissionsEditReadonlyFields = permissionsEditReadonlyFields;
    }


    /**
     * Gets the permissionsEditReports value for this Profile.
     * 
     * @return permissionsEditReports
     */
    public java.lang.Boolean getPermissionsEditReports() {
        return permissionsEditReports;
    }


    /**
     * Sets the permissionsEditReports value for this Profile.
     * 
     * @param permissionsEditReports
     */
    public void setPermissionsEditReports(java.lang.Boolean permissionsEditReports) {
        this.permissionsEditReports = permissionsEditReports;
    }


    /**
     * Gets the permissionsEditTask value for this Profile.
     * 
     * @return permissionsEditTask
     */
    public java.lang.Boolean getPermissionsEditTask() {
        return permissionsEditTask;
    }


    /**
     * Sets the permissionsEditTask value for this Profile.
     * 
     * @param permissionsEditTask
     */
    public void setPermissionsEditTask(java.lang.Boolean permissionsEditTask) {
        this.permissionsEditTask = permissionsEditTask;
    }


    /**
     * Gets the permissionsImportLeads value for this Profile.
     * 
     * @return permissionsImportLeads
     */
    public java.lang.Boolean getPermissionsImportLeads() {
        return permissionsImportLeads;
    }


    /**
     * Sets the permissionsImportLeads value for this Profile.
     * 
     * @param permissionsImportLeads
     */
    public void setPermissionsImportLeads(java.lang.Boolean permissionsImportLeads) {
        this.permissionsImportLeads = permissionsImportLeads;
    }


    /**
     * Gets the permissionsInstallMultiforce value for this Profile.
     * 
     * @return permissionsInstallMultiforce
     */
    public java.lang.Boolean getPermissionsInstallMultiforce() {
        return permissionsInstallMultiforce;
    }


    /**
     * Sets the permissionsInstallMultiforce value for this Profile.
     * 
     * @param permissionsInstallMultiforce
     */
    public void setPermissionsInstallMultiforce(java.lang.Boolean permissionsInstallMultiforce) {
        this.permissionsInstallMultiforce = permissionsInstallMultiforce;
    }


    /**
     * Gets the permissionsManageCallCenters value for this Profile.
     * 
     * @return permissionsManageCallCenters
     */
    public java.lang.Boolean getPermissionsManageCallCenters() {
        return permissionsManageCallCenters;
    }


    /**
     * Sets the permissionsManageCallCenters value for this Profile.
     * 
     * @param permissionsManageCallCenters
     */
    public void setPermissionsManageCallCenters(java.lang.Boolean permissionsManageCallCenters) {
        this.permissionsManageCallCenters = permissionsManageCallCenters;
    }


    /**
     * Gets the permissionsManageCases value for this Profile.
     * 
     * @return permissionsManageCases
     */
    public java.lang.Boolean getPermissionsManageCases() {
        return permissionsManageCases;
    }


    /**
     * Sets the permissionsManageCases value for this Profile.
     * 
     * @param permissionsManageCases
     */
    public void setPermissionsManageCases(java.lang.Boolean permissionsManageCases) {
        this.permissionsManageCases = permissionsManageCases;
    }


    /**
     * Gets the permissionsManageCategories value for this Profile.
     * 
     * @return permissionsManageCategories
     */
    public java.lang.Boolean getPermissionsManageCategories() {
        return permissionsManageCategories;
    }


    /**
     * Sets the permissionsManageCategories value for this Profile.
     * 
     * @param permissionsManageCategories
     */
    public void setPermissionsManageCategories(java.lang.Boolean permissionsManageCategories) {
        this.permissionsManageCategories = permissionsManageCategories;
    }


    /**
     * Gets the permissionsManageCssUsers value for this Profile.
     * 
     * @return permissionsManageCssUsers
     */
    public java.lang.Boolean getPermissionsManageCssUsers() {
        return permissionsManageCssUsers;
    }


    /**
     * Sets the permissionsManageCssUsers value for this Profile.
     * 
     * @param permissionsManageCssUsers
     */
    public void setPermissionsManageCssUsers(java.lang.Boolean permissionsManageCssUsers) {
        this.permissionsManageCssUsers = permissionsManageCssUsers;
    }


    /**
     * Gets the permissionsManageDashboards value for this Profile.
     * 
     * @return permissionsManageDashboards
     */
    public java.lang.Boolean getPermissionsManageDashboards() {
        return permissionsManageDashboards;
    }


    /**
     * Sets the permissionsManageDashboards value for this Profile.
     * 
     * @param permissionsManageDashboards
     */
    public void setPermissionsManageDashboards(java.lang.Boolean permissionsManageDashboards) {
        this.permissionsManageDashboards = permissionsManageDashboards;
    }


    /**
     * Gets the permissionsManageLeads value for this Profile.
     * 
     * @return permissionsManageLeads
     */
    public java.lang.Boolean getPermissionsManageLeads() {
        return permissionsManageLeads;
    }


    /**
     * Sets the permissionsManageLeads value for this Profile.
     * 
     * @param permissionsManageLeads
     */
    public void setPermissionsManageLeads(java.lang.Boolean permissionsManageLeads) {
        this.permissionsManageLeads = permissionsManageLeads;
    }


    /**
     * Gets the permissionsManageMobile value for this Profile.
     * 
     * @return permissionsManageMobile
     */
    public java.lang.Boolean getPermissionsManageMobile() {
        return permissionsManageMobile;
    }


    /**
     * Sets the permissionsManageMobile value for this Profile.
     * 
     * @param permissionsManageMobile
     */
    public void setPermissionsManageMobile(java.lang.Boolean permissionsManageMobile) {
        this.permissionsManageMobile = permissionsManageMobile;
    }


    /**
     * Gets the permissionsManageSelfService value for this Profile.
     * 
     * @return permissionsManageSelfService
     */
    public java.lang.Boolean getPermissionsManageSelfService() {
        return permissionsManageSelfService;
    }


    /**
     * Sets the permissionsManageSelfService value for this Profile.
     * 
     * @param permissionsManageSelfService
     */
    public void setPermissionsManageSelfService(java.lang.Boolean permissionsManageSelfService) {
        this.permissionsManageSelfService = permissionsManageSelfService;
    }


    /**
     * Gets the permissionsManageSolutions value for this Profile.
     * 
     * @return permissionsManageSolutions
     */
    public java.lang.Boolean getPermissionsManageSolutions() {
        return permissionsManageSolutions;
    }


    /**
     * Sets the permissionsManageSolutions value for this Profile.
     * 
     * @param permissionsManageSolutions
     */
    public void setPermissionsManageSolutions(java.lang.Boolean permissionsManageSolutions) {
        this.permissionsManageSolutions = permissionsManageSolutions;
    }


    /**
     * Gets the permissionsManageTerritories value for this Profile.
     * 
     * @return permissionsManageTerritories
     */
    public java.lang.Boolean getPermissionsManageTerritories() {
        return permissionsManageTerritories;
    }


    /**
     * Sets the permissionsManageTerritories value for this Profile.
     * 
     * @param permissionsManageTerritories
     */
    public void setPermissionsManageTerritories(java.lang.Boolean permissionsManageTerritories) {
        this.permissionsManageTerritories = permissionsManageTerritories;
    }


    /**
     * Gets the permissionsManageUsers value for this Profile.
     * 
     * @return permissionsManageUsers
     */
    public java.lang.Boolean getPermissionsManageUsers() {
        return permissionsManageUsers;
    }


    /**
     * Sets the permissionsManageUsers value for this Profile.
     * 
     * @param permissionsManageUsers
     */
    public void setPermissionsManageUsers(java.lang.Boolean permissionsManageUsers) {
        this.permissionsManageUsers = permissionsManageUsers;
    }


    /**
     * Gets the permissionsModifyAllData value for this Profile.
     * 
     * @return permissionsModifyAllData
     */
    public java.lang.Boolean getPermissionsModifyAllData() {
        return permissionsModifyAllData;
    }


    /**
     * Sets the permissionsModifyAllData value for this Profile.
     * 
     * @param permissionsModifyAllData
     */
    public void setPermissionsModifyAllData(java.lang.Boolean permissionsModifyAllData) {
        this.permissionsModifyAllData = permissionsModifyAllData;
    }


    /**
     * Gets the permissionsPasswordNeverExpires value for this Profile.
     * 
     * @return permissionsPasswordNeverExpires
     */
    public java.lang.Boolean getPermissionsPasswordNeverExpires() {
        return permissionsPasswordNeverExpires;
    }


    /**
     * Sets the permissionsPasswordNeverExpires value for this Profile.
     * 
     * @param permissionsPasswordNeverExpires
     */
    public void setPermissionsPasswordNeverExpires(java.lang.Boolean permissionsPasswordNeverExpires) {
        this.permissionsPasswordNeverExpires = permissionsPasswordNeverExpires;
    }


    /**
     * Gets the permissionsPublishMultiforce value for this Profile.
     * 
     * @return permissionsPublishMultiforce
     */
    public java.lang.Boolean getPermissionsPublishMultiforce() {
        return permissionsPublishMultiforce;
    }


    /**
     * Sets the permissionsPublishMultiforce value for this Profile.
     * 
     * @param permissionsPublishMultiforce
     */
    public void setPermissionsPublishMultiforce(java.lang.Boolean permissionsPublishMultiforce) {
        this.permissionsPublishMultiforce = permissionsPublishMultiforce;
    }


    /**
     * Gets the permissionsRunReports value for this Profile.
     * 
     * @return permissionsRunReports
     */
    public java.lang.Boolean getPermissionsRunReports() {
        return permissionsRunReports;
    }


    /**
     * Sets the permissionsRunReports value for this Profile.
     * 
     * @param permissionsRunReports
     */
    public void setPermissionsRunReports(java.lang.Boolean permissionsRunReports) {
        this.permissionsRunReports = permissionsRunReports;
    }


    /**
     * Gets the permissionsSendSitRequests value for this Profile.
     * 
     * @return permissionsSendSitRequests
     */
    public java.lang.Boolean getPermissionsSendSitRequests() {
        return permissionsSendSitRequests;
    }


    /**
     * Sets the permissionsSendSitRequests value for this Profile.
     * 
     * @param permissionsSendSitRequests
     */
    public void setPermissionsSendSitRequests(java.lang.Boolean permissionsSendSitRequests) {
        this.permissionsSendSitRequests = permissionsSendSitRequests;
    }


    /**
     * Gets the permissionsSolutionImport value for this Profile.
     * 
     * @return permissionsSolutionImport
     */
    public java.lang.Boolean getPermissionsSolutionImport() {
        return permissionsSolutionImport;
    }


    /**
     * Sets the permissionsSolutionImport value for this Profile.
     * 
     * @param permissionsSolutionImport
     */
    public void setPermissionsSolutionImport(java.lang.Boolean permissionsSolutionImport) {
        this.permissionsSolutionImport = permissionsSolutionImport;
    }


    /**
     * Gets the permissionsTransferAnyEntity value for this Profile.
     * 
     * @return permissionsTransferAnyEntity
     */
    public java.lang.Boolean getPermissionsTransferAnyEntity() {
        return permissionsTransferAnyEntity;
    }


    /**
     * Sets the permissionsTransferAnyEntity value for this Profile.
     * 
     * @param permissionsTransferAnyEntity
     */
    public void setPermissionsTransferAnyEntity(java.lang.Boolean permissionsTransferAnyEntity) {
        this.permissionsTransferAnyEntity = permissionsTransferAnyEntity;
    }


    /**
     * Gets the permissionsTransferAnyLead value for this Profile.
     * 
     * @return permissionsTransferAnyLead
     */
    public java.lang.Boolean getPermissionsTransferAnyLead() {
        return permissionsTransferAnyLead;
    }


    /**
     * Sets the permissionsTransferAnyLead value for this Profile.
     * 
     * @param permissionsTransferAnyLead
     */
    public void setPermissionsTransferAnyLead(java.lang.Boolean permissionsTransferAnyLead) {
        this.permissionsTransferAnyLead = permissionsTransferAnyLead;
    }


    /**
     * Gets the permissionsUseTeamReassignWizards value for this Profile.
     * 
     * @return permissionsUseTeamReassignWizards
     */
    public java.lang.Boolean getPermissionsUseTeamReassignWizards() {
        return permissionsUseTeamReassignWizards;
    }


    /**
     * Sets the permissionsUseTeamReassignWizards value for this Profile.
     * 
     * @param permissionsUseTeamReassignWizards
     */
    public void setPermissionsUseTeamReassignWizards(java.lang.Boolean permissionsUseTeamReassignWizards) {
        this.permissionsUseTeamReassignWizards = permissionsUseTeamReassignWizards;
    }


    /**
     * Gets the permissionsViewAllData value for this Profile.
     * 
     * @return permissionsViewAllData
     */
    public java.lang.Boolean getPermissionsViewAllData() {
        return permissionsViewAllData;
    }


    /**
     * Sets the permissionsViewAllData value for this Profile.
     * 
     * @param permissionsViewAllData
     */
    public void setPermissionsViewAllData(java.lang.Boolean permissionsViewAllData) {
        this.permissionsViewAllData = permissionsViewAllData;
    }


    /**
     * Gets the permissionsViewSetup value for this Profile.
     * 
     * @return permissionsViewSetup
     */
    public java.lang.Boolean getPermissionsViewSetup() {
        return permissionsViewSetup;
    }


    /**
     * Sets the permissionsViewSetup value for this Profile.
     * 
     * @param permissionsViewSetup
     */
    public void setPermissionsViewSetup(java.lang.Boolean permissionsViewSetup) {
        this.permissionsViewSetup = permissionsViewSetup;
    }


    /**
     * Gets the systemModstamp value for this Profile.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Profile.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the users value for this Profile.
     * 
     * @return users
     */
    public com.sforce.soap.enterprise.QueryResult getUsers() {
        return users;
    }


    /**
     * Sets the users value for this Profile.
     * 
     * @param users
     */
    public void setUsers(com.sforce.soap.enterprise.QueryResult users) {
        this.users = users;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Profile)) return false;
        Profile other = (Profile) obj;
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
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.licenseType==null && other.getLicenseType()==null) || 
             (this.licenseType!=null &&
              this.licenseType.equals(other.getLicenseType()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.permissionsApiUserOnly==null && other.getPermissionsApiUserOnly()==null) || 
             (this.permissionsApiUserOnly!=null &&
              this.permissionsApiUserOnly.equals(other.getPermissionsApiUserOnly()))) &&
            ((this.permissionsConvertLeads==null && other.getPermissionsConvertLeads()==null) || 
             (this.permissionsConvertLeads!=null &&
              this.permissionsConvertLeads.equals(other.getPermissionsConvertLeads()))) &&
            ((this.permissionsCreateMultiforce==null && other.getPermissionsCreateMultiforce()==null) || 
             (this.permissionsCreateMultiforce!=null &&
              this.permissionsCreateMultiforce.equals(other.getPermissionsCreateMultiforce()))) &&
            ((this.permissionsCustomizeApplication==null && other.getPermissionsCustomizeApplication()==null) || 
             (this.permissionsCustomizeApplication!=null &&
              this.permissionsCustomizeApplication.equals(other.getPermissionsCustomizeApplication()))) &&
            ((this.permissionsDisableNotifications==null && other.getPermissionsDisableNotifications()==null) || 
             (this.permissionsDisableNotifications!=null &&
              this.permissionsDisableNotifications.equals(other.getPermissionsDisableNotifications()))) &&
            ((this.permissionsEditActivatedOrders==null && other.getPermissionsEditActivatedOrders()==null) || 
             (this.permissionsEditActivatedOrders!=null &&
              this.permissionsEditActivatedOrders.equals(other.getPermissionsEditActivatedOrders()))) &&
            ((this.permissionsEditEvent==null && other.getPermissionsEditEvent()==null) || 
             (this.permissionsEditEvent!=null &&
              this.permissionsEditEvent.equals(other.getPermissionsEditEvent()))) &&
            ((this.permissionsEditForecast==null && other.getPermissionsEditForecast()==null) || 
             (this.permissionsEditForecast!=null &&
              this.permissionsEditForecast.equals(other.getPermissionsEditForecast()))) &&
            ((this.permissionsEditOppLineItemUnitPrice==null && other.getPermissionsEditOppLineItemUnitPrice()==null) || 
             (this.permissionsEditOppLineItemUnitPrice!=null &&
              this.permissionsEditOppLineItemUnitPrice.equals(other.getPermissionsEditOppLineItemUnitPrice()))) &&
            ((this.permissionsEditPublicDocuments==null && other.getPermissionsEditPublicDocuments()==null) || 
             (this.permissionsEditPublicDocuments!=null &&
              this.permissionsEditPublicDocuments.equals(other.getPermissionsEditPublicDocuments()))) &&
            ((this.permissionsEditReadonlyFields==null && other.getPermissionsEditReadonlyFields()==null) || 
             (this.permissionsEditReadonlyFields!=null &&
              this.permissionsEditReadonlyFields.equals(other.getPermissionsEditReadonlyFields()))) &&
            ((this.permissionsEditReports==null && other.getPermissionsEditReports()==null) || 
             (this.permissionsEditReports!=null &&
              this.permissionsEditReports.equals(other.getPermissionsEditReports()))) &&
            ((this.permissionsEditTask==null && other.getPermissionsEditTask()==null) || 
             (this.permissionsEditTask!=null &&
              this.permissionsEditTask.equals(other.getPermissionsEditTask()))) &&
            ((this.permissionsImportLeads==null && other.getPermissionsImportLeads()==null) || 
             (this.permissionsImportLeads!=null &&
              this.permissionsImportLeads.equals(other.getPermissionsImportLeads()))) &&
            ((this.permissionsInstallMultiforce==null && other.getPermissionsInstallMultiforce()==null) || 
             (this.permissionsInstallMultiforce!=null &&
              this.permissionsInstallMultiforce.equals(other.getPermissionsInstallMultiforce()))) &&
            ((this.permissionsManageCallCenters==null && other.getPermissionsManageCallCenters()==null) || 
             (this.permissionsManageCallCenters!=null &&
              this.permissionsManageCallCenters.equals(other.getPermissionsManageCallCenters()))) &&
            ((this.permissionsManageCases==null && other.getPermissionsManageCases()==null) || 
             (this.permissionsManageCases!=null &&
              this.permissionsManageCases.equals(other.getPermissionsManageCases()))) &&
            ((this.permissionsManageCategories==null && other.getPermissionsManageCategories()==null) || 
             (this.permissionsManageCategories!=null &&
              this.permissionsManageCategories.equals(other.getPermissionsManageCategories()))) &&
            ((this.permissionsManageCssUsers==null && other.getPermissionsManageCssUsers()==null) || 
             (this.permissionsManageCssUsers!=null &&
              this.permissionsManageCssUsers.equals(other.getPermissionsManageCssUsers()))) &&
            ((this.permissionsManageDashboards==null && other.getPermissionsManageDashboards()==null) || 
             (this.permissionsManageDashboards!=null &&
              this.permissionsManageDashboards.equals(other.getPermissionsManageDashboards()))) &&
            ((this.permissionsManageLeads==null && other.getPermissionsManageLeads()==null) || 
             (this.permissionsManageLeads!=null &&
              this.permissionsManageLeads.equals(other.getPermissionsManageLeads()))) &&
            ((this.permissionsManageMobile==null && other.getPermissionsManageMobile()==null) || 
             (this.permissionsManageMobile!=null &&
              this.permissionsManageMobile.equals(other.getPermissionsManageMobile()))) &&
            ((this.permissionsManageSelfService==null && other.getPermissionsManageSelfService()==null) || 
             (this.permissionsManageSelfService!=null &&
              this.permissionsManageSelfService.equals(other.getPermissionsManageSelfService()))) &&
            ((this.permissionsManageSolutions==null && other.getPermissionsManageSolutions()==null) || 
             (this.permissionsManageSolutions!=null &&
              this.permissionsManageSolutions.equals(other.getPermissionsManageSolutions()))) &&
            ((this.permissionsManageTerritories==null && other.getPermissionsManageTerritories()==null) || 
             (this.permissionsManageTerritories!=null &&
              this.permissionsManageTerritories.equals(other.getPermissionsManageTerritories()))) &&
            ((this.permissionsManageUsers==null && other.getPermissionsManageUsers()==null) || 
             (this.permissionsManageUsers!=null &&
              this.permissionsManageUsers.equals(other.getPermissionsManageUsers()))) &&
            ((this.permissionsModifyAllData==null && other.getPermissionsModifyAllData()==null) || 
             (this.permissionsModifyAllData!=null &&
              this.permissionsModifyAllData.equals(other.getPermissionsModifyAllData()))) &&
            ((this.permissionsPasswordNeverExpires==null && other.getPermissionsPasswordNeverExpires()==null) || 
             (this.permissionsPasswordNeverExpires!=null &&
              this.permissionsPasswordNeverExpires.equals(other.getPermissionsPasswordNeverExpires()))) &&
            ((this.permissionsPublishMultiforce==null && other.getPermissionsPublishMultiforce()==null) || 
             (this.permissionsPublishMultiforce!=null &&
              this.permissionsPublishMultiforce.equals(other.getPermissionsPublishMultiforce()))) &&
            ((this.permissionsRunReports==null && other.getPermissionsRunReports()==null) || 
             (this.permissionsRunReports!=null &&
              this.permissionsRunReports.equals(other.getPermissionsRunReports()))) &&
            ((this.permissionsSendSitRequests==null && other.getPermissionsSendSitRequests()==null) || 
             (this.permissionsSendSitRequests!=null &&
              this.permissionsSendSitRequests.equals(other.getPermissionsSendSitRequests()))) &&
            ((this.permissionsSolutionImport==null && other.getPermissionsSolutionImport()==null) || 
             (this.permissionsSolutionImport!=null &&
              this.permissionsSolutionImport.equals(other.getPermissionsSolutionImport()))) &&
            ((this.permissionsTransferAnyEntity==null && other.getPermissionsTransferAnyEntity()==null) || 
             (this.permissionsTransferAnyEntity!=null &&
              this.permissionsTransferAnyEntity.equals(other.getPermissionsTransferAnyEntity()))) &&
            ((this.permissionsTransferAnyLead==null && other.getPermissionsTransferAnyLead()==null) || 
             (this.permissionsTransferAnyLead!=null &&
              this.permissionsTransferAnyLead.equals(other.getPermissionsTransferAnyLead()))) &&
            ((this.permissionsUseTeamReassignWizards==null && other.getPermissionsUseTeamReassignWizards()==null) || 
             (this.permissionsUseTeamReassignWizards!=null &&
              this.permissionsUseTeamReassignWizards.equals(other.getPermissionsUseTeamReassignWizards()))) &&
            ((this.permissionsViewAllData==null && other.getPermissionsViewAllData()==null) || 
             (this.permissionsViewAllData!=null &&
              this.permissionsViewAllData.equals(other.getPermissionsViewAllData()))) &&
            ((this.permissionsViewSetup==null && other.getPermissionsViewSetup()==null) || 
             (this.permissionsViewSetup!=null &&
              this.permissionsViewSetup.equals(other.getPermissionsViewSetup()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.users==null && other.getUsers()==null) || 
             (this.users!=null &&
              this.users.equals(other.getUsers())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
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
        if (getLicenseType() != null) {
            _hashCode += getLicenseType().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPermissionsApiUserOnly() != null) {
            _hashCode += getPermissionsApiUserOnly().hashCode();
        }
        if (getPermissionsConvertLeads() != null) {
            _hashCode += getPermissionsConvertLeads().hashCode();
        }
        if (getPermissionsCreateMultiforce() != null) {
            _hashCode += getPermissionsCreateMultiforce().hashCode();
        }
        if (getPermissionsCustomizeApplication() != null) {
            _hashCode += getPermissionsCustomizeApplication().hashCode();
        }
        if (getPermissionsDisableNotifications() != null) {
            _hashCode += getPermissionsDisableNotifications().hashCode();
        }
        if (getPermissionsEditActivatedOrders() != null) {
            _hashCode += getPermissionsEditActivatedOrders().hashCode();
        }
        if (getPermissionsEditEvent() != null) {
            _hashCode += getPermissionsEditEvent().hashCode();
        }
        if (getPermissionsEditForecast() != null) {
            _hashCode += getPermissionsEditForecast().hashCode();
        }
        if (getPermissionsEditOppLineItemUnitPrice() != null) {
            _hashCode += getPermissionsEditOppLineItemUnitPrice().hashCode();
        }
        if (getPermissionsEditPublicDocuments() != null) {
            _hashCode += getPermissionsEditPublicDocuments().hashCode();
        }
        if (getPermissionsEditReadonlyFields() != null) {
            _hashCode += getPermissionsEditReadonlyFields().hashCode();
        }
        if (getPermissionsEditReports() != null) {
            _hashCode += getPermissionsEditReports().hashCode();
        }
        if (getPermissionsEditTask() != null) {
            _hashCode += getPermissionsEditTask().hashCode();
        }
        if (getPermissionsImportLeads() != null) {
            _hashCode += getPermissionsImportLeads().hashCode();
        }
        if (getPermissionsInstallMultiforce() != null) {
            _hashCode += getPermissionsInstallMultiforce().hashCode();
        }
        if (getPermissionsManageCallCenters() != null) {
            _hashCode += getPermissionsManageCallCenters().hashCode();
        }
        if (getPermissionsManageCases() != null) {
            _hashCode += getPermissionsManageCases().hashCode();
        }
        if (getPermissionsManageCategories() != null) {
            _hashCode += getPermissionsManageCategories().hashCode();
        }
        if (getPermissionsManageCssUsers() != null) {
            _hashCode += getPermissionsManageCssUsers().hashCode();
        }
        if (getPermissionsManageDashboards() != null) {
            _hashCode += getPermissionsManageDashboards().hashCode();
        }
        if (getPermissionsManageLeads() != null) {
            _hashCode += getPermissionsManageLeads().hashCode();
        }
        if (getPermissionsManageMobile() != null) {
            _hashCode += getPermissionsManageMobile().hashCode();
        }
        if (getPermissionsManageSelfService() != null) {
            _hashCode += getPermissionsManageSelfService().hashCode();
        }
        if (getPermissionsManageSolutions() != null) {
            _hashCode += getPermissionsManageSolutions().hashCode();
        }
        if (getPermissionsManageTerritories() != null) {
            _hashCode += getPermissionsManageTerritories().hashCode();
        }
        if (getPermissionsManageUsers() != null) {
            _hashCode += getPermissionsManageUsers().hashCode();
        }
        if (getPermissionsModifyAllData() != null) {
            _hashCode += getPermissionsModifyAllData().hashCode();
        }
        if (getPermissionsPasswordNeverExpires() != null) {
            _hashCode += getPermissionsPasswordNeverExpires().hashCode();
        }
        if (getPermissionsPublishMultiforce() != null) {
            _hashCode += getPermissionsPublishMultiforce().hashCode();
        }
        if (getPermissionsRunReports() != null) {
            _hashCode += getPermissionsRunReports().hashCode();
        }
        if (getPermissionsSendSitRequests() != null) {
            _hashCode += getPermissionsSendSitRequests().hashCode();
        }
        if (getPermissionsSolutionImport() != null) {
            _hashCode += getPermissionsSolutionImport().hashCode();
        }
        if (getPermissionsTransferAnyEntity() != null) {
            _hashCode += getPermissionsTransferAnyEntity().hashCode();
        }
        if (getPermissionsTransferAnyLead() != null) {
            _hashCode += getPermissionsTransferAnyLead().hashCode();
        }
        if (getPermissionsUseTeamReassignWizards() != null) {
            _hashCode += getPermissionsUseTeamReassignWizards().hashCode();
        }
        if (getPermissionsViewAllData() != null) {
            _hashCode += getPermissionsViewAllData().hashCode();
        }
        if (getPermissionsViewSetup() != null) {
            _hashCode += getPermissionsViewSetup().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getUsers() != null) {
            _hashCode += getUsers().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Profile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Profile"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Description"));
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
        elemField.setFieldName("licenseType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LicenseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsApiUserOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsApiUserOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsConvertLeads");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsConvertLeads"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsCreateMultiforce");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsCreateMultiforce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsCustomizeApplication");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsCustomizeApplication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsDisableNotifications");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsDisableNotifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEditActivatedOrders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEditActivatedOrders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEditEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEditEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEditForecast");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEditForecast"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEditOppLineItemUnitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEditOppLineItemUnitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEditPublicDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEditPublicDocuments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEditReadonlyFields");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEditReadonlyFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEditReports");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEditReports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEditTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEditTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsImportLeads");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsImportLeads"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsInstallMultiforce");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsInstallMultiforce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageCallCenters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageCallCenters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageCases");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageCases"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageCategories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageCategories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageCssUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageCssUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageDashboards");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageDashboards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageLeads");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageLeads"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageMobile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageMobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageSelfService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageSelfService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageSolutions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageSolutions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageTerritories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageTerritories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsModifyAllData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsModifyAllData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsPasswordNeverExpires");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsPasswordNeverExpires"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsPublishMultiforce");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsPublishMultiforce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsRunReports");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsRunReports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsSendSitRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsSendSitRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsSolutionImport");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsSolutionImport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsTransferAnyEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsTransferAnyEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsTransferAnyLead");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsTransferAnyLead"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsUseTeamReassignWizards");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsUseTeamReassignWizards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsViewAllData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsViewAllData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsViewSetup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsViewSetup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("users");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Users"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
