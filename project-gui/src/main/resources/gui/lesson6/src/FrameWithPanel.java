//����6-1��  ����һ���������Ŀ�ܡ�
//�����嵥6-1:  FrameWithPanel.java
import java.awt.*;

public class FrameWithPanel extends Frame {
	public static void main(String args[]) {
		FrameWithPanel fr = new FrameWithPanel("Hello !");
		fr.setSize(200, 200); // ����Frame�Ĵ�С
		fr.setBackground(Color.blue); // ����Frame�ı���ɫΪ��ɫ
		fr.setLayout(new GridLayout(2, 1));
		Panel pan = new Panel();
		pan.setSize(200, 100); // ����Panel�Ĵ�С
		pan.setBackground(Color.yellow);// ����Panel�ı���ɫΪ��ɫ
		pan.add(new Button("ȷ��"));
		fr.add(pan);
		fr.setVisible(true); // ����Frame�ɼ�
	}

	public FrameWithPanel(String str) {
		super(str);
	}
}
