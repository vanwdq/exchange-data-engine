package com.wdq.task;

import com.wdq.model.Order;

import java.math.BigDecimal;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;

public class ProduceOrderTask implements Runnable {

    private BlockingQueue<Order> queue;// 内存缓冲区

    public ProduceOrderTask(BlockingQueue<Order> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        Order order2 = new Order(UUID.randomUUID().toString(), new BigDecimal("1000"), new BigDecimal("80"), "sell", System.currentTimeMillis(), 0, "btc");
        queue.add(order2);
        for (int i = 0; i < 100000; i++) {
            String tradeType = random() == 1 ? "buy" : "sell";
            Order order1 = new Order(UUID.randomUUID().toString(), new BigDecimal(randomPrice()), new BigDecimal(randomAmount()), tradeType, System.currentTimeMillis(), 0, "btc");
            queue.add(order1);
        }
        Order order = new Order();
        order.setUuid("end");
        queue.add(order);

    }

    //随机价格
    public int randomPrice() {
        Random rand = new Random();
        int randNum = rand.nextInt(5000) + 10000;
        return randNum;
    }

    //随机数量
    public int randomAmount() {
        Random rand = new Random();
        int randNum = rand.nextInt(100);
        return randNum;
    }

    public int random() {
        Random rand = new Random();
        int randNum = rand.nextInt(2);
        return randNum;
    }
}
