package com.samirovic.springbootin10step.service;

import com.samirovic.springbootin10step.dao.DataService;

public class SomeBusinessImpl {

    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    public int findTheGreatest() {
        int[] data = this.dataService.getAllData();
        int gretatest = Integer.MIN_VALUE;
        for (int value: data) {
            if ( value > gretatest) {
                gretatest = value;
            }
        }
        return gretatest;
    }
}
