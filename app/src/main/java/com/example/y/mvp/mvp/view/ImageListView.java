package com.example.y.mvp.mvp.view;


import com.example.y.mvp.mvp.Bean.ImageListInfo;

import java.util.List;

/**
 * by y on 2016/4/28.
 */
public interface ImageListView {

    void setImageListInfo(List<ImageListInfo> imageListInfo);

    void netWorkError();

    void hideProgress();

    void showFoot();

    void hideFoot();
}