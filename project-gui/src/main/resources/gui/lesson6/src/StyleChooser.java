//【例6-15】  L&F设置示例。
//程序清单6-15:  StyleChooser.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StyleChooser extends JPanel {
	static JFrame frame;

	static String metal = "Metal";

	static String metalClassName = "javax.swing.plaf.metal.MetalLookAndFeel";

	static String motif = "Motif";

	static String motifClassName = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";

	static String windows = "Windows";

	static String windowsClassName = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";

	JRadioButton metalButton, motifButton, windowsButton;

	public StyleChooser() {
		JLabel label = new JLabel("Try the styles Swing has");
		metalButton = new JRadioButton(metal);
		metalButton.setMnemonic('o');
		metalButton.setActionCommand(metalClassName);
		motifButton = new JRadioButton(motif);
		motifButton.setMnemonic('m');
		motifButton.setActionCommand(motifClassName);
		windowsButton = new JRadioButton(windows);
		windowsButton.setMnemonic('w');
		windowsButton.setActionCommand(windowsClassName);
		ButtonGroup group = new ButtonGroup(); // 将RadioButton归为一组。
		group.add(metalButton);
		group.add(motifButton);
		group.add(windowsButton);
		RadioListener myListener = new RadioListener(); // 为按钮注册事件监听器。
		metalButton.addActionListener(myListener);
		motifButton.addActionListener(myListener);
		windowsButton.addActionListener(myListener);
		add(label);
		add(metalButton);
		add(motifButton);
		add(windowsButton);
	}

	class RadioListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String lnfName = event.getActionCommand();
			try {
				UIManager.setLookAndFeel(lnfName);
				SwingUtilities.updateComponentTreeUI(frame);
				frame.pack();
			} catch (Exception e) {
				JRadioButton button = (JRadioButton) event.getSource();
				button.setEnabled(false);
				updateState();
				System.err.println("Could not load LookAndFeel:" + lnfName);
			}
		}
	}

	public void updateState() {
		String lnfName = UIManager.getLookAndFeel().getClass().getName();
		if (lnfName.indexOf(metal) >= 0)
			metalButton.setSelected(true);
		else if (lnfName.indexOf(windows) >= 0)
			windowsButton.setSelected(true);
		else if (lnfName.indexOf(motif) >= 0)
			motifButton.setSelected(true);
		else
			System.err.println("StyleChooser is using an unknown L&F:"
					+ lnfName);
	}

	public static void main(String args[]) {
		StyleChooser panel = new StyleChooser();
		frame = new JFrame("StyleChooser");
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent event) {
				System.exit(0);
			}
		});
		frame.getContentPane().add("Center", panel);
		frame.pack();
		frame.setVisible(true);
		panel.updateState();
	}
}
