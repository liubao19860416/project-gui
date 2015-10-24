//【例6-28】  JTree示例。
//程序清单6-28:  JTreeDemo.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;

public class JTreeDemo extends JFrame {
	DefaultMutableTreeNode rootNode = createNode();

	JTree tree = new JTree(rootNode);

	JTextField textField = new JTextField();

	JScrollPane scrollPane = new JScrollPane();

	JButton button1 = new JButton();

	JButton button2 = new JButton();

	public JTreeDemo() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setTitle("JTreeDemo");
		getContentPane().setLayout(null);
		scrollPane.setBounds(new Rectangle(12, 9, 221, 228));
		textField.setBounds(new Rectangle(10, 250, 90, 23));
		button1.setBounds(new Rectangle(105, 251, 60, 22));
		button1.setText("增加");
		button2.setBounds(new Rectangle(171, 251, 62, 22));
		button2.setText("删除");
		getContentPane().add(scrollPane, null);
		getContentPane().add(textField, null);
		getContentPane().add(button2, null);
		getContentPane().add(button1, null);
		scrollPane.getViewport().add(tree, null);
		// 添加TreeSelection事件监听器
		tree.addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent e) {
				// 获取当前节点的路径
				TreePath selectionPath = e.getPath();
				DefaultMutableTreeNode selectedNode;
				// 获取当前节点
				selectedNode = (DefaultMutableTreeNode) selectionPath
						.getLastPathComponent();
				textField.setText(selectedNode.toString());
			}
		});
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNode();
			}
		});
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeNode();
			}
		});
	}

	public static void main(String args[]) {
		JTreeDemo app = new JTreeDemo();
		app.setBounds(new Rectangle(100, 100, 255, 310));
		app.setVisible(true);
	}

	DefaultMutableTreeNode createNode() {
		// 创建节点
		DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Java");
		DefaultMutableTreeNode books = new DefaultMutableTreeNode("Java书籍");
		DefaultMutableTreeNode tools = new DefaultMutableTreeNode("Java开发工具");
		// 添加字节点
		rootNode.add(books);
		rootNode.add(tools);
		books.add(new DefaultMutableTreeNode("Java高级实例编程"));
		books.add(new DefaultMutableTreeNode("Java编程思想"));
		books.add(new DefaultMutableTreeNode("Java编程详解"));
		tools.add(new DefaultMutableTreeNode("JBuilder"));
		tools.add(new DefaultMutableTreeNode("JCreator"));
		tools.add(new DefaultMutableTreeNode("NetBeans"));
		return rootNode;
	}

	void removeNode() {
		// 获取当前节点的路径
		TreePath selectedPath = tree.getSelectionPath();
		if (selectedPath != null) {
			DefaultMutableTreeNode selectedNode;
			DefaultTreeModel treeModel;
			// 获取当前节点
			selectedNode = (DefaultMutableTreeNode) selectedPath
					.getLastPathComponent();
			treeModel = (DefaultTreeModel) tree.getModel();
			// 删除节点
			treeModel.removeNodeFromParent(selectedNode);
		}
	}

	void addNode() {
		DefaultMutableTreeNode newNode;
		newNode = new DefaultMutableTreeNode(textField.getText());
		// 获取当前节点的路径
		TreePath selectedPath = tree.getSelectionPath();
		if (selectedPath != null) {
			DefaultMutableTreeNode selectedNode;
			DefaultTreeModel treeModel;
			// 获取当前节点
			selectedNode = (DefaultMutableTreeNode) selectedPath
					.getLastPathComponent();
			treeModel = (DefaultTreeModel) tree.getModel();
			// 增加节点
			treeModel.insertNodeInto(newNode, selectedNode, selectedNode
					.getChildCount());
		}
	}
}
