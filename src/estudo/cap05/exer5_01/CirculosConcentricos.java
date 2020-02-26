/*Desenhe 12 círculos concêntricos no centro de um JPanel (Figura 5.29). O círculo mais interno deve ter um raio de 10 pixels e cada
círculo sucessivo deve ter um raio de 10 pixels maior que o anterior. Comece localizando o centro do JPanel. Para obter o canto superior
esquerdo de um círculo, mova-se um raio para cima e um raio para a esquerda a partir do centro. A largura e a altura do retângulo delimitador
têm o mesmo diâmetro do círculo (isto é, duas vezes o raio).*/
package estudo.cap05.exer5_01;

import java.awt.Graphics;

import javax.swing.JPanel;

public class CirculosConcentricos extends JPanel{


		public void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			
			int xCentro = getWidth() / 2;
			int yCentro = getHeight() / 2;
			
			g.drawOval(10, 10, xCentro, yCentro);
		}
		

}
