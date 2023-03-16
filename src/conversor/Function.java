package conversor;

import javax.swing.JOptionPane;

public class Function {
	
	ConvertirMonedas monedas = new ConvertirMonedas();

	public void ConvertirMonedas(double ValorRecibido) {
		
		String opcion = (JOptionPane.showInputDialog(null, "Seleccione la moneda a la que desee convertir su dinero ", "Monedas", JOptionPane.PLAIN_MESSAGE, null ,
				new Object[] {"De Pesos a Dolar", "De Pesos a Euros" , "De Pesos a Reales" , "De Pesos a Libras" , "De Dolar a Pesos" ,
						"De Euros a Pesos" , "De Reales a Pesos", "De Libras a Pesos"}, "Seleccion")).toString();
		
		switch (opcion) {
		case "De Pesos a Dolar": {
			monedas.ConvertirPesosADolar(ValorRecibido);
			break;
		}
		case "De Pesos a Euros": {
			monedas.ConvertirPesosAEuros(ValorRecibido);
			break;
		}
		case "De Pesos a Reales": {
			monedas.ConvertirPesosAReales(ValorRecibido);
			break;
		}
		case "De Dolar a Pesos": {
			monedas.ConvertirDolarAPesos(ValorRecibido);
			break;
		}
		case "De Euros a Pesos": {
			monedas.ConvertirEurosAPesos(ValorRecibido);
			break;
		}
		case "De Reales a Pesos": {
			monedas.ConvertirRealesAPesos(ValorRecibido);
			break;
		}
		
	}
	}
	
	ConvertirTemperaturas temperaturas = new ConvertirTemperaturas();
	
	public void ConvertirTemperaturas(double ValorRecibido) {
		String opciones = (JOptionPane.showInputDialog(null, "Seleccione la temperatura a la que desee relizar su conversión ", "Temperaturas", JOptionPane.PLAIN_MESSAGE, null ,
				new Object[] {"De Celsius a Farenheit", "De Farenheit a Celsius" , "De Celsius a Kelvin" , "De Kelvin a Celsius" , "De Kelvin a Farenheit" ,
						"De Farenheit a Kelvin"}, "Seleccion")).toString();
		switch (opciones) {
		case "De Celsius a Farenheit": {
			temperaturas.ConvertirCelsiusAFarenheit(ValorRecibido);
			break;
		}
		case "De Farenheit a Celsius": {
			temperaturas.ConvertirFarenheitACelsius(ValorRecibido);
			break;
		}
		case "De Celsius a Kelvin": {
			temperaturas.ConvertirCelsiusAKelvin(ValorRecibido);
			break;
		}
		case "De Kelvin a Celsius": {
			temperaturas.ConvertirKelvinACelsius(ValorRecibido);
			break;
		}
		case "De Kelvin a Farenheit": {
			temperaturas.ConvertirKelvinAFarenheit(ValorRecibido);
			break;
		}
		case "De Farenheit a Kelvin": {
			temperaturas.ConvertirFarenheitAKelvin(ValorRecibido);
			break;
		}
	}
	}
	
	
}
