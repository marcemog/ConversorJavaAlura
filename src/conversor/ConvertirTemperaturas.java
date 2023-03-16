package conversor;

import javax.swing.JOptionPane;

public class ConvertirTemperaturas {

	public void ConvertirCelsiusAFarenheit(double valorRecibido) {
		double gradosFarenheit = (valorRecibido * 1.8) + 32;
		gradosFarenheit =(double) Math.round(gradosFarenheit*100)/100; //redondea en caso de que el valor tenga mas de dos decimales
		JOptionPane.showMessageDialog(null, valorRecibido +" grados Celsius equivalen a "+gradosFarenheit+" grados Farenheit");
	}
	
	public void ConvertirFarenheitACelsius(double valorRecibido) {
		double gradosCelsius = (valorRecibido - 32) /1.8;
		gradosCelsius =(double) Math.round(gradosCelsius*100)/100; //redondea en caso de que el valor tenga mas de dos decimales
		JOptionPane.showMessageDialog(null, valorRecibido +" grados Farenheit equivalen a "+gradosCelsius+" grados Celsius");
	}
	
	public void ConvertirCelsiusAKelvin(double valorRecibido) {
		double gradosKelvin = (valorRecibido +273.15);
		gradosKelvin =(double) Math.round(gradosKelvin*100)/100; //redondea en caso de que el valor tenga mas de dos decimales
		JOptionPane.showMessageDialog(null, valorRecibido +" grados Celsius equivalen a "+gradosKelvin+" grados Kelvin");
	}
	
	public void ConvertirKelvinACelsius(double valorRecibido) {
		double gradosCelsius = (valorRecibido - 273.15);
		gradosCelsius =(double) Math.round(gradosCelsius*100)/100; //redondea en caso de que el valor tenga mas de dos decimales
		JOptionPane.showMessageDialog(null, valorRecibido +" grados Kelvin equivalen a "+gradosCelsius+" grados Celsius");
	}
	
	public void ConvertirKelvinAFarenheit(double valorRecibido) {
		double gradosFarenheit = ((valorRecibido - 273.15) *9/5) + 32;
		gradosFarenheit =(double) Math.round(gradosFarenheit*100)/100; //redondea en caso de que el valor tenga mas de dos decimales
		JOptionPane.showMessageDialog(null, valorRecibido +" grados Kelvin equivalen a "+gradosFarenheit+" grados Farenheit");
	}
	
	public void ConvertirFarenheitAKelvin(double valorRecibido) {
		double gradosKelvin = ((valorRecibido - 32) *5/9) + 273.15;
		gradosKelvin =(double) Math.round(gradosKelvin*100)/100; //redondea en caso de que el valor tenga mas de dos decimales
		JOptionPane.showMessageDialog(null, valorRecibido +" grados Kelvin equivalen a "+gradosKelvin+" grados Farenheit");
	}
}
