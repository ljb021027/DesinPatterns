package visitor;

/**
 * Created by ljb on 2018/9/27.
 */
//消费的单子
public class ConsumeBill extends AbstractBill{

    public ConsumeBill(double amount, String item) {
        super(amount, item);
    }

    public void accept(Viewer viewer) {
        if (viewer instanceof AbstractViewer) {
            ((AbstractViewer)viewer).viewConsumeBill(this);
            return;
        }
        viewer.viewAbstractBill(this);
    }

}
