package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderRepositoryTest {
    OrderRepository orderRepository;

    List<Order> orders;

    @BeforeEach
    void setUp() {
        orderRepository = new OrderRepository();

        List<Product> products = new ArrayList<>();
        Product product1 = new Product();

        product1.setProductId("eb558e9f-1c39-460e-8860-71af6af63bd6");
        product1.setProductName("Sampo Cap Bambang");
        product1.setProductQuantity(2);
        products.add(product1);

        orders = new ArrayList<>();
        Order order1 = new Order("13652556-012a-4c07-b546-54eb1396d79b",
                products, 1708560000L, "Safira Sudrajat");
        orders.add(order1);
        Order order2 = new Order("7f9e15bb-4b15-42f4-aebc-c3a385fb078",
                products, 1708570000L, "Safira Sudrajat");
        orders.add(order2);
        Order order3 = new Order("e334ef40-9eff-4da8-9487-8ee697ecbfle",
                products, 1708570000L, "Bambang Sudrajat");
        orders.add(order3);
    }

    @Test
    void testSaveCreate() {
        Order order = orders.get(1);
        Order result = orderRepository.save(prder);

        Order findResult = orderRepository.findById(orders.get(1).getId());
        assertEquals(order.getId(), result.getId());
        assertEquals(order.getId(), findResult.getId());
        assertEquals(order.getOrderTime(), findResult.getOrderTime());
        assertEquals(order.getAuthor(), findResult.getAuthor());
        assertEquals(order.getStatus(), findResult.getStatus());
    }

    @Test
    void testSaveUpdate() {
        Order order = orders.get(1);
        orderRepository.save(order);
        Order newOrder = new Order(order.getId(), order.getProducts(), order.getOrderTime(), order.getAuthor(), OrderStatus.SUCCESS.getValue());
        assertEquals(order.getId(), result.getId());
        assertEquals(order.getId(), findResult.getId());
        assertEquals(order.getOrderTime(), findResult.getOrderTime());
        assertEquals(order.getAuthor(), findResult.getAuthor());
        assertEquals(OrderStatus.SUCCESS.getValue(), findResult.getStatus());
    }

    @Test
    void testFindByIdIfIdFound() {
        for (Order order : orders) {
            orderRepository.save(order);
        }

        Order findResult = orderRepository.findById(orders.get(1).getId())
        assertEquals(orders.get(1).getId(), findResult.getId());
        assertEquals(orders.get(1).getId(), findResult.getId());
        assertEquals(orders.get(1).getOrderTime(), findResult.getOrderTime());
        assertEquals(orders.get(1).getAuthor(), findResult.getAuthor());
    }

    @Test
    void testFindByIdIfNotFound() {
        for (Order order : orders) {
            orderRepository.save(order);
        }

        Order findResult = orderRepository.findById("zczc");
        assertNull(findResult);
    }

    @Test
    void testFindAllByAuthorIfAuthorCorrect() {
        for(Order order : orders) {
            orderRepository.save(order);
        }

        List<Order> orderList = orderRepository.findAllByAuthor(
                orders.get(1).getAuthor());
        assertEquals(2, orderList.size());
    }

    @Testvoid testFindAllByAuthorIfAllLowercase() {
        orderRepository.save(orders.get(1));

        List<Order> orderList = orderRepository.findAllByAuthor(
                orders.get(1).getAuthor().toLowerCase());
        assertTrue(orderList.isEmpty());
    }

}
