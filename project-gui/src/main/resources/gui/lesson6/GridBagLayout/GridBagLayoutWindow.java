//����6-6��  GridBagLayout���ֹ�����Ӧ��ʾ����
//�����嵥6-6:  GridBagLayoutWindow.java
import java.awt.*;

public class GridBagLayoutWindow extends Frame {
	public static void main(String args[]) {
		GridBagLayoutWindow window = new GridBagLayoutWindow("GridBagLayout");
		window.setLayout(new GridBagLayout());
                  //GridBagConstraints ��ָ��ʹ�� GridBagLayout �಼�õ������Լ���� 
		GridBagConstraints c = new GridBagConstraints(); 
		c.fill = GridBagConstraints.BOTH; // ���������ʾ����
		c.weightx = 1.0;
		window.addButton("Button1", c);
		window.addButton("Button2", c);
		window.addButton("Button3", c);
		c.gridwidth = GridBagConstraints.REMAINDER; // ���н�����
		window.addButton("Button4", c);
		c.weightx = 0.0; // �ָ�Ϊȱʡֵ��
		window.addButton("Button5", c);
		c.gridwidth = GridBagConstraints.RELATIVE; // �����еĵ����ڶ��������
		window.addButton("Button6", c);
		c.gridwidth = GridBagConstraints.REMAINDER; // ���н�����
		window.addButton("Button7", c);
		c.gridwidth = 1; // �ָ�Ϊȱʡֵ��
		c.gridheight = 2;
		c.weighty = 1.0;
		window.addButton("Button8", c);
		c.weighty = 0.0; // �ָ�Ϊȱʡֵ��
		c.gridwidth = GridBagConstraints.REMAINDER; // ���н�����
		c.gridheight = 1; // �ָ�Ϊȱʡֵ��
		window.addButton("Button9", c);
		window.addButton("Button10", c);
		window.pack();// ���ڵĴ�С����Ϊ�ʺ������ѳߴ��벼������Ŀռ䡣
		window.setVisible(true);
	}

	public GridBagLayoutWindow(String str) {
		super(str);
	}

	private void addButton(String name, GridBagConstraints gbc) {
		Button button = new Button(name);
		add(button, gbc); // ��ָ��Լ�����벿����
	}
}
