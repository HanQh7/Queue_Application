package activity2;
import java.util.*;
public class Queue_Haneen {
	
		int SIZE =5;
		int items[]=new int[SIZE];
		int front, rear;
		Queue_Haneen(){
		//Queue is Empty
		front = -1;
		rear = -1;
		}
		// check if the queue is full
		boolean isFull()
		{
		if (front == 0 && rear == SIZE - 1)
		{return true;}
		return false;
		}
		// check if the queue is empty
		boolean isEmpty()
		{
		if (front == -1)//or Rear==-1
		return true;
		else
		return false;
		}
		// insert elements to the queue
		void enqueue(int element)
		{
		// if queue is full
		if (isFull())
		{
		System.out.println("Queue is full");
		}
		else {
		if (front == -1&& rear==-1)
		{
		// mark front denote first element of queue
		front=rear = 0;
		items[front]=element;
		//or items[rear]=element;
		}
		else
		{
		rear++;
		// insert element at the rear
		items[rear] = element;
		System.out.println("Insert " + element);
		}
		}
		}
		// delete element from the queue
		void dequeue() {
		// if queue is empty
		if (isEmpty()) {
		System.out.println("Queue is empty");
		}
		else if(front==rear) {
		// if the queue has only one element
		front=rear=-1;
		}
		else {
		// mark next element as the front
		front++;
		}
		}
		// display element of the queue
		void display() {
		int i;
		if (isEmpty()) {
		System.out.println("Empty Queue");
		}
		else {
		// display the front of the queue
		System.out.println("\nFront index-> " + front);
		// display element of the queue
		System.out.println("Items -> ");
		for (i = front; i <= rear; i++)
		System.out.print(items[i] + " ");
		// display the rear of the queue
		System.out.println("\nRear index-> " + rear);
		}
		}
		public static void main(String[] args) {
		// create an object of Queue class
		PriorityQueue<Integer> q = new PriorityQueue<>();
		
		
		
		// currently queue is empty
		// insert elements to the queue
		for(int i = 1; i <6; i ++){
		q.add(i);
		}
		//or 5th element can't be added to queue
		q.add(6);
		q.add(7);
		q.add(8);
		
		System.out.println( " Priority Queue 1: "+q);
		
		PriorityQueue<Integer> q2 = new PriorityQueue<>();
		
		q2.addAll(q);
		System.out.println( " Priority Queue 2: "+q2);
		
		}
		
		
}

	
	

