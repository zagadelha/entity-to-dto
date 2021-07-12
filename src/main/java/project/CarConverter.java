package project;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarConverter {

	CarConverter CONVERTER = Mappers.getMapper(CarConverter.class);

	@Mapping(source = "modelName", target = "model")
	@Mapping(source = "numSeats", target = "seats")
	Car getEntity(CarDto dto);

	@Mapping(source = "model", target = "modelName")
	@Mapping(source = "seats", target = "numSeats")
	CarDto getDto(Car entity);

}
