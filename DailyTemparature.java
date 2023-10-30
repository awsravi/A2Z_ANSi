package com.demo.T;

import java.util.Stack;

public class DailyTemparature {
	public static void main(String[] args) {

		int[] tempurater = { 73, 74, 75, 71, 69, 72, 76, 73 };

		DailyTemparature dt = new DailyTemparature();
		int[] result=dt.dailyTemparature(tempurater);
			
      for (int temp : result) {
			System.out.print(temp + " ");
		}
	}

	public int[] dailyTemparature(int[] tempurater) {

		int[] result = new int[tempurater.length];
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < tempurater.length; i++) {
			while (!stack.isEmpty() && tempurater[i] > tempurater[stack.peek()]) {
				int prevIndex = stack.pop();
				result[prevIndex] = i - prevIndex;
			}
			stack.push(i);

		}

		return result;

	}

}
