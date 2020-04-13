package com.demo.jpa.springjpahibernateexample.model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;


@Converter(autoApply = true)
public class LocalDateTimeAttributeConverter implements AttributeConverter<LocalDateTime, Timestamp> {

	public Timestamp convertToDatabaseColumn(LocalDateTime localDateTime) {
		return localDateTime == null ? null : Timestamp.valueOf(localDateTime);
	}

	public LocalDateTime convertToEntityAttribute(Timestamp sqlTimestamp) {
		return sqlTimestamp == null ? null : sqlTimestamp.toLocalDateTime();
	}

}
