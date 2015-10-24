//����6-9��  ͨ������ר�ŵ���ʵ�ּ������ӿڣ������6-8����Ĺ��ܡ�
//�����嵥6-9:  OuterCounter.java
import java.awt.*;
import java.awt.event.*;

public class OuterCounter extends Frame {
	private Button button = new Button("1");

	public OuterCounter(String title) {
		super(title);
		button.addActionListener(new OuterListener(1)); // ע���������
		add(button);
		setSize(200, 100);
		setVisible(true);
	}

	public static void main(String args[]) {
		new OuterCounter("Counter");
	}
}

class OuterListener implements ActionListener {
	private int step;// ����Button�ϵı��ֵÿ�����ӵĲ�����

	public OuterListener(int step) {
		this.step = step;
	}

	// ʵ��ActionListener��actionPerformed( )������
	public void actionPerformed(ActionEvent event) {
		Button button = (Button) event.getSource(); // ����¼�Դ��
		int count = Integer.parseInt(button.getLabel());
		// ��button�ϵı��ֵ��step��
		button.setLabel(new Integer(step + count).toString());
	}
}
