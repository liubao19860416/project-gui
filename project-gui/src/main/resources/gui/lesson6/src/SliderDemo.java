//【例6-25】  JSlider使用示例。
//程序清单6-25:  SliderDemo.java
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
		numberPanel = new JPanel();// 建立容纳滑块的面板
		JSlider numberSlider = new JSlider();// 新建缺省样式的滑块
		numberSlider.addChangeListener(mynumberListener);
		numberPanel.add(choiceLabel);
		numberPanel.add(numberSlider);
		// 新建竖向滑块，并指定最大值和初始值。
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
