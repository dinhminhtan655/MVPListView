package com.example.mvplistview.Presenter;

import com.example.mvplistview.Model.Developer;
import com.example.mvplistview.Model.ModelMain;
import com.example.mvplistview.Model.ReturnData;
import com.example.mvplistview.View.ViewMain;

import java.util.List;

public class PresenterToModel implements ReturnData {

    private ModelMain modelMain;
    private ViewMain viewMain;
    public PresenterToModel(ViewMain viewMain){
        this.viewMain = viewMain;
        modelMain = new ModelMain(this);
    }

    @Override
    public void ResponseSuccess(List<String> developers) {
        viewMain.LoadListView(developers);
    }

    public void loadData(){
        modelMain.createList();
    }

    @Override
    public void ResponseFailed(String message) {

    }
}
