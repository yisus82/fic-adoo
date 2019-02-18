/**
 * Opportunity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Opportunity  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.Account account;

    private java.lang.String accountId;

    private com.sforce.soap.enterprise.QueryResult accountPartners;

    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private java.lang.Double amount;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private com.sforce.soap.enterprise.sobject.Campaign campaign;

    private java.lang.String campaignId;

    private java.util.Date closeDate;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String currentGenerators__c;

    private java.lang.String deliveryInstallationStatus__c;

    private java.lang.String description;

    private com.sforce.soap.enterprise.QueryResult events;

    private java.lang.Double expectedRevenue;

    private java.lang.String fiscal;

    private java.lang.Integer fiscalQuarter;

    private java.lang.Integer fiscalYear;

    private java.lang.String forecastCategory;

    private java.lang.Boolean hasOpportunityLineItem;

    private java.lang.Boolean isClosed;

    private java.lang.Boolean isDeleted;

    private java.lang.Boolean isPrivate;

    private java.lang.Boolean isWon;

    private java.util.Date lastActivityDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String leadSource;

    private java.lang.String mainCompetitors__c;

    private java.lang.String name;

    private java.lang.String nextStep;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private com.sforce.soap.enterprise.QueryResult opportunityCompetitors;

    private com.sforce.soap.enterprise.QueryResult opportunityContactRoles;

    private com.sforce.soap.enterprise.QueryResult opportunityHistories;

    private com.sforce.soap.enterprise.QueryResult opportunityLineItems;

    private com.sforce.soap.enterprise.QueryResult opportunityPartnersFrom;

    private java.lang.String orderNumber__c;

    private com.sforce.soap.enterprise.sobject.User owner;

    private java.lang.String ownerId;

    private com.sforce.soap.enterprise.QueryResult partners;

    private com.sforce.soap.enterprise.sobject.Pricebook2 pricebook2;

    private java.lang.String pricebook2Id;

    private java.lang.Double probability;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private com.sforce.soap.enterprise.QueryResult shares;

    private java.lang.String stageName;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private java.lang.Double totalOpportunityQuantity;

    private java.lang.String trackingNumber__c;

    private java.lang.String type;

    public Opportunity() {
    }

    public Opportunity(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.Account account,
           java.lang.String accountId,
           com.sforce.soap.enterprise.QueryResult accountPartners,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           java.lang.Double amount,
           com.sforce.soap.enterprise.QueryResult attachments,
           com.sforce.soap.enterprise.sobject.Campaign campaign,
           java.lang.String campaignId,
           java.util.Date closeDate,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String currentGenerators__c,
           java.lang.String deliveryInstallationStatus__c,
           java.lang.String description,
           com.sforce.soap.enterprise.QueryResult events,
           java.lang.Double expectedRevenue,
           java.lang.String fiscal,
           java.lang.Integer fiscalQuarter,
           java.lang.Integer fiscalYear,
           java.lang.String forecastCategory,
           java.lang.Boolean hasOpportunityLineItem,
           java.lang.Boolean isClosed,
           java.lang.Boolean isDeleted,
           java.lang.Boolean isPrivate,
           java.lang.Boolean isWon,
           java.util.Date lastActivityDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String leadSource,
           java.lang.String mainCompetitors__c,
           java.lang.String name,
           java.lang.String nextStep,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           com.sforce.soap.enterprise.QueryResult openActivities,
           com.sforce.soap.enterprise.QueryResult opportunityCompetitors,
           com.sforce.soap.enterprise.QueryResult opportunityContactRoles,
           com.sforce.soap.enterprise.QueryResult opportunityHistories,
           com.sforce.soap.enterprise.QueryResult opportunityLineItems,
           com.sforce.soap.enterprise.QueryResult opportunityPartnersFrom,
           java.lang.String orderNumber__c,
           com.sforce.soap.enterprise.sobject.User owner,
           java.lang.String ownerId,
           com.sforce.soap.enterprise.QueryResult partners,
           com.sforce.soap.enterprise.sobject.Pricebook2 pricebook2,
           java.lang.String pricebook2Id,
           java.lang.Double probability,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           com.sforce.soap.enterprise.QueryResult shares,
           java.lang.String stageName,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           java.lang.Double totalOpportunityQuantity,
           java.lang.String trackingNumber__c,
           java.lang.String type) {
        super(
            fieldsToNull,
            id);
        this.account = account;
        this.accountId = accountId;
        this.accountPartners = accountPartners;
        this.activityHistories = activityHistories;
        this.amount = amount;
        this.attachments = attachments;
        this.campaign = campaign;
        this.campaignId = campaignId;
        this.closeDate = closeDate;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.currentGenerators__c = currentGenerators__c;
        this.deliveryInstallationStatus__c = deliveryInstallationStatus__c;
        this.description = description;
        this.events = events;
        this.expectedRevenue = expectedRevenue;
        this.fiscal = fiscal;
        this.fiscalQuarter = fiscalQuarter;
        this.fiscalYear = fiscalYear;
        this.forecastCategory = forecastCategory;
        this.hasOpportunityLineItem = hasOpportunityLineItem;
        this.isClosed = isClosed;
        this.isDeleted = isDeleted;
        this.isPrivate = isPrivate;
        this.isWon = isWon;
        this.lastActivityDate = lastActivityDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.leadSource = leadSource;
        this.mainCompetitors__c = mainCompetitors__c;
        this.name = name;
        this.nextStep = nextStep;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.openActivities = openActivities;
        this.opportunityCompetitors = opportunityCompetitors;
        this.opportunityContactRoles = opportunityContactRoles;
        this.opportunityHistories = opportunityHistories;
        this.opportunityLineItems = opportunityLineItems;
        this.opportunityPartnersFrom = opportunityPartnersFrom;
        this.orderNumber__c = orderNumber__c;
        this.owner = owner;
        this.ownerId = ownerId;
        this.partners = partners;
        this.pricebook2 = pricebook2;
        this.pricebook2Id = pricebook2Id;
        this.probability = probability;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.shares = shares;
        this.stageName = stageName;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.totalOpportunityQuantity = totalOpportunityQuantity;
        this.trackingNumber__c = trackingNumber__c;
        this.type = type;
    }


    /**
     * Gets the account value for this Opportunity.
     * 
     * @return account
     */
    public com.sforce.soap.enterprise.sobject.Account getAccount() {
        return account;
    }


    /**
     * Sets the account value for this Opportunity.
     * 
     * @param account
     */
    public void setAccount(com.sforce.soap.enterprise.sobject.Account account) {
        this.account = account;
    }


    /**
     * Gets the accountId value for this Opportunity.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this Opportunity.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the accountPartners value for this Opportunity.
     * 
     * @return accountPartners
     */
    public com.sforce.soap.enterprise.QueryResult getAccountPartners() {
        return accountPartners;
    }


    /**
     * Sets the accountPartners value for this Opportunity.
     * 
     * @param accountPartners
     */
    public void setAccountPartners(com.sforce.soap.enterprise.QueryResult accountPartners) {
        this.accountPartners = accountPartners;
    }


    /**
     * Gets the activityHistories value for this Opportunity.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Opportunity.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the amount value for this Opportunity.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this Opportunity.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the attachments value for this Opportunity.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Opportunity.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the campaign value for this Opportunity.
     * 
     * @return campaign
     */
    public com.sforce.soap.enterprise.sobject.Campaign getCampaign() {
        return campaign;
    }


    /**
     * Sets the campaign value for this Opportunity.
     * 
     * @param campaign
     */
    public void setCampaign(com.sforce.soap.enterprise.sobject.Campaign campaign) {
        this.campaign = campaign;
    }


    /**
     * Gets the campaignId value for this Opportunity.
     * 
     * @return campaignId
     */
    public java.lang.String getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this Opportunity.
     * 
     * @param campaignId
     */
    public void setCampaignId(java.lang.String campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the closeDate value for this Opportunity.
     * 
     * @return closeDate
     */
    public java.util.Date getCloseDate() {
        return closeDate;
    }


    /**
     * Sets the closeDate value for this Opportunity.
     * 
     * @param closeDate
     */
    public void setCloseDate(java.util.Date closeDate) {
        this.closeDate = closeDate;
    }


    /**
     * Gets the createdBy value for this Opportunity.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Opportunity.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Opportunity.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Opportunity.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Opportunity.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Opportunity.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the currentGenerators__c value for this Opportunity.
     * 
     * @return currentGenerators__c
     */
    public java.lang.String getCurrentGenerators__c() {
        return currentGenerators__c;
    }


    /**
     * Sets the currentGenerators__c value for this Opportunity.
     * 
     * @param currentGenerators__c
     */
    public void setCurrentGenerators__c(java.lang.String currentGenerators__c) {
        this.currentGenerators__c = currentGenerators__c;
    }


    /**
     * Gets the deliveryInstallationStatus__c value for this Opportunity.
     * 
     * @return deliveryInstallationStatus__c
     */
    public java.lang.String getDeliveryInstallationStatus__c() {
        return deliveryInstallationStatus__c;
    }


    /**
     * Sets the deliveryInstallationStatus__c value for this Opportunity.
     * 
     * @param deliveryInstallationStatus__c
     */
    public void setDeliveryInstallationStatus__c(java.lang.String deliveryInstallationStatus__c) {
        this.deliveryInstallationStatus__c = deliveryInstallationStatus__c;
    }


    /**
     * Gets the description value for this Opportunity.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Opportunity.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the events value for this Opportunity.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Opportunity.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the expectedRevenue value for this Opportunity.
     * 
     * @return expectedRevenue
     */
    public java.lang.Double getExpectedRevenue() {
        return expectedRevenue;
    }


    /**
     * Sets the expectedRevenue value for this Opportunity.
     * 
     * @param expectedRevenue
     */
    public void setExpectedRevenue(java.lang.Double expectedRevenue) {
        this.expectedRevenue = expectedRevenue;
    }


    /**
     * Gets the fiscal value for this Opportunity.
     * 
     * @return fiscal
     */
    public java.lang.String getFiscal() {
        return fiscal;
    }


    /**
     * Sets the fiscal value for this Opportunity.
     * 
     * @param fiscal
     */
    public void setFiscal(java.lang.String fiscal) {
        this.fiscal = fiscal;
    }


    /**
     * Gets the fiscalQuarter value for this Opportunity.
     * 
     * @return fiscalQuarter
     */
    public java.lang.Integer getFiscalQuarter() {
        return fiscalQuarter;
    }


    /**
     * Sets the fiscalQuarter value for this Opportunity.
     * 
     * @param fiscalQuarter
     */
    public void setFiscalQuarter(java.lang.Integer fiscalQuarter) {
        this.fiscalQuarter = fiscalQuarter;
    }


    /**
     * Gets the fiscalYear value for this Opportunity.
     * 
     * @return fiscalYear
     */
    public java.lang.Integer getFiscalYear() {
        return fiscalYear;
    }


    /**
     * Sets the fiscalYear value for this Opportunity.
     * 
     * @param fiscalYear
     */
    public void setFiscalYear(java.lang.Integer fiscalYear) {
        this.fiscalYear = fiscalYear;
    }


    /**
     * Gets the forecastCategory value for this Opportunity.
     * 
     * @return forecastCategory
     */
    public java.lang.String getForecastCategory() {
        return forecastCategory;
    }


    /**
     * Sets the forecastCategory value for this Opportunity.
     * 
     * @param forecastCategory
     */
    public void setForecastCategory(java.lang.String forecastCategory) {
        this.forecastCategory = forecastCategory;
    }


    /**
     * Gets the hasOpportunityLineItem value for this Opportunity.
     * 
     * @return hasOpportunityLineItem
     */
    public java.lang.Boolean getHasOpportunityLineItem() {
        return hasOpportunityLineItem;
    }


    /**
     * Sets the hasOpportunityLineItem value for this Opportunity.
     * 
     * @param hasOpportunityLineItem
     */
    public void setHasOpportunityLineItem(java.lang.Boolean hasOpportunityLineItem) {
        this.hasOpportunityLineItem = hasOpportunityLineItem;
    }


    /**
     * Gets the isClosed value for this Opportunity.
     * 
     * @return isClosed
     */
    public java.lang.Boolean getIsClosed() {
        return isClosed;
    }


    /**
     * Sets the isClosed value for this Opportunity.
     * 
     * @param isClosed
     */
    public void setIsClosed(java.lang.Boolean isClosed) {
        this.isClosed = isClosed;
    }


    /**
     * Gets the isDeleted value for this Opportunity.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Opportunity.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the isPrivate value for this Opportunity.
     * 
     * @return isPrivate
     */
    public java.lang.Boolean getIsPrivate() {
        return isPrivate;
    }


    /**
     * Sets the isPrivate value for this Opportunity.
     * 
     * @param isPrivate
     */
    public void setIsPrivate(java.lang.Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }


    /**
     * Gets the isWon value for this Opportunity.
     * 
     * @return isWon
     */
    public java.lang.Boolean getIsWon() {
        return isWon;
    }


    /**
     * Sets the isWon value for this Opportunity.
     * 
     * @param isWon
     */
    public void setIsWon(java.lang.Boolean isWon) {
        this.isWon = isWon;
    }


    /**
     * Gets the lastActivityDate value for this Opportunity.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Opportunity.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Opportunity.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Opportunity.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Opportunity.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Opportunity.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Opportunity.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Opportunity.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the leadSource value for this Opportunity.
     * 
     * @return leadSource
     */
    public java.lang.String getLeadSource() {
        return leadSource;
    }


    /**
     * Sets the leadSource value for this Opportunity.
     * 
     * @param leadSource
     */
    public void setLeadSource(java.lang.String leadSource) {
        this.leadSource = leadSource;
    }


    /**
     * Gets the mainCompetitors__c value for this Opportunity.
     * 
     * @return mainCompetitors__c
     */
    public java.lang.String getMainCompetitors__c() {
        return mainCompetitors__c;
    }


    /**
     * Sets the mainCompetitors__c value for this Opportunity.
     * 
     * @param mainCompetitors__c
     */
    public void setMainCompetitors__c(java.lang.String mainCompetitors__c) {
        this.mainCompetitors__c = mainCompetitors__c;
    }


    /**
     * Gets the name value for this Opportunity.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Opportunity.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the nextStep value for this Opportunity.
     * 
     * @return nextStep
     */
    public java.lang.String getNextStep() {
        return nextStep;
    }


    /**
     * Sets the nextStep value for this Opportunity.
     * 
     * @param nextStep
     */
    public void setNextStep(java.lang.String nextStep) {
        this.nextStep = nextStep;
    }


    /**
     * Gets the notes value for this Opportunity.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Opportunity.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Opportunity.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Opportunity.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the openActivities value for this Opportunity.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Opportunity.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the opportunityCompetitors value for this Opportunity.
     * 
     * @return opportunityCompetitors
     */
    public com.sforce.soap.enterprise.QueryResult getOpportunityCompetitors() {
        return opportunityCompetitors;
    }


    /**
     * Sets the opportunityCompetitors value for this Opportunity.
     * 
     * @param opportunityCompetitors
     */
    public void setOpportunityCompetitors(com.sforce.soap.enterprise.QueryResult opportunityCompetitors) {
        this.opportunityCompetitors = opportunityCompetitors;
    }


    /**
     * Gets the opportunityContactRoles value for this Opportunity.
     * 
     * @return opportunityContactRoles
     */
    public com.sforce.soap.enterprise.QueryResult getOpportunityContactRoles() {
        return opportunityContactRoles;
    }


    /**
     * Sets the opportunityContactRoles value for this Opportunity.
     * 
     * @param opportunityContactRoles
     */
    public void setOpportunityContactRoles(com.sforce.soap.enterprise.QueryResult opportunityContactRoles) {
        this.opportunityContactRoles = opportunityContactRoles;
    }


    /**
     * Gets the opportunityHistories value for this Opportunity.
     * 
     * @return opportunityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getOpportunityHistories() {
        return opportunityHistories;
    }


    /**
     * Sets the opportunityHistories value for this Opportunity.
     * 
     * @param opportunityHistories
     */
    public void setOpportunityHistories(com.sforce.soap.enterprise.QueryResult opportunityHistories) {
        this.opportunityHistories = opportunityHistories;
    }


    /**
     * Gets the opportunityLineItems value for this Opportunity.
     * 
     * @return opportunityLineItems
     */
    public com.sforce.soap.enterprise.QueryResult getOpportunityLineItems() {
        return opportunityLineItems;
    }


    /**
     * Sets the opportunityLineItems value for this Opportunity.
     * 
     * @param opportunityLineItems
     */
    public void setOpportunityLineItems(com.sforce.soap.enterprise.QueryResult opportunityLineItems) {
        this.opportunityLineItems = opportunityLineItems;
    }


    /**
     * Gets the opportunityPartnersFrom value for this Opportunity.
     * 
     * @return opportunityPartnersFrom
     */
    public com.sforce.soap.enterprise.QueryResult getOpportunityPartnersFrom() {
        return opportunityPartnersFrom;
    }


    /**
     * Sets the opportunityPartnersFrom value for this Opportunity.
     * 
     * @param opportunityPartnersFrom
     */
    public void setOpportunityPartnersFrom(com.sforce.soap.enterprise.QueryResult opportunityPartnersFrom) {
        this.opportunityPartnersFrom = opportunityPartnersFrom;
    }


    /**
     * Gets the orderNumber__c value for this Opportunity.
     * 
     * @return orderNumber__c
     */
    public java.lang.String getOrderNumber__c() {
        return orderNumber__c;
    }


    /**
     * Sets the orderNumber__c value for this Opportunity.
     * 
     * @param orderNumber__c
     */
    public void setOrderNumber__c(java.lang.String orderNumber__c) {
        this.orderNumber__c = orderNumber__c;
    }


    /**
     * Gets the owner value for this Opportunity.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.User getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Opportunity.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.User owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Opportunity.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Opportunity.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the partners value for this Opportunity.
     * 
     * @return partners
     */
    public com.sforce.soap.enterprise.QueryResult getPartners() {
        return partners;
    }


    /**
     * Sets the partners value for this Opportunity.
     * 
     * @param partners
     */
    public void setPartners(com.sforce.soap.enterprise.QueryResult partners) {
        this.partners = partners;
    }


    /**
     * Gets the pricebook2 value for this Opportunity.
     * 
     * @return pricebook2
     */
    public com.sforce.soap.enterprise.sobject.Pricebook2 getPricebook2() {
        return pricebook2;
    }


    /**
     * Sets the pricebook2 value for this Opportunity.
     * 
     * @param pricebook2
     */
    public void setPricebook2(com.sforce.soap.enterprise.sobject.Pricebook2 pricebook2) {
        this.pricebook2 = pricebook2;
    }


    /**
     * Gets the pricebook2Id value for this Opportunity.
     * 
     * @return pricebook2Id
     */
    public java.lang.String getPricebook2Id() {
        return pricebook2Id;
    }


    /**
     * Sets the pricebook2Id value for this Opportunity.
     * 
     * @param pricebook2Id
     */
    public void setPricebook2Id(java.lang.String pricebook2Id) {
        this.pricebook2Id = pricebook2Id;
    }


    /**
     * Gets the probability value for this Opportunity.
     * 
     * @return probability
     */
    public java.lang.Double getProbability() {
        return probability;
    }


    /**
     * Sets the probability value for this Opportunity.
     * 
     * @param probability
     */
    public void setProbability(java.lang.Double probability) {
        this.probability = probability;
    }


    /**
     * Gets the processInstances value for this Opportunity.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Opportunity.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Opportunity.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Opportunity.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the shares value for this Opportunity.
     * 
     * @return shares
     */
    public com.sforce.soap.enterprise.QueryResult getShares() {
        return shares;
    }


    /**
     * Sets the shares value for this Opportunity.
     * 
     * @param shares
     */
    public void setShares(com.sforce.soap.enterprise.QueryResult shares) {
        this.shares = shares;
    }


    /**
     * Gets the stageName value for this Opportunity.
     * 
     * @return stageName
     */
    public java.lang.String getStageName() {
        return stageName;
    }


    /**
     * Sets the stageName value for this Opportunity.
     * 
     * @param stageName
     */
    public void setStageName(java.lang.String stageName) {
        this.stageName = stageName;
    }


    /**
     * Gets the systemModstamp value for this Opportunity.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Opportunity.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Opportunity.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Opportunity.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the totalOpportunityQuantity value for this Opportunity.
     * 
     * @return totalOpportunityQuantity
     */
    public java.lang.Double getTotalOpportunityQuantity() {
        return totalOpportunityQuantity;
    }


    /**
     * Sets the totalOpportunityQuantity value for this Opportunity.
     * 
     * @param totalOpportunityQuantity
     */
    public void setTotalOpportunityQuantity(java.lang.Double totalOpportunityQuantity) {
        this.totalOpportunityQuantity = totalOpportunityQuantity;
    }


    /**
     * Gets the trackingNumber__c value for this Opportunity.
     * 
     * @return trackingNumber__c
     */
    public java.lang.String getTrackingNumber__c() {
        return trackingNumber__c;
    }


    /**
     * Sets the trackingNumber__c value for this Opportunity.
     * 
     * @param trackingNumber__c
     */
    public void setTrackingNumber__c(java.lang.String trackingNumber__c) {
        this.trackingNumber__c = trackingNumber__c;
    }


    /**
     * Gets the type value for this Opportunity.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Opportunity.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Opportunity)) return false;
        Opportunity other = (Opportunity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.accountPartners==null && other.getAccountPartners()==null) || 
             (this.accountPartners!=null &&
              this.accountPartners.equals(other.getAccountPartners()))) &&
            ((this.activityHistories==null && other.getActivityHistories()==null) || 
             (this.activityHistories!=null &&
              this.activityHistories.equals(other.getActivityHistories()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.campaign==null && other.getCampaign()==null) || 
             (this.campaign!=null &&
              this.campaign.equals(other.getCampaign()))) &&
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.closeDate==null && other.getCloseDate()==null) || 
             (this.closeDate!=null &&
              this.closeDate.equals(other.getCloseDate()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.currentGenerators__c==null && other.getCurrentGenerators__c()==null) || 
             (this.currentGenerators__c!=null &&
              this.currentGenerators__c.equals(other.getCurrentGenerators__c()))) &&
            ((this.deliveryInstallationStatus__c==null && other.getDeliveryInstallationStatus__c()==null) || 
             (this.deliveryInstallationStatus__c!=null &&
              this.deliveryInstallationStatus__c.equals(other.getDeliveryInstallationStatus__c()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.expectedRevenue==null && other.getExpectedRevenue()==null) || 
             (this.expectedRevenue!=null &&
              this.expectedRevenue.equals(other.getExpectedRevenue()))) &&
            ((this.fiscal==null && other.getFiscal()==null) || 
             (this.fiscal!=null &&
              this.fiscal.equals(other.getFiscal()))) &&
            ((this.fiscalQuarter==null && other.getFiscalQuarter()==null) || 
             (this.fiscalQuarter!=null &&
              this.fiscalQuarter.equals(other.getFiscalQuarter()))) &&
            ((this.fiscalYear==null && other.getFiscalYear()==null) || 
             (this.fiscalYear!=null &&
              this.fiscalYear.equals(other.getFiscalYear()))) &&
            ((this.forecastCategory==null && other.getForecastCategory()==null) || 
             (this.forecastCategory!=null &&
              this.forecastCategory.equals(other.getForecastCategory()))) &&
            ((this.hasOpportunityLineItem==null && other.getHasOpportunityLineItem()==null) || 
             (this.hasOpportunityLineItem!=null &&
              this.hasOpportunityLineItem.equals(other.getHasOpportunityLineItem()))) &&
            ((this.isClosed==null && other.getIsClosed()==null) || 
             (this.isClosed!=null &&
              this.isClosed.equals(other.getIsClosed()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.isPrivate==null && other.getIsPrivate()==null) || 
             (this.isPrivate!=null &&
              this.isPrivate.equals(other.getIsPrivate()))) &&
            ((this.isWon==null && other.getIsWon()==null) || 
             (this.isWon!=null &&
              this.isWon.equals(other.getIsWon()))) &&
            ((this.lastActivityDate==null && other.getLastActivityDate()==null) || 
             (this.lastActivityDate!=null &&
              this.lastActivityDate.equals(other.getLastActivityDate()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.leadSource==null && other.getLeadSource()==null) || 
             (this.leadSource!=null &&
              this.leadSource.equals(other.getLeadSource()))) &&
            ((this.mainCompetitors__c==null && other.getMainCompetitors__c()==null) || 
             (this.mainCompetitors__c!=null &&
              this.mainCompetitors__c.equals(other.getMainCompetitors__c()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.nextStep==null && other.getNextStep()==null) || 
             (this.nextStep!=null &&
              this.nextStep.equals(other.getNextStep()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.openActivities==null && other.getOpenActivities()==null) || 
             (this.openActivities!=null &&
              this.openActivities.equals(other.getOpenActivities()))) &&
            ((this.opportunityCompetitors==null && other.getOpportunityCompetitors()==null) || 
             (this.opportunityCompetitors!=null &&
              this.opportunityCompetitors.equals(other.getOpportunityCompetitors()))) &&
            ((this.opportunityContactRoles==null && other.getOpportunityContactRoles()==null) || 
             (this.opportunityContactRoles!=null &&
              this.opportunityContactRoles.equals(other.getOpportunityContactRoles()))) &&
            ((this.opportunityHistories==null && other.getOpportunityHistories()==null) || 
             (this.opportunityHistories!=null &&
              this.opportunityHistories.equals(other.getOpportunityHistories()))) &&
            ((this.opportunityLineItems==null && other.getOpportunityLineItems()==null) || 
             (this.opportunityLineItems!=null &&
              this.opportunityLineItems.equals(other.getOpportunityLineItems()))) &&
            ((this.opportunityPartnersFrom==null && other.getOpportunityPartnersFrom()==null) || 
             (this.opportunityPartnersFrom!=null &&
              this.opportunityPartnersFrom.equals(other.getOpportunityPartnersFrom()))) &&
            ((this.orderNumber__c==null && other.getOrderNumber__c()==null) || 
             (this.orderNumber__c!=null &&
              this.orderNumber__c.equals(other.getOrderNumber__c()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.partners==null && other.getPartners()==null) || 
             (this.partners!=null &&
              this.partners.equals(other.getPartners()))) &&
            ((this.pricebook2==null && other.getPricebook2()==null) || 
             (this.pricebook2!=null &&
              this.pricebook2.equals(other.getPricebook2()))) &&
            ((this.pricebook2Id==null && other.getPricebook2Id()==null) || 
             (this.pricebook2Id!=null &&
              this.pricebook2Id.equals(other.getPricebook2Id()))) &&
            ((this.probability==null && other.getProbability()==null) || 
             (this.probability!=null &&
              this.probability.equals(other.getProbability()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.shares==null && other.getShares()==null) || 
             (this.shares!=null &&
              this.shares.equals(other.getShares()))) &&
            ((this.stageName==null && other.getStageName()==null) || 
             (this.stageName!=null &&
              this.stageName.equals(other.getStageName()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.totalOpportunityQuantity==null && other.getTotalOpportunityQuantity()==null) || 
             (this.totalOpportunityQuantity!=null &&
              this.totalOpportunityQuantity.equals(other.getTotalOpportunityQuantity()))) &&
            ((this.trackingNumber__c==null && other.getTrackingNumber__c()==null) || 
             (this.trackingNumber__c!=null &&
              this.trackingNumber__c.equals(other.getTrackingNumber__c()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAccountPartners() != null) {
            _hashCode += getAccountPartners().hashCode();
        }
        if (getActivityHistories() != null) {
            _hashCode += getActivityHistories().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getCampaign() != null) {
            _hashCode += getCampaign().hashCode();
        }
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getCloseDate() != null) {
            _hashCode += getCloseDate().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getCurrentGenerators__c() != null) {
            _hashCode += getCurrentGenerators__c().hashCode();
        }
        if (getDeliveryInstallationStatus__c() != null) {
            _hashCode += getDeliveryInstallationStatus__c().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
        }
        if (getExpectedRevenue() != null) {
            _hashCode += getExpectedRevenue().hashCode();
        }
        if (getFiscal() != null) {
            _hashCode += getFiscal().hashCode();
        }
        if (getFiscalQuarter() != null) {
            _hashCode += getFiscalQuarter().hashCode();
        }
        if (getFiscalYear() != null) {
            _hashCode += getFiscalYear().hashCode();
        }
        if (getForecastCategory() != null) {
            _hashCode += getForecastCategory().hashCode();
        }
        if (getHasOpportunityLineItem() != null) {
            _hashCode += getHasOpportunityLineItem().hashCode();
        }
        if (getIsClosed() != null) {
            _hashCode += getIsClosed().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getIsPrivate() != null) {
            _hashCode += getIsPrivate().hashCode();
        }
        if (getIsWon() != null) {
            _hashCode += getIsWon().hashCode();
        }
        if (getLastActivityDate() != null) {
            _hashCode += getLastActivityDate().hashCode();
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
        if (getLeadSource() != null) {
            _hashCode += getLeadSource().hashCode();
        }
        if (getMainCompetitors__c() != null) {
            _hashCode += getMainCompetitors__c().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNextStep() != null) {
            _hashCode += getNextStep().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getNotesAndAttachments() != null) {
            _hashCode += getNotesAndAttachments().hashCode();
        }
        if (getOpenActivities() != null) {
            _hashCode += getOpenActivities().hashCode();
        }
        if (getOpportunityCompetitors() != null) {
            _hashCode += getOpportunityCompetitors().hashCode();
        }
        if (getOpportunityContactRoles() != null) {
            _hashCode += getOpportunityContactRoles().hashCode();
        }
        if (getOpportunityHistories() != null) {
            _hashCode += getOpportunityHistories().hashCode();
        }
        if (getOpportunityLineItems() != null) {
            _hashCode += getOpportunityLineItems().hashCode();
        }
        if (getOpportunityPartnersFrom() != null) {
            _hashCode += getOpportunityPartnersFrom().hashCode();
        }
        if (getOrderNumber__c() != null) {
            _hashCode += getOrderNumber__c().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getPartners() != null) {
            _hashCode += getPartners().hashCode();
        }
        if (getPricebook2() != null) {
            _hashCode += getPricebook2().hashCode();
        }
        if (getPricebook2Id() != null) {
            _hashCode += getPricebook2Id().hashCode();
        }
        if (getProbability() != null) {
            _hashCode += getProbability().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getShares() != null) {
            _hashCode += getShares().hashCode();
        }
        if (getStageName() != null) {
            _hashCode += getStageName().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        if (getTotalOpportunityQuantity() != null) {
            _hashCode += getTotalOpportunityQuantity().hashCode();
        }
        if (getTrackingNumber__c() != null) {
            _hashCode += getTrackingNumber__c().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Opportunity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Opportunity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountPartners");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountPartners"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityHistories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActivityHistories"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaign");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campaign"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campaign"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CampaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CloseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("currentGenerators__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CurrentGenerators__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryInstallationStatus__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DeliveryInstallationStatus__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Events"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ExpectedRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fiscal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fiscal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fiscalQuarter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FiscalQuarter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fiscalYear");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FiscalYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecastCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ForecastCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasOpportunityLineItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HasOpportunityLineItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsClosed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDeleted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDeleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPrivate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsPrivate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isWon");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsWon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastActivityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastActivityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LeadSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainCompetitors__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MainCompetitors__c"));
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
        elemField.setFieldName("nextStep");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NextStep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notesAndAttachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NotesAndAttachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openActivities");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpenActivities"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityCompetitors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityCompetitors"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityContactRoles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityContactRoles"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityHistories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityHistories"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityLineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityLineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityPartnersFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityPartnersFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNumber__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OrderNumber__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OwnerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partners");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Partners"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricebook2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pricebook2"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pricebook2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricebook2Id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pricebook2Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("probability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Probability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processInstances");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessInstances"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processSteps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessSteps"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shares");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Shares"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stageName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "StageName"));
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
        elemField.setFieldName("tasks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalOpportunityQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TotalOpportunityQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingNumber__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TrackingNumber__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Type"));
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
