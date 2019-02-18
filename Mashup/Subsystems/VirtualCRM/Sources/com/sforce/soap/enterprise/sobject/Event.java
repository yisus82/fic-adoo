/**
 * Event.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Event  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String accountId;

    private java.util.Date activityDate;

    private java.util.Calendar activityDateTime;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String description;

    private java.lang.Integer durationInMinutes;

    private com.sforce.soap.enterprise.QueryResult eventAttendees;

    private java.lang.Boolean isAllDayEvent;

    private java.lang.Boolean isArchived;

    private java.lang.Boolean isChild;

    private java.lang.Boolean isDeleted;

    private java.lang.Boolean isGroupEvent;

    private java.lang.Boolean isPrivate;

    private java.lang.Boolean isRecurrence;

    private java.lang.Boolean isReminderSet;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String location;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private java.lang.String recurrenceActivityId;

    private java.lang.Integer recurrenceDayOfMonth;

    private java.lang.Integer recurrenceDayOfWeekMask;

    private java.util.Date recurrenceEndDateOnly;

    private java.lang.String recurrenceInstance;

    private java.lang.Integer recurrenceInterval;

    private java.lang.String recurrenceMonthOfYear;

    private java.util.Calendar recurrenceStartDateTime;

    private java.lang.String recurrenceTimeZoneSidKey;

    private java.lang.String recurrenceType;

    private com.sforce.soap.enterprise.QueryResult recurringEvents;

    private java.util.Calendar reminderDateTime;

    private java.lang.String showAs;

    private java.lang.String subject;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.sobject.Name what;

    private java.lang.String whatId;

    private com.sforce.soap.enterprise.sobject.Name who;

    private java.lang.String whoId;

    public Event() {
    }

    public Event(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String accountId,
           java.util.Date activityDate,
           java.util.Calendar activityDateTime,
           com.sforce.soap.enterprise.QueryResult attachments,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String description,
           java.lang.Integer durationInMinutes,
           com.sforce.soap.enterprise.QueryResult eventAttendees,
           java.lang.Boolean isAllDayEvent,
           java.lang.Boolean isArchived,
           java.lang.Boolean isChild,
           java.lang.Boolean isDeleted,
           java.lang.Boolean isGroupEvent,
           java.lang.Boolean isPrivate,
           java.lang.Boolean isRecurrence,
           java.lang.Boolean isReminderSet,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String location,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           java.lang.String recurrenceActivityId,
           java.lang.Integer recurrenceDayOfMonth,
           java.lang.Integer recurrenceDayOfWeekMask,
           java.util.Date recurrenceEndDateOnly,
           java.lang.String recurrenceInstance,
           java.lang.Integer recurrenceInterval,
           java.lang.String recurrenceMonthOfYear,
           java.util.Calendar recurrenceStartDateTime,
           java.lang.String recurrenceTimeZoneSidKey,
           java.lang.String recurrenceType,
           com.sforce.soap.enterprise.QueryResult recurringEvents,
           java.util.Calendar reminderDateTime,
           java.lang.String showAs,
           java.lang.String subject,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.sobject.Name what,
           java.lang.String whatId,
           com.sforce.soap.enterprise.sobject.Name who,
           java.lang.String whoId) {
        super(
            fieldsToNull,
            id);
        this.accountId = accountId;
        this.activityDate = activityDate;
        this.activityDateTime = activityDateTime;
        this.attachments = attachments;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.description = description;
        this.durationInMinutes = durationInMinutes;
        this.eventAttendees = eventAttendees;
        this.isAllDayEvent = isAllDayEvent;
        this.isArchived = isArchived;
        this.isChild = isChild;
        this.isDeleted = isDeleted;
        this.isGroupEvent = isGroupEvent;
        this.isPrivate = isPrivate;
        this.isRecurrence = isRecurrence;
        this.isReminderSet = isReminderSet;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.location = location;
        this.owner = owner;
        this.ownerId = ownerId;
        this.recurrenceActivityId = recurrenceActivityId;
        this.recurrenceDayOfMonth = recurrenceDayOfMonth;
        this.recurrenceDayOfWeekMask = recurrenceDayOfWeekMask;
        this.recurrenceEndDateOnly = recurrenceEndDateOnly;
        this.recurrenceInstance = recurrenceInstance;
        this.recurrenceInterval = recurrenceInterval;
        this.recurrenceMonthOfYear = recurrenceMonthOfYear;
        this.recurrenceStartDateTime = recurrenceStartDateTime;
        this.recurrenceTimeZoneSidKey = recurrenceTimeZoneSidKey;
        this.recurrenceType = recurrenceType;
        this.recurringEvents = recurringEvents;
        this.reminderDateTime = reminderDateTime;
        this.showAs = showAs;
        this.subject = subject;
        this.systemModstamp = systemModstamp;
        this.what = what;
        this.whatId = whatId;
        this.who = who;
        this.whoId = whoId;
    }


    /**
     * Gets the accountId value for this Event.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this Event.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the activityDate value for this Event.
     * 
     * @return activityDate
     */
    public java.util.Date getActivityDate() {
        return activityDate;
    }


    /**
     * Sets the activityDate value for this Event.
     * 
     * @param activityDate
     */
    public void setActivityDate(java.util.Date activityDate) {
        this.activityDate = activityDate;
    }


    /**
     * Gets the activityDateTime value for this Event.
     * 
     * @return activityDateTime
     */
    public java.util.Calendar getActivityDateTime() {
        return activityDateTime;
    }


    /**
     * Sets the activityDateTime value for this Event.
     * 
     * @param activityDateTime
     */
    public void setActivityDateTime(java.util.Calendar activityDateTime) {
        this.activityDateTime = activityDateTime;
    }


    /**
     * Gets the attachments value for this Event.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Event.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the createdBy value for this Event.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Event.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Event.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Event.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Event.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Event.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the description value for this Event.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Event.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the durationInMinutes value for this Event.
     * 
     * @return durationInMinutes
     */
    public java.lang.Integer getDurationInMinutes() {
        return durationInMinutes;
    }


    /**
     * Sets the durationInMinutes value for this Event.
     * 
     * @param durationInMinutes
     */
    public void setDurationInMinutes(java.lang.Integer durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }


    /**
     * Gets the eventAttendees value for this Event.
     * 
     * @return eventAttendees
     */
    public com.sforce.soap.enterprise.QueryResult getEventAttendees() {
        return eventAttendees;
    }


    /**
     * Sets the eventAttendees value for this Event.
     * 
     * @param eventAttendees
     */
    public void setEventAttendees(com.sforce.soap.enterprise.QueryResult eventAttendees) {
        this.eventAttendees = eventAttendees;
    }


    /**
     * Gets the isAllDayEvent value for this Event.
     * 
     * @return isAllDayEvent
     */
    public java.lang.Boolean getIsAllDayEvent() {
        return isAllDayEvent;
    }


    /**
     * Sets the isAllDayEvent value for this Event.
     * 
     * @param isAllDayEvent
     */
    public void setIsAllDayEvent(java.lang.Boolean isAllDayEvent) {
        this.isAllDayEvent = isAllDayEvent;
    }


    /**
     * Gets the isArchived value for this Event.
     * 
     * @return isArchived
     */
    public java.lang.Boolean getIsArchived() {
        return isArchived;
    }


    /**
     * Sets the isArchived value for this Event.
     * 
     * @param isArchived
     */
    public void setIsArchived(java.lang.Boolean isArchived) {
        this.isArchived = isArchived;
    }


    /**
     * Gets the isChild value for this Event.
     * 
     * @return isChild
     */
    public java.lang.Boolean getIsChild() {
        return isChild;
    }


    /**
     * Sets the isChild value for this Event.
     * 
     * @param isChild
     */
    public void setIsChild(java.lang.Boolean isChild) {
        this.isChild = isChild;
    }


    /**
     * Gets the isDeleted value for this Event.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Event.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the isGroupEvent value for this Event.
     * 
     * @return isGroupEvent
     */
    public java.lang.Boolean getIsGroupEvent() {
        return isGroupEvent;
    }


    /**
     * Sets the isGroupEvent value for this Event.
     * 
     * @param isGroupEvent
     */
    public void setIsGroupEvent(java.lang.Boolean isGroupEvent) {
        this.isGroupEvent = isGroupEvent;
    }


    /**
     * Gets the isPrivate value for this Event.
     * 
     * @return isPrivate
     */
    public java.lang.Boolean getIsPrivate() {
        return isPrivate;
    }


    /**
     * Sets the isPrivate value for this Event.
     * 
     * @param isPrivate
     */
    public void setIsPrivate(java.lang.Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }


    /**
     * Gets the isRecurrence value for this Event.
     * 
     * @return isRecurrence
     */
    public java.lang.Boolean getIsRecurrence() {
        return isRecurrence;
    }


    /**
     * Sets the isRecurrence value for this Event.
     * 
     * @param isRecurrence
     */
    public void setIsRecurrence(java.lang.Boolean isRecurrence) {
        this.isRecurrence = isRecurrence;
    }


    /**
     * Gets the isReminderSet value for this Event.
     * 
     * @return isReminderSet
     */
    public java.lang.Boolean getIsReminderSet() {
        return isReminderSet;
    }


    /**
     * Sets the isReminderSet value for this Event.
     * 
     * @param isReminderSet
     */
    public void setIsReminderSet(java.lang.Boolean isReminderSet) {
        this.isReminderSet = isReminderSet;
    }


    /**
     * Gets the lastModifiedBy value for this Event.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Event.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Event.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Event.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Event.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Event.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the location value for this Event.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Event.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the owner value for this Event.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Event.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Event.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Event.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the recurrenceActivityId value for this Event.
     * 
     * @return recurrenceActivityId
     */
    public java.lang.String getRecurrenceActivityId() {
        return recurrenceActivityId;
    }


    /**
     * Sets the recurrenceActivityId value for this Event.
     * 
     * @param recurrenceActivityId
     */
    public void setRecurrenceActivityId(java.lang.String recurrenceActivityId) {
        this.recurrenceActivityId = recurrenceActivityId;
    }


    /**
     * Gets the recurrenceDayOfMonth value for this Event.
     * 
     * @return recurrenceDayOfMonth
     */
    public java.lang.Integer getRecurrenceDayOfMonth() {
        return recurrenceDayOfMonth;
    }


    /**
     * Sets the recurrenceDayOfMonth value for this Event.
     * 
     * @param recurrenceDayOfMonth
     */
    public void setRecurrenceDayOfMonth(java.lang.Integer recurrenceDayOfMonth) {
        this.recurrenceDayOfMonth = recurrenceDayOfMonth;
    }


    /**
     * Gets the recurrenceDayOfWeekMask value for this Event.
     * 
     * @return recurrenceDayOfWeekMask
     */
    public java.lang.Integer getRecurrenceDayOfWeekMask() {
        return recurrenceDayOfWeekMask;
    }


    /**
     * Sets the recurrenceDayOfWeekMask value for this Event.
     * 
     * @param recurrenceDayOfWeekMask
     */
    public void setRecurrenceDayOfWeekMask(java.lang.Integer recurrenceDayOfWeekMask) {
        this.recurrenceDayOfWeekMask = recurrenceDayOfWeekMask;
    }


    /**
     * Gets the recurrenceEndDateOnly value for this Event.
     * 
     * @return recurrenceEndDateOnly
     */
    public java.util.Date getRecurrenceEndDateOnly() {
        return recurrenceEndDateOnly;
    }


    /**
     * Sets the recurrenceEndDateOnly value for this Event.
     * 
     * @param recurrenceEndDateOnly
     */
    public void setRecurrenceEndDateOnly(java.util.Date recurrenceEndDateOnly) {
        this.recurrenceEndDateOnly = recurrenceEndDateOnly;
    }


    /**
     * Gets the recurrenceInstance value for this Event.
     * 
     * @return recurrenceInstance
     */
    public java.lang.String getRecurrenceInstance() {
        return recurrenceInstance;
    }


    /**
     * Sets the recurrenceInstance value for this Event.
     * 
     * @param recurrenceInstance
     */
    public void setRecurrenceInstance(java.lang.String recurrenceInstance) {
        this.recurrenceInstance = recurrenceInstance;
    }


    /**
     * Gets the recurrenceInterval value for this Event.
     * 
     * @return recurrenceInterval
     */
    public java.lang.Integer getRecurrenceInterval() {
        return recurrenceInterval;
    }


    /**
     * Sets the recurrenceInterval value for this Event.
     * 
     * @param recurrenceInterval
     */
    public void setRecurrenceInterval(java.lang.Integer recurrenceInterval) {
        this.recurrenceInterval = recurrenceInterval;
    }


    /**
     * Gets the recurrenceMonthOfYear value for this Event.
     * 
     * @return recurrenceMonthOfYear
     */
    public java.lang.String getRecurrenceMonthOfYear() {
        return recurrenceMonthOfYear;
    }


    /**
     * Sets the recurrenceMonthOfYear value for this Event.
     * 
     * @param recurrenceMonthOfYear
     */
    public void setRecurrenceMonthOfYear(java.lang.String recurrenceMonthOfYear) {
        this.recurrenceMonthOfYear = recurrenceMonthOfYear;
    }


    /**
     * Gets the recurrenceStartDateTime value for this Event.
     * 
     * @return recurrenceStartDateTime
     */
    public java.util.Calendar getRecurrenceStartDateTime() {
        return recurrenceStartDateTime;
    }


    /**
     * Sets the recurrenceStartDateTime value for this Event.
     * 
     * @param recurrenceStartDateTime
     */
    public void setRecurrenceStartDateTime(java.util.Calendar recurrenceStartDateTime) {
        this.recurrenceStartDateTime = recurrenceStartDateTime;
    }


    /**
     * Gets the recurrenceTimeZoneSidKey value for this Event.
     * 
     * @return recurrenceTimeZoneSidKey
     */
    public java.lang.String getRecurrenceTimeZoneSidKey() {
        return recurrenceTimeZoneSidKey;
    }


    /**
     * Sets the recurrenceTimeZoneSidKey value for this Event.
     * 
     * @param recurrenceTimeZoneSidKey
     */
    public void setRecurrenceTimeZoneSidKey(java.lang.String recurrenceTimeZoneSidKey) {
        this.recurrenceTimeZoneSidKey = recurrenceTimeZoneSidKey;
    }


    /**
     * Gets the recurrenceType value for this Event.
     * 
     * @return recurrenceType
     */
    public java.lang.String getRecurrenceType() {
        return recurrenceType;
    }


    /**
     * Sets the recurrenceType value for this Event.
     * 
     * @param recurrenceType
     */
    public void setRecurrenceType(java.lang.String recurrenceType) {
        this.recurrenceType = recurrenceType;
    }


    /**
     * Gets the recurringEvents value for this Event.
     * 
     * @return recurringEvents
     */
    public com.sforce.soap.enterprise.QueryResult getRecurringEvents() {
        return recurringEvents;
    }


    /**
     * Sets the recurringEvents value for this Event.
     * 
     * @param recurringEvents
     */
    public void setRecurringEvents(com.sforce.soap.enterprise.QueryResult recurringEvents) {
        this.recurringEvents = recurringEvents;
    }


    /**
     * Gets the reminderDateTime value for this Event.
     * 
     * @return reminderDateTime
     */
    public java.util.Calendar getReminderDateTime() {
        return reminderDateTime;
    }


    /**
     * Sets the reminderDateTime value for this Event.
     * 
     * @param reminderDateTime
     */
    public void setReminderDateTime(java.util.Calendar reminderDateTime) {
        this.reminderDateTime = reminderDateTime;
    }


    /**
     * Gets the showAs value for this Event.
     * 
     * @return showAs
     */
    public java.lang.String getShowAs() {
        return showAs;
    }


    /**
     * Sets the showAs value for this Event.
     * 
     * @param showAs
     */
    public void setShowAs(java.lang.String showAs) {
        this.showAs = showAs;
    }


    /**
     * Gets the subject value for this Event.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this Event.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the systemModstamp value for this Event.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Event.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the what value for this Event.
     * 
     * @return what
     */
    public com.sforce.soap.enterprise.sobject.Name getWhat() {
        return what;
    }


    /**
     * Sets the what value for this Event.
     * 
     * @param what
     */
    public void setWhat(com.sforce.soap.enterprise.sobject.Name what) {
        this.what = what;
    }


    /**
     * Gets the whatId value for this Event.
     * 
     * @return whatId
     */
    public java.lang.String getWhatId() {
        return whatId;
    }


    /**
     * Sets the whatId value for this Event.
     * 
     * @param whatId
     */
    public void setWhatId(java.lang.String whatId) {
        this.whatId = whatId;
    }


    /**
     * Gets the who value for this Event.
     * 
     * @return who
     */
    public com.sforce.soap.enterprise.sobject.Name getWho() {
        return who;
    }


    /**
     * Sets the who value for this Event.
     * 
     * @param who
     */
    public void setWho(com.sforce.soap.enterprise.sobject.Name who) {
        this.who = who;
    }


    /**
     * Gets the whoId value for this Event.
     * 
     * @return whoId
     */
    public java.lang.String getWhoId() {
        return whoId;
    }


    /**
     * Sets the whoId value for this Event.
     * 
     * @param whoId
     */
    public void setWhoId(java.lang.String whoId) {
        this.whoId = whoId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Event)) return false;
        Event other = (Event) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.activityDate==null && other.getActivityDate()==null) || 
             (this.activityDate!=null &&
              this.activityDate.equals(other.getActivityDate()))) &&
            ((this.activityDateTime==null && other.getActivityDateTime()==null) || 
             (this.activityDateTime!=null &&
              this.activityDateTime.equals(other.getActivityDateTime()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
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
            ((this.durationInMinutes==null && other.getDurationInMinutes()==null) || 
             (this.durationInMinutes!=null &&
              this.durationInMinutes.equals(other.getDurationInMinutes()))) &&
            ((this.eventAttendees==null && other.getEventAttendees()==null) || 
             (this.eventAttendees!=null &&
              this.eventAttendees.equals(other.getEventAttendees()))) &&
            ((this.isAllDayEvent==null && other.getIsAllDayEvent()==null) || 
             (this.isAllDayEvent!=null &&
              this.isAllDayEvent.equals(other.getIsAllDayEvent()))) &&
            ((this.isArchived==null && other.getIsArchived()==null) || 
             (this.isArchived!=null &&
              this.isArchived.equals(other.getIsArchived()))) &&
            ((this.isChild==null && other.getIsChild()==null) || 
             (this.isChild!=null &&
              this.isChild.equals(other.getIsChild()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.isGroupEvent==null && other.getIsGroupEvent()==null) || 
             (this.isGroupEvent!=null &&
              this.isGroupEvent.equals(other.getIsGroupEvent()))) &&
            ((this.isPrivate==null && other.getIsPrivate()==null) || 
             (this.isPrivate!=null &&
              this.isPrivate.equals(other.getIsPrivate()))) &&
            ((this.isRecurrence==null && other.getIsRecurrence()==null) || 
             (this.isRecurrence!=null &&
              this.isRecurrence.equals(other.getIsRecurrence()))) &&
            ((this.isReminderSet==null && other.getIsReminderSet()==null) || 
             (this.isReminderSet!=null &&
              this.isReminderSet.equals(other.getIsReminderSet()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.recurrenceActivityId==null && other.getRecurrenceActivityId()==null) || 
             (this.recurrenceActivityId!=null &&
              this.recurrenceActivityId.equals(other.getRecurrenceActivityId()))) &&
            ((this.recurrenceDayOfMonth==null && other.getRecurrenceDayOfMonth()==null) || 
             (this.recurrenceDayOfMonth!=null &&
              this.recurrenceDayOfMonth.equals(other.getRecurrenceDayOfMonth()))) &&
            ((this.recurrenceDayOfWeekMask==null && other.getRecurrenceDayOfWeekMask()==null) || 
             (this.recurrenceDayOfWeekMask!=null &&
              this.recurrenceDayOfWeekMask.equals(other.getRecurrenceDayOfWeekMask()))) &&
            ((this.recurrenceEndDateOnly==null && other.getRecurrenceEndDateOnly()==null) || 
             (this.recurrenceEndDateOnly!=null &&
              this.recurrenceEndDateOnly.equals(other.getRecurrenceEndDateOnly()))) &&
            ((this.recurrenceInstance==null && other.getRecurrenceInstance()==null) || 
             (this.recurrenceInstance!=null &&
              this.recurrenceInstance.equals(other.getRecurrenceInstance()))) &&
            ((this.recurrenceInterval==null && other.getRecurrenceInterval()==null) || 
             (this.recurrenceInterval!=null &&
              this.recurrenceInterval.equals(other.getRecurrenceInterval()))) &&
            ((this.recurrenceMonthOfYear==null && other.getRecurrenceMonthOfYear()==null) || 
             (this.recurrenceMonthOfYear!=null &&
              this.recurrenceMonthOfYear.equals(other.getRecurrenceMonthOfYear()))) &&
            ((this.recurrenceStartDateTime==null && other.getRecurrenceStartDateTime()==null) || 
             (this.recurrenceStartDateTime!=null &&
              this.recurrenceStartDateTime.equals(other.getRecurrenceStartDateTime()))) &&
            ((this.recurrenceTimeZoneSidKey==null && other.getRecurrenceTimeZoneSidKey()==null) || 
             (this.recurrenceTimeZoneSidKey!=null &&
              this.recurrenceTimeZoneSidKey.equals(other.getRecurrenceTimeZoneSidKey()))) &&
            ((this.recurrenceType==null && other.getRecurrenceType()==null) || 
             (this.recurrenceType!=null &&
              this.recurrenceType.equals(other.getRecurrenceType()))) &&
            ((this.recurringEvents==null && other.getRecurringEvents()==null) || 
             (this.recurringEvents!=null &&
              this.recurringEvents.equals(other.getRecurringEvents()))) &&
            ((this.reminderDateTime==null && other.getReminderDateTime()==null) || 
             (this.reminderDateTime!=null &&
              this.reminderDateTime.equals(other.getReminderDateTime()))) &&
            ((this.showAs==null && other.getShowAs()==null) || 
             (this.showAs!=null &&
              this.showAs.equals(other.getShowAs()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.what==null && other.getWhat()==null) || 
             (this.what!=null &&
              this.what.equals(other.getWhat()))) &&
            ((this.whatId==null && other.getWhatId()==null) || 
             (this.whatId!=null &&
              this.whatId.equals(other.getWhatId()))) &&
            ((this.who==null && other.getWho()==null) || 
             (this.who!=null &&
              this.who.equals(other.getWho()))) &&
            ((this.whoId==null && other.getWhoId()==null) || 
             (this.whoId!=null &&
              this.whoId.equals(other.getWhoId())));
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getActivityDate() != null) {
            _hashCode += getActivityDate().hashCode();
        }
        if (getActivityDateTime() != null) {
            _hashCode += getActivityDateTime().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDurationInMinutes() != null) {
            _hashCode += getDurationInMinutes().hashCode();
        }
        if (getEventAttendees() != null) {
            _hashCode += getEventAttendees().hashCode();
        }
        if (getIsAllDayEvent() != null) {
            _hashCode += getIsAllDayEvent().hashCode();
        }
        if (getIsArchived() != null) {
            _hashCode += getIsArchived().hashCode();
        }
        if (getIsChild() != null) {
            _hashCode += getIsChild().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getIsGroupEvent() != null) {
            _hashCode += getIsGroupEvent().hashCode();
        }
        if (getIsPrivate() != null) {
            _hashCode += getIsPrivate().hashCode();
        }
        if (getIsRecurrence() != null) {
            _hashCode += getIsRecurrence().hashCode();
        }
        if (getIsReminderSet() != null) {
            _hashCode += getIsReminderSet().hashCode();
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
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getRecurrenceActivityId() != null) {
            _hashCode += getRecurrenceActivityId().hashCode();
        }
        if (getRecurrenceDayOfMonth() != null) {
            _hashCode += getRecurrenceDayOfMonth().hashCode();
        }
        if (getRecurrenceDayOfWeekMask() != null) {
            _hashCode += getRecurrenceDayOfWeekMask().hashCode();
        }
        if (getRecurrenceEndDateOnly() != null) {
            _hashCode += getRecurrenceEndDateOnly().hashCode();
        }
        if (getRecurrenceInstance() != null) {
            _hashCode += getRecurrenceInstance().hashCode();
        }
        if (getRecurrenceInterval() != null) {
            _hashCode += getRecurrenceInterval().hashCode();
        }
        if (getRecurrenceMonthOfYear() != null) {
            _hashCode += getRecurrenceMonthOfYear().hashCode();
        }
        if (getRecurrenceStartDateTime() != null) {
            _hashCode += getRecurrenceStartDateTime().hashCode();
        }
        if (getRecurrenceTimeZoneSidKey() != null) {
            _hashCode += getRecurrenceTimeZoneSidKey().hashCode();
        }
        if (getRecurrenceType() != null) {
            _hashCode += getRecurrenceType().hashCode();
        }
        if (getRecurringEvents() != null) {
            _hashCode += getRecurringEvents().hashCode();
        }
        if (getReminderDateTime() != null) {
            _hashCode += getReminderDateTime().hashCode();
        }
        if (getShowAs() != null) {
            _hashCode += getShowAs().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getWhat() != null) {
            _hashCode += getWhat().hashCode();
        }
        if (getWhatId() != null) {
            _hashCode += getWhatId().hashCode();
        }
        if (getWho() != null) {
            _hashCode += getWho().hashCode();
        }
        if (getWhoId() != null) {
            _hashCode += getWhoId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Event.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Event"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActivityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActivityDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("durationInMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DurationInMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventAttendees");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EventAttendees"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAllDayEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsAllDayEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isArchived");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsArchived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isChild");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsChild"));
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
        elemField.setFieldName("isGroupEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsGroupEvent"));
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
        elemField.setFieldName("isRecurrence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsRecurrence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReminderSet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsReminderSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
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
        elemField.setFieldName("recurrenceActivityId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceActivityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceDayOfMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceDayOfMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceDayOfWeekMask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceDayOfWeekMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceEndDateOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceEndDateOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceInstance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceInstance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceMonthOfYear");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceMonthOfYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceStartDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceStartDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceTimeZoneSidKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceTimeZoneSidKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurringEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurringEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reminderDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ReminderDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showAs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ShowAs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Subject"));
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
        elemField.setFieldName("what");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "What"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("whatId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "WhatId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("who");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Who"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("whoId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "WhoId"));
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
