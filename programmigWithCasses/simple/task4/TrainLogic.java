package com.epam.programmigWithCasses.simple.task4;

import java.util.Comparator;
import java.util.List;

public class TrainLogic {

    public static List<Train> sort(List<Train> train) {
        train.sort(Comparator.comparing(Train::getTrainNumber));
        return train;

    }
}
