//����6-12��  �������������6-8����Ĺ��ܡ�
//�����嵥6-12:  AnnoymousCounter.java
import java.awt.*;
import java.awt.event.*;

public class AnnoymousCounter extends Frame {
	private Button button = new Button("1");

	public AnnoymousCounter(String title) {
		super(title);
		button.addActionListener(new ActionListener() {// ���������ࡣ
					public void actionPerformed(ActionEvent event) {
						int count = Integer.parseInt(button.getLabel());
						button.setLabel(new Integer(++count).toString());
					}
				});// ע���������ʵ��ActionListener��actionPerformed( )������
		add(button);
		setSize(200, 100);
		setVisible(true);
	}

	public static void main(String args[]) {
		new FrameCounter("Counter");
	}
}
