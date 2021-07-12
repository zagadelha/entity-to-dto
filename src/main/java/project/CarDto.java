package project;

public class CarDto {

	private String modelName;
	private String NumSeats;

	public CarDto(String modelName, String numSeats) {
		super();
		this.modelName = modelName;
		NumSeats = numSeats;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getNumSeats() {
		return NumSeats;
	}

	public void setNumSeats(String numSeats) {
		NumSeats = numSeats;
	}

}
