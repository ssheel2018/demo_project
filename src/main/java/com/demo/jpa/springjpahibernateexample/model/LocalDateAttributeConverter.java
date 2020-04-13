package com.demo.jpa.springjpahibernateexample.model;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/*
This make conversion for all the model objects., if not used than you have apply @convert annotation 
on each specific entity class to do the conversion.
*/
@Converter(autoApply = true)
public class LocalDateAttributeConverter implements AttributeConverter<LocalDate, Date> {

	public Date convertToDatabaseColumn(LocalDate localDate) {
		return localDate == null ? null : Date.valueOf(localDate);
	}

	public LocalDate convertToEntityAttribute(Date sqlDate) {
		return sqlDate == null ? null : sqlDate.toLocalDate();
	}

}
