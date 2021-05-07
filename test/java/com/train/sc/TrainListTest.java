package com.train.sc;

import org.junit.Test;

import com.train.TrainDetails;
import com.train.TrainList;

public class TrainListTest {
	@Test
	public void testCase() {
		TrainDetails Train1 = new TrainDetails();
		String trainNo =TrainDetails.trainno="12345M";
		String trainName=TrainDetails.trainName="Madurai Express ";										
		TrainList.addTrainList(trainNo, trainName);
	}
	@Test
	public void testCase1() {

		TrainDetails Train2 = new TrainDetails();
		String trainNo=TrainDetails.trainno = "234451T";
		String trainName=TrainDetails.trainName = "Pearl City Express";
		TrainList.addTrainList(trainNo, trainName);
	}
	@Test
	public void testCase2() {
		TrainDetails Train3 = new TrainDetails();
		String trainNo=TrainDetails.trainno = "457671C";
		String trainName=TrainDetails.trainName = "Kacheguda Express";
		TrainList.addTrainList(trainNo, trainName);
	}

	

}
