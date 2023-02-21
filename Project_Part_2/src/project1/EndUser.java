package project1;

public class EndUser {

	String firstName;
	String lastName;
	int age;
	String userResolution;
	float multiplier;
	float performanceScore;
	float  gpuClockSpeed;
	int numberOfCores;

	float cpuClockSpeed;
	String recGraphicQuality;

	public EndUser() {
		this.firstName = "";
		this.lastName = "";
		this.age = 0;
		this.userResolution = "";
		this.multiplier = 0.0f;
		this.performanceScore = 0.0f;
		this.gpuClockSpeed = 0.0f;
		this.numberOfCores = 0;
		this.cpuClockSpeed = 0.0f;
		this.recGraphicQuality="";
	

	}
	
	


	public EndUser(
			String firstName,
			String lastName,
			int age,
			String userResolution,
			float multiplier,
			float performanceScore,
			float gpuClockSpeed,
			int numberOfCores,
			float cpuClockSpeed,
			String recGraphicQuality) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.userResolution = userResolution;
		this.multiplier = multiplier;
		this.performanceScore = performanceScore;
		this.gpuClockSpeed = gpuClockSpeed;
		this.numberOfCores = numberOfCores;
		this.cpuClockSpeed = cpuClockSpeed;
		this.recGraphicQuality = recGraphicQuality;
	}


//	public float calculatePerformanceScore() {
//		this.performanceScore = ((5*this.gpuClockSpeed)+(numberOfCores*cpuClockSpeed))*multiplier;
//		
//	
//		return this.performanceScore;
//		
//	}

}
