package com.mob.module;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SuccessResponse {
	private int version;
	private String language;
	private Account acount;
	private List<Cards> cards;
	

}
