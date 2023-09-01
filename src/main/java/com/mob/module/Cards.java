package com.mob.module;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cards {
	@JsonProperty("paymentToken")
	private String paymenetToke;
	@JsonProperty("cardNumber")
	private String number;
	@JsonProperty("cardType")
	private String type;
	@JsonProperty("cardNumber")
	private boolean isDefault;

}
