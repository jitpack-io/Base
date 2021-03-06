package io.kimo.base.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import io.kimo.base.presentation.BaseApp;

public class ExampleApp extends BaseApp {
    @Override
    public ExecutorService configureJobManager() {
        return Executors.newSingleThreadExecutor();
    }
}
