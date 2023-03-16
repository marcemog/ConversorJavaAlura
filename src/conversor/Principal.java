package conversor;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		Function funcion = new Function();
		
		String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Menú", JOptionPane.QUESTION_MESSAGE, null ,
				new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion")).toString();
		
		switch (opciones) {
		case "Conversor de Moneda": {
			boolean continuar = true;
			while (continuar) {
			String input;
			boolean esNumero = false;
			//la expresión regular "[0-9]+" coincide con cualquier cadena que contenga solo dígitos. El método matches() de la clase String devuelve true si la entrada coincide con la expresión regular y false de lo contrario. Si la entrada no contiene solo dígitos, se muestra un mensaje de error y se vuelve a pedir la entrada.
			do {
			    input = JOptionPane.showInputDialog("Ingrese un valor a convertir");
			    esNumero = input.matches("[0-9]+(\\.\\d{1,2})?");
			    if (!esNumero) {
			        JOptionPane.showMessageDialog(null, "Ingrese solo números con hasta dos valores decimales", "Error", JOptionPane.ERROR_MESSAGE);
			    }
			} while (!esNumero);
			double valorRecibido = Double.parseDouble(input);
			funcion.ConvertirMonedas(valorRecibido);
			
			int seleccion = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversión?");
	        if (seleccion != JOptionPane.OK_OPTION) {
	            continuar = false;
	        }
	    }
	    JOptionPane.showMessageDialog(null, "Programa terminado");
	    break;
		}
		case "Conversor de Temperatura": {
			boolean continuar = true;
			while (continuar) {
			String input;
			boolean esNumero = false;
			//la expresión regular "[0-9]+" coincide con cualquier cadena que contenga solo dígitos. El método matches() de la clase String devuelve true si la entrada coincide con la expresión regular y false de lo contrario. Si la entrada no contiene solo dígitos, se muestra un mensaje de error y se vuelve a pedir la entrada.
			do {
			    input = JOptionPane.showInputDialog("Ingrese un valor a convertir");
			    esNumero = input.matches("-?[0-9]+(\\.\\d{1,2})?");
			    if (!esNumero) {
			        JOptionPane.showMessageDialog(null, "Ingrese solo números con hasta dos valores decimales", "Error", JOptionPane.ERROR_MESSAGE);
			    }
			} while (!esNumero);
			double valorRecibido = Double.parseDouble(input);
			funcion.ConvertirTemperaturas(valorRecibido);
			
			int seleccion = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversión?");
	        if (seleccion != JOptionPane.OK_OPTION) {
	            continuar = false;
	        }
	    }
	    JOptionPane.showMessageDialog(null, "Programa terminado");
	    break;
		}
	}
	
}
}
