package com.mob.module;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Status {
	
	
	private String  code;
	private String description;
	private String retry;
	private String messageAr;
	private String messageEn;
	

}
