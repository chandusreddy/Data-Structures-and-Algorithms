package com.chandu.datastructures.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	BlockingQueue queue = null;

	public Producer(BlockingQueue queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Produced Thread item: " + i);
			try {
				queue.put("Process thread: " + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
