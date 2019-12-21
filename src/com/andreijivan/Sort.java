package com.andreijivan;

public class Sort {
    public void sortReps(SalesRepresentative[] reps) {

        for (int i = 0; i < reps.length - 1; i++) {
            for (int j = 0; j < reps.length - i - 1; j++)
                if (reps[j].totalSales() < reps[j + 1].totalSales()) {
                    SalesRepresentative temp = reps[j];
                    reps[j] = reps[j + 1];
                    reps[j + 1] = temp;
                }
        }

    }
}
