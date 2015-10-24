//【例6-23】  JList使用示例。
//程序清单6-23:  JListDemo.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JListDemo extends JFrame implements ListSelectionListener,
		ActionListener {
	JList list;

	DefaultListModel listModel;

	JButton addButton;

	JTextField nameField;

	JButton delButton;

	public JListDemo() {
		super("JListDemo");
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		listModel = new DefaultListModel();
		listModel.addElement("Black");
		listModel.addElement("white");
		listModel.addElement("blue");
		// 创建一个列表框并将它加到JScrollPne中
		list = new JList(listModel);
		// 限定列表框只能单选 list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setSelectedIndex(0);
		list.addListSelectionListener(this);
		JScrollPane listScrollPane = new JScrollPane(list);
		addButton = new JButton("增加");
		addButton.addActionListener(this);
		delButton = new JButton("删除");
		delButton.addActionListener(this);
		nameField = new JTextField(10);
		nameField.addActionListener(this);
		String name = listModel.getElementAt(list.getSelectedIndex())
				.toString();
		nameField.setText(name);
		JPanel buttonPane = new JPanel();
		buttonPane.add(nameField);
		buttonPane.add(addButton);
		buttonPane.add(delButton);
		Container contentPane = getContentPane();
		contentPane.add(listScrollPane, BorderLayout.CENTER);
		contentPane.add(buttonPane, BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == delButton) {
			int index = list.getSelectedIndex();
			listModel.remove(index);
			int size = listModel.getSize();
			if (size == 0) {
				delButton.setEnabled(false);
			} else {
				if (index == listModel.getSize())
					index--;
				list.setSelectedIndex(index);
			}
		} else if (e.getSource() == addButton || e.getSource() == nameField) {
			// 添加元素
			if (nameField.getText().equals("")) {
				Toolkit.getDefaultToolkit().beep();
				return;
			}
			int index = list.getSelectedIndex();
			int size = listModel.getSize();
			if (index == -1 || (index + 1 == size)) {
				listModel.addElement(nameField.getText());
				list.setSelectedIndex(size);
			} else {
				listModel.insertElementAt(nameField.getText(), index + 1);
				list.setSelectedIndex(index + 1);
			}
		}
	}

	// 当列表框中被选择的项改变时被调用
	public void valueChanged(ListSelectionEvent e) {
		if (e.getValueIsAdjusting() == false) {
			if (list.getSelectedIndex() == -1) {
				delButton.setEnabled(false);
				nameField.setText("");
			} else {
				delButton.setEnabled(true);
				String name = list.getSelectedValue().toString();
				nameField.setText(name);
			}
		}
	}

	public static void main(String s[]) {
		JListDemo mainFrame = new JListDemo();
		mainFrame.pack();
		mainFrame.setVisible(true);
	}
}
