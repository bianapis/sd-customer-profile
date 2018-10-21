package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerProfileAlertRecordRequest
 */
public class CustomerProfileAlertRecordRequest   {
  private String customerReference = null;

  private Object customerProfileRecord = null;

  private String customerRelationshipAlertType = null;

  private String customerRelationshipAlert = null;

  private String customerRelationshipAlertNarrative = null;

  private String customerRelationshipAlertValidFromToDate = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: consolidates alert value for reference defined below 
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: explanation or description for given Alert value 
   * @return customerRelationshipAlertNarrative
  **/

  public String getCustomerRelationshipAlertNarrative() {
    return customerRelationshipAlertNarrative;
  }

  public void setCustomerRelationshipAlertNarrative(String customerRelationshipAlertNarrative) {
    this.customerRelationshipAlertNarrative = customerRelationshipAlertNarrative;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Date general-info: alert value updated and time until given value applies 
   * @return customerRelationshipAlertValidFromToDate
  **/

  public String getCustomerRelationshipAlertValidFromToDate() {
    return customerRelationshipAlertValidFromToDate;
  }

  public void setCustomerRelationshipAlertValidFromToDate(String customerRelationshipAlertValidFromToDate) {
    this.customerRelationshipAlertValidFromToDate = customerRelationshipAlertValidFromToDate;
  }


}

