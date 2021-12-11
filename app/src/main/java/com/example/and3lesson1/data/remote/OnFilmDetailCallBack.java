package com.example.and3lesson1.data.remote;

import com.example.and3lesson1.data.models.Film;


public interface OnFilmDetailCallBack {

    void success(Film film);
    void onServerError();
    void Failure(String msg);

}
