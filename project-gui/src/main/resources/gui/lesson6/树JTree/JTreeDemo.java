//����6-28��  JTreeʾ����
//�����嵥6-28:  JTreeDemo.java
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
		button1.setText("����");
		button2.setBounds(new Rectangle(171, 251, 62, 22));
		button2.setText("ɾ��");
		getContentPane().add(scrollPane, null);
		getContentPane().add(textField, null);
		getContentPane().add(button2, null);
		getContentPane().add(button1, null);
		scrollPane.getViewport().add(tree, null);
		// ���TreeSelection�¼�������
		tree.addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent e) {
				// ��ȡ��ǰ�ڵ��·��
				TreePath selectionPath = e.getPath();
				DefaultMutableTreeNode selectedNode;
				// ��ȡ��ǰ�ڵ�
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
		// �����ڵ�
		DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Java");
		DefaultMutableTreeNode books = new DefaultMutableTreeNode("Java�鼮");
		DefaultMutableTreeNode tools = new DefaultMutableTreeNode("Java��������");
		// ����ֽڵ�
		rootNode.add(books);
		rootNode.add(tools);
		books.add(new DefaultMutableTreeNode("Java�߼�ʵ�����"));
		books.add(new DefaultMutableTreeNode("Java���˼��"));
		books.add(new DefaultMutableTreeNode("Java������"));
		tools.add(new DefaultMutableTreeNode("JBuilder"));
		tools.add(new DefaultMutableTreeNode("JCreator"));
		tools.add(new DefaultMutableTreeNode("NetBeans"));
		return rootNode;
	}

	void removeNode() {
		// ��ȡ��ǰ�ڵ��·��
		TreePath selectedPath = tree.getSelectionPath();
		if (selectedPath != null) {
			DefaultMutableTreeNode selectedNode;
			DefaultTreeModel treeModel;
			// ��ȡ��ǰ�ڵ�
			selectedNode = (DefaultMutableTreeNode) selectedPath
					.getLastPathComponent();
			treeModel = (DefaultTreeModel) tree.getModel();
			// ɾ���ڵ�
			treeModel.removeNodeFromParent(selectedNode);
		}
	}

	void addNode() {
		DefaultMutableTreeNode newNode;
		newNode = new DefaultMutableTreeNode(textField.getText());
		// ��ȡ��ǰ�ڵ��·��
		TreePath selectedPath = tree.getSelectionPath();
		if (selectedPath != null) {
			DefaultMutableTreeNode selectedNode;
			DefaultTreeModel treeModel;
			// ��ȡ��ǰ�ڵ�
			selectedNode = (DefaultMutableTreeNode) selectedPath
					.getLastPathComponent();
			treeModel = (DefaultTreeModel) tree.getModel();
			// ���ӽڵ�
			treeModel.insertNodeInto(newNode, selectedNode, selectedNode
					.getChildCount());
		}
	}
}
