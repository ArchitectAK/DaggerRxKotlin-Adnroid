# Kotlin Dagger2 Android Project

A Kotlin project to demonstrate the use of Dagger2 with RxKotlin with Retrofit2 in Android

Apply plugins to app level build.gradle 
    
      apply plugin: 'com.android.application'
      apply plugin: 'kotlin-android'
      apply plugin: 'kotlin-android-extensions'
      apply plugin: 'kotlin-kapt'
        
Add dependencies to app level build.gradle
 
    //Retrofit
     implementation "com.squareup.retrofit2:retrofit:2.3.0"
     //Retrofit adapter for rx
     implementation "com.squareup.retrofit2:adapter-rxjava2:2.3.0"
     //Json Converter
     implementation "com.squareup.retrofit2:converter-gson:2.3.0"
     //RxAndroid
     implementation "io.reactivex.rxjava2:rxandroid:2.0.1"
     // Dagger 2
     implementation 'com.google.dagger:dagger:2.11'
     kapt 'com.google.dagger:dagger-compiler:2.11'
     provided 'org.glassfish:javax.annotation:10.0-b28'
     
     
And Now check code to see how to implement Dagger2 with RxKotlin/RxJava/RxAndroid and Retrofit2

All the best !!!!!!
