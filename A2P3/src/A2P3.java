
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Memos
 */
public class A2P3 extends Applet implements AdjustmentListener {

    private Scrollbar scrb;
    private LayoutManager Layout;

    public void init() {
        Layout = new BorderLayout();
        Dimension appletSize = this.getSize();
        int appletWidth = appletSize.width;
        scrb = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 10, appletWidth - 10);
        setLayout(Layout);
        add("South", scrb);
        scrb.addAdjustmentListener(this);
    }

    public void paint(Graphics g) {
        g.fillOval(10, 10, scrb.getValue(), scrb.getValue());
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        repaint();
    }
}
