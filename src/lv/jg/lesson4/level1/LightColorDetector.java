package lv.jg.lesson4.level1;

//Ok
public class LightColorDetector {

	public void detect(int wavelength) {

		switch (wavelength >= 380 && wavelength < 450 ? "violet" :
				wavelength >= 450 && wavelength < 495 ? "blue" :
				wavelength >= 495 && wavelength < 570 ? "green" :
				wavelength >= 570 && wavelength < 590 ? "yellow" :
				wavelength >= 590 && wavelength < 620 ? "orange" :
				wavelength >= 620 && wavelength < 750 ? "red" : "") {

		case "violet":
			System.out.println("Color for wavelength " + wavelength + " is violet.");
			break;
		case "blue":
			System.out.println("Color for wavelength " + wavelength + " is blue.");
			break;
		case "green":
			System.out.println("Color for wavelength " + wavelength + " is green.");
			break;
		case "yellow":
			System.out.println("Color for wavelength " + wavelength + " is yellow.");
			break;
		case "orange":
			System.out.println("Color for wavelength " + wavelength + " is orange.");
			break;
		case "red":
			System.out.println("Color for wavelength " + wavelength + " is red.");
			break;
		default:
			System.out.println("Wavelength " + wavelength + " is out of scope.");
		}
	}
}