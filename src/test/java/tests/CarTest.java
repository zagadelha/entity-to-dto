package tests;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import project.Car;
import project.CarConverter;
import project.CarDto;

public class CarTest {

	@Test
	public void testEntityToDto() {

		Car car = new Car("BMW Z1", 4);
		CarDto dto = CarConverter.CONVERTER.getDto(car);
		// ----------------
		assertThat(dto.getModelName()).isEqualTo("BMW Z1");
		assertThat(dto.getNumSeats()).isEqualTo("4");

	}

	@Test
	public void testDtoToEntity() {

		CarDto dto = new CarDto("Porche Cayenne", "2");
		Car entity = CarConverter.CONVERTER.getEntity(dto);
		// ----------------
		assertThat(entity.getModel()).isEqualTo("Porche Cayenne");
		assertThat(entity.getSeats()).isEqualTo(2);

	}

}
