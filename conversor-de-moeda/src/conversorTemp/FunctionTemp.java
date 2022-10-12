package conversorTemp;

import javax.swing.JOptionPane;

public class FunctionTemp {
	
	public void converteTemp(double ValorRecebido) {
		
		ConversorTemp temp = new ConversorTemp();
		
		String opcoes = JOptionPane.showInputDialog(null, "Escolha a temperatura que você deseja converter: ", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Celsius para Fahrenheit", "De Celsius para Kelvin", "De Fahrenheit para Celsius", "De Fahrenheit para Kelvin", "De Kelvin para Celsius", "De Kelvin para Fahrenheit"}, "Escolha").toString();
		
		switch (opcoes) {
		case "De Celsius para Fahrenheit":
			temp.ConverteCelsiusParaFahrenheit(ValorRecebido);
			break;

		case "De Celsius para Kelvin":
			temp.ConverteCelsiusParaKelvin(ValorRecebido);
			break;
		
		case "De Fahrenheit para Celsius":
			temp.ConverteFahrenheitParaCelsius(ValorRecebido);
			break;
			
		case "De Fahrenheit para Kelvin":
			temp.ConverteFahrenheitParaKelvin(ValorRecebido);
			break;
			
		case "De Kelvin para Celsius":
			temp.ConverteKelvinParaCelsius(ValorRecebido);
			break;
			
		case "De Kelvin para Fahrenheit":
			temp.ConverteKelvinParaFahrenheit(ValorRecebido);
			break;
		}	
	}
}