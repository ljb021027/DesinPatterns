package visitor;

/**
 * Created by ljb on 2018/9/27.
 */
//单个单子的接口（相当于Element）
public interface Bill {

    void accept(Viewer  viewer);

}
