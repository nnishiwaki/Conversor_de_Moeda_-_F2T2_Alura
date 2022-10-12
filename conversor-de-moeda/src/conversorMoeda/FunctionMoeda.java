package conversorMoeda;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FunctionMoeda {
	
	ConversorRealParaMoeda moeda = new ConversorRealParaMoeda();
	ConversorMoedaParaReal real = new ConversorMoedaParaReal();
	
	public void converteMoeda(double valorRecebido) {
					
		String toConvert = JOptionPane.showInputDialog(null, "Escolha a moeda que deseja converter: ", "Moedas", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Reais para Dólares", "De Reais para Euro", "De Reais para Peso Argentino", "De Dólares para Reais", "De Euro Para Reais", "Peso Argentino para Reais"}, "Moedas").toString();
				
		switch(toConvert) {
			case "De Reais para Dólares":
				moeda.converterRealParaDolar(valorRecebido);
				break;
			
			case "De Reais para Euro":
				moeda.converterRealParaEuro(valorRecebido);
				break;
			
			case "De Reais para Peso Argentino":
				moeda.converterRealParaPesosArgentinos(valorRecebido);
				break;
				
			case "De Dólares para Reais":
				real.converterDolarParaReal(valorRecebido);
				break;
				
			case "De Euro Para Reais":
				real.converterEuroParaReal(valorRecebido);
				break;
				
			case "Peso Argentino para Reais":
				real.converterPesoArgentinoParaReal(valorRecebido);
				break;
		}
	}
}