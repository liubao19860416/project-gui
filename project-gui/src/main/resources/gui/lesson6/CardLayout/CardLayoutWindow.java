//【例6-5】  CardLayout布局管理器应用示例。
//程序清单6-5:  CardLayoutWindow.java
import java.awt.*;
import java.awt.event.*;

public class CardLayoutWindow extends Frame implements ActionListener {
	Panel cards;

	CardLayout CLayout = new CardLayout();

	public CardLayoutWindow() {
		setLayout(new BorderLayout()); // 设置Frame为BorderLayout。
		// 创建摆放"卡片切换"按钮的panel,并添加到Frame中。
		Panel cp = new Panel();
		Button bt = new Button("卡片切换");
		bt.addActionListener(this);
		cp.add(bt);
		//add("North", cp); 该方法中的参数可一调换位置。
                add(cp, "North");
		cards = new Panel();// 创建承放多个卡片的Panel。
		cards.setLayout(CLayout); // 设置为CardLayout。
		// 创建cards中的第一个panel及其组件。
		Panel p1 = new Panel();
		p1.add(new Button("Button 1"));
		p1.add(new Button("Button 2"));
		p1.add(new Button("Button 3"));
		// 创建cards中的另一个panel及其组件。
		Panel p2 = new Panel();
		p2.add(new TextField("TextField", 20));
		cards.add("Panel with Buttons", p1); // 把上述两个panel加到cards中。
		cards.add("Panel with TextField", p2);
		add("Center", cards); // 将cards放入Frame中。
	}

	public void actionPerformed(ActionEvent e) {
		CLayout.next(cards); // 响应点击切换卡片按钮的事件，显示下一张卡片。
	}

	public static void main(String args[]) {
		CardLayoutWindow window = new CardLayoutWindow();
		window.setTitle("CardLayout");
		window.pack();
		window.setVisible(true);
	}
}
