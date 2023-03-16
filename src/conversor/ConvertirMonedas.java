package conversor;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

	public void ConvertirPesosADolar(double valorRecibido) {
		double monedaDolar = valorRecibido / 383;
		monedaDolar =(double) Math.round(monedaDolar*100)/100; //redondea en caso de que el valor tenga mas de dos decimales
		JOptionPane.showMessageDialog(null, "Tienes $ "+monedaDolar+" Dolares");
	}
	
	public void ConvertirPesosAEuros(double valorRecibido) {
		double monedaEuro = valorRecibido / 411;
		monedaEuro =(double) Math.round(monedaEuro*100)/100; //redondea en caso de que el valor tenga mas de dos decimales
		JOptionPane.showMessageDialog(null, "Tienes $ "+monedaEuro+" Euros");
	}
	
	public void ConvertirPesosAReales(double valorRecibido) {
		double monedaReal = valorRecibido / 87;
		monedaReal =(double) Math.round(monedaReal*100)/100; //redondea en caso de que el valor tenga mas de dos decimales
		JOptionPane.showMessageDialog(null, "Tienes $ "+monedaReal+" Reales");
	}
	
	public void ConvertirDolarAPesos(double valorRecibido) {
		double monedaPeso = valorRecibido * 383;
		monedaPeso =(double) Math.round(monedaPeso*100)/100; //redondea en caso de que el valor tenga mas de dos decimales
		JOptionPane.showMessageDialog(null, "Tienes $ "+monedaPeso+" Pesos");
	}
	
	public void ConvertirEurosAPesos(double valorRecibido) {
		double monedaPesos = valorRecibido * 411;
		monedaPesos =(double) Math.round(monedaPesos*100)/100; //redondea en caso de que el valor tenga mas de dos decimales
		JOptionPane.showMessageDialog(null, "Tienes $ "+monedaPesos+" Pesos");
	}
	
	public void ConvertirRealesAPesos(double valorRecibido) {
		double monedaPesos = valorRecibido * 87;
		monedaPesos =(double) Math.round(monedaPesos*100)/100; //redondea en caso de que el valor tenga mas de dos decimales
		JOptionPane.showMessageDialog(null, "Tienes $ "+monedaPesos+" Pesos");
	}
}
