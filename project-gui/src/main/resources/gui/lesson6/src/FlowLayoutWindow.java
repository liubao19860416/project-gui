//����6-2��  FlowLayout���ֹ�����Ӧ��ʾ����
//�����嵥6-2:  FlowLayoutWindow.java
import java.awt.*;

public class FlowLayoutWindow extends Frame {
	public static void main(String args[]) {
		FlowLayoutWindow window = new FlowLayoutWindow("FlowLayout");
		window.setLayout(new FlowLayout());
		window.add(new Label("��ť:"));
		String spaces = ""; // �����ı䰴ť�Ĵ�С�仯
		for (int i = 1; i <= 6; i++) {
			window.add(new Button("��ť" + i + spaces));
			spaces += " ";
		}
		window.pack();// ���ڵĴ�С����Ϊ�ʺ������ѳߴ��벼������Ŀռ�
		window.setVisible(true);
	}

	public FlowLayoutWindow(String str) {
		super(str);
	}
}
