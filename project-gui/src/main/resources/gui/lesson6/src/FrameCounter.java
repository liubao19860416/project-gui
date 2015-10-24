//����6-8��  ��������ʵ�ּ������ӿڵ�ʾ����
//�����嵥6-8:  FrameCounter.java
import java.awt.*;
import java.awt.event.*;

public class FrameCounter extends Frame implements ActionListener {
	private Button button = new Button("1");

	public FrameCounter(String title) {
		super(title);
		// ��FrameCounter�����ʵ��ע��ΪButton�ļ�������
		button.addActionListener(this);
		add(button);
		setSize(200, 100);
		setVisible(true);
	}

	// ʵ��ActionListener��actionPerformed( )������
	public void actionPerformed(ActionEvent event) {
		int count = Integer.parseInt(button.getLabel());
		// ��button�ϵı��ֵ��1��
		button.setLabel(new Integer(++count).toString());
	}

	public static void main(String args[]) {
		new FrameCounter("Counter");
	}
}
