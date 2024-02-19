package inclass.kh.week4;

public class Buffer {
	private int data;
	private boolean empty = true;

	public synchronized int get() {
		while (empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		empty = true;
		notifyAll();
		return data;
	}

	public synchronized void put(int data) {
		while (!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		empty = false;
		this.data = data;
		notifyAll();
	}
}
