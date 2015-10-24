//【例6-14】  显示单击按钮的次数。
//程序清单6-14:  SwingApplication.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingApplication {
	private static String labelPrefix = "Number of button clicks: ";

	private int numClicks = 0; // 计数器，记录单击次数。

	public Component createComponents() {
		final JLabel label = new JLabel(labelPrefix + "0    ");
		JButton button = new JButton("I'm a Swing button!");
		button.setMnemonic(KeyEvent.VK_I); // 设置按钮热键。
		button.addActionListener(new ActionListener() {// 注册事件监听器。
					public void actionPerformed(ActionEvent e) {// 定义事件处理方法。
						numClicks++;
						label.setText(labelPrefix + numClicks); // 显示单击按钮的次数。
					}
				});
		label.setLabelFor(button);
		JPanel pane = new JPanel();
		pane.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		pane.setLayout(new GridLayout(0, 1)); // 单列多行。
		pane.add(button);
		pane.add(label);
		return pane;
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager
					.getCrossPlatformLookAndFeelClassName());// 设置窗口风格
		} catch (Exception e) {
		}
		// 创建顶层容器并向其中添加组件。
		JFrame frame = new JFrame("SwingApplication");
		SwingApplication app = new SwingApplication();
		Component contents = app.createComponents();
		frame.getContentPane().add(contents, BorderLayout.CENTER);
		frame.addWindowListener(new WindowAdapter() { // 注册事件监听器。
					public void windowClosing(WindowEvent e) {// 定义事件处理方法。
						System.exit(0);
					}
				});
		frame.pack();
		frame.setVisible(true);
	}
}
