//����6-4��  GridLayout���ֹ�����Ӧ��ʾ����
//�����嵥6-4:  GridLayoutWindow.java
import java.awt.*;

public class GridLayoutWindow extends Frame {
	public static void main(String args[]) {
		GridLayoutWindow window = new GridLayoutWindow("GridLayout");
		window.setLayout(new GridLayout(2, 3));
		String spaces = "";
		for (int i = 1; i <= 6; i++) {
			window.add(new Button("��ť" + i + spaces));
			spaces += "  ";
		}
		window.pack();
		window.setVisible(true);
	}

	public GridLayoutWindow(String str) {
		super(str);
	}
}
