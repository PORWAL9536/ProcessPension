package com.cts.pension.process.model;

import java.time.LocalDate;


import org.springframework.format.annotation.DateTimeFormat;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author vivek
 * POJO class for the Pension details.
 */
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PensionDetail {

	
	private String name;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateOfBirth;
	private String pan;
	private String pensionType;
	private double pensionAmount;
}
