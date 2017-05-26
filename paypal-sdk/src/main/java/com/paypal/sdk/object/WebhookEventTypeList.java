// This class was generated on Fri, 26 May 2017 11:06:13 PDT by version 0.01 of Braintree SDK Generator
// .java
// DO NOT EDIT
// @type object
// @json {"Type":"Webhook Event Type List","VariableName":"","Description":"List of webhook events.","IsArray":false,"ReadOnly":false,"Visible":false,"Required":false,"Properties":[{"Type":"Event Type","VariableName":"event_types","Description":"A list of webhook events.","IsArray":true,"ReadOnly":false,"Visible":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;


/**
 * List of webhook events.
 */
@Data
@Accessors(chain = true)
public class WebhookEventTypeList {
	/**
	* A list of webhook events.
	*/
	@SerializedName("event_types")
	private List<EventType> eventTypes;
}
