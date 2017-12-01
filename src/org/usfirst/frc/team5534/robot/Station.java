package org.usfirst.frc.team5534.robot;


public class Station {

	
	public static void LeftStation() {
		
	}
	
	
	public static void CenterStation() {
		
	}
	
	
	public static void RightStation() {
		
	}
	
	
	public static void CrossBaseline() {
		
	}
	
	
	public static void DoNothing() {
		
	}
	 
	
	public static void Testing() {
		switch (Stage.Number) {

			case 0:
				Navigation.Reset();
				break;
		
			case 1:
				Autopilot.DriveForwardToDistance(36, 16*12);
				break;

			case 2:
//				Drivetrain.TurnToHeading( 60 );
				Stage.WaitForDuration( 4 );
				break;
				
			case 3:
//				Drivetrain.DriveToTarget( 32 );
				if ( Navigation.GetRange() > 16 ) { Stage.StillWorking = true; }
				break;
				
			case 4:
				Drivetrain.Stop();
				break;
				
			default:
				Stage.Last();
				break;
		}
				
	}
	 
}
