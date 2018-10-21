package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerProfileRequestRequest
 */
public class CustomerProfileRequestRequest   {
  private String customerReference = null;

  private Object customerProfileRecord = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: consolidates state, rating and alert values for reference defined below 
   * @return customerProfileRecord
  **/

  public Object getCustomerProfileRecord() {
    return customerProfileRecord;
  }

  public void setCustomerProfileRecord(Object customerProfileRecord) {
    this.customerProfileRecord = customerProfileRecord;
  }


}

