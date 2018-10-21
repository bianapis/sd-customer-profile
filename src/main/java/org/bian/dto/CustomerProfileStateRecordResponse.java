package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerProfileStateRecordResponse
 */
public class CustomerProfileStateRecordResponse   {
  private String customerReference = null;

  private String customerProfileReference = null;

  private String customerRelationshipStateReference = null;

  private Object customerProfileRecord = null;

  private String customerRelationshipStateType = null;

  private String customerRelationshipState = null;

  private String customerRelationshipStateNarrative = null;

  private String customerRelationshipStateValidFromToDate = null;

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
   * @return customerRelationshipStateReference
  **/

  public String getCustomerRelationshipStateReference() {
    return customerRelationshipStateReference;
  }

  public void setCustomerRelationshipStateReference(String customerRelationshipStateReference) {
    this.customerRelationshipStateReference = customerRelationshipStateReference;
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
   * @return customerRelationshipStateType
  **/

  public String getCustomerRelationshipStateType() {
    return customerRelationshipStateType;
  }

  public void setCustomerRelationshipStateType(String customerRelationshipStateType) {
    this.customerRelationshipStateType = customerRelationshipStateType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: maintained state value 
   * @return customerRelationshipState
  **/

  public String getCustomerRelationshipState() {
    return customerRelationshipState;
  }

  public void setCustomerRelationshipState(String customerRelationshipState) {
    this.customerRelationshipState = customerRelationshipState;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: explanation or description for given state value 
   * @return customerRelationshipStateNarrative
  **/

  public String getCustomerRelationshipStateNarrative() {
    return customerRelationshipStateNarrative;
  }

  public void setCustomerRelationshipStateNarrative(String customerRelationshipStateNarrative) {
    this.customerRelationshipStateNarrative = customerRelationshipStateNarrative;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Date general-info: when state value updated and time until given value applies 
   * @return customerRelationshipStateValidFromToDate
  **/

  public String getCustomerRelationshipStateValidFromToDate() {
    return customerRelationshipStateValidFromToDate;
  }

  public void setCustomerRelationshipStateValidFromToDate(String customerRelationshipStateValidFromToDate) {
    this.customerRelationshipStateValidFromToDate = customerRelationshipStateValidFromToDate;
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

