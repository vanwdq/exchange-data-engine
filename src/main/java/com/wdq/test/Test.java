package com.wdq.test;

import com.wdq.model.Order;
import com.wdq.task.ConsumerOrderTask;
import com.wdq.task.ProduceOrderTask;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
        BlockingQueue<Order> queue = new LinkedBlockingDeque<>();
        //订单生产者
        ProduceOrderTask produceOrderTask = new ProduceOrderTask(queue);
        //订单撮合
        ConsumerOrderTask consumerOrderTask = new ConsumerOrderTask(queue);
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(produceOrderTask);
        service.execute(consumerOrderTask);
        service.shutdown();


    }


}
