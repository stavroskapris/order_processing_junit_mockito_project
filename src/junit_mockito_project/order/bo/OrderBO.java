package junit_mockito_project.order.bo;

import junit_mockito_project.order.bo.exception.BOException;
import junit_mockito_project.order.dto.Order;

public interface OrderBO {

	boolean placeOrder(Order order) throws BOException;

	boolean cancelOrder(int id) throws BOException;

	boolean deleteOrder(int id) throws BOException;

}
