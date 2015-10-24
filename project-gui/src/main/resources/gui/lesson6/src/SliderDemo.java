//����6-25��  JSliderʹ��ʾ����
//�����嵥6-25:  SliderDemo.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo extends JFrame {
	public static final int WIDTH = 400;

	public static final int HEIGHT = 280;

	public static final JLabel choosedLabel = new JLabel("Choosed number:");

	public static final JLabel choiceLabel = new JLabel("Please choose number:");

	private JTextField myTextField;

	private JPanel numberPanel;

	public SliderDemo() {
		setTitle("SliderExample");
		setSize(WIDTH, HEIGHT);
		Container contentPane = getContentPane();
		numberListener mynumberListener = new numberListener();
		numberPanel = new JPanel();// �������ɻ�������
		JSlider numberSlider = new JSlider();// �½�ȱʡ��ʽ�Ļ���
		numberSlider.addChangeListener(mynumberListener);
		numberPanel.add(choiceLabel);
		numberPanel.add(numberSlider);
		// �½����򻬿飬��ָ�����ֵ�ͳ�ʼֵ��
		numberSlider = new JSlider(SwingConstants.VERTICAL, 0, 120, 20);
		numberSlider.addChangeListener(mynumberListener);
		numberPanel.add(numberSlider);
		JPanel textPanel = new JPanel();
		myTextField = new JTextField("", 15);
		textPanel.add(choosedLabel, BorderLayout.NORTH);
		textPanel.add(myTextField, BorderLayout.CENTER);
		contentPane.add(numberPanel, BorderLayout.NORTH);
		contentPane.add(textPanel, BorderLayout.CENTER);
	}

	private class numberListener implements ChangeListener {
		public void stateChanged(ChangeEvent event) {
			JSlider sourceSlider = (JSlider) event.getSource();
			myTextField.setText("" + sourceSlider.getValue());
		}
	}

	public static void main(String[] args) {
		SliderDemo frame = new SliderDemo();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
