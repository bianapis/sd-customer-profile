package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerProfileRatingRecordResponse
 */
public class CustomerProfileRatingRecordResponse   {
  private String customerReference = null;

  private String customerProfileReference = null;

  private String customerRelationshipRatingReference = null;

  private Object customerProfileRecord = null;

  private String customerRelationshipRatingType = null;

  private String customerRelationshipRating = null;

  private String customerRelationshipRatingNarrative = null;

  private String customerRelationshipRatingValidFromToDate = null;

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
   * @return customerRelationshipRatingReference
  **/

  public String getCustomerRelationshipRatingReference() {
    return customerRelationshipRatingReference;
  }

  public void setCustomerRelationshipRatingReference(String customerRelationshipRatingReference) {
    this.customerRelationshipRatingReference = customerRelationshipRatingReference;
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
   * Get customerRelationshipRatingType
   * @return customerRelationshipRatingType
  **/

  public String getCustomerRelationshipRatingType() {
    return customerRelationshipRatingType;
  }

  public void setCustomerRelationshipRatingType(String customerRelationshipRatingType) {
    this.customerRelationshipRatingType = customerRelationshipRatingType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Rate general-info: maintained state value 
   * @return customerRelationshipRating
  **/

  public String getCustomerRelationshipRating() {
    return customerRelationshipRating;
  }

  public void setCustomerRelationshipRating(String customerRelationshipRating) {
    this.customerRelationshipRating = customerRelationshipRating;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: explanation or description for given state value 
   * @return customerRelationshipRatingNarrative
  **/

  public String getCustomerRelationshipRatingNarrative() {
    return customerRelationshipRatingNarrative;
  }

  public void setCustomerRelationshipRatingNarrative(String customerRelationshipRatingNarrative) {
    this.customerRelationshipRatingNarrative = customerRelationshipRatingNarrative;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Date general-info: when rating value updated and time until given value applies 
   * @return customerRelationshipRatingValidFromToDate
  **/

  public String getCustomerRelationshipRatingValidFromToDate() {
    return customerRelationshipRatingValidFromToDate;
  }

  public void setCustomerRelationshipRatingValidFromToDate(String customerRelationshipRatingValidFromToDate) {
    this.customerRelationshipRatingValidFromToDate = customerRelationshipRatingValidFromToDate;
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

