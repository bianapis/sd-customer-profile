package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerProfileRatingRecordRequest
 */
public class CustomerProfileRatingRecordRequest   {
  private String customerReference = null;

  private Object customerProfileRecord = null;

  private String customerRelationshipRatingType = null;

  private String customerRelationshipRating = null;

  private String customerRelationshipRatingNarrative = null;

  private String customerRelationshipRatingValidFromToDate = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: consolidates rating values for reference defined below 
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
   * @return customerRelationshipRatingType
  **/

  public String getCustomerRelationshipRatingType() {
    return customerRelationshipRatingType;
  }

  public void setCustomerRelationshipRatingType(String customerRelationshipRatingType) {
    this.customerRelationshipRatingType = customerRelationshipRatingType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Rate general-info: maintained rating value 
   * @return customerRelationshipRating
  **/

  public String getCustomerRelationshipRating() {
    return customerRelationshipRating;
  }

  public void setCustomerRelationshipRating(String customerRelationshipRating) {
    this.customerRelationshipRating = customerRelationshipRating;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: explanation or description for given rating value 
   * @return customerRelationshipRatingNarrative
  **/

  public String getCustomerRelationshipRatingNarrative() {
    return customerRelationshipRatingNarrative;
  }

  public void setCustomerRelationshipRatingNarrative(String customerRelationshipRatingNarrative) {
    this.customerRelationshipRatingNarrative = customerRelationshipRatingNarrative;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Date general-info: rating value updated and time until given value applies 
   * @return customerRelationshipRatingValidFromToDate
  **/

  public String getCustomerRelationshipRatingValidFromToDate() {
    return customerRelationshipRatingValidFromToDate;
  }

  public void setCustomerRelationshipRatingValidFromToDate(String customerRelationshipRatingValidFromToDate) {
    this.customerRelationshipRatingValidFromToDate = customerRelationshipRatingValidFromToDate;
  }


}

