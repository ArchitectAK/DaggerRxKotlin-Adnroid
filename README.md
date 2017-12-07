# Kotlin Dagger2 Android Project

A Kotlin project to demonstrate the use of Dagger2 with RxKotlin with Retrofit2 in Android


### Libraries Used


1. [Dagger](http://square.github.io/dagger/)
2. [Retrofit](http://square.github.io/retrofit/)
3. [OkHttp](http://square.github.io/okhttp/)
4. [Rx](http://square.github.io/retrofit/)
5. [Blur](https://bintray.com/ankitdroiddeveloper/FreeBlurEffect)


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

[Leanr More about Kotlin ](https://github.com/AnkitDroidGit/Dagger2Retrofit2RxKotlinRxAndroidApplication/blob/master/learnKotlin.md)

All the best !!!!!!

### License

    Copyright 2017 Thomas Kioko
    
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
    
    
