package com.example.gemography.dagger2;

import javax.inject.Singleton;

import dagger.Component;
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

}
