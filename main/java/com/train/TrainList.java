package com.train;

import java.util.HashMap;

public class TrainList {
	static HashMap<String, String> TrainName = new HashMap<String, String>();

	public static void addTrainList(String trainNo, String trainName) {
		TrainName.put(trainNo, trainName);
		System.out.println(TrainName);
	}
	public static void deleteEmployee(String trainNo) {
		if(TrainName.containsKey(trainNo)) {
			TrainName.remove(trainNo);
	}
	}
}
