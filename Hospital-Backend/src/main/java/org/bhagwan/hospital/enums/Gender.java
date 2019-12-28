package org.bhagwan.hospital.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Gender {
	@JsonProperty("1")
	Male,
	@JsonProperty("2")
	Female,
	@JsonProperty("3")
	Other
}
