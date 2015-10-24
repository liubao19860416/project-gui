//����6-11��  ���ڲ��������6-8����Ĺ��ܡ�
//�����嵥6-11:  InnerCounter.java
import java.awt.*;
import java.awt.event.*;

public class InnerCounter extends Frame {
	private Button button = new Button("1");

	public InnerCounter(String title) {
		super(title);
		button.addMouseListener(new MyMouseListener(1)); // ע���������
		add(button);
		setSize(200, 100);
		setVisible(true);
	}

	public static void main(String args[]) {
		new AdapterCounter("Counter");
	}

	class MyMouseListener extends MouseAdapter {
		private int step;

		public MyMouseListener(int step) {
			this.step = step;
		}

		public void MousePressed(MouseEvent event) {
			int count = Integer.parseInt(button.getLabel());
			button.setLabel(new Integer(step + count).toString());
		}
	}
}
