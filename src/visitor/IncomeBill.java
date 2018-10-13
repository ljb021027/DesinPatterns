package visitor;

/**
 * Created by ljb on 2018/9/27.
 */
//收入单子
public class IncomeBill extends AbstractBill{

    public IncomeBill(double amount, String item) {
        super(amount, item);
    }

    public void accept(Viewer viewer) {
        if (viewer instanceof AbstractViewer) {
            ((AbstractViewer)viewer).viewIncomeBill(this);
            return;
        }
        viewer.viewAbstractBill(this);
    }

}