package com.example.mvplistview.Model;

import java.util.List;

public interface ReturnData {

    void ResponseSuccess(List<String> developers);

    void ResponseFailed(String message);

}
