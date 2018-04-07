package com.example.yiran.weather;

import java.util.ArrayList;

public interface RecognitionCallback {
    abstract void onRecognitionFinished(ArrayList<String> matches);
}
