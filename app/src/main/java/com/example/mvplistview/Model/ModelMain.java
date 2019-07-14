package com.example.mvplistview.Model;

import java.util.ArrayList;
import java.util.List;

public class ModelMain {

    ReturnData returnData;

    public ModelMain(ReturnData returnData){
        this.returnData = returnData;
    }

    public void createList(){
        List<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++){
            list.add("I'm Developer " + i);
        }

        returnData.ResponseSuccess(list);
    }

}
