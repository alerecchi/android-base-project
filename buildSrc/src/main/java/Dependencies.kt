object PrjDependencies {
    //Library packages (alphabetic order)
    const val archLifecycle = "androidx.lifecycle:lifecycle-extensions:${Versions.archLifecycleX}"
    const val archLifecycleStreams = "androidx.lifecycle:lifecycle-reactivestreams:${Versions.archLifecycleX}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutX}"
    const val coreKtX = "androidx.core:core-ktx:${Versions.coreKtX}"
    const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    const val daggerAndroid = "com.google.dagger:dagger-android:${Versions.dagger}"
    const val daggerAndroidSupport = "com.google.dagger:dagger-android-support:${Versions.dagger}"
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glideOkHttp = "com.github.bumptech.glide:okhttp3-integration:${Versions.glide}"
    const val gson = "com.google.code.gson:gson:${Versions.gson}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    const val okHttpInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val retrofitRxJava = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    const val room = "androidx.room:room-runtime:${Versions.roomX}"
    const val roomRxJava = "androidx.room:room-rxjava2:${Versions.roomX}"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"
    const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"
    const val supportAppCompat = "androidx.appcompat:appcompat:${Versions.supportAppCompatX}"
    const val supportCardView = "androidx.cardview:cardview:${Versions.supportLibX}"
    const val supportDesign = "com.google.android.material:material:${Versions.supportLibX}"
    const val supportLib = "androidx.legacy:legacy-support-v4:${Versions.supportLibX}"
    const val supportRecyclerView = "androidx.recyclerview:recyclerview:${Versions.supportLibX}"
}

object AnnotationProcessors {
    const val archLifecycle = "androidx.lifecycle:lifecycle-compiler:${Versions.archLifecycleX}"
    const val dagger = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val daggerAndroid = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
    const val glide = "com.github.bumptech.glide:compiler:${Versions.glide}"
    const val room = "androidx.room:room-compiler:${Versions.roomX}"
}

object TestDependencies {
    const val androidTestRules = "androidx.test:rules:${Versions.androidTestX}"
    const val androidTestRunner = "androidx.test:runner:${Versions.androidTestX}"
    const val archCoreTest = "androidx.arch.core:core-testing:${Versions.archCoreTestVersionX}"
    const val assertJ = "org.assertj:assertj-core:${Versions.assertJ}"
    const val jUnit = "junit:junit:${Versions.jUnit}"
    const val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockitoKotlin}"
}