package com.mob.module;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Account {
	
	@JsonProperty("acctNumber")
	private String AccountNumber;
	@JsonProperty("type")
	private String AccountType;

}
