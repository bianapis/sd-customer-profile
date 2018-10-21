package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerProfileAlertRecordResponse
 */
public class CustomerProfileAlertRecordResponse   {
  private String customerReference = null;

  private String customerProfileReference = null;

  private String customerRelationshipAlertReference = null;

  private Object customerProfileRecord = null;

  private String customerRelationshipAlertType = null;

  private String customerRelationshipAlert = null;

  private String customerRelationshipAlertNarrative = null;

  private String customerRelationshipAlertValidFromToDate = null;

  private String recordingRecordReference = null;

  private String recordingRecordStatus = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerProfileReference
  **/

  public String getCustomerProfileReference() {
    return customerProfileReference;
  }

  public void setCustomerProfileReference(String customerProfileReference) {
    this.customerProfileReference = customerProfileReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerRelationshipAlertReference
  **/

  public String getCustomerRelationshipAlertReference() {
    return customerRelationshipAlertReference;
  }

  public void setCustomerRelationshipAlertReference(String customerRelationshipAlertReference) {
    this.customerRelationshipAlertReference = customerRelationshipAlertReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: consolidates state, rating and alert values for reference defined below 
   * @return customerProfileRecord
  **/

  public Object getCustomerProfileRecord() {
    return customerProfileRecord;
  }

  public void setCustomerProfileRecord(Object customerProfileRecord) {
    this.customerProfileRecord = customerProfileRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerRelationshipAlertType
  **/

  public String getCustomerRelationshipAlertType() {
    return customerRelationshipAlertType;
  }

  public void setCustomerRelationshipAlertType(String customerRelationshipAlertType) {
    this.customerRelationshipAlertType = customerRelationshipAlertType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: maintained alert value 
   * @return customerRelationshipAlert
  **/

  public String getCustomerRelationshipAlert() {
    return customerRelationshipAlert;
  }

  public void setCustomerRelationshipAlert(String customerRelationshipAlert) {
    this.customerRelationshipAlert = customerRelationshipAlert;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: explanation for given alert value 
   * @return customerRelationshipAlertNarrative
  **/

  public String getCustomerRelationshipAlertNarrative() {
    return customerRelationshipAlertNarrative;
  }

  public void setCustomerRelationshipAlertNarrative(String customerRelationshipAlertNarrative) {
    this.customerRelationshipAlertNarrative = customerRelationshipAlertNarrative;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Date general-info: when alert created and time until alert expires 
   * @return customerRelationshipAlertValidFromToDate
  **/

  public String getCustomerRelationshipAlertValidFromToDate() {
    return customerRelationshipAlertValidFromToDate;
  }

  public void setCustomerRelationshipAlertValidFromToDate(String customerRelationshipAlertValidFromToDate) {
    this.customerRelationshipAlertValidFromToDate = customerRelationshipAlertValidFromToDate;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return recordingRecordReference
  **/

  public String getRecordingRecordReference() {
    return recordingRecordReference;
  }

  public void setRecordingRecordReference(String recordingRecordReference) {
    this.recordingRecordReference = recordingRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return recordingRecordStatus
  **/

  public String getRecordingRecordStatus() {
    return recordingRecordStatus;
  }

  public void setRecordingRecordStatus(String recordingRecordStatus) {
    this.recordingRecordStatus = recordingRecordStatus;
  }


}

