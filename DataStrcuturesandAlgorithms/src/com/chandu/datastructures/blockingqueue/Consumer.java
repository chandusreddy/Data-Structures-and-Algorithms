package com.chandu.datastructures.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	BlockingQueue queue;

	public Consumer(BlockingQueue queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("Consumed item:" + queue.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
